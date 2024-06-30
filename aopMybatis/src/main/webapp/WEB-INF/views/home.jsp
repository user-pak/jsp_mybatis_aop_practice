<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="playerList.do">선수목록조회</a>
<form action="searchAteamPlayers.do" method="get">
	<input type="text" name="teamName">팀에 해당하는 선수들의 이름과 포지션, 등번호, 키를 조회	<button type="submit">조회</button>
</form>
</body>
</html>
