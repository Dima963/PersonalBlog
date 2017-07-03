package net.blog.service;

import net.blog.dao.FactoryDAO;
import net.blog.dao.PostgreImpl.PostgreFactoryDAO;
import net.blog.dao.UserDAO;
import net.blog.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Service
@Component
@Scope( value = "prototype")
public class UserService implements GenericService<User> {


    @Resource(name = "DaoProvider")
    FactoryDAO factoryDAO;

    @Transactional
    public void add(User object) throws IOException, ClassNotFoundException {

        UserDAO userDAO = factoryDAO.getUserDAO();
        userDAO.insert(object);
    }

    @Transactional
    public void delete(User object) throws IOException, ClassNotFoundException {

    }

    @Transactional
    public void update(User object) throws IOException, ClassNotFoundException {

    }

    @Transactional
    public List<User> getAll() throws IOException, ClassNotFoundException {
        return null;
    }
}
