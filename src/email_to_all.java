

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 * Servlet implementation class email_to_all
 */
@WebServlet(description = "this device is used to send emails to all the eligible candidates", urlPatterns = { "/email_to_all" })
public class email_to_all extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public email_to_all() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String result=null;
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		// Get a Properties object
	     Properties props = System.getProperties();
	     props.setProperty("mail.smtp.host", "smtp.gmail.com");
	     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	     props.setProperty("mail.smtp.socketFactory.fallback", "false");
	     props.setProperty("mail.smtp.port", "465");
	     props.setProperty("mail.smtp.socketFactory.port", "465");
	     props.put("mail.smtp.auth", "true");
	     props.put("mail.debug", "true");
	     props.put("mail.store.protocol", "pop3");
	     props.put("mail.transport.protocol", "smtp");
	     final String username = "vermarahulg1991@gmail.com";
	     final String password = "rahul@123";
	     String mailmessage=request.getParameter("mailmessage");
	     String studentemailid=request.getParameter("sender");    //sender
	     String subject=request.getParameter("subject");
	     String recipient=request.getParameter("recipient");		//recipient
	     HttpSession session1=request.getSession();
	     
	     try{
	     Session session = Session.getDefaultInstance(props, 
	                          new Authenticator(){
	                             protected PasswordAuthentication getPasswordAuthentication() {
	                                return new PasswordAuthentication(username, password);
	                             }});
	     
	   // -- Create a new message --
	     Message msg = new MimeMessage(session);

	  // -- Set the FROM and TO fields --
	     msg.setFrom(new InternetAddress(studentemailid));
	     System.out.println("hereb");
	     //msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse(recipient,false));
	     String [] toEmails = recipient.split(",");	
	     for (int i = 0; i < toEmails.length; i++) {
	    	 System.out.println(toEmails[i]);
	    	 
	    	msg.addRecipients(Message.RecipientType.TO,InternetAddress.parse(toEmails[i]));
/*	 			msg.addRecipients(Message.RecipientType.TO,InternetAddress.parse(toEmails[i],false));
	*/    	 
	 		}
	     System.out.println("herec");
	     msg.setSubject(subject);
	     msg.setText(mailmessage);
	     msg.setSentDate(new Date());
	     Transport.send(msg);
	     System.out.println("Message sent.");
	     result="successfully mail delivered";
	     session1.setAttribute("status",result);
	     response.sendRedirect("dummy_page.jsp");
	  }
	     catch (MessagingException e)
	     { result="mail cannot be sent";
	     session1.setAttribute("status",result);
	     response.sendRedirect("dummy_page.jsp");
	    	 System.out.println(e);}
		
	   	}
	
	
	}
		
		


