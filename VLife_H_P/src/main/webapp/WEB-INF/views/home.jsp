<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P Zone</title>
<link rel="Stylesheet" href="resources/css/index.css">
<link rel="Stylesheet" href="resources/css/loginjoin.css">
<script type="text/javascript" src="resources/js/go.js"></script>
</head>
<body>
 	<table>
		<tr>
			<td>
			<!-- 로그인 안한 부분 -->
			<c:forEach var="r" items="${r }">
			${r }
			</c:forEach>
			</td>
		</tr>
	</table>

</body>
</html>