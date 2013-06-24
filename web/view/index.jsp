<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>卧底Online  - 谁是卧底！</title>
</head>
<style>
	body {width:100%; height:auto; margin:0;}
	.head {width:1024px;height:auto;}
	/*.ads {width:1024px;height:190px;background-color:#b2d8f1;vertical-align:middle; padding-top:50px;}*/
	.resolution {width:1024px;height:auto;}
	.align-middle {margin-right:auto;margin-left:auto;}
	/*.ads .title {font-size: xx-large;text-align:center;vertical-align:middle;color:red;}*/
	.navigator {width:1010px; height:30px;margin-top:4px;padding:7px 10px 10px 7px; background-color:#000000; border-top:thin; border-top-color:#666666;}
	.navigator > div { float:left;width:auto;margin-right:20px; font-size:20px;}
	.navigator  a {display:block;text-decoration: none;color: highlight;border: none;}
	.navigator a:link {color: white;}
	.navigator a:visited {color: white;}
	.navigator a:hover {color:white;}
	
	
	.pillar {background:transparent; width:40%; margin:4px 4px 4px 4px; }
	.pillar h1, .pillar p { margin:0 10px; }
	.pillar h1 { font-size:2em; color:#fff;}
	.pillar p {padding-bottom:0.5em;}
	.pillar .b1, .pillar .b2, .pillar .b3, .pillar .b4 { display:block; overflow:hidden; font-size:1px;}
	.pillar .b1, .pillar .b2, .pillar .b4 { height:1px; }
	.pillar .b2, .pillar .b3 { background:#d66; border-left:1px solid #fff; border-right:1px solid #fff;}
	.pillar .b4 { background:#d66; border-left:4px solid #fff; border-right:4px solid #fff;}
	.pillar .b1 {margin:0 2px; background:#fff;}
	.pillar .b2 { margin:0 1px; border-width:0 1px; }
	.pillar .b3 {height:2px; margin:0;}
	.pillar .b4 { margin:0 2px; }
	.pillar .boxcontent { display:block;  background:#d66;  border-left:1px solid #fff;  border-right:1px solid #fff;  margin:0 5px;}
	.ads div {width:1024px;height:200px;background: #9BD1FA}
	
	.signin_bar { width:80px;height:30px;float:right;}
	.signin_bar > span {width: 30px;text-align: center;height:30px;}
	
		
</style>
<body>
<div class="wrap">
	<div class="head align-middle">
		<div class="resolution">
			<jsp:include page="common/logo.jsp"></jsp:include>
			<div class="signin_bar"><span><a>登陆</a></span><span><a>注册</a></span></div>
		</div>
		<div class="ads">
		  <b class="rtop">
			<b class="r1"></b>
			<b class="r2"></b>
			<b class="r3"></b>
			<b class="r4"></b>
		  </b>
		  <div >卧底Online，敬请期待！</div>
		  <b class="rbottom">
			<b class="r4"></b>
			<b class="r3"></b>
			<b class="r2"></b>
			<b class="r1"></b>
		  </b>
		</div>
	</div>
	<div class="navigator align-middle">
		<div><a href="#">首页</a></div>
		<div><a href="#">角色介绍</a></div>
		<div><a href="#">游戏规则</a></div>
		<div><a href="#">玩家排行</a></div>
		<div><a href="#">积分等级</a></div>
		<div><a href="#">XXXX</a></div>
		<div><a href="#">XXXX</a></div>
	</div>
	<div class="content">
		<div class="middle" >
			<div id="table">

			</div>
			<div id="noneMessage"></div>
		</div>
	</div>
</div>
</body>
</html>
