/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.geaca.scheduler.dao.impl;

import javax.xml.stream.events.Comment;
import ro.geaca.scheduler.dao.ICommentDAO;
import ro.geaca.scheduler.model.Comments;

/**
 *
 * @author tasa
 */
public class CommentDAO extends AbstractDAO<Comments> implements ICommentDAO{
    
    public CommentDAO () {
        super(Comments.class);
    }
    
    
    
    public void addNew(Comment com) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
