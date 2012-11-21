/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.dao;

import java.util.List;
import ro.geaca.scheduler.model.Task;

/**
 *
 * @author tasa
 */
public interface ITaskDAO {
 
    public List<Task> getAllEntities();
}
