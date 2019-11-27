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
            <h1>Customer Dashboard</h1>
            <hr>
            <form action="busList.do" method="get">
                Choose Source:
                <select name="source">
                    <option value="Mumbai" name="Mumbai">Mumbai</option>
                    <option value="Pune" name="Pune">Pune</option>
                </select><br><br>
                Choose Destination:
                <select name="destination">
                        <option value="Mumbai" name="Mumbai">Mumbai</option>
                    <option value="Pune" name="Pune">Pune</option>
                    </select><br><br>
                <input type = "submit"  value="ShowBus"/>
            </form>
        </center>
</body>
</html>