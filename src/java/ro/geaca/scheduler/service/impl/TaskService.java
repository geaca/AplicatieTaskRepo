/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.service.impl;

import ro.geaca.scheduler.service.i.IService;
import java.util.List;
import javax.xml.stream.events.Comment;
import ro.geaca.scheduler.dao.impl.AbstractDAO;
import ro.geaca.scheduler.model.Task;

/**
 *
 * @author tasa
 */
public class TaskService implements IService{

    private AbstractDAO commentDao;
    private AbstractDAO taskDao;

    public TaskService() {
    }
    
    public List<Task> getAllTasks () {
        return taskDao.getAllEntities();
    }

    public List<Comment> getAllComments(){
        return commentDao.getAllEntities();
    }
    
    public void setTaskDao(AbstractDAO taskDao) {
        this.taskDao = taskDao;
    }

    public void setCommentDao(AbstractDAO commentDao) {
        this.commentDao = commentDao;
    }

    public AbstractDAO getCommentDao() {
        return commentDao;
    }

    public AbstractDAO getTaskDao() {
        return taskDao;
    }
    
    
    
    
}
