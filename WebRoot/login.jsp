<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>NewTVOfficial后台登录系统！</title>
    
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<style type="text/css">
.titleimg{
position:absolute;
width:300px;
height:50px;
left:220px;
}
.backgroundimg{
position:absolute;
height:500px;
width:1350px;
top:50px;
}
.formdiv{
position:absolute;
width:350px;
height:190px;
left:120px;
top:170px;
background-color:white;
}
.text{
width:250px;
height:30px;
}
.loginlabel{
position:absolute;
left:40px;
top:20px;
font-size:25px;
}
.usernamediv{
position:absolute;
left:40px;
top:50px;
}
.passwordiv{
position:absolute;
left:40px;
top:85px;
}
.submitdiv{
position:absolute;
left:40px;
top:130px;

}
.button{
display: inline-block;
	outline: none;
	cursor: pointer;
	text-align: center;
	text-decoration: none;
	font: 14px/100% Arial, Helvetica, sans-serif;
	padding: .5em 2em .55em;
	text-shadow: 0 1px 1px rgba(0,0,0,.3);
	-webkit-border-radius: .5em; 
	-moz-border-radius: .5em;
	border-radius: .5em;
	-webkit-box-shadow: 0 1px 2px rgba(0,0,0,.2);
	-moz-box-shadow: 0 1px 2px rgba(0,0,0,.2);
	box-shadow: 0 1px 2px rgba(0,0,0,.2);
}
.usernamelogo{
position:absolute;
height:30px;
width:30px;
top:50px;
left:3px;
}
.passwordlogo{
position:absolute;
height:30px;
width:30px;
top:90px;
left:3px;
}
</style>
</head>
<body>
<header>
<img  class="titleimg" src="./image/titleimg.png" />
</header>
<div>
<img class="backgroundimg" src="./image/loginbackgroundimg.png"/>
</div>
<div class="formdiv" >
   <form>
   <legend class="loginlabel" >登录</legend><sapn id="warning"></sapn>
   <img  class="usernamelogo" src="./image/username.png" />
   <div class="usernamediv">
   
   <input class="text" type="text"/>
   </div> 
   <img  class="passwordlogo" src="./image/password.png" />
   <div class="passwordiv">
  
   <input class="text" type="password"/>
   </div>
   <div class="submitdiv">
   <input class="button" type="button" value="登录"/>
   </div>
   
   </form>
</div>

</body>
</html>
