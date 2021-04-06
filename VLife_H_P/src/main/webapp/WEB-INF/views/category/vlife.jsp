<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table id="snsBackGroundTbl">
	<form action="vlifesns.write" name="vlifesnswrite" method="post">
		<input name="token" value="${token }" type="hidden">
			<table id="snsWriteTbl">
				<tr>
					<td align="center">
						<input name="m_sns_title" placeholder="프로젝트 명"style="width: 500px; height: 50px;">
					</td>
					<td align="center">	
						<input name="m_sns_photo" type="file">
					</td>
				</tr>
				<tr>
					<td align="center">
						<textarea name="m_sns_txt" placeholder="스택 입력" maxlength="1000" style="width: 700px; height: 50px;"></textarea><br>
						<input name="m_sns_explain" placeholder="내용 입력"maxlength="1000"style="width: 700px; height: 100px;"><br>
					</td>
				</tr>
		</table>
	</form>
	<button>작성</button>
</table>
</body>
</html>