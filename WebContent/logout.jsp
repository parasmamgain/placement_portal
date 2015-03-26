<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" type="text/css" href="file1.css"/>
</head>

<body bgcolor="ffffff">
<div style="margin-left:140px; width:1000px"   >
<iframe name="header" align="top" seamless="seamless" frameborder="0" src="header.html" height="120px" width="1000px"></iframe>
<iframe name="menubar" seamless="seamless" frameborder="0" src="menubar.html" height="60px"  width="1000px"></iframe>
<%
session.invalidate();

%>
<center>you successfully logged out<br>
<a href="login.html">click here to login again</a>
</center>

<empty></empty>
<iframe name="footer" align="bottom" seamless="seamless" frameborder="0" src="footer.html" height="120px" width="1000px"></iframe>
</div>


</body>
</html>
