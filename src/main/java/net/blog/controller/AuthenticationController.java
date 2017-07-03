package net.blog.controller;

import net.blog.dao.FactoryDAO;
import net.blog.dao.PostgreImpl.PostgreFactoryDAO;
import net.blog.dao.UserDAO;
import net.blog.model.User;
import net.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;


@Controller
@RequestMapping(value ="/authentication")
public class AuthenticationController {

   UserService userService = new UserService();


    @RequestMapping(method = RequestMethod.GET)
    public String requestAuthenticationGET(){
        return "Authentication/register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String requestAuthenticationPOST(@ModelAttribute("user") User contact) throws SQLException, IOException, ClassNotFoundException {

        userService.add(contact);

        return "index";
    }
}
