package ru.itgeo.timetracker.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs(String taskId) {
        return jobRepository.findAllByTaskId(taskId);
    }

    public Job getJob(String taskId, String id) {
        return this.jobRepository.findJobByTaskId(taskId, id);
    }
    public Job saveJob(String taskId, Job job) {
        job.setTaskId(taskId);
        return this.jobRepository.save(job);
    }
}
