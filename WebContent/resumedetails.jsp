<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="file1.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resume</title>
</head>
<body bgcolor="white">
<div style="width:1000px" >
<iframe name="header" align="top" seamless="seamless" frameborder="0" src="header.html" height="120px" width="1000px"></iframe>

<form action="candidate_home.jsp" method="post">
<table topmargin="1000">
<div style="margin-left:140px; width:1000px"   >
<tr><td><div align="left"><h3>Personal Details</h3></div></td></tr>
<tr><td>STUDENT-ID</td><td><input type="text"  size="25" height="200" value="${jsid}" readonly="readonly"></td></tr>
<tr><td>first name</td><td><input type="text"  size="25" height="200" value="${fname}"     readonly="readonly"></td></tr>
<tr><td>middle name</td><td><input type="text"  size="25" height="200" value="${mname}"     readonly="readonly"></td></tr>
<tr><td>last name  </td><td><input type="text"  size="25" height="200" value="${lname}"     readonly="readonly"></td></tr>
<tr><td>Gender     </td><td><input type="text"  size="25" height="200" value="${gender}"     readonly="readonly"></td></tr>
<tr><td>Email      </td><td><input type="text"  size="25" height="200" value="${email}"     readonly="readonly"></td></tr>
<tr><td>Mobile    </td><td><input type="text"  size="25" height="200" value="${mobile}"     readonly="readonly"></td></tr>


<tr><td><div align="left"><h3>Professional Details</h3></div></td></tr>
<tr><td>CLASS-X   </td><td><input type="text"  size="25" height="200" value="${tenth}"     readonly="readonly"></td></tr>
<tr><td>CLASS-XII </td><td><input type="text"  size="25" height="200" value="${twelfth}"   readonly="readonly"></td></tr>
<tr><td>Graduation</td><td><input type="text"  size="25" height="200" value="${graduation}"readonly="readonly"></td></tr>
<tr><td>Stream		</td><td><input type="text"  size="25" height="200" value="${stream}" readonly="readonly"></td></tr>
<tr><td>CurrentProfile</td><td><input type="text"  size="25" height="200" value="${currentProfile}" readonly="readonly"></td></tr>
<tr><td>Skill		</td><td><input type="text"  size="25" height="200" value="${skill}" readonly="readonly"></td></tr>
<tr><td>RESUME-NO 	</td><td><input type="text"  size="25" height="200" value="${resume}"    readonly="readonly"></td></tr>
<tr><td><input type="submit" value="continue"></td></tr>
</table>
</form>

<hr color="black">
<footer>
Copyright © 3sP EntErpRiSeS
</footer><br><hr color="black">
</div>

</body>
</html>