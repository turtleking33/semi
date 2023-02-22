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
	<span>학번 </span><span>${info.getStuid()}</span>
    </fieldset>
    <fieldset>
    <span>주소 </span><input type="text" value="${info.getAddress()}" name="address" id="address">
    </fieldset>
    <fieldset>
    <span>이메일 </span><input type="text" value="${info.getEmail()}" name="email" id="email">
	</fieldset>
	<button onclick="modi();" id="modi">정보 수정</button>
	
	<script>
		function modi(){
			location.href="modi";
			let innertext="";
            
			if(innertext=="확인") {
			document.querySelector("#address").value="";
			
            }
			
    	}
		
	</script>
</body>
</html>