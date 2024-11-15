<%--
  Created by IntelliJ IDEA.
  User: Sc4
  Date: 11/4/2024
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("pw");
    String job = request.getParameter("job");
    String status = request.getParameter("status");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Username: <%=username%> <br>
    Email: <%=email%> <br>
    Password: <%=password%> <br>
    Job: <%=job%> <br>
    Status: <%=status%> <br>
</body>
</html>
