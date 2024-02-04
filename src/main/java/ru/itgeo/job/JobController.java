package ru.itgeo.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    @RequestMapping(method = RequestMethod.GET, value = "/jobs/{taskId}")
    public List<Job> getAllJobs(@PathVariable String taskId) {
        return this.jobService.getAllJobs(taskId);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/jobs/{taskId}/{id}")
    public Job getJob(@PathVariable String taskId, @PathVariable String id) {
        return this.jobService.getJob(taskId, id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/jobs/{taskId}")
    public Job saveJob(@PathVariable String taskId, @RequestBody Job job) {
        return this.jobService.saveJob(taskId, job);
    }
}
