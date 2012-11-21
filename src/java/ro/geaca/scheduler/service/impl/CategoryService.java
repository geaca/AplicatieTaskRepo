/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.service.impl;

import ro.geaca.scheduler.service.i.IService;
import ro.geaca.scheduler.dao.ICategoryDAO;
import ro.geaca.scheduler.dao.impl.AbstractDAO;

/**
 *
 * @author tasa
 */
public class CategoryService implements IService{

    public CategoryService() {
    }
    private AbstractDAO dao; // = new CategoryHibernateDAO();
    private String test;

    public AbstractDAO getDao() {
        return dao;
    }

    public void setDao(AbstractDAO dao) {
        this.dao = dao;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void hello() {
        System.out.println("Hy");
    }
}
