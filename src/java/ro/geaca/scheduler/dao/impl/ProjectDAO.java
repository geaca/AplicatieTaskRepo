/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import ro.geaca.scheduler.dao.IProjectDAO;
import ro.geaca.scheduler.model.Category;
import ro.geaca.scheduler.model.Project;

/**
 *
 * @author tasa
 */
public class ProjectDAO extends AbstractDAO<Project> implements IProjectDAO {

    public ProjectDAO() {
        super(Project.class);
        System.out.println("PROJDAO");

    }
}
