<%@ page language="java" import="java.util.*,dbutil.*,entity.*,model.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示数据页面</title>
      <link rel="stylesheet" href="css/index.css">
  </head>
  <body>
  <nav class="navbar">
      <ul class="navbar-list">
          <li class="navbar-item"><a href="allShow.jsp">展示所有用户</a></li>
          <li class="navbar-item"><a href="insert.jsp">增加用户</a></li>
          <li class="navbar-item"><a href="dele.jsp">删除用户</a></li>
          <li class="navbar-item"><a href="update.jsp">更新用户</a></li>
          <li class="navbar-item"><a href="search.jsp">查询用户</a></li>
      </ul>
  </nav>
    <%
    int id=Integer.parseInt(request.getParameter("id"));
     Model model=new Model();
 	 User user=model.load(id);
	%>
	<%=user.getId() %>
	<%=user.getName() %>
	<%=user.getPassword() %>
  </body>
</html>
