package ro.geaca.scheduler.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ro.geaca.scheduler.model.Task;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-11-19T15:14:23")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> categoryDetails;
    public static volatile SingularAttribute<Category, String> categoryTitle;
    public static volatile SingularAttribute<Category, Integer> categoryId;
    public static volatile CollectionAttribute<Category, Task> taskCollection;

}