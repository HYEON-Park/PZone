<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="snsTbl">
		여기는 로그인한사람 보는 게시판1
		<br> 여기는 로그인한사람 보는 게시판2
		<br> 여기는 로그인한사람 보는 게시판3
		<br> 여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는
		로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는
		로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판 여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는
		로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는
		로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판 여기는 로그인한사람 보는 게시판여기는
		로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는
		로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판여기는 로그인한사람 보는 게시판 여기는
		로그인한사람 보는 게시판
		<br>
		<form action="vlifesns.write" name="snswriteForm" method="post"
			enctype="multipart/form-data">
			<table id="snsBackGroundTbl">
				<input name="token" value="${token }" type="hidden">
				<table id="snsWriteTbl">
					<tr>
						<td id="snsjQuerybutton"> 글쓰기>>
						</td>
					</tr>
					<tr>
						<td>
							<button id="snsWriteTblBT">작성</button>
						</td>
					</tr>
					<tr>
						<td align="center"><input name="m_sns_title"
							placeholder="프로젝트 명" style="width: 500px; height: 50px;">
						</td>
						<td align="center"><input name="m_sns_photo" type="file">
						</td>
					</tr>
					<tr>
						<td align="center"><textarea name="m_sns_txt"
								placeholder="스택 입력" maxlength="1000"
								style="width: 700px; height: 50px;"></textarea><br> <input
							name="m_sns_explain" placeholder="내용 입력" maxlength="1000"
							style="width: 700px; height: 100px;"><br></td>
					</tr>
				</table>
			</table>
		</form>
	</table>
</body>
</html>