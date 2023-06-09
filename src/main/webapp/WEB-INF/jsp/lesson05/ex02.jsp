<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리 (2)</title>
</head>
<body>
	<h2>1. 조건문 (c:choose, c:when, c:otherwise)</h2>
	<c:set var="weight" value="65"/>
	
	<c:choose>
		<c:when test="${weight < 60}"> <%-- 60미만 --%>
			치킨먹자!!!<br>
		</c:when>
		
		<c:when test="${weight < 70}"> <%-- 60 이상 ~ 70 미만 --%>
			샐러드 먹자!!!<br>
		</c:when>

		<c:otherwise> <%-- 70이상 --%>
			굶자ㅜㅜ<br>
		</c:otherwise>
	</c:choose>
	
	<h2>2. 반복문 (c:forEach)</h2>
	<c:forEach begin="0" end="5" step="1" var="val1">
		${val1}<br>
	</c:forEach>
	<br>
	<%-- 16~20 : 5번 --%>
	<c:forEach begin="16" end="20" step="1" var="val2" varStatus="status">
		val: ${val2} 
		current: ${status.current}
		first: ${status.first}
		last: ${status.last}
		count: ${status.count}
		index: ${status.index} <br>
	</c:forEach>
	<br>
	<%-- 서버에서 가져온 List<String> 출력 --%>
	<c:forEach var="fruit" items="${fruits}" varStatus="status">
		${fruit} ::::::: ${status.count} , ${status.index}<br>
	</c:forEach>
	<br>
	
	<%-- 서버에서 가져온 List<Map<String, Object>> 출력 --%>
	<c:forEach var="user" items="${users}" varStatus="status">
		<h4>${status.count}번째 사람정보</h4>
		이름: ${user.name}<br>
		나이: ${user.age}<br>
		취미: ${user.hobby}<br>
	</c:forEach>
	<br>	
		<%-- 테이블 구성 --%>
		<table border="1">
		 	<thead>
		 		<tr>
		 			<th>번호</th>
		 			<th>이름</th>
		 			<th>나이</th>
		 			<th>취미</th>
		 		</tr>
		 	</thead>
		 	
		 	<tbody>
		 	<c:forEach var="user" items="${users}" varStatus="status">
		 		<tr>
		 			<td>${stauts.count}</td>
		 			<td>${user.name}</td>
		 			<td>${user.age}</td>
		 			<td>${user.hobby}</td>
		 		</tr>
		 	</c:forEach>
		 	</tbody>
		</table>
</body>
</html>