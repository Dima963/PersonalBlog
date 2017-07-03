package net.blog.service;

import java.io.IOException;
import java.util.List;

public interface GenericService<T> {

    void add(T object) throws IOException, ClassNotFoundException;

    void delete(T object) throws IOException, ClassNotFoundException;

    void update(T object) throws IOException, ClassNotFoundException;

    List<T> getAll()throws IOException, ClassNotFoundException;

}
