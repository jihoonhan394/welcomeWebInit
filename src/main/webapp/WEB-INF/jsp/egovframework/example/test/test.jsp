<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="test.do">
		<input type="hidden" name="test[]" value="1n">
		<input type="hidden" name="test[]" value="2n">
		<input type="hidden" name="test[]" value="3n">
		<input type="hidden" name="test[]" value="4n">
		<input type="hidden" name="test[]" value="5n">
		<input type="hidden" name="test1" value="1x">
		<input type="hidden" name="test1" value="2x">
		<input type="hidden" name="test1" value="3x">
		<input type="hidden" name="test1" value="4x">
		<input type="hidden" name="test1" value="5x">
		<input type="submit" value="버튼">
	
	</form>
</body>
</html>