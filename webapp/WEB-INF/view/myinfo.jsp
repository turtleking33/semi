<%@page import="semi.dto.ModiDto"%>
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
	<span>학번 </span><span>${info.stuid}</span>
    </fieldset>
    <fieldset>
    <span>주소 </span><input type="text" value="${info.address}" name="address" id="address">
    </fieldset>
    <fieldset>
    <span>이메일 </span><input type="text" value="${info.getEmail()}" name="email" id="email">
	</fieldset>
	<button onclick="modi()" id="modi">정보수정</button>
	
	<script>
	<% ModiDto dto=(ModiDto)request.getAttribute("modi");%>
		function modi(){
			document.getElementById("modi").innerText="확인";
			
// 				location.href="modi";
			
		}
// 			if(text=="확인") {
<%-- 			document.querySelector("#address").setAttribute("value", "<%=dto.getAddress() %>"); --%>
<%-- 			document.querySelector("#email").setAttribute("value", "<%=dto.getEmail() %>"); --%>
			
//             }
			
    			
	</script>
</body>
</html>