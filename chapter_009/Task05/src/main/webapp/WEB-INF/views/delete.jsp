<%--
  Created by IntelliJ IDEA.
  User: pit
  Date: 22.11.2017
  Time: 6:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Delete user</title>
</head>
<body>
<form action='${pageContext.servletContext.contextPath}/delete' method=post>

    <label>
        ID:
        <input type='text' name='id'>
    </label><br/>
    <br>
    <button type='submit'>Delete user</button>

</form>
</body>
</html>
