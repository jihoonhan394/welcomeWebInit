<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	
</script>

<div class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card ">
					<div class="header">
						<h4 class="title">게시글 조회</h4>
					</div>
					<div class="content">
						<form id="selectSeqNoFrm" class="form-horizontal"
							action="welcomeWeb.do">
							<div class="row">
								<div class="form-group">
									<label class="col-sm-2 control-label">글 번호 선택</label>
									<div class="col-sm-8 arrayLabel">
										<c:forEach items="${arrayList}" var="arrayList"
											varStatus="status">
											<label class="checkbox checkbox-inline"> <input
												type="checkbox" data-toggle="checkbox" name="selectSeqNo"
												value="${status.count}" /> <span class="labelText">${status.count}</span>
											</label>
										</c:forEach>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="form-group">
									<label class="col-sm-2 control-label">컬럼 선택</label>
									<div class="col-sm-8 arrayLabel">
										<label class="checkbox checkbox-inline"> <input
											type="checkbox" data-toggle="checkbox" name="selectColumn"
											value="userId" /> <span class="labelText">아이디</span>
										</label> <label class="checkbox checkbox-inline"> <input
											type="checkbox" data-toggle="checkbox" name="selectColumn"
											value="userNm" /> <span class="labelText">이름</span>
										</label> <label class="checkbox checkbox-inline"> <input
											type="checkbox" data-toggle="checkbox" name="selectColumn"
											value="age" /> <span class="labelText">나이</span>
										</label> <label class="checkbox checkbox-inline"> <input
											type="checkbox" data-toggle="checkbox" name="selectColumn"
											value="cafeNick" /> <span class="labelText">별명</span>
										</label> <label class="checkbox checkbox-inline"> <input
											type="checkbox" data-toggle="checkbox" name="selectColumn"
											value="phone" /> <span class="labelText">핸드폰번호</span>
										</label>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<label class="col-sm-2 control-label">출력횟수 선택</label>
									<div class="col-sm-8 arrayLabel">
										<label class="radio checked"> <span class="icons">
												<span class="first-icon fa fa-circle-o"></span> <span
												class="second-icon fa fa-dot-circle-o"></span>
										</span> <input type="radio" data-toggle="radio" name="selectCount"
											value="1" checked="checked"> <span class="labelText">1</span>
										</label> <label class="radio"> <span class="icons"> <span
												class="first-icon fa fa-circle-o"></span> <span
												class="second-icon fa fa-dot-circle-o"></span>
										</span> <input type="radio" data-toggle="radio" name="selectCount"
											value="2"> <span class="labelText">2</span>
										</label>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-2 col-md-offset-5">
									<input type="hidden" id="pageName" name="pageName"
										value="array" /> <input type="submit"
										class="btn btn-wd btn-success" value="검색하기">
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>