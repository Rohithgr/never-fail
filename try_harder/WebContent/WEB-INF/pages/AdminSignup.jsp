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
		<h1>ADMIN END SIGNUP</h1>
	
	<form action="adminSignup.do" method="post">
		Enter Admin ID:<br>
		<input type="number"  placeholder="admin id" name="adminId"><br><br>
		Enter Mobile Number:<br>
		<input type ="number"  placeholder="Number" name="phoneNum"><br><br>
		Enter Password:<br>
		<input type="password"  placeholder="Password" name="password"><br><br>
		Enter Email:<br>
		<input type="email" placeholder="Email" name="email"><br><br>
		Enter First Name: 
		<input type="text" placeholder="First Name" name="firstName">
		Enter Last Name:
		<input type="text" placeholder="Last Name" name="lastName"><br><br>
		Enter Firm Name:<br>
		<input type="text" placeholder="Firm Name" name="firmName"><br><br>	
		<input type="submit" value="Submit">
	</form>
	</center>
</body>
</html>