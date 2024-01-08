<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.javalex.ex.student" %>
<%-- 액션 태그 --%>
<%-- usebean :: 특정 자바빈의 내용을 가져옴 --%>
<jsp:useBean id="student1" class="com.javalex.ex.student" scope="page"/>

<%-- 다른 패키지 안에 묶어있을떄 --%>

<!-- setProperty :: 특정 필드의 값을 설정한다. -->
<jsp:setProperty name="student1" property="name" value="백"/>
<jsp:setProperty name="student1" property="age" value="25"/>
<jsp:setProperty name="student1" property="number" value="101"/>
<jsp:setProperty name="student1" property="gender" value="남"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- getProperty :: 특정 필드의 값을 반환한다. -->
	student1 이름 ::<jsp:getProperty name="student1" property="name"/>
	student1 나이 ::<jsp:getProperty name="student1" property="age"/>
	<%
		// page 지시어로, 자바빈 파일을 import해야 사용 가능
		student s1 = new student("이유나",25,"100","남성");
		student s2 = new student();
		
		s2.setName("이종권");
		s2.setAge(28);
		s2.setNumber("4");
		s2.setGender("남성");
	%>
</body>
</html>