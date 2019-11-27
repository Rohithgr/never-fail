<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
       
       
       
       
        <h1>Enter Passenger Details</h1>

	<table>
	<tr>
	<td>seat number</td>
	
	</tr>
	<c:forEach items="${seats}" var="s">
	<tr>
	<td>${s }</td>
	
	</tr>

	</c:forEach>
	
	</table>

        <form method="post">
             <table border="2">
            <tr>
                <th>Passenger Name</th>
                <th>Gender</th>
                <th>Age</th>
            </tr>
            <tr>
                <td><input type="text" placeholder="Full Name" /></td>
                <td><input type="text" placeholder="M/F" /></td>
                <td><input type="number" placeholder="Age" /></td>
            </tr>
            <tr>
                <td><input type="text" placeholder="Full Name" /></td>
                <td><input type="text" placeholder="M/F" /></td>
                <td><input type="number" placeholder="Age" /></td>
            </tr>
            <tr>
                <td><input type="text" placeholder="Full Name" /></td>
                <td><input type="text" placeholder="M/F" /></td>
                <td><input type="number" placeholder="Age" /></td>
            </tr>
            <tr>
                <td><input type="text" placeholder="Full Name" /></td>
                <td><input type="text" placeholder="M/F" /></td>
                <td><input type="number" placeholder="Age" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit"/>
        
        </form>
    </center>
</body>
</html>