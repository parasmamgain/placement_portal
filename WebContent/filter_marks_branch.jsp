<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@ include file="nocache.jsp" %>
<html><head></head>
<%	int i=0;
ArrayList<String> emailid=new ArrayList<String>();
    try {
    	String tenthmarks=request.getParameter("tenthmarks");
		String twelthmarks=request.getParameter("twelthmarks");
		String graduationmarks=request.getParameter("graduationmarks");
		String branch=request.getParameter("branch");
    	String l_branch=branch.toLowerCase();
    	String query="select * from (select * from f_signup f inner join professionaldetails p on f.jsid=p.jsid inner join resume r on p.jsid=r.jsid inner join personaldetails pd on r.jsid=pd.jsid) where tenth > ? and twelth > ? and graduation >? and stream like (?)";
    	String user="root",pass="root";
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        
        Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:" + user + "/" + pass + "@localhost:1521:xe");
        PreparedStatement st = con2.prepareStatement(query);
        st.setString(1,tenthmarks);
        st.setString(2,twelthmarks);
        st.setString(3,graduationmarks);
        st.setString(4,l_branch);
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
<%
StringBuilder sb= null ;
String recipient=new String();
while (rs.next()) {
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
	emailid.add(rs.getString("email"));
	
}

sb = new StringBuilder();
for(String str : emailid)
{
    sb.append(str).append(","); //separating contents using semi colon
}
	

recipient=sb.toString();

%>
</table><br><br><br><br>
<empty>
							<center>
						<form name="email_all"  method="post" action="email_to_all">
						<table>
						<tr><td>Recipient:</td><td><input type="text" name="recipient" size="25" value="<%=recipient %>" readonly="readonly" required="required"/></td>>
						<tr><td>Sender:</td><td><input type="text" name="sender" size="25" value=value="${email }" readonly="readonly" required="required"/></td>>
					
						<tr><td>Subject:</td><td><input type="text" name="subject" size="55" required="required"/></td></tr>
						<tr><td>Message:</td><td><textarea name="mailmessage"rows="10" cols="76" required="required"></textarea> </td></tr>
						<tr><td><input type="submit" value="send"></td><td><input type="reset" value="reset"></td></tr>
						</table>
						</form>
						</center>			
					</empty>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<jsp:include page="footer.html"/>
<%
    } catch (Exception ex) {
        System.out.println(ex);
    }
%>
</div>
</body>
</html>
