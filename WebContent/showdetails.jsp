<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@ include file="nocache.jsp" %>
<html>
<%	int i=0;
    try {
    	String cname=(String)session.getAttribute("cname");
    	String query="select * from postjobs where cname=?";
 		String user="root",pass="root";
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
        PreparedStatement st = con2.prepareStatement(query);
        st.setString(1,cname);
        ResultSet rs = st.executeQuery();
        
        
 %>
<body></body> <div style="margin-left:140px; width:1000px"   >
<jsp:include page="header.html"/>
<jsp:include page="menubar.html"/>
<div align="right">
<font color="Red" size="2px" style="font-family: cursive;">
			hi ${username } <a href="logout.jsp">log out</a>
     </font>
     
     
</div>
<center><h1>list of jobs posted by you:</h1></center>
<table  border=1>
<tr><th>S.no</th><th>Company Name</th><th>Total Posts</th><th>Experience<th>Post</th></th><th>Stream</th><th>Batch</th></tr>
<%	while (rs.next()) {
	out.print("<tr>");
	out.print("<td width:'30px'>"  + (++i) + "</td>");
	out.print("<td width='40px'>" + rs.getString("cname") + "</td>");
    out.print("<td width='40px'>" + rs.getString(2) + "</td>");
    out.print("<td width='40px'>" + rs.getString(3) + "</td>");
    out.print("<td width='100px'>" + rs.getString(4) + "</td>");
    out.print("<td width='200px'>" + rs.getString(7) + "</td>");
    out.print("<td width='50px'>" + rs.getString(6) + "</td></tr>");
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
