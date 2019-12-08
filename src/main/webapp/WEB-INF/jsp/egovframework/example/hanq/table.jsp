<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript">
</script>

<div class="container-fluid">
	<div class="row">
        <div class="col-md-12">
           	<div class="card">
               	<div class="header">
                   	<h4 class="title">테이블도 뭐 그렇게 어렵진 않아요</h4>
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
	                       	<c:forEach items="${hanqTableList}" var="hanqTableVar">
	                       		<tr>
	                       			<td><c:out value="${hanqTableVar.num}"></c:out></td>
	                       			<td><c:out value="${hanqTableVar.userId}"></c:out></td>
	                       			<td><c:out value="${hanqTableVar.userNm}"></c:out></td>
	                       			<td><c:out value="${hanqTableVar.age}"></c:out></td>
	                       			<td><c:out value="${hanqTableVar.cafeNick}"></c:out></td>
	                       			<td><c:out value="${hanqTableVar.phone}"></c:out></td>
	                       			<td><c:out value="${hanqTableVar.classNm}"></c:out></td>
	                       			<td><c:out value="${hanqTableVar.gisuNm}"></c:out></td>
	                       			<td><c:out value="${hanqTableVar.juchaNm}"></c:out></td>
	                       		</tr>
	                       	</c:forEach>
                       	</tbody>
                   	</table>
               	</div>
           	</div>
       	</div>
   	</div>
</div>
