<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="file1.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employer Profile</title>
</head>
<body bgcolor="white">
<div style="width:1000px" >
<iframe name="header" align="top" seamless="seamless" frameborder="0" src="header.html" height="120px" width="1000px"></iframe>

<form action="candidate_home.jsp" method="post">
<table topmargin="1000">
<div style="margin-left:140px; width:1000px"   >
<tr><td><div align="left"><h3>Personal Details</h3></div></td></tr>
<tr><td>Employer-ID</td><td><input type="text"  size="25" height="200" value="${Eid}" readonly="readonly"></td></tr>
<tr><td>first name</td><td><input type="text"  size="25" height="200" value="${fname}"     readonly="readonly"></td></tr>
<tr><td>middle name</td><td><input type="text"  size="25" height="200" value="${mname}"     readonly="readonly"></td></tr>
<tr><td>last name  </td><td><input type="text"  size="25" height="200" value="${lname}"     readonly="readonly"></td></tr>
<tr><td>Company Name     </td><td><input type="text"  size="25" height="200" value="${cname}"     readonly="readonly"></td></tr>
<tr><td>Email      </td><td><input type="text"  size="25" height="200" value="${email}"     readonly="readonly"></td></tr>
<tr><td>User Name    </td><td><input type="text"  size="25" height="200" value="${username}"     readonly="readonly"></td></tr>
</table>
</form>
<hr color="black">
<font color="red" size="5">
Total no. of  Jobs posted by you are -</font> <%= (String)session.getAttribute("jobs_count") %>
<%

%>
<footer>
Copyright © 3sP EntErpRiSeS
</footer><br><hr color="black">
</div>

</body>
</html>