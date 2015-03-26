<%@ include file="nocache.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="file1.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Professional Information</title>
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
<font size="50" color="33CCFF" >Professional Information</font>
<hr color="black">
<iframe name="menubar" seamless="seamless" frameborder="0" src="s_menubar.html" height="75px"  width="1000px"></iframe>
<font  size="16" >
<font face="italic"></font>
</font>
<tr>
<td>
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
<form action="professional" method="post">
<table topmargin="1000">
<tr>
<td>Stream</td><td>:
<input type="text"  required="required" placeholder="Stream" size="25" value="${stream}" height="200" name="stream">
</td>
</tr>
<tr>
<td>JobType</td><td>:
<input type="text" required="required" placeholder="Job Type" size="25" value="${jobtype}" height="200" name="jobtype">
</td>
</tr>
<tr>
<td>Skill</td><td>:
<input type="text" required="required" placeholder="Skills" size="25" height="200" value="${skill}"name="skill">
</td>
</tr>
<tr>
<td>Current Profile</td><td>:
<input type="text" required="required" placeholder="Current Profile" size="25" height="200" value="${currentprofile}"name="currentProfile">
</td>
</tr>
<tr>
<td>Batch</td><td>:
<input type="text"  required="required" placeholder="batch(eg.-2015,2014 etc)" size="25" height="200" value="${batch}"name="batch">
</td>
</tr>
<tr>
<td>Student id</td><td>:
<input type="text"size="25" required="required" height="200" name="Studentid" value="${jsid}" readonly="readonly">
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

</tr>
</table>
<br><br><br><br><br><br><br><br><br><br>
<iframe name="footer" align="bottom" seamless="seamless" frameborder="0" src="footer.html" height="120px" width="1000px"></iframe>

</div>

</body>
</html>