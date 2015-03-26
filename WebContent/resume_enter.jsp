<%@ include file="nocache.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="file1.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resume</title>
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
			<font color="33CCFF" size="10px">Academic Details-Resume</font>
			<hr color="black">
			<iframe name="menubar" seamless="seamless" frameborder="0" src="s_menubar.html" height="75px"  width="1000px"></iframe>
			<br><br><br><br><br><br><br><br>
			<table>
			<tr>
			<td>
			<div align="left">
			<form action="resume" method="post">
			<table >
			<tr><td>Tenth     :</td><td><input type="text" required="required" placeholder="Tenth %"size="25" height="200" name="tenth" value="${tenth}"></td></tr>
			<tr><td>Twelth    :</td><td><input type="text" required="required" placeholder="Twelth/diploma"size="25" height="200" name="twelfth" value="${twelfth}"></td></tr>
			<tr><td>Graduation:</td><td><input type="text" required="required" placeholder="Graduation" size="25" height="200" name="graduation" value="${graduation}"></td></tr>
			<tr><td>Resume No.:</td><td><input type="text" required="required" placeholder="Create unique resume no" size="25" height="200" name="resume" readonly="readonly" value="re${jsid}"></td></tr>
			<tr><td>Student ID:</td><td><input type="text" required="required" size="25" height="200" name="Studentid" value="${jsid}" readonly="readonly"></td></tr>
			<tr><td><input type="submit" required="required" value="Submit"></td></tr>
			</table>
			</form>
			</div>
			</td>
			</tr>
			</table>
<iframe name="footer" align="bottom" seamless="seamless" frameborder="0" src="footer.html" height="120px" width="1000px"></iframe>

</div>

</body>
</html>