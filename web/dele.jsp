<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>ɾ���û�</title>
      <style>
          /* ����ʽ */
          form {
              width: 300px;
              margin: 20px auto;
              padding: 20px;
              background-color: #f2f2f2;
              border-radius: 5px;
              box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
          }

          /* �������ʽ */
          input[type="text"] {
              width: 100%;
              padding: 10px;
              margin-bottom: 10px;
              border-radius: 3px;
              border: 1px solid #ccc;
          }

          /* �ύ��ť��ʽ */
          input[type="submit"] {
              width: 100%;
              padding: 10px;
              color: white;
              background-color: #4CAF50; /* ��ɫ */
              border: none;
              border-radius: 3px;
              cursor: pointer;
          }

          /* �ύ��ť���ʱ����ʽ����ѡ�� */
          input[type="submit"]:hover {
              background-color: #45a049; /* ��һ�����ɫ */
          }
      </style>
  </head>
  <body>
<form action="deleShow.jsp" method="post">
    ����idɾ����<input type="text" name="id">
    <input type="submit" value="�ύ">
</form>
  </body>
</html>
