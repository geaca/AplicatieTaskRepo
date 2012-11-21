/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.context;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author SpireAlex
 */
public class Contextul {



    
    /**
     * Injected from the class "ApplicationContextProvider" which is automatically
     * loaded during Spring-Initialization.
     */
	private ApplicationContext ctx;

    /**
     * Web Archive Application Business Context
     */
	private HashMap<String, Object> appContext = new HashMap<String, Object>();

	private Contextul() {};


	private static Contextul instance;

	static {

		instance = new Contextul();
	}

	public static Contextul getInstance() {
		return instance;
	}

	public void storeOnContext(String name, Object value){
		appContext.put(name, value);
	}

	public synchronized void storeOnContextSynchronized(String name, Object value){
		appContext.put(name, value);
	}

	public Object getFromContext(String name){
		return appContext.get(name);
	}

	public void removeFromContext(String name){
		appContext.remove(name);
	}

	public void clearContext(){
		appContext.clear();
	}

	public HashMap<String, Object> getContext(){
		return appContext;
	}

    /**
     * Injected from the class "ApplicationContextProvider" which is automatically
     * loaded during Spring-Initialization.
     */
    public void setApplicationContext(ApplicationContext applicationContext) {
        ctx = applicationContext;
    }

    /**
     * Get access to the Spring ApplicationContext from everywhere in your Application.
     *
     * @return
     */
    public ApplicationContext getApplicationContext() {
        return ctx;
    }
}

