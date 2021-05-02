<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P ZONE</title>
</head>
<body>
	<table >
		<tr>
			<td id="pPZTopTbl">
			 P Zone 자유게시판
			</td>
		</tr>
	</table>
	<form action="pzone.write.go" name="boardForm" method="POST">
		<table id="pPBboard">
			<tr>
				<td>글제목</td>
				<td><input id="m_board_title" name="m_board_title" style=""></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="30" cols="50" id="m_board_text"
						name="m_board_text" style="width: 900px;"></textarea></td>
			</tr>
			<tr>
				<td align="right"><button id="pPBboardWriteButton">작성</button></td>
			</tr>
		</table>
	</form>
</body>
</html>