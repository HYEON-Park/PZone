<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P Zone</title>
</head>
<body>
	<table id="memInfoTbl">
		<tr>
			<td>${sessionScope.loginMember.m_id }
				${sessionScope.loginMember.m_name }
				${sessionScope.loginMember.m_addr } 
				<img src="img/${sessionScope.loginMember.m_photo }" width="200px">
			</td>
		</tr>
	</table>
	<table>
			<tr>
			<td colspan="2" align="center">
				<button onclick="memberInfoGo();">회원정~~~~~보</button>
				<p>
				<button onclick="logout();">로그아웃</button>
			</td>
		</tr>
	</table>
</body>
</html>