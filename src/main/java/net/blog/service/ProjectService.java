package net.blog.service;

import net.blog.dao.FactoryDAO;
import net.blog.dao.PostgreImpl.PostgreFactoryDAO;
import net.blog.dao.ProjectDAO;
import net.blog.model.Project;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public class ProjectService implements GenericService<Project> {


    @Autowired
    FactoryDAO factoryDAO;

    public void add(Project object) throws IOException, ClassNotFoundException {
        ProjectDAO projectDAO = factoryDAO.getProjectDAO();
        projectDAO.insert(object);
    }

    public void delete(Project object) throws IOException, ClassNotFoundException {

    }

    public void update(Project object) throws IOException, ClassNotFoundException {

    }

    public List<Project> getAll() throws IOException, ClassNotFoundException {
        return null;
    }
}
