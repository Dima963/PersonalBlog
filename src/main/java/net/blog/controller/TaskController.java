package net.blog.controller;

import net.blog.model.Task;
import net.blog.service.ProjectService;
import net.blog.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.sql.SQLException;

@Controller
@RequestMapping(value ="/task")
public class TaskController {

    TaskService taskService = new TaskService();

    @RequestMapping(method = RequestMethod.GET)
    public String ProjectGET(){
        return "Task/taskPage";
    }



    @RequestMapping(method = RequestMethod.POST)
    public String requestCreateTaskPOST(@ModelAttribute("task") Task task) throws SQLException, IOException, ClassNotFoundException {

        taskService.add(task);

        return "index";
    }
}
