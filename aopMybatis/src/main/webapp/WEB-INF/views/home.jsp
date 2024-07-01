<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="playerList.do">선수목록조회</a>
<p> 팀 목록 </p>
<ul id="teamList_ul"></ul>
<form action="searchAteamPlayers.do" method="get">
	팀 아이디<input type="text" name="teamName">에 해당하는 선수들의 이름과 포지션, 등번호, 키를 	<button type="submit">조회</button>
</form>

<script type="text/javascript">
	$.ajax({
		url: "teamList.do",
		method: "get",
		dataType:"json",
		success: function(teamList) {
			$.each(teamList, function(index, element) {
				$("#teamList_ul").append("<li><input type='text' size='3' readonly value='"+element.teamId +"'>"+ element.teamName + "</li>");
			})			
		},
		error: function() {
			alert("ajax 통신 에러");
		}
	})
		
	
</script>
</body>
</html>

