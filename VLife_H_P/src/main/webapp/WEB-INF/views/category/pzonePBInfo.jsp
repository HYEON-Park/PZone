<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>P ZONE</title>
</head>
<body>
	<table id="pPBInfo1">
		<c:forEach var="bb" items="${b2 }">
			<tr class="dataTr">
				<td>
					<table id="pPBInfoTblTitle">
						<tr>
							<%-- <td>${b2.m_board_no}</td> --%>
							<td style="text-align: center; font-weight: bolder;">${bb.m_board_title }</td>
						</tr>
						<tr>
							<td style="text-align: right;"><fmt:formatDate value="${bb.m_board_when }"
									pattern="yyyy-MM-dd" /></td>
							<td style="height: 15px;">&nbsp;&nbsp;&nbsp;id${bb.m_id }</td>
						</tr>
					</table>
					<table id="pPBInfoTblText">
						<tr>
							<td
								style="padding-left:20px; padding-right:20px;background-color: #EAEAEA; opacity: 0.8; border-bottom: 5px solid black;">${bb.m_board_text }</td>
						</tr>
					</table>
		<table>
			<tr>
				<td>
					<a href="pzone.modify.go?m_board_no=${bb.m_board_no }">
					<button id="pPBinfoUDButton" onclick="goBoardModifyGo();">수정</button></a>
				</td>
				</c:forEach>
			</tr>
		</table>
	</table>
</body>
</html>