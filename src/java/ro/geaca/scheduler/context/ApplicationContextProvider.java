/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.context;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author SpireAlex
 */
public class ApplicationContextProvider implements ApplicationContextAware{

       public void setApplicationContext(ApplicationContext ctx) throws BeansException {
    	// Wiring the ApplicationContext into a static method
        Contextul.getInstance().setApplicationContext(ctx);

    }
}
