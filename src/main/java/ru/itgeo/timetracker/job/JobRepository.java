package ru.itgeo.timetracker.job;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobRepository extends MongoRepository<Job, String> {
    @Query("{'taskId': :#{#taskId}}")
    public List<Job> findAllByTaskId(@Param("taskId") String taskId);
    @Query("{'taskId': :#{#taskId}, 'id': :#{#id}}")
    public Job findJobByTaskId(@Param("taskId") String taskId, @Param("id") String id);
}
