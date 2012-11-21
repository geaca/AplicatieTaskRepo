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
import ro.geaca.scheduler.model.Project;

/**
 *
 * @author tasa
 */
public abstract class AbstractDAO<T> {

    public AbstractDAO(Class<T> classType) {
        this.classType = classType;
    }
    // T.class
    private Class<T> classType;
    protected EntityManagerFactory emf;

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<T> getAllEntities() {

        EntityManager em = emf.createEntityManager();
        CriteriaQuery pq = em.getCriteriaBuilder().createQuery();

        pq.select(pq.from(classType));
        Query q = em.createQuery(pq);
        return q.getResultList();
    }

    /* CRUD */
        public T getEntity(int id) { // R

            EntityManager em = emf.createEntityManager();
            T target = em.find(classType, id);
            return target;
        }

    public void saveEntity(T entity) { // C
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteEntity(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        // intai il luam din baza de date, apoi il stergem
        T target = em.find(classType, id);
        System.out.println("Deleting entity");
        em.remove(target);
        // DELETE FROM tabel WHERE tabel_pk_id = id;
        em.getTransaction().commit();
        em.close();
    }
}
