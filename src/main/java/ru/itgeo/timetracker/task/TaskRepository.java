package ru.itgeo.timetracker.task;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {
    @Query("{'projectId': :#{#projectId}, 'id': :#{#id}}")
    public Task findTaskByProjectId(@Param("projectId") String projectId, @Param("id") String id);

    @Query("{'projectId': :#{#projectId}}")
    public List<Task> findAllByProjectId(@Param("projectId") String projectId);
}
