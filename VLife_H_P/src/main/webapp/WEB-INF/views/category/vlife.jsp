<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P Zone</title>
<script type="text/javascript">
  /* 	$(function () {
		$("#snsWriteTbl img").click(function() {
			alert("ss");
		});

	}); */
</script>
</head>
<body>
	<table id="proResultBackTbl">
		<tr>
			<td>
			<c:forEach var="snsw" items="${snsw }">
				<table id="proResultTbl" style="box-shadow: 5px 5px 5px ${snsw.m_sns_color};">
					<tr>	
						<td>
							${snsw.m_id }<br>
							 ${snsw.m_sns_title }<br>
								<img src="resources/img/${snsw.m_sns_photo }"  style="max-width: 300px; height: 200px;">
								<br> 
							${snsw.m_sns_txt }<br>
								<fmt:formatDate value="${snsw.m_sns_when }" pattern="yyyy-MM-dd"/>
							${snsw.m_sns_explain } 
						</td>
					</tr>
				</table>
							</c:forEach>
			</td>
		</tr>
	</table>

	<table id="snsWriteBackTbl">
		<form action="vlifesns.write" name="snswriteForm" method="post"
			enctype="multipart/form-data">
			<tr>
				<td align="center">
					<input name="token" value="${token }" type="hidden">
				</td>
			</tr>
			<tr>
				<td align="center">
					<table id="snsWriteTbl">
						<tr>
							<td align="right">
							<img id="snsWriteTblimg"
								src="resources/img/writing.png" style="max-width: 55px;">
							</td>
						</tr>
						<tr>
							<td align="center">
							<input name="m_sns_title"
								placeholder="프로젝트 명" style="width: 400px; height: 70px;">
							</td>
						</tr>
						<tr>
							<td align="center"> 사진: <input name="m_sns_photo" type="file">
							</td>
						</tr>
						<tr>
							<td align="center">
								<textarea name="m_sns_txt"
									placeholder="스택 입력" maxlength="1000"
									style="width: 400px; height: 150px; text-align: left;"></textarea><br> 
								<input
								name="m_sns_explain" placeholder="내용 입력" maxlength="1000"
								style="width: 400px; height: 150px;"><br></td>
						</tr>
						<tr>
							<td align="right">
								<button id="snsWriteTblButton">작성</button>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>