<%-- 
    Document   : add_project
    Created on : Nov 14, 2012, 2:51:50 PM
    Author     : tasa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form:form  action="process_form.htm" method="post" commandName="project">
            Project name: <form:input type="text"  path="projectName"/>
            <br/>
            <input type="submit"/>
        </form:form>
    </body>
</html>
