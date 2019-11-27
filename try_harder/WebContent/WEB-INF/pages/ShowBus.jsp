<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Added Buses</h1>
    <table>
        <tr>
            <th>Bus Id</th>
            <th>Bus Name</th>
            <th>Vehicle Number</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Journey Date</th>
        </tr>
        <c:forEach items="${busList}" var="bus">
        <tr>
            <td>${bus.busId}</td>
            <td>${bus.busName}</td>
            <td>${bus.vehNum}</td>
            <td>${bus.source}</td>
            <td>${bus.destination}</td>
            <td>${bus.date}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>