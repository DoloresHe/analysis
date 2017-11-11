<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 渠道的表格部件-->
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>  
  
body {  
width: 600px;  
margin: 40px auto;  
font-family: 'trebuchet MS', 'Lucida sans', Arial;  
font-size: 14px;  
color: #444;  
}  
  
table {  
*border-collapse: collapse; /* IE7 and lower */  
border-spacing: 0;  
width: 100%;  
}  
  
.bordered {  
border: solid #ccc 1px;  
-moz-border-radius: 6px;  
-webkit-border-radius: 6px;  
border-radius: 6px;  
-webkit-box-shadow: 0 1px 1px #ccc;  
-moz-box-shadow: 0 1px 1px #ccc;  
box-shadow: 0 1px 1px #ccc;  
}  
  
.bordered tr:hover {  
background: #fbf8e9;  
-o-transition: all 0.1s ease-in-out;  
-webkit-transition: all 0.1s ease-in-out;  
-moz-transition: all 0.1s ease-in-out;  
-ms-transition: all 0.1s ease-in-out;  
transition: all 0.1s ease-in-out;  
}  
  
.bordered td, .bordered th {  
border-left: 1px solid #ccc;  
border-top: 1px solid #ccc;  
padding: 10px;  
text-align: left;  
}  
  
.bordered th {  
background-color: #dce9f9;  
background-image: -webkit-gradient(linear, left top, left bottom, from(#ebf3fc), to(#dce9f9));  
background-image: -webkit-linear-gradient(top, #ebf3fc, #dce9f9);  
background-image: -moz-linear-gradient(top, #ebf3fc, #dce9f9);  
background-image: -ms-linear-gradient(top, #ebf3fc, #dce9f9);  
background-image: -o-linear-gradient(top, #ebf3fc, #dce9f9);  
background-image: linear-gradient(top, #ebf3fc, #dce9f9);  
-webkit-box-shadow: 0 1px 0 rgba(255,255,255,.8) inset;  
-moz-box-shadow:0 1px 0 rgba(255,255,255,.8) inset;  
box-shadow: 0 1px 0 rgba(255,255,255,.8) inset;  
border-top: none;  
text-shadow: 0 1px 0 rgba(255,255,255,.5);  
}  
  
.bordered td:first-child, .bordered th:first-child {  
border-left: none;  
}  
  
.bordered th:first-child {  
-moz-border-radius: 6px 0 0 0;  
-webkit-border-radius: 6px 0 0 0;  
border-radius: 6px 0 0 0;  
}  
  
.bordered th:last-child {  
-moz-border-radius: 0 6px 0 0;  
-webkit-border-radius: 0 6px 0 0;  
border-radius: 0 6px 0 0;  
}  
  
.bordered th:only-child{  
-moz-border-radius: 6px 6px 0 0;  
-webkit-border-radius: 6px 6px 0 0;  
border-radius: 6px 6px 0 0;  
}  
  
.bordered tr:last-child td:first-child {  
-moz-border-radius: 0 0 0 6px;  
-webkit-border-radius: 0 0 0 6px;  
border-radius: 0 0 0 6px;  
}  
  
.bordered tr:last-child td:last-child {  
-moz-border-radius: 0 0 6px 0;  
-webkit-border-radius: 0 0 6px 0;  
border-radius: 0 0 6px 0;  
}  
  

  
</style>
<body>
<script>  
window.onload=function(){  
    var blob = new Blob(['hhhhh']);  
    var url = URL.createObjectURL(blob);  
    document.getElementById('download').setAttribute('href',url);   
}  
  
</script>

<h2>商品销售渠道特征</h2>  
<table class="bordered">  
<thead>  
  
<tr>  
<th>移动商城</th>  
<th>手机营业厅</th>  
<th>触屏版商城</th>
<th>用户数</th>
<th>占比</th>
<th>矩阵下载</th>  
</tr>  
</thead>  
<tr>  
<td colspan="3">合计</td>  
<td>${tnum}</td>  
<td></td>  
<td></td>
</tr>  
<tr>  
<td style="background-color:green"></td>  
<td></td>  
<td></td> 
<td><form action="num1" method="post" id="orderForm1">
<input type="submit" value="${num1}" onclick="msg()" />
</form></td>
<td>${per1}</td>
<td><a id="download" href="" download="analyze.txt">下载</td> 
</tr>  
<tr>  
  
<td></td>  
<td style="background-color:green"></td>  
<td></td>  
<td><form action="num2" method="post" id="orderForm2">
<input type="submit"  value="${num2}" onclick="msg()" />
</form></td>
<td>${per2}</td>
<td><a id="download" href="" download="analyze.txt">下载</td>
</tr>  
 
<tr>
<td></td>  
<td></td>  
<td style="background-color:green"></td>  
<td><form action="num5" method="post" id="orderForm5">
<input type="submit" value="${num3}"  />
</form></td> 
<td>${per3}</td>
<td><a id="download" href="" download="analyze.txt">下载</a></td>
</tr>  
</table>  

</body>
</html>