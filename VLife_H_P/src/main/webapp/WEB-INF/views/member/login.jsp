<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P Zone</title>
</head>
<body>
	<table id="loginPageArea">
		<form action="member.loginhomego" name="loginForm" onsubmit="ioginCheck();"method="POST">
			<tr>
				<td align="center">
					<table id="loginPageArea2">
						<tr>
							<td align="center" class="tdStylefont">로그인 하세요</td>
						</tr>
						<tr>
							<td align="center" class="tdStylefont2">P Zone 에서 교류해보세요.</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
					<table>
						<tr>
							<td align="center">
								<input name="m_id" autocomplete="ID"
								placeholder="ID" style=""></td>
						</tr>
						<tr>
							<td align="center"><input name="m_pw" type="password"
								placeholder="PASSWORD"></td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td align="center"><button id="loginbutton">로그인하기</button></td>
			</tr>
		</form>
	</table>
	
	<table id="loginPageAreaJoin">
		<tr>
			<td align="center">계정이 없으신가요?</td>
		</tr>
		<tr>
			<td align="center"><button onclick="goJoin();">가입하기</button></td>
		</tr>
	</table>
</body>
</html>