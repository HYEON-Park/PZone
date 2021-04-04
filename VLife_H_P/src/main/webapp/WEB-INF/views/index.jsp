<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P Zone</title>
<link rel="Stylesheet" href="resources/css/index.css">
<link rel="Stylesheet" href="resources/css/loginjoin.css">
<link rel="Stylesheet" href="resources/css/project.css">
<link rel="Stylesheet" href="resources/css/vlifeSNS.css">
<script type="text/javascript" src="resources/js/go.js"></script>
<script type="text/javascript" src="resources/js/check.js"></script>
<script type="text/javascript" src="resources/js/ParkChecker.js"></script>
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<script type="text/javascript" src="resources/js/jQ.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<!-- 		http/https:를 안쓰면 내 사이트가 http면 그걸로 s 면 그걸로 바꿔줌 -->
<script  type="text/javascript"  charset="utf-8">  
    _aqiFeed({  container:"city-aqi-container",  city:"seoul"  });  
</script>
</head>
<body>

	<table id="mainHome">
		<tr>
			<td align="center">
				<table id="siteMain">
					<tr>
						<td align="left" ><a href="index.go">P Zone</a></td>	
					</tr>
				</table>
				<table id="siteMain2">
					<tr>
						<td class="td2" align="right"><a href="">
							<img src="resources/img/user.png"></a></td>
						<td class="td2" align="right"><a href="">
							<img src="resources/img/we.png" id="city-aqi-container"></a></td>
						<td class="td2" align="right"><a href="https://www.instagram.com/711p6/">
							<img src="resources/img/in.png"></a></td>
						<td class="td2" align="right"><a href="https://github.com/">
							<img src="resources/img/git.png"></a></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table id="siteMenu">
		<tr>
			<td align="center"><a href="home.go">Home</td>
			<td align="center"><a href="pzone.go">P Zone</td>
			<td align="center"><a href="vlifesns.go">V Life</td>
			<td align="center"><a href="project.go">Project</td>
			<td align="center"><a href="profile.go">Profile</td>
		</tr>
	</table>
	<table id="mainLoginPage">
		<tr>
			<td align="center" id="mainLoginPage">
			<jsp:include page="${loginPage }"></jsp:include>
			</td>
		</tr>
	</table>
	<table id="mainHomePage">
		<tr>
			<td align="center" id="mainHomePage">
			<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
	</table>
	
	
</body>
</html>