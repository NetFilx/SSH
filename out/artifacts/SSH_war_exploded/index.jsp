<%--
  Created by IntelliJ IDEA.
  User: limbo
  Date: 2016/11/8
  Time: 下午4:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <table border="1">
    <tr>
      <td>id</td>
      <td>姓名</td>
      <td>年龄</td>
      <td>地址</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="user">
      <tr>
        <td>${user.userId}</td>
        <td>${user.userName}</td>
        <td>${user.userAge}</td>
        <td>${user.userAddress}</td>
      </tr>
    </c:forEach>
  </table>
  <a href="addUser.jsp">添加</a>
  </body>
</html>
