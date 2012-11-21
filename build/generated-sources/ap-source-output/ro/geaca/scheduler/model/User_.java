package ro.geaca.scheduler.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ro.geaca.scheduler.model.Project;
import ro.geaca.scheduler.model.Task;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-11-19T15:14:23")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Project> prId;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile SingularAttribute<User, String> name;
    public static volatile CollectionAttribute<User, Task> taskCollection;
    public static volatile SingularAttribute<User, String> lastname;

}