<%@page import="semi.dto.StuInfoDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<span>학번 </span><input type="text" value="${info.getStuid()}">
    </fieldset>
    <fieldset>
    <span>주소 </span><input type="text" value="${info.getAddress() }">
    </fieldset>
    <fieldset>
    <span>이메일 </span><input type="text" value="${info.getEmail() }">
	</fieldset>
	<button onclick="modi()">정보 수정</button>
	
	<script>
		function modi(){
			location.href="modi";
    	}
	</script>
</body>
</html>