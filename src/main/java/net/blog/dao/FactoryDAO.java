package net.blog.dao;

public abstract class FactoryDAO {

    public abstract UserDAO getUserDAO();

    public abstract TaskDAO getTaskDAO();

    public abstract ProjectDAO getProjectDAO();


}
