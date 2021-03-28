	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P Zone</title>
</head>
<body>
<h1>sdfss</h1>
	<form action="member.join" method="post" enctype="multipart/form-data"
		name="joinForm" onsubmit="return joinCheckff();">
		<table id="joinPageArea">
			<tr>
				<td align="center" ><br>아이디<br> <input placeholder="아이디는 영문,숫자 조합이 가능합니다." id="joinm_id" "autocomplete="off" name="m_id"><img src=""></td>
			</tr>
			<tr>
				<td align="center" ><br>비밀번호<br><input placeholder="비밀번호는 영문과 숫자를 조합해주세요." autocomplete="off"
					name="m_pw"></td>
			</tr>
			<tr>
				<td align="center" >
				<br>비밀번호 재확인<br><input placeholder="비밀번호를 재확인해주세요."
					autocomplete="off" name="m_pwck"></td>
			</tr>
			<tr>
				<td align="center" >
				<br>이름<br><input placeholder="사용자 이름"
					autocomplete="off" name="m_name"></td>
			</tr>
			<tr>
				<td align="center" >
				<br>주소<br>
				<input id="joinm_addr1" readonly="readonly" placeholder="우편번호" autocomplete="off" name="m_addr"><br>
				<input id="joinm_addr2" readonly="readonly" placeholder="주소" autocomplete="off" name="m_addr2"><br>
				<input placeholder="상세주소" autocomplete="off" name="m_addr3">
				</td>
			</tr>

			<tr>
				<td align="center" ><br>프로필 사진<br><input type="file" name="m_photo"></td>
			</tr>
			<tr>
				<td align="center" style="width: 30%; font-size: 12pt;">가입유형</td>
			</tr>	
			<tr>
				<td align="center" >
					<input name="m_role" type="radio" value="s" checked="checked" style="width: 70px;">
					&nbsp;스태프&nbsp;&nbsp;&nbsp;
					<input name="m_role" type="radio" value="g" style="width: 70px;">게스트
				</td>
			</tr>
			<tr>
				<td align="center" >
					<br><br>
					<c:forEach var="rr" items="${r }">
					${rr }
					</c:forEach>
					
					<br><br><br>
					<button>가입하기</button>
					<br><br><br>
					<br><br><br>
				</td>
			</tr>
			
		</table>
	</form>

</body>
</html>