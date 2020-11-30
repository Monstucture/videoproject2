<%@page import="model.VideosList"%>
<%@page import="model.Videos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML>
<!--
	Full Motion by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->



<!-- Header -->
<%@ include file="header.jsp"%>
<!-- Main -->
<div id="main">
	<div class="inner">
		<div class="thumbnails">
		
					
			<c:forEach items="${VideosList.getVideosList()}" var="video">
				<div class="box">
					<a href="${video.url}" class="image fit"><img
						src="${video.img}" alt="" /></a>
					
					<div class="inner">
						<h3>${video.h3content}</h3>
						<p>${video.pcontent}</p>
						<a href="${video.url}" class="button fit"
							data-poptrox="youtube,800x400">Watch</a>
					</div>
				</div>

			</c:forEach>
		</div>

	</div>
	<div class="inner">

	<%@ include file="addnewvideo.jsp"%>
	<a href="deletevideo">DELETE VIDEO</a>



</div>
</div>

<!-- Footer -->

<%@ include file="footer.jsp"%>


</body>
<!-- Scripts -->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.scrolly.min.js"></script>
<script src="assets/js/jquery.poptrox.min.js"></script>
<script src="assets/js/skel.min.js"></script>
<script src="assets/js/util.js"></script>
<script src="assets/js/main.js"></script>
</html>