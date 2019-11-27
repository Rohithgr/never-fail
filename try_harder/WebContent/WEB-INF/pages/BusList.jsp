<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form name="viewBus" action="">
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
            <td><a href="busDetails.do?busId=${bus.busId}">click here</a></td>
        </tr>
        </c:forEach>
		</table>
	</form>
	
</body>
</html>