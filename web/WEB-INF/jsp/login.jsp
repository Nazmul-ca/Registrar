<%-- 
    Document   : welcome
    Created on : 01-Jan-2018, 18:27:22
    Author     : nazmul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
        <form:form action="display.htm" method="post" commandName="userForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Login to the portal</h2></td>
                </tr>
                
                <tr>
                    <td>Name/ID:</td>
                    <td><form:select path="username" items="${userList}" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="left"><input type="submit" value="Login" /></td>
                </tr>
            </table>
        </form:form>
    </div>
    </body>
</html>
