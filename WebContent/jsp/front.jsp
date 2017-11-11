<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 暂定首页，一级界面-->
<html>
<head>
<script language="" for="time" event="onclick">
      window.alert('你点击的Radio按钮值为' + value);
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>  
  
</style>
<body>

<h2>业务名称</h2>
<h3 style="color:white;background:blue;"><center>五一七商品销售</center></h3>
<h2>分析指标：渠道特征分布</h2>
<form action="" method="get"> 
<label><input name="time"  type="radio" value="" />全部 </label> 
<label><input name="time" type="radio" value="" />四阶段(6.1-6.14)</label> 
<label><input name="time" type="radio" value="" />五阶段(6.15-6.30)</label> 
</form>
<div>
<%@include file="form.jsp" %></div>
</body>
</html>