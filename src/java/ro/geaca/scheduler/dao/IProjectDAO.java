/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.dao;

import java.util.List;
import ro.geaca.scheduler.model.Project;

/**
 *
 * @author tasa
 */
public interface IProjectDAO {
    
    public List<Project> getAllEntities();
    
}
