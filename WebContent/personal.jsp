
<%@ include file="nocache.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<link rel="stylesheet" type="text/css" href="file1.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal-Information</title>

</head>
<body bgcolor="white">
<div style="margin-left:140px; width:1000px"   >
<iframe name="header" align="top" seamless="seamless" frameborder="0" src="header.html" height="120px" width="1000px"></iframe>
<iframe name="menubar" seamless="seamless" frameborder="0" src="menubar.html" height="60px"  width="1000px"></iframe>
<div align="right">
<font color="Red" size="2px" style="font-family: cursive;">
			hi ${username } <a href="logout.jsp">log out</a>
     </font>
     
     
</div>

<iframe name="menubar" seamless="seamless" frameborder="0" src="s_menubar.html" height="75px"  width="1000px"></iframe>
<div align=right>
<table>
<tr>
<td>
</td>&nbsp;&nbsp;
<td>
</td>
<td>
</td>
<td>
</td>
<td>
</td>
</tr>
</table>
</div>
</form>
<table>
<tr>
<td>
<div align="left">
<form action="personal" method="post">
<table topmargin="1000">
<tr>
<td><font size="50">Personal Information</font>
</td>
</tr>
<tr>
<td>Gender:</td><td>
<input type="text"required="required" value="${gender}" placeholder="Gender" size="25" height="200" name="gender">
</td>
</tr>
<tr>
<td>Mobile:</td><td>
<input type="text"  required="required" value="${mobile}" placeholder="Mobile" size="25" height="200" name="mobile">
</td>
</tr>
<tr>
<td>Nationality:</td><td>
<input type="text" required="required"value="${nationality}"  placeholder="Nationality" size="25" height="200" name="nationality">
</td>
</tr>
<tr>
<td>Current-Location:</td><td>
<input type="text"  required="required" value="${current_location}" placeholder="Current-Location" size="25" height="200" name="currentloc">
</td>
</tr>
<tr>
<td>student id:</td>
<td><input type="text"size="50" required="required" height="200" name="Studentid" value="${jsid}" readonly="readonly">
</td>
</tr>
<tr>
<td>
<input type="submit" value="Submit">
</td>
</tr>
</table>
</form>
</div>
</td>
<td>
<img src="company10.jpg" width="300" height="250">
</div>
</td>
</tr>
</table>
<iframe name="footer" align="bottom" seamless="seamless" frameborder="0" src="footer.html" height="120px" width="1000px"></iframe>


</div>

</body>
</html>