<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>新增用户</title>
      <style>
          /* 表单样式 */
          form {
              width: 300px;
              margin: 20px auto;
              padding: 20px;
              background-color: #f2f2f2;
              border-radius: 5px;
              box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
          }

          /* 输入框样式 */
          input[type="text"] {
              width: 100%;
              padding: 10px;
              margin-bottom: 10px;
              border-radius: 3px;
              border: 1px solid #ccc;
          }

          /* 提交按钮样式 */
          input[type="submit"] {
              width: 100%;
              padding: 10px;
              color: white;
              background-color: #4CAF50; /* 绿色 */
              border: none;
              border-radius: 3px;
              cursor: pointer;
          }

          /* 提交按钮点击时的样式（可选） */
          input[type="submit"]:hover {
              background-color: #45a049; /* 深一点的绿色 */
          }
      </style>
  </head>
  <body>
<form action="insertShow.jsp" method="post">
   请输入id：    <input type="text" name="id"><br/>
   请输入姓名：<input type="text" name="name"><br/>
    请输入密码：<input type="text" name="password"><br/>
    <input type="submit" value="提交">
</form>
  </body>
</html>
