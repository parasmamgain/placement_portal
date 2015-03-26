<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@ include file="nocache.jsp" %>
<html>
<%	int i=0;
    try {
    	String branch=request.getParameter("branch");
    	
    	String l_branch=branch.toLowerCase();
    	
		
    	String query="select * from (select * from f_signup f inner join professionaldetails p on f.jsid=p.jsid inner join resume r on p.jsid=r.jsid inner join personaldetails pd on r.jsid=pd.jsid) where stream like (?)";
 		String user="root",pass="root";
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
        
        
        PreparedStatement st = con2.prepareStatement(query);
        st.setString(1,l_branch);
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
<center><h1>list of registered students:</h1></center>
<table  border=1>
<tr><th>S.no</th><th>Student-Id</th><th >Student Name</th><th>X(in %)</th><th>XII(in %)</th><th>Graduation(in %)<th>Branch</th><th>Email-id</th></th><th>Contact no.</th><th>Batch</th></tr>
<%	while (rs.next()) {
	out.print("<tr>");
	out.print("<td width:'30px'>"  + (++i) + "</td>");
	out.print("<td width='50px'>"  + rs.getString("jsid") + "</td>");
    out.print("<td width:'200px'>" + rs.getString("fname") + "&nbsp;"+rs.getString("lname") +"</td>");
    out.print("<td width='40px'>" + rs.getString("tenth") + "</td>");
    out.print("<td width='40px'>" + rs.getString("twelth") + "</td>");
    out.print("<td width='40px'>" + rs.getString("graduation") + "</td>");
    out.print("<td width='100px'>" + rs.getString("stream") + "</td>");
    out.print("<td width='200px'>" + rs.getString("email") + "</td>");
    out.print("<td width='100px'>" + rs.getString("mobile") + "</td>");
    out.print("<td width='50px'>" + rs.getString("batch") + "</td></tr>");
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
