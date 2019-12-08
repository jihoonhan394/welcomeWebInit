<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript">
$(function() {
	var labelsArr = [],
		seriesArr = [];
	
	<c:forEach items="${hanqPieList}" var="hanqPieVar" varStatus="status">
		labelsArr["<c:out value='${status.index}'/>"] = "<c:out value='${hanqPieVar.labels}'/>";
		seriesArr["<c:out value='${status.index}'/>"] = "<c:out value='${hanqPieVar.series}'/>";
	</c:forEach>
	
	var dataPreferences = {
		labels: labelsArr,
		series: seriesArr
	};

	Chartist.Pie('#chartPreferences', dataPreferences);
});

</script>

<div class="container-fluid">
	<div class="row">
    	<div class="col-md-6">
        	<div class="card">
            	<div class="header">
                       	수업 과정별 수강자 통계
                	<p class="category">Hanq Pie Chart</p>
                </div>
                <div class="content">
                	<div id="chartPreferences" class="ct-chart "></div>
                </div>
                <div class="footer">
                	<h6>Legend</h6>
                    <i class="fa fa-circle text-warning"></i>
                    <i class="fa fa-circle text-danger"></i>
                    <i class="fa fa-circle text-info"></i>
                </div>
            </div>
        </div>
   	</div>
</div>
