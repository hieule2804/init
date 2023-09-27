<%-- 
    Document   : register
    Created on : Sep 12, 2023, 10:09:03 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="register" method="post">
            Username : <input type="text" name="user"><br>
            Password : <input type="password" name="pass"><br>
            Gerder :
            <input type="radio" name="gender" value="0">Male
             <input type="radio" name="gender" value="1">FeMale
             <br>
             Role
             <select name="role">
             <c:forEach items="${listRole}" var="role">
                <option value="${role.id}">${role.name}</option>
             </c:forEach>
             </select>
             <br>
              Hobby
              <input type="checkbox" name="hobby" value="Reading">Reading
                            <input type="checkbox" name="hobby" value="Sleping">Sleping
              <input type="checkbox" name="hobby" value="gaming">gaming
              <br>
              <input type="submit" value="submit">
                 
        </form>
    </body>
</html>
