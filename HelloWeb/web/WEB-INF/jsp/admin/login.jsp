<%-- 
    Document   : login
    Created on : 2016-5-14, 17:32:07
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="tologin" method="POST">
            <table>
                <tr>
                    <td>Account</td>
                    <td><input type="text" name="account"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
            </table>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
