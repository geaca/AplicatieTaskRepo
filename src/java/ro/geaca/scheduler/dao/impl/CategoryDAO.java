/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import ro.geaca.scheduler.dao.ICategoryDAO;
import ro.geaca.scheduler.model.Category;

/**
 *
 * @author tasa
 */
public class CategoryDAO extends AbstractDAO<Category> implements ICategoryDAO{
    
    
    public CategoryDAO(){
        super(Category.class);
    }

    
    public void addNew(Category cat){
        System.out.println("1");
       // Session session = HibernateUtil.getSessionFactory().openSession();
       EntityManager em =  emf.createEntityManager();
       em.getTransaction().begin();
       em.persist(cat);
       em.getTransaction().commit();
       System.out.println("2");
    }
    
}
