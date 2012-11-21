/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import ro.geaca.scheduler.dao.ITaskDAO;
import ro.geaca.scheduler.model.Project;
import ro.geaca.scheduler.model.Task;

/**
 *
 * @author tasa
 */
public class TaskDAO extends AbstractDAO<Task> implements ITaskDAO{

 
    public TaskDAO(){
        super(Task.class);
    }
    
}
