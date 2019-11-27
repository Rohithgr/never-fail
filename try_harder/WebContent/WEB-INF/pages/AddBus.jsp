<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
    <h1>Add Bus Details</h1>
    <form action="addBus.do" method="post">
        <input type="number" placeholder="Enter BUS_ID" name="busId"/><br><br>
        <input type="text" placeholder="Enter BUS_NAME" name="busName"/><br><br>
        <input type="text" placeholder="Enter VEH_NO." name="vehNum"/><br><br>
        <input type="text" placeholder="Enter SOURCE" name="source"/><br><br>
        <input type="text" placeholder="Enter DESTINATION" name="destination"/><br><br>
        <input type="date"/><br><br>
        <input type="submit" value="Submit"/><br><br>
    </form>
    </center>
</body>
</html>