<%-- 
    Document   : student
    Created on : 2016-5-11, 19:07:40
    Author     : Kevin
--%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form  action="hey" method="POST">
            <input type="text"  name="name">
            <input type="submit" name="submit" value="ok">
        <form>
    </body>
</html>
