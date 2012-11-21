package ro.geaca.scheduler.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ro.geaca.scheduler.model.Task;
import ro.geaca.scheduler.model.User;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-11-19T15:14:23")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, String> projectDetails;
    public static volatile CollectionAttribute<Project, Task> taskCollection;
    public static volatile SingularAttribute<Project, Integer> projectId;
    public static volatile SingularAttribute<Project, String> projectName;
    public static volatile CollectionAttribute<Project, User> userCollection;

}