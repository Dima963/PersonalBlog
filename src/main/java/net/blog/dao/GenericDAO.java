package net.blog.dao;

import java.io.IOException;
import java.util.List;

public interface GenericDAO<T, K> {

     void insert(T object) throws IOException, ClassNotFoundException;

     void delete(T object) throws IOException, ClassNotFoundException;

     void update(T object) throws IOException, ClassNotFoundException;

     T getK(K id)throws IOException, ClassNotFoundException;

    List<T> getAll()throws IOException, ClassNotFoundException;

}
