<%@ page language="java" import="java.util.*,dbutil.*,entity.*,model.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示数据页面</title>
	  <style>
		  /* 表格样式 */
		  table {
			  width: 100%;
			  border-collapse: collapse;
		  }

		  /* 表格头部和单元格样式 */
		  th, td {
			  padding: 8px;
			  text-align: left;
			  border-bottom: 1px solid #ddd;
		  }

		  /* 表格头部样式 */
		  th {
			  background-color: #f2f2f2;
		  }

		  /* 表格行悬停效果 */
		  tr:hover {background-color: #f5f5f5;}
	  </style>
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
     Model model=new Model();
 	 ArrayList<User> arraylist=model.userSelect();
			%>
			数据库中所有用户
			<table border="1">
			<%for(int i=0;i<arraylist.size();i++){%>
				<tr>
				<td><%=arraylist.get(i).getId()%></td>
				<td><%=arraylist.get(i).getName() %></td>
				<td><%=arraylist.get(i).getPassword() %></td>
				</tr>
		<% 	
		}
     %>
     </table>
  </body>
</html>
