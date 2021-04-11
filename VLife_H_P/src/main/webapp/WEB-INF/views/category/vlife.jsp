<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P Zone</title>
</head>
<body>
	<table>
		<tr>
			<td>
				<table>
					<tr>
						<td>
							<c:forEach var="snsw" items="${snsw }"/>
				${snsw.m_sns_writer }
				${snsw.m_sns_title }
				<img src="resources/img/${snsw.m_sns_photo }">
				${snsw.m_sns_txt }
				${snsw.m_sns_explain }
				<fmt:formatDate value="${snsw.m_sns_when }" type="yyyy/MM/dd"/>
						</td>
					</tr>
				</table>
				<table>
					<form action="vlifesns.write" name="snswriteForm" method="post"
						enctype="multipart/form-data">
						<tr>
							<td>
								<input name="token" value="${token }" type="hidden">
							</td>
						</tr>
					<tr>
						<td>
							<table id="snsWriteTbl">
								<tr>
									<td id="snsjQuerybutton" align="right">글쓰기>></td>
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
											style="width: 700px; height: 50px;"></textarea><br> 
											<input name="m_sns_explain" placeholder="내용 입력" maxlength="1000"
										style="width: 700px; height: 100px;"><br></td>
								</tr>
								<tr>
									<td>
										<button id="snsWriteTblBT">작성</button>
									</td>
								</tr>
								</form>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>