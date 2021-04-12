<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P Zone</title>
</head>
<body>
	<table id="proResultBackTbl">
		<tr>
			<td>
				<table id="proResultTbl">
					<tr>
						<td>
							<c:forEach var="snsw" items="${snsw }">
							${snsw.m_sns_writer }<br>
							 ${snsw.m_sns_title }<br> 
							<img src="resources/img/${snsw.m_sns_photo }"><br> 
							${snsw.m_sns_txt }<br>
							<fmt:formatDate
								value="${snsw.m_sns_when }" type="yyyy/MM/dd" />
							${snsw.m_sns_explain } 
								</td>
							</c:forEach>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table>
		<form action="vlifesns.write" name="snswriteForm" method="post"
			enctype="multipart/form-data">
			<tr>
				<td><input name="token" value="${token }" type="hidden">
				</td>
			</tr>
			<tr>
				<td>
					<table id="snsWriteTbl">
						<tr>
							<td id="snsjQuerybutton" align="right">글쓰기>></td>
						</tr>
						<tr>
							<td align="center">
							<input name="m_sns_title"
								placeholder="프로젝트 명" style="width: 700px; height: 50px;">
							</td>
						</tr>
						<tr>
							<td align="right">
							<input name="m_sns_photo" type="file">
							</td>
						</tr>
						<tr>
							<td align="center"><textarea name="m_sns_txt"
									placeholder="스택 입력" maxlength="1000"
									style="width: 700px; height: 50px;"></textarea><br> <input
								name="m_sns_explain" placeholder="내용 입력" maxlength="1000"
								style="width: 700px; height: 100px;"><br></td>
						</tr>
						<tr>
							<td align="right">
								<button id="snsWriteTblBT">작성</button>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>