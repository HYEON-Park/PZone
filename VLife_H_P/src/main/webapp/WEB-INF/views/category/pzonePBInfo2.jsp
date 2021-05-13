<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="pPBInfo2">
		<form action="pzone.update.go" name="boardInfoUpdate" method="POST">
			<tr>
				<td>
					<table id="pPBInfo2Tbl">
						<tr>
							<td>
								<table id="pPBInfoTblTitle2">
									<c:forEach var="bb" items="${b2 }">
										<tr>
											<%-- <td>${b2.m_board_no}</td> --%>
											<td style="font-weight: bolder;">
											<input
												style="width: 850px; height: 50px; font-size: 18pt;"
												name="m_board_title" value="${bb.m_board_title }"></td>
										</tr>
										<tr>
											<td style="text-align: right;"><fmt:formatDate
													value="${bb.m_board_when }" pattern="yyyy-MM-dd" /></td>
											<td style="height: 15px;"></td>
										</tr>
										<tr>
											<td
												style="padding-left: 20px; padding-right: 20px; background-color: #EAEAEA; opacity: 0.8; border-bottom: 5px solid black;">
												<textarea
													style="width: 800px; height: 300px; font-size: 16pt;"
													name="m_board_text">${bb.m_board_text }</textarea>
											</td>
										</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td>
								<button id="pPBinfoUpdateButton">수정</button> 
								<%-- </c:forEach> --%>
								</form> 
								<%-- <c:forEach var="bb" items="${b2 }"> --%>
									<button value="${bb.m_board_no}" id="pPBinfoDeleteButton"
										onclick="goPBDelete();">삭제</button>
								</c:forEach>
							</td>
						</tr>
					</table>
				</td>
			</tr>
	</table>
</body>
</html>