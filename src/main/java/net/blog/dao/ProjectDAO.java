package net.blog.dao;

import net.blog.model.Project;

import java.io.IOException;
import java.util.List;

public interface ProjectDAO extends GenericDAO<Project, Integer> {
    void insert(Project object) throws IOException, ClassNotFoundException;

    void delete(Project object) throws IOException, ClassNotFoundException;

    void update(Project object) throws IOException, ClassNotFoundException;

    Project getK(Integer id) throws IOException, ClassNotFoundException;

    List<Project> getAll() throws IOException, ClassNotFoundException;
}
