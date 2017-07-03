package net.blog.service;

import net.blog.dao.FactoryDAO;
import net.blog.dao.PostgreImpl.PostgreFactoryDAO;
import net.blog.dao.TaskDAO;
import net.blog.model.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public class TaskService implements GenericService<Task> {

    @Autowired
    FactoryDAO factoryDAO;

    public void add(Task object) throws IOException, ClassNotFoundException {

        TaskDAO taskDAO = factoryDAO.getTaskDAO();
        taskDAO.insert(object);
    }

    public void delete(Task object) throws IOException, ClassNotFoundException {

    }

    public void update(Task object) throws IOException, ClassNotFoundException {

    }

    public List<Task> getAll() throws IOException, ClassNotFoundException {
        return null;
    }
}
