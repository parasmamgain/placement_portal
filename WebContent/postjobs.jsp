<%@ include file="nocache.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="file1.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
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
<div align="left">
<hr color="black">
<font size="50" color="33CCFF">Post- Jobs</font>
<hr color="black">
<form action="postjobs" method="post">
<table topmargin="1000">
<tr>
<td>company-name:</td><td>
<input type="text" required="required" value = "${cname}" readonly="readonly""25" height="200" name="cname">
</td>
</tr>
<tr>
<td>TotalPosts:</td><td>
<input type="text" required="required" placeholder="Total Posts" size="25" height="200" name="totalposts">
</td>
</tr>
<tr>
<td>Experience:</td><td>
<input type="text"  required="required" placeholder="Experience" size="25" height="200" name="experience">
</td>
</tr>
<tr>
<td>Post:</td><td>
<input type="text" required="required"  placeholder="Post" size="25" height="200" name="post">
</td>
</tr>
<tr>
<td>Description:</td><td>
<input type="text" required="required" placeholder="Description" size="25" height="200" name="description">
</td>
</tr>
<tr>
<td>Batch:</td><td>
<input type="text" required="required" placeholder="Batch" size="50" height="200" name="batch">
</td>
</tr>
<tr>
<td>Stream:</td><td>
<input type="text" placeholder="Stream" size="50" height="200" name="stream">
</td>
</tr>
<tr>
<td>
<input type="submit" value="sign">
</td>
</tr>
</table>
</form>
</div>
</td>
<td>
<div align="right">
<img src="img3.jpg" width="300" height="250">
</div>
</td>
</tr>
</table><iframe name="footer" align="bottom" seamless="seamless" frameborder="0" src="footer.html" height="120px" width="1000px"></iframe>

</div>

</body>
</html>