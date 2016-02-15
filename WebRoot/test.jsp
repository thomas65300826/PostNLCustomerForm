<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
    <div class="formfield__inputContainer formfield__inputQuantity">
<span tabindex="1" class="minus" data-hover-on-class="minus-active-hover" data-hover-off-class="minus-active" data-select-number-prev="4"></span>
<input tabindex="-1" name="NumberOfTravelers" readonly="readonly" id="PO_TravelerAmount" class="textInput textInput--hasBorder textInput--smallWidth" type="text" value="4" />
<span tabindex="1" class="plus-active" data-hover-on-class="plus-active-hover" data-hover-off-class="plus-active" data-select-number-next="10"></span> 
</div>
  </body>
</html>
