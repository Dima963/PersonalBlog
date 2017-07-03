package net.blog.dao.PostgreImpl;

import net.blog.dao.ProjectDAO;
import net.blog.dao.UserDAO;
import net.blog.dao.TaskDAO;

import net.blog.dao.FactoryDAO
        ;
import org.springframework.stereotype.Service;

@Service("DaoProvider")
public class PostgreFactoryDAO extends FactoryDAO {

    public ProjectDAO getProjectDAO() {
        return new PostgreProjectDAO();
    }

    public UserDAO getUserDAO() {return new PostgreUserDAO(); }

    public TaskDAO getTaskDAO() {
        return  new PostgreTaskDAO();
    }
}

