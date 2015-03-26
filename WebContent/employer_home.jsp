<%@ include file="nocache.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="file1.css"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="margin-left:140px; width:1000px"   >
<iframe name="header" align="top" seamless="seamless" frameborder="0" src="header.html" height="120px" width="1000px"></iframe>
<iframe name="menubar" seamless="seamless" frameborder="0" src="menubar.html" height="60px"  width="1000px"></iframe>
<div align="right">
<font color="Red" size="2px" style="font-family: cursive;">
			hi ${username } <a href="logout.jsp">log out</a>
     </font>
     
     
</div>
	<nav>
			<font color="000000" align="left">&nbsp;&nbsp;Know Your<br><br>  
			</font>
			<font color="33CCFF">"OPPORTUNITY"</font>
	</nav><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<hr color="black">
<table><tr><td style="width:166px">
<a href="postjobs.jsp">Postjobs</a></td><td style="width:166px">
<a href="viewcandidates.jsp">View Candidates</a></td><td style="width:166px">
<a href="filtercandidates.jsp">Filter Candidates</a></td><td style="width:166px">
<a href="UnderConstruction.html">College Details</a></td><td style="width:166px">
<a href="UnderConstruction.html">Update details</a></td><td style="width:166px">
<a href="UnderConstruction.html">My Profile</a></td></tr>
</table>
<hr color="black">
<br>
<empty></empty><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<iframe name="footer" align="bottom" seamless="seamless" frameborder="0" src="footer.html" height="120px" width="1000px"></iframe>

</div>
</body>
</html>