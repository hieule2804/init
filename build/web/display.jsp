<%-- 
    Document   : display
    Created on : Sep 12, 2023, 11:16:59 AM
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
        <form action="home?action=search" method="post">
            <input type="text" name="searchname" placeholder="Nhap Username" >
            <input type="submit" value="search">
        </form>
        <table border="1">
            <c:forEach items="${listAcc}" var="account">
              <tr>
                    <!--Username-->
                    <td>${account.username}</td>
                    <!--Password-->
                    <td>${account.password}</td>
                    <!--Gender-->
                    <td>${account.gender.equals('0') ?"Male" : "Female"}</td>
                    <!--Role-->
                    <td>${account.role.name}</td>
                    <!--Hobbies-->
                    <td>
                         <c:forEach items="${account.hobby}" var="hob" >
                ${hob}<br>
            </c:forEach>
                    </td>
                </tr>
            </c:forEach>
        </table>
                
    </body>
</html>
