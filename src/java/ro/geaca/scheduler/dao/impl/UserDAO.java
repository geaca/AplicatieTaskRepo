/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.dao.impl;

import ro.geaca.scheduler.model.User;

/**
 *
 * @author tasa
 */
public class UserDAO extends AbstractDAO<User>{
    
   public UserDAO(){
       super(User.class);
   }
    
}
