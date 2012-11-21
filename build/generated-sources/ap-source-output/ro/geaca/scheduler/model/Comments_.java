package ro.geaca.scheduler.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ro.geaca.scheduler.model.Task;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-11-19T15:14:23")
@StaticMetamodel(Comments.class)
public class Comments_ { 

    public static volatile SingularAttribute<Comments, Integer> commentsId;
    public static volatile SingularAttribute<Comments, String> commentsTitle;
    public static volatile SingularAttribute<Comments, Task> tskId;
    public static volatile SingularAttribute<Comments, String> commentsDetails;

}