<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="loginInfo">
		<tr>
			<td>
				${sessionScope.loginMember.m_id }
				${sessionScope.loginMember.m_name }
				<img src="img/${sessionScope.loginMember.m_photo }" width="180px">
			</td>
		</tr>	
	</table>

</body>
</html>