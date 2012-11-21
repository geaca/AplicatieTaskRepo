<%-- 
    Document   : view_project
    Created on : Nov 19, 2012, 2:52:36 PM
    Author     : tasa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- pentru JSTL -->
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Viewing project: ${wtf.projectId} - ${wtf.projectName}<br/>
        Description: ${wtf.projectDetails}
        <br/>
        T1T2
        <c:forEach items="${wtf.taskCollection}" var="task">
            Task: ${task.title}
        </c:forEach>
        
    </body>
</html>
