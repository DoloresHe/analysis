<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<!DOCTYPE html>
<!-- 品牌，零件的二级界面-->
<html>
<head>
<script src="resources/jquery-3.2.1.min.js"></script>

<script src="resources/require.js"></script>
</head>

<title></title>

<script type="text/javascript">

 
</script>



 <body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
   <div id="main" style="height:400px ">
   <%@include file="province.jsp" %>
   </div>
      
       
<div id="form" style="height:400px ">
<%@include file="form.jsp" %>
 </div>
</body>