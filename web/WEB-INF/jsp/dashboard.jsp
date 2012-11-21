<%-- 
    Document   : dashboard
    Created on : Nov 9, 2012, 7:24:10 PM
    Author     : tasa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- pentru JSTL -->
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DASHBOARD</title>
    </head>
    <body>
        <h1>DASHBOARD!</h1>
        <a href="<c:url value="/projects/add.htm"/>">Add Project</a>
        <br/>
        <%--<c:out value="o valoare"/>--%>

        <h2>Projects:</h2>
        <ul>
            <c:forEach items="${proiecte}" var="proiect">
                <li>PROIECT: <a href="<c:url value="/projects/view.htm"/>?project_id=${proiect.projectId}">${proiect.projectName}</a> <a href="<c:url value="/projects/delete.htm"/>?project_id=${proiect.projectId}">Delete Project</a> 
                    <a href="">Show Tasks</a></li>
            </c:forEach>
        </ul>

        <hr/>
        <h2>Tasks:</h2>
        <ul>
            <c:forEach items="${tasks}" var="task">
                <li>TASK: ${task.taskId} - ${task.title}</li>
            </c:forEach>
        </ul>
    </body>
</html>
