<%@ include file="nocache.jsp" %>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="file1.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
			<br>
			<div style="margin-left:140px; width:1000px"   >
			<iframe name="header" align="top" seamless="seamless" frameborder="0" src="header.html" height="120px" width="1000px"></iframe>
<iframe name="menubar" seamless="seamless" frameborder="0" src="menubar.html" height="60px"  width="1000px"></iframe>
<div align="right">
<font color="Red" size="2px" style="font-family: cursive;">
			hi ${username } <a href="logout.jsp">log out</a>
     </font>
     
     
</div>
			<font color="33CCFF"><center>Mail us any questions you have:</center></font>
			<hr color="black">
			<iframe name="menubar" seamless="seamless" frameborder="0" src="s_menubar.html" height="75px"  width="1000px"></iframe>
			<empty>
						<center>
						<form name="mailmyform" action="mail_question" method="post">
						<table>
						<tr><td>Recipient:</td><td><input type="text" name="recipient" size="25" value="parasdevil@gmail.com" readonly="readonly" required="required"/></td>>
						<tr><td>Sender:</td><td><input type="text" name="sender" size="25" value="${email}" required="required" readonly="readonly"/></td>
						<tr><td>Subject:</td><td><input type="text" name="subject" size="55" required="required"/></td></tr>
						<tr><td>Message:</td><td><textarea name="mailmessage"rows="10" cols="76" required="required"></textarea> </td></tr>
						<tr><td><input type="submit" value="send"></td><td><input type="reset" value="reset"></td></tr>
						</table>
						</form>
						</center>			
					</empty>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		<iframe name="footer" align="bottom" seamless="seamless" frameborder="0" src="footer.html" height="120px" width="1000px"></iframe>

				
			
</div>
</body>
</html>