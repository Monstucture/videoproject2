<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="inner">

	<form method="POST" action="">
		<input type="hidden" name="img" value="null">
		YouTube video url (shareable link!): <input type="text" name="url"
			size="20"><br />
		<br /> Title: <input type="text" name="h3content" size="10"><br />
		<br /> Description: <input type="text" name="pcontent" size="10"><br />
		<br /> <input style="margin: auto auto auto 90%" type="submit"
			value="ADD VIDEO">

	</form>



</div>

