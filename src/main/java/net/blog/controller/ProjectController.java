package net.blog.controller;

import net.blog.model.Project;
import net.blog.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

@Controller
@RequestMapping(value ="/project")
public class ProjectController {

    ProjectService projectService = new ProjectService();

    @RequestMapping(method = RequestMethod.GET)
    public String ProjectGET(){
        return "Project/projectPage";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String requestCreateProjectPOST(@ModelAttribute("project") Project project) throws SQLException, IOException, ClassNotFoundException {

        projectService.add(project);

        return "index";
    }
}


