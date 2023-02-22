<%@page import="semi.dto.ScoreDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>

        <tr>
            <td>학번</td>
            <td>학과</td>
            <td>과목</td>
            <td>담당교수</td>
            <td>학점</td>
        </tr>
	<% List<ScoreDto> aa=(List<ScoreDto>)request.getAttribute("score"); 
	ScoreDto dto= aa.get(0);
	ScoreDto dtoo=aa.get(1);
	%>
        <tr>
            <td><%=dto.getStuid() %></td>
            <td><%=dto.getMajor() %></td>
            <td><%=dto.getSubject() %></td>
            <td><%=dto.getProfessor() %></td>
            <td><%=dto.getScore()%></td>
        </tr>

        <tr>
            <td><%=dtoo.getStuid() %></td>
            <td><%=dtoo.getMajor() %></td>
            <td><%=dtoo.getSubject() %></td>
            <td><%=dtoo.getProfessor() %></td>
            <td><%=dtoo.getScore() %></td>
        </tr>

    </table>
    
</body>
</html>