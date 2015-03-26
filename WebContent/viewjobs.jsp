<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@ include file="nocache.jsp" %>
<html>
<%	int i=0;
    String cname = request.getParameter("csname");
    String cdname = request.getParameter("cdname");
    try {
 		String user="root",pass="root";
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
       Connection con = DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
        PreparedStatement st = con.prepareStatement("select * from postjobs");
        ResultSet rs = st.executeQuery();
        
%>

<body></body> <div style="margin-left:140px; width:1000px"   >
<jsp:include page="header.html"/>
<jsp:include page="menubar.html"/>
<jsp:include page="s_menubar.html"/>
<div align="right">
<font color="Red" size="2px" style="font-family: cursive;">
			hi ${username } <a href="logout.jsp">log out</a>
     </font>
     
     
</div>
<center><h1>list of jobs:</h1></center>
<table  border=1>
<tr><th>S.no</th><th >Company Name</th><th>Vacancies</th><th>details</th><th>Batch</th><th>Branches</th></tr>
<%	while (rs.next()) {
	out.print("<tr>");
	out.print("<td width:'20px'>"  + (++i) + "</td>");
    out.print("<td width:'200px'>" + rs.getString(1) + "</td>");
    out.print("<td width='100px'>" + rs.getString(2) + "</td>");
    out.print("<td width='200px'>" + rs.getString(5) + "</td>");
    out.print("<td width='200px'>" + rs.getString(6) + "</td>");
    out.print("<td width='200px'>" + rs.getString(7) + "</td></tr>");
  }
%>
</table><br><br><br><br>
<jsp:include page="footer.html"/>
<%
    } catch (Exception ex) {
        System.out.println(ex);
    }
%>
</div>
</body>
</html>
