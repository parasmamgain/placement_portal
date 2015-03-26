<%@ include file="nocache.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="file1.css"/>
</head>
<body>
			<br>
			<div style="margin-left:140px; width:1000px"   >
			<iframe name="header" align="top" seamless="seamless" frameborder="0" src="header.html" height="120px" width="1000px"></iframe>
<iframe name="menubar" seamless="seamless" frameborder="0" src="menubar.html" height="60px"  width="1000px"></iframe>

			<font color="33CCFF"><center>Thank you for using our services.</center></font>
			<hr color="black">
			<empty>
						<center>
						<input type="text" value="${status}" name="status" readonly="readonly">
						</center>			
					</empty>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
			
		<iframe name="footer" align="bottom" seamless="seamless" frameborder="0" src="footer.html" height="120px" width="1000px"></iframe>

				</div>
				
			
</div>
</body>
</html>