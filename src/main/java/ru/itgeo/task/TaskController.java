package ru.itgeo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(method = RequestMethod.GET, value = "/tasks/{projectId}")
    public List<Task> getAllTasks(@PathVariable String projectId) {
        return this.taskService.getAllTasks(projectId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tasks/{projectId}/{id}")
    public Task getTask(@PathVariable String projectId, @PathVariable String id) {
        return this.taskService.getTask(projectId, id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tasks/{projectId}")
    public Task saveTask(@PathVariable String projectId, @RequestBody Task task) {
        return this.taskService.saveTask(projectId, task);
    }
}
