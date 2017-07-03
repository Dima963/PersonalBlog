package net.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/")
public class WelcomeController {

    private String userName;
    private String userSurname;

    @RequestMapping(value ="/",  method = RequestMethod.GET)
    public String authenticationMethodGET(){

        return "redirect:Authentication/login";
    }

    @RequestMapping(value ="/Authentication/login",  method = RequestMethod.GET)
    public String requestMethodGET(){

        return "/Authentication/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String requestMethodPost(HttpServletRequest request, Model model){
      //  userName =  request.getParameter("user_name");
       // userSurname = request.getParameter("user_surname");

       // model.addAttribute("name", userName);
       // model.addAttribute("surname", userSurname);

        return "index";
    }

}




