package ru.itgeo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(String projectId) {
        return taskRepository.findAllByProjectId(projectId);
    }

    public Task getTask(String projectId, String taskId) {
        return this.taskRepository.findTaskByProjectId(projectId, taskId);
    }

    public Task saveTask(String projectId, Task task) {
        task.setProjectId(projectId);
        return this.taskRepository.save(task);
    }
}
