package net.blog.dao;

import net.blog.model.Task;

import java.io.IOException;
import java.util.List;

public interface TaskDAO extends GenericDAO<Task, Integer> {

    void insert(Task object) throws IOException, ClassNotFoundException;

    void delete(Task object)throws IOException, ClassNotFoundException;

    void update(Task object)throws IOException, ClassNotFoundException;

    Task getK(Integer id)throws IOException, ClassNotFoundException;

    List<Task> getAll()throws IOException, ClassNotFoundException;
}
