package ru.itgeo.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        this.projectRepository.findAll().forEach(project -> projects.add(project));
        return projects;
    }
    public Project getProject(String id) {
        return this.projectRepository.findById(id).get();
    }

    public Project saveProject(Project project) {
        return this.projectRepository.save(project);
    }
}
