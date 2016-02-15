<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>

    <title>测试</title>
  </head>
  <%
   String data= request.getParameter("Hidden1");
   out.println("取得的数据为："+data);
   %>
  <body>

  </body>
</html>