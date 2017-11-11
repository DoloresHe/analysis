<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 

<!DOCTYPE html>
<html>
<head>
<script src="resources/jquery-3.2.1.min.js"></script>
</head>

<title></title>

<script>

 
</script>

<style>
input[type=text],
input[type=password]{
BACKGROUND-COLOR: transparent;
}
input{
    width: 50%;
    padding: 8px 5px;
 }
</style>


<body >
			<section class="main">
     			 <form action="login.do" method="post" id="loginForm">
				    <h1></h1>
				    <p>
				        <input type="text" name="username" placeholder="Username or email" >
				    </p>
				    <p>
				        <input type="password" name="password" placeholder="Password" > 
				    </p>

				    <p>
				        <input type="submit" name="submit" value="Continue">
				    </p>       
							   
				</form>

			</section>

</body>
</html>