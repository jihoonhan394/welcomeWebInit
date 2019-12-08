<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script>

	var leftChk = {
			
		pageSubmitFn : function(menuStr) {
			$("#leftFrm").attr("action", menuStr + ".do");
			
			$("#pageName").val(menuStr);
			
			$("#leftFrm").submit();
		}
	}
	
	$(function() {
		var pageName = "${param.pageName}";
		
		$("#leftUl > li").removeClass("active");
	
		$("#" + pageName).addClass("active");
		
		$("#leftUl > li").click(function() {
			leftChk.pageSubmitFn($(this).attr("id"));
		});
	});
	
</script>

<form id="leftFrm" method="post">
	<input type="hidden" id="pageName" name="pageName">
	<!-- <input type="hidden" id="userNm" name="userNm">
	<input type="hidden" id="arr" name="arr">
	<input type="hidden" id="happy" name="happy" value="happyV">
	<input type="hidden" id="nice" name="nice" value="niceV">
	<input type="hidden" id="cookie" name="cookie" value="cookieV"> -->
</form>

<div class="sidebar" data-color="orange" data-image="img/full-screen-image-3.jpg">
    <div class="logo">
        <a href="https://hanqea.co.kr/" class="logo-text">
            한큐에자바
        </a>
    </div>
	<div class="logo logo-mini">
		<a href="https://hanqea.co.kr/" class="logo-text">
			한큐에자바
		</a>
	</div>
  	<div class="sidebar-wrapper">
        <div class="user">
            <div class="photo">
                <img src="img/default-avatar.png" />
            </div>
            <div class="info">
                <a data-toggle="collapse" href="#collapseExample" class="collapsed">
                    Hanqea
                    <b class="caret"></b>
                </a>
                <div class="collapse" id="collapseExample">
                    <ul class="nav">
                        <li><a href="#">My Profile</a></li>
                        <li><a href="#">Edit Profile</a></li>
                        <li><a href="#">Settings</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <ul id="leftUl" class="nav">
            <li id="main">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>main</p>
                </a>
            </li>
            <li id="array">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>게시물 조회</p>
                </a>
            </li>
            <li id="welcomeWeb">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWeb</p>
                </a>
            </li>
            <li id="test">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>test</p>
                </a>
            </li>
          <!--   <li id="welcomeWebTable">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWebTable</p>
                </a>
            </li>
            <li id="welcomeWebMap">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWebMap</p>
                </a>
            </li>
            <li id="welcomeWebEgovMap">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWebEgovMap</p>
                </a>
            </li>
            <li id="welcomeWebString">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWebString</p>
                </a>
            </li>
            <li id="welcomeWebVO">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWebVO</p>
                </a>
            </li>
            <li id="welcomeWebReqPm">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWebReqPm</p>
                </a>
            </li>
            <li id="welcomeWebModelVO">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWebModelVO</p>
                </a>
            </li>
            <li id="welcomeWebCmmnVO">
                <a href="#">
                    <i class="pe-7s-graph"></i>
                    <p>welcomeWebCmmnVO</p>
                </a>
            </li> -->
        </ul>
  	</div>
</div>