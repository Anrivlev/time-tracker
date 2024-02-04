package ru.itgeo.timetracker.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping(method = RequestMethod.GET, value = "/projects")
    public List<Project> getAllProjects() {
        return this.projectService.getAllProjects();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/projects/{projectId}")
    public Project getProject(@PathVariable String projectId) {
        return this.projectService.getProject(projectId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    public Project saveProject(@RequestBody Project project) {
        return this.projectService.saveProject(project);
    }
}
