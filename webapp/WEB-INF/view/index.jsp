<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div> 
        <form action="login" name="loginform" method="post">
            <span>학번 : </span><input type="number" name="stunum" class="inputlogin">
            <br>
            <span>비번 : </span><input type="password" name="passwd" class="inputlogin">
            <br>
            <button type="submit">로그인</button>
        </form>
    </div>
</body>
</html>