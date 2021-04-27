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
	/* $(function() {
		$(".dataTr").click(function() {
			"goBoardInfoGo();"
		});

	});
	 */
</script>
</head>
<body>
	<table id="pzoneTbl">
		<tr>
			<td>
				<table class="pzoneReg">
					<tr>
						<td align="center">
							<table id="pzoneTblTop">
								<tr>
									<th>제목</th>
									<th>날짜</th>
								</tr>
							</table>
							<table id="pzoneTblReg">
								<c:forEach var="bws" items="${bws }">
									<tr class="dataTr" style="border-bottom-style: gray 1px inset;">

										<td class="pzoneTblRegTd">
											<a href="pzone.info.go?m_board_no=${bws.m_board_no }">${bws.m_board_no }</a>
										</td>
										<td class="pzoneTblRegTd">
											<a href="pzone.info.go?m_board_no=${bws.m_board_no }">${bws.m_board_title }</a>
										</td>
										
										<td class="pzoneTblRegTd" >
											<fmt:formatDate value="${bws.m_board_when }"
												pattern="yyyy-MM-dd" />
										</td>

									</tr>
								</c:forEach>
							</table>
						</td>
					</tr>
					<tr>
						<td>
							<table>
								<tr>
									<td align="left">
										<button id="pzoneRegButton" onclick="goBoard();">글쓰기</button>
									</td>
								</tr>
							</table>

						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>