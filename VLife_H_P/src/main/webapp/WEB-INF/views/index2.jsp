<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>V-Zone</title>
<link rel="Stylesheet" href="resources/css/index.css">
<link rel="Stylesheet" href="resources/css/loginjoin.css">
<script type="text/javascript" src="resources/js/go.js"></script>
</head>
<body>
	<form action="">
		<table id="mainHomeArea">
			<tr>
				<td align="center" lowspan="2" id="mainTitleArea">
					<div>
						<a href="index.go">V Zone</a>
					</div>
				</td>
			</tr>
			<table id="mainHomeArea2">
				<tr>
					<td class="td2" align="right"><a href=""><img
							src="resources/img/IC.svg"></a></td>
					<td class="td2" align="right"><a href=""><img
							src="resources/img/weather.svg"></a></td>
					<td class="td2" align="right"><a href=""><img
							src="resources/img/camera.svg"></a></td>
					<td class="td2" align="right"><a href=""><img
							src="resources/img/camera.svg"></a></td>
				</tr>
			</table>
		</table>
		<table id="mainMenuArea">
			<tr>
				<td align="center">Home</td>
				<td align="center">V Life</td>
				<td align="center">Project</td>
				<td align="center">Contact</td>
			</tr>
		</table>
	</form>
	<table id="mainPapper3">
		<tr>
			<td>
				<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>		
	</table> 

</body>
</html>