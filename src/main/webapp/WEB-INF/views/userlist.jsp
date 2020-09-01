<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of users</title>
</head>
<div>
<a href ="user_form">Add User</a>
</div>
<body>
	<c:if test="${!empty users }">
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Date of Birth</th>
				<th>Gender</th>
				<th>Education Level</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${users }" var="user">
				<tr>
					<th>${user.firstname }</th>
					<th>${user.lastname }</th>
					<th>${user.dob }</th>
					<th>${user.gender }</th>
					<th>${user.educationlevel }</th>
					
				</tr>			
		
			</c:forEach>
		</tbody>
		
	</table>
</c:if>
</body>
</html>