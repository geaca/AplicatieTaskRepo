/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.controllers;

import ro.geaca.scheduler.service.impl.ProjectService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ro.geaca.scheduler.context.Contextul;
import ro.geaca.scheduler.model.Project;
import ro.geaca.scheduler.model.Task;
import ro.geaca.scheduler.service.impl.TaskService;

/**
 *
 * @author tasa
 */
@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView viewDashboards() {

        ModelAndView mav = new ModelAndView("dashboard");

        ApplicationContext ctx = Contextul.getInstance().getApplicationContext();
        ProjectService projectService = (ProjectService) ctx.getBean("projectService");
        TaskService taskService = (TaskService) ctx.getBean("taskService");
        List<Project> projects = new ArrayList<Project>();
        List<Task> tasks = new ArrayList<Task>();

        projects = projectService.getAllEntities();
        tasks = taskService.getAllTasks();
        // System.out.println(projectService.getAllProjects().get(0).getProjectName());
        mav.addObject("proiecte", projects);
        mav.addObject("tasks", tasks);

        return mav;
    }
}
