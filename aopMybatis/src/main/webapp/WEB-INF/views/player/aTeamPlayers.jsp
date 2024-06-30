<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>특정 팀의 특정 정보 조회</title>
</head>
<body>
	<ul>
		${teamName }팀의 선수 정보
		<c:forEach items="${aTeamPlayers }" var="player">
			<li>${player.playerName } 의 포지션은 ${player.position}이고 등번호는 ${player.backNo}이며 키는 ${player.height }입니다.</li>
		</c:forEach>
	</ul>
</body>
</html>