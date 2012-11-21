/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ro.geaca.scheduler.context.Contextul;
import ro.geaca.scheduler.model.Category;
import ro.geaca.scheduler.service.impl.CategoryService;

/**
 *
 * @author tasa
 */
@Controller
@RequestMapping(value="/ctrl")
public class CategoryController {


    
    
    
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ModelAndView getNewForm() {
        
        ApplicationContext ctx  = Contextul.getInstance().getApplicationContext();
        CategoryService srv = (CategoryService) ctx.getBean("categoryService");
        srv.hello();
        Category cat = new Category();
        cat.setCategoryTitle("testare");
        cat.setCategoryDetails("testare cu JUnit");
        // srv.getDao().addNew(cat);
        return new ModelAndView("pagina_test");
    }
}
