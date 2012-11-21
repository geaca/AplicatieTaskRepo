/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.service.impl;

import ro.geaca.scheduler.service.i.IService;
import java.util.List;
import javax.persistence.EntityManager;
import ro.geaca.scheduler.dao.IProjectDAO;
import ro.geaca.scheduler.dao.impl.AbstractDAO;
import ro.geaca.scheduler.model.Project;

/**
 *
 * @author tasa
 */
public class ProjectService implements IService {

    private AbstractDAO projectDao;

    public ProjectService() {
    }

    public Project getEntity(int id) { // R
        Project target = (Project) projectDao.getEntity(id);
        return target;
    }

    public List<Project> getAllEntities() {
        return projectDao.getAllEntities();
    }

    public AbstractDAO getProjectDao() {
        return projectDao;
    }

    public void setProjectDao(AbstractDAO projectDao) {
        this.projectDao = projectDao;
    }

    public void saveEntity(Project project) {
        projectDao.saveEntity(project);
    }

    public void deleteEntity(int id) {
        projectDao.deleteEntity(id);
    }
}
