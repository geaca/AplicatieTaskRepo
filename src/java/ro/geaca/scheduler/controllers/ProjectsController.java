/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ro.geaca.scheduler.context.Contextul;
import ro.geaca.scheduler.model.Project;
import ro.geaca.scheduler.model.Task;
import ro.geaca.scheduler.service.impl.ProjectService;
import ro.geaca.scheduler.service.impl.TaskService;

/**
 *
 * @author tasa
 */
@Controller
@RequestMapping(value = "/projects")
public class ProjectsController {

    ApplicationContext ctx = Contextul.getInstance().getApplicationContext();
    ProjectService projectService = (ProjectService) ctx.getBean("projectService");
    TaskService taskService = (TaskService) ctx.getBean("taskService");

    @ModelAttribute("project")
    public Project getProject() {
        return new Project();
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addProject() {
        ModelAndView mav = new ModelAndView("projects/add_project");
        return mav;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView viewProject(
            @RequestParam("project_id") String id) {
        ModelAndView mav = new ModelAndView("projects/view_project");
        Project proj = projectService.getEntity(Integer.valueOf(id));
        System.out.println("TASKS: " + proj.getTaskCollection().size());
        mav.addObject("wtf", proj);
        return mav;
    }

    public ModelAndView fillDashboardMav(ModelAndView mav) {


        mav = new ModelAndView("dashboard");
        List<Project> projects = new ArrayList<Project>();
        List<Task> tasks = new ArrayList<Task>();
        projects = projectService.getAllEntities();
        tasks = taskService.getAllTasks();
        mav.addObject("proiecte", projects);
        mav.addObject("tasks", tasks);

        return mav;


    }

    @RequestMapping(value = "/process_form", method = RequestMethod.POST)
    public ModelAndView processAddProject(@ModelAttribute("project") Project proiect) {
        ModelAndView mav = new ModelAndView("projects/add_project");
        System.out.println("*(************************************");
        System.out.println(proiect.getProjectName());



        try {
            ModelAndView smav = null;
            smav = fillDashboardMav(smav);



            projectService.saveEntity(proiect);


            System.out.println("returning smav");

            return smav;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("returning normal mav");
        return mav;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView deleteProject(@RequestParam("project_id") String id) {

        System.out.println("PROJECT ID: " + id);



        projectService.deleteEntity(Integer.valueOf(id));


        ModelAndView mav = new ModelAndView("redirect:/dashboard/test.htm");
        // mav = fillDashboardMav(mav);
        System.out.println("*************************************************");
        return mav;

    }
}
