<%@ page import="project.project22_jspcrudfullstack.ForumDAO" %>
<%@ page import="project.project22_jspcrudfullstack.ForumVO" %><%--
  Created by IntelliJ IDEA.
  User: Sc4
  Date: 11/9/2024
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String title = request.getParameter("title");
    String phone = request.getParameter("phone");
    String post_type = request.getParameter("post_type");
    String user_type = request.getParameter("user_type");
    System.out.println("id: " + id + ", name: " + name + ", title: " + title + ", phone: " + phone + ", post_type: " + post_type + ", user_type: " + user_type);

    ForumDAO dao = new ForumDAO();
    ForumVO vo = new ForumVO(Integer.parseInt(id), name, title, phone, post_type, user_type);
    int i = dao.updateForum(vo);
    String msg = "Successfully edited data.";
    if(i==-1) msg = "[Error] Error in editing data";
%>
<html>
<script>
    // document.addEventListener('DOMContentLoaded', () => {
    //     const current_uri = window.location.href;
    //     const uri = new URL(current_uri);
    //     const name = uri.searchParams.get("name");
    //     const title = uri.searchParams.get("title");
    //     const phone = uri.searchParams.get("phone");
    //     const post_type = uri.searchParams.get("post_type");
    //     const user_type = uri.searchParams.get("user_type");
    //     document.getElementById("label1").innerHTML = "Name: " + name;
    //     document.getElementById("label2").innerHTML = "Title: " + title;
    //     document.getElementById("label3").innerHTML = "Phone no.: " + phone;
    //     document.getElementById("label4").innerHTML = "Post type: " + post_type;
    //     document.getElementById("label5").innerHTML = "User type: " + user_type;
    // });
    alert('<%=msg%>');
    location.href = 'index.jsp';
</script>
<head>
    <title>Edited</title>
</head>
<body>
<%--Name: <%=name%><br>--%>
<%--Title: <%=title%><br>--%>
<%--Phone: <%=phone%><br>--%>
<%--Post_type: <%=post_type%><br>--%>
<%--User_type: <%=user_type%><br>--%>
<%--    <a href="index.jsp">홈페이지로</a>--%>
</body>
</html>
