package ru.itgeo.job;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;

@Document("jobs")
public class Job {
    @Id
    private String id;
    private String taskId;
    private String userId;
    private String description;
    private Duration duration;

    public Job() {
    }

    public Job(String id, String taskId, String userId, String description, Duration duration) {
        this.id = id;
        this.taskId = taskId;
        this.userId = userId;
        this.description = description;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
