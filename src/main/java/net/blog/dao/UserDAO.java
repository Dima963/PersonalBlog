package net.blog.dao;

import net.blog.model.User;

import java.io.IOException;
import java.util.List;

public interface UserDAO extends GenericDAO<User, Integer> {

    void insert(User object) throws IOException, ClassNotFoundException;

    void delete(User object)throws IOException, ClassNotFoundException;

    void update(User object)throws IOException, ClassNotFoundException;

    User getK(Integer id)throws IOException, ClassNotFoundException;

    List<User> getAll()throws IOException, ClassNotFoundException;
}
