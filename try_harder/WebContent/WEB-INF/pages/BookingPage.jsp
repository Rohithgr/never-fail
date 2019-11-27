<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>

 <script type="text/javascript">
        function chkcontrol(j) {
            var total = 0;
            var c = 0;
            for (var i = 0; i < document.form1.ckb.length; i++) {
                if (document.form1.ckb[i].checked) {
                    total = total + 1;
                    c++;
                }
                if (total > 4) {
                    alert("Please Select only four count" + (c - 1))
                    document.form1.ckb[j].checked = false;
                    return false;
                }
                document.getElementById("counter").value=c;
            }
        }


    </script>


</head>
<body>
<table>
        <tr>
            <td>${busDetails.busId}</td>
            <td>${busDetails.busName}</td>
            <td>${busDetails.vehNum}</td>
            <td>${busDetails.source}</td>
            <td>${busDetails.destination}</td>
            <td>${busDetails.date}</td>
        </tr>
 </table>
 
  <br>
    <center>
        <form name=form1 action="passengerDetails.do" method="POST">
        	<input type="hidden" name="busId" value="${busDetails.busId}"/>
            <input type="checkbox" name="ckb" value=1 onclick='chkcontrol(0)'>Seat 1
            <input type="checkbox" name="ckb" value=9 onclick='chkcontrol(1)'>Seat 9 <br>
            <input type="checkbox" name="ckb" value=2 onclick='chkcontrol(2)'>Seat 2
            <input type="checkbox" name="ckb" value=10 onclick='chkcontrol(3)'>Seat 10 <br>
            <input type="checkbox" name="ckb" value=3 onclick='chkcontrol(4)'>Seat 3
            <input type="checkbox" name="ckb" value=11 onclick='chkcontrol(5)'>Seat 11 <br>
            <input type="checkbox" name="ckb" value=4 onclick='chkcontrol(6)'>Seat 4
            <input type="checkbox" name="ckb" value=12 onclick='chkcontrol(7)'>Seat 12 <br>
            <input type="checkbox" name="ckb" value=5 onclick='chkcontrol(8)'>Seat 5
            <input type="checkbox" name="ckb" value=13 onclick='chkcontrol(9)'>Seat 13 <br>
            <input type="checkbox" name="ckb" value=6 onclick='chkcontrol(10)'>Seat 6
            <input type="checkbox" name="ckb" value=14 onclick='chkcontrol(11)'>Seat 14 <br>
            <input type="checkbox" name="ckb" value=7 onclick='chkcontrol(12)'>Seat 7
            <input type="checkbox" name="ckb" value=15 onclick='chkcontrol(13)'>Seat 15 <br>
            <input type="checkbox" name="ckb" value=8 onclick='chkcontrol(14)'>Seat 8
            <input type="checkbox" name="ckb" value=16 onclick='chkcontrol(15)'>Seat 16 <br><br>
            <input type="hidden" id="counter" name="total"  />
            <input type="submit" value="Submit" onclick=func() />
        </form>
    </center>
	
</body>
</html>