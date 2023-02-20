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
        <button onclick="myinfo" name="myinfo">내정보</button>
        <br>
        <button onclick="myscore">학점확인</button>
    </div>

    <script>
        function myinfo(){
            location.href="myinfo";
        }

        function myscore(){
            location.href="myinfo";
        }
    </script>
</body>
</html>