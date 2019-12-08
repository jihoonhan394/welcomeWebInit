<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript">
$(function() {
	
		$("tbody > tr").click(function() {
			
			$("#userNm").val($(this).children().eq(2).text());
			
			leftChk.pageSubmitFn("welcomeWebCmmnVO");
		});
});
</script>

<div class="container-fluid">
	<div class="row">
        <div class="col-md-12">
           	<div class="card">
               	<div class="header">
                   	<h4 class="title">테이블도 뭐 그렇게 어렵진 않아요<c:out value="${vo.userNm}"/></h4>
                   	<p class="category">기본 확실하게 다져서 갑시다~</p>
               	</div>
				<div class="content table-responsive table-full-width">
                   	<table class="table table-hover table-striped">
                       	<thead>
                          	<th>NO</th>
                       		<th>아이디</th>
                       		<th>이름</th>
                       		<th>나이</th>
                       		<th>닉네임</th>
                          	<th>핸드폰 번호</th>
                          	<th>수업 과정</th>
                          	<th>기수</th>
                          	<th>주차</th>
                       	</thead>
                       	<tbody>
	                       	<c:forEach items="${welcomeWebList}" var="welcomeWebVar">
	                       		<tr>
	                       			<td><c:out value="${welcomeWebVar.num}"></c:out></td>
	                       			<td><c:out value="${welcomeWebVar.userId}"></c:out></td>
	                       			<td><c:out value="${welcomeWebVar.userNm}"></c:out></td>
	                       			<td><c:out value="${welcomeWebVar.age}"></c:out></td>
	                       			<td><c:out value="${welcomeWebVar.cafeNick}"></c:out></td>
	                       			<td><c:out value="${welcomeWebVar.phone}"></c:out></td>
	                       			<td><c:out value="${welcomeWebVar.classNm}"></c:out></td>
	                       			<td><c:out value="${welcomeWebVar.gisuNm}"></c:out></td>
	                       			<td><c:out value="${welcomeWebVar.juchaNm}"></c:out></td>
	                       		</tr>
	                       	</c:forEach>
                       	</tbody>
                   	</table>
               	</div>
           	</div>
       	</div>
   	</div>
</div>
