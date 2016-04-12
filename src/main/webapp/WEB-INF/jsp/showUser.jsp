<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <title>测试</title>
  </head>

  <body>
  <c:forEach items="${users}" var="user">
  	${user.name}
  </c:forEach>
  </body>
</html>