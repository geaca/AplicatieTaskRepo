package ro.geaca.scheduler.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ro.geaca.scheduler.model.Category;
import ro.geaca.scheduler.model.Comments;
import ro.geaca.scheduler.model.Project;
import ro.geaca.scheduler.model.User;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-11-19T15:14:23")
@StaticMetamodel(Task.class)
public class Task_ { 

    public static volatile SingularAttribute<Task, Integer> taskId;
    public static volatile CollectionAttribute<Task, Comments> commentsCollection;
    public static volatile SingularAttribute<Task, String> title;
    public static volatile SingularAttribute<Task, Project> prId;
    public static volatile SingularAttribute<Task, String> details;
    public static volatile SingularAttribute<Task, User> usrId;
    public static volatile SingularAttribute<Task, Category> catId;

}