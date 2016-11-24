<%--
  Created by IntelliJ IDEA.
  User: limbo
  Date: 2016/11/8
  Time: 下午9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/addUser.do"  method="post">
    姓名：<input type="text" name="userName" /><br>
    年龄：<input type="text" name="userAge" /><br>
    地址：<input type="text" name="userAddress" /><br>
    <input type="submit" value="OK" />
</form>
</body>
</html>
