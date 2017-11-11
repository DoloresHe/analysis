<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<!DOCTYPE html>
<!-- 左半边的目录（点击事件没完成，查询条件的叠加限制也没有做-->
<html>
<head>
<script src="resources/jquery-3.2.1.min.js"></script>
</head>

<title></title>

<script>
$(function(){
	$("#activity").click(function(){
		  $("#details").toggle();
		  });
});
 
</script>

<style>
.menuParent{
width:150px;
height:47px;
line-height:47px;
padding-left:38px;
font-size:14px;
cursor:pointer;
border:1px solid #e1e1e1;
position:relative;
margin:0px;
font-weight:bold;
}
#details{
width:188px;
height:auto;
overflow:hidden;
line-height:38px;
border-left:1px solid #e1e1e1;
border-right:1px solid #e1e1e1;	}
#details a{
display:block;
width:150px;
height:38px;
line-height:38px;
padding-left:38px;
text-decoration:none;
border-bottom:1px solid #e1e1e1;	}
a:link {text-decoration: none;}
a:visited {text-decoration: none;}
a:active {text-decoration: none;}
a:hover {text-decoration: none;}
</style>


<body >
<div id="firstpane" style="height:400px; weight:150px"class="menu_list">

<select>
<option>全国</option>
<option>北京</option>
<option>广东</option>
<option>上海</option>
<option>天津</option>
<option>重庆</option>
<option>辽宁</option>
<option>江苏</option>
<option>湖北</option>
<option>四川</option>
<option>陕西</option>
<option>河北</option>
<option>山西</option>
<option>河南</option>
<option>吉林</option>
<option>黑龙江</option>
<option>内蒙古</option>
<option>山东</option>
<option>安徽</option>
<option>浙江</option>
<option>福建</option>
<option>湖南</option>
<option>广西</option>
<option>江西</option>
<option>贵州</option>
<option>云南</option>
<option>西藏</option>
<option>海南</option>
<option>甘肃</option>
<option>宁夏</option>
<option>青海</option>
<option>新疆</option>
</select>
 
<br>
<input type="text" value="2015-09"/>
<br>
<input type="submit" value="Submit">
<div>
<div class=menuParent>
总体特征
<img src="image/triangle.png" width="20" height="20" align="right"/>
</div>
<div class=menuParent>登录
<img src="image/triangle.png" width="20" height="20" align="right"/></div>
<div class=menuParent>业务查询
<img src="image/triangle.png" width="20" height="20" align="right"/></div>
<div class=menuParent>业务办理
<img src="image/triangle.png" width="20" height="20" align="right"/></div>
<div class=menuParent>流量直充
<img src="image/triangle.png" width="20" height="20" align="right"/></div>
<div class=menuParent>商品销售
<img src="image/triangle.png" width="20" height="20" align="right"/></div>
<div id="activity" class=menuParent >营销活动
<img src="image/triangle.png" width="20" height="20" align="right" /></div>
  <div id="details" style="DISPLAY: none">
      <A class=menuChild href="#"  target=main>充值类活动</A> 
      <A class=menuChild href="#"  target=main>业务办理活动</A>
  </div>
    当前用户:${username}  
 

</div>
</div>

</body>
</html>