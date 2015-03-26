<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@ include file="nocache.jsp" %>
<html>
<body></body>
<div style="margin-left:140px; width:1000px"   >
<jsp:include page="header.html"/>
<jsp:include page="menubar.html"/>
<div align="right">
<font color="Red" size="2px" style="font-family: cursive;">
			hi ${username } <a href="logout.jsp">log out</a>
     </font>
     
     
</div>
<hr color="#33CCFF">
<form name="filter_marks" action="filter_marks.jsp" method="post">
<table>
<tr><td>Tenth</td><td>:<select name="tenthmarks">  <option>55</option><option>60</option><option>65</option><option>70</option>
				<option>75</option><option>80</option><option>85</option><option>90</option>
	  			</select></td>
	  </tr>
	  <tr>
	  <td>
Twelth</td><td>:<select name="twelthmarks">  <option>55</option><option>60</option><option>65</option><option>70</option>
				<option>75</option><option>80</option><option>85</option><option>90</option>
	  			
	  </select></td></tr>
	  <tr><td>
Graduation</td><td>:<select name="graduationmarks">  <option>55</option><option>60</option><option>65</option><option>70</option>
				<option>75</option><option>80</option><option>85</option><option>90</option>
	  			
	  </select></td></tr>
	  </table><div align="right">
<input type="submit" value="Filter by marks"></div>
</form><br>
<hr color="#33CCFF">
<form name="filter_branch" action="filter_branch.jsp" method="post">
<table><td>Branch</td><td>:<select name="branch">  <option>CSE</option><option>IT</option><option>ECE</option><option>EE</option>
				<option>CE</option><option>AEI</option><option>IPE</option><option>ME</option>
	  			
	  </select></td></tr>
	  </table><div align="right">
<input  type="submit" value="Filter by branches"></div>
</form><br>
<hr color="#33CCFF">
<form name="filter_marks_branch" action="filter_marks_branch.jsp" method="post">
<table>
<tr><td>Tenth</td><td>:<select name="tenthmarks">  <option>55</option><option>60</option><option>65</option><option>70</option>
				<option>75</option><option>80</option><option>85</option><option>90</option>
	  			</select></td>
	  </tr>
	  <tr>
	  <td>
Twelth</td><td>:<select name="twelthmarks">  <option>55</option><option>60</option><option>65</option><option>70</option>
				<option>75</option><option>80</option><option>85</option><option>90</option>
	  			
	  </select></td></tr>
	  <tr><td>
Graduation</td><td>:<select name="graduationmarks">  <option>55</option><option>60</option><option>65</option><option>70</option>
				<option>75</option><option>80</option><option>85</option><option>90</option>
	  			
	  </select></td></tr>
	<td>  Branch</td><td>:<select name="branch">  <option>CSE</option><option>IT</option><option>ECE</option><option>EE</option>
				<option>CE</option><option>AEI</option><option>IPE</option><option>ME</option>
	  			
	  </select></td></tr>
	  </table>

<div align="right">
<input type="submit" value="Filter by marks and branches"></div>
</form><br>
<hr color="#33CCFF">

<br><br><br><br>
<jsp:include page="footer.html"/>

</div>
</body>
</html>
