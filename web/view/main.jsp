<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>言言家族  - Familyan.com！</title>
</head>
<style>
	body {width:100%; height:auto; margin:0;}
	.head {width:1024px;height:auto;}
	/*.ads {width:1024px;height:190px;background-color:#b2d8f1;vertical-align:middle; padding-top:50px;}*/
	.resolution {width:1024px;height:auto;}
	.align-middle {margin-right:auto;margin-left:auto;}
	/*.ads .title {font-size: xx-large;text-align:center;vertical-align:middle;color:red;}*/
	.navigator {width:1010px; height:30px;margin-top:4px;padding:7px 10px 10px 7px; background-color:#000000; border-top:thin; border-top-color:#666666;}
	.navigator > div { float:left;width:auto;margin-right:20px; font-size:20px;color: white;}
	.navigator  a {display:block;text-decoration: none;color: highlight;border: none; height:40px;}
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
	.ads {width:auto;margin-top:4px;}
	.ads div {width:1024px;height:200px;background: #9BD1FA}
	b.rtop, b.rbottom {display:block;background: #FFF}
	b.rtop b, b.rbottom b {display:block;height: 1px;overflow: hidden; background: #9BD1FA;}
	b.r1 {margin: 0 5px}
	b.r2 {margin: 0 3px}
	b.r3{margin: 0 2px}
	b.rtop b.r4, b.rbottom b.r4 {margin: 0 1px;height: 2px}
	
	.signin_bar { width:100px;height:30px;float:right;margin-top:4px;}
	.signin_bar > span {width: 30px;text-align: center;height:30px;margin-left:4px;}
	
	.content {margin-top:4px;}
	.content_tab {height:400px;float:left;width:auto;padding-top:20px;}
	.content_tab > div {height:30px;text-align: center; line-height:30px; width:100px;margin-top:6px;background:activeborder;border:solid; border-color: black;}
	
	.tab_content {height:350px;width:900px;border:dotted;border-color: black;float: left;}
</style>
<script type="text/javascript" src="js/jquery-1.7.2.min.js" ></script>
<body>
<div class="wrap">
	<div class="head align-middle">
		<div class="resolution" style="height:60px;">
			<jsp:include page="common/logo.jsp"></jsp:include>
			<div class="signin_bar"><span><a id="signin_link" href="javascript:void(0);">登陆</a></span><span><a href="javascript:void(0);">注册</a></span></div>
		</div>
		<div class="navigator align-middle">
			<div><a href="#">Home</a></div>
			<div>|</div>
			<div><a href="#">Zone</a></div>
			<div>|</div>
			<div><a href="#">Games</a></div>
			<div>|</div>
			<div><a href="#">Blog</a></div>
			<div>|</div>
			<div><a href="#">Contact Us</a></div>
		</div>
		<div class="ads">
		  <b class="rtop">
			<b class="r1"></b>
			<b class="r2"></b>
			<b class="r3"></b>
			<b class="r4"></b>
		  </b>
		  <div ><img src="" /></div>
		  <b class="rbottom">
			<b class="r4"></b>
			<b class="r3"></b>
			<b class="r2"></b>
			<b class="r1"></b>
		  </b>
		</div>
	</div>
	<div class="content resolution align-middle">
		<div class="content_tab">
			<div>1st tab</div>
			<div>2nd tab</div>
			<div>3rd tab</div>
			<div>4th tab</div>
		</div>
		<div class="tab_content">
			<div style=""></div>
		</div>
	</div>
</div>
</body>
</html>
