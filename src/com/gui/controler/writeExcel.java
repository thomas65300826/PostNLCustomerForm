package com.gui.controler;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook; 
import jxl.write.Label; 
import jxl.write.WritableSheet; 
import jxl.write.WritableWorkbook; 

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import sun.misc.BASE64Encoder;

public class writeExcel extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        Date d = new Date(); 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_kkmmss "); 
        String random = sdf.format(d); 
        String targetFile = "Gui Chen"+random + ".xls"; 
		 try { 

	            //response.setContentType("application/vnd.ms-excel"); 
	            response.addHeader("Content-Disposition", "attachment;   filename=\"" + targetFile + "\""); 
	  
	            FileOutputStream customerForm = new FileOutputStream("/Users/user/Workspaces/MyEclipse 10/"+targetFile);
	            WritableWorkbook wwb = Workbook.createWorkbook(customerForm); 
	            // 新建一张表 
	            WritableSheet wsheet = wwb.createSheet("Sheet1", 0); 
	            // 设置表头 
	            Label label = new Label(0, 0, ""); 
	            wsheet.addCell(label); 
	            label = new Label(0, 0, "Senderref"); 
	            wsheet.addCell(label); 
	            label = new Label(1, 0, "Clientref"); 
	            wsheet.addCell(label); 
	            label = new Label(2, 0, "Contractname"); 
	            wsheet.addCell(label); 
	            label = new Label(3, 0, "labelref"); 
	            wsheet.addCell(label); 
	            label = new Label(4, 0, "productcode"); 
	            wsheet.addCell(label); 
	            label = new Label(5, 0, "shipweight"); 
	            wsheet.addCell(label); 
	            label = new Label(6, 0, "colli"); 
	            wsheet.addCell(label); 
	            label = new Label(7, 0, "Companyname"); 
	            wsheet.addCell(label); 
	            label = new Label(8, 0, "lastname"); 
	            wsheet.addCell(label); 
	            label = new Label(9, 0, "department"); 
	            wsheet.addCell(label); 
	            label = new Label(10, 0, "email"); 
	            wsheet.addCell(label); 
	            label = new Label(11, 0, "street"); 
	            wsheet.addCell(label);
	            label = new Label(12, 0, "housenr"); 
	            wsheet.addCell(label);
	            label = new Label(13, 0, "housenradd"); 
	            wsheet.addCell(label);
	            label = new Label(14, 0, "zip"); 
	            wsheet.addCell(label);
	            label = new Label(15, 0, "city"); 
	            wsheet.addCell(label);
	            label = new Label(16, 0, "country"); 
	            wsheet.addCell(label);
	            label = new Label(17, 0, "date"); 
	            wsheet.addCell(label);
	            label = new Label(18, 0, "valuta"); 
	            wsheet.addCell(label);
	            label = new Label(19, 0, "gptype"); 
	            wsheet.addCell(label);
	            label = new Label(20, 0, "gpinvoicenr"); 
	            wsheet.addCell(label);
	            label = new Label(21, 0, "gpcertificate"); 
	            wsheet.addCell(label);
	            label = new Label(22, 0, "gplicensenr"); 
	            wsheet.addCell(label);
	            label = new Label(23, 0, "gphandlenond"); 
	            wsheet.addCell(label);
	            label = new Label(24, 0, "barcode"); 
	            wsheet.addCell(label);
	            label = new Label(25, 0, "gpomschr1"); 
	            wsheet.addCell(label);
	            label = new Label(26, 0, "gpaantal1"); 
	            wsheet.addCell(label);
	            label = new Label(27, 0, "gpweight1"); 
	            wsheet.addCell(label);
	            label = new Label(28, 0, "gpvalue1"); 
	            wsheet.addCell(label);
	            label = new Label(29, 0, "HStariff1"); 
	            wsheet.addCell(label);
	            label = new Label(30, 0, "gporgcountry1"); 
	            wsheet.addCell(label);
	   ///////////////////////////////////////////////////////////
	            
	            
	            label = new Label(0, 1, ""); 
	            wsheet.addCell(label); 
	            label = new Label(1, 1, ""); 
	            wsheet.addCell(label); 
	            label = new Label(2, 1, ""); 
	            wsheet.addCell(label); 
	            label = new Label(3, 1, ""); 
	            wsheet.addCell(label); 
	            label = new Label(4, 1, ""); 
	            wsheet.addCell(label); 
	            label = new Label(5, 1, "7"); 
	            wsheet.addCell(label); 
	            label = new Label(6, 1, ""); 
	            wsheet.addCell(label); 
	            label = new Label(7, 1, ""); 
	            wsheet.addCell(label); 
	            label = new Label(8, 1, "吴少岚"); 
	            wsheet.addCell(label); 
	            label = new Label(9, 1, "15999518990"); 
	            wsheet.addCell(label); 
	            label = new Label(10, 1, ""); 
	            wsheet.addCell(label); 
	            label = new Label(11, 1, "深圳市罗湖区人民南路发展中心908"); 
	            wsheet.addCell(label);
	            label = new Label(12, 1, ""); 
	            wsheet.addCell(label);
	            label = new Label(13, 1, ""); 
	            wsheet.addCell(label);
	            label = new Label(14, 1, "518000"); 
	            wsheet.addCell(label);
	            label = new Label(15, 1, "深圳市"); 
	            wsheet.addCell(label);
	            label = new Label(16, 1, "CN"); 
	            wsheet.addCell(label);
	            label = new Label(17, 1, "16/2/16"); 
	            wsheet.addCell(label);
	            label = new Label(18, 1, ""); 
	            wsheet.addCell(label);
	            label = new Label(19, 1, "0"); 
	            wsheet.addCell(label);
	            label = new Label(20, 1, "Ref001"); 
	            wsheet.addCell(label);
	            label = new Label(21, 1, "1"); 
	            wsheet.addCell(label);
	            label = new Label(22, 1, "1"); 
	            wsheet.addCell(label);
	            label = new Label(23, 1, "1"); 
	            wsheet.addCell(label);
	            label = new Label(24, 1, ""); 
	            wsheet.addCell(label);
	            label = new Label(25, 1, "baby products"); 
	            wsheet.addCell(label);
	            label = new Label(26, 1, "1"); 
	            wsheet.addCell(label);
	            label = new Label(27, 1, "7"); 
	            wsheet.addCell(label);
	            label = new Label(28, 1, "150"); 
	            wsheet.addCell(label);
	            label = new Label(29, 1, "1901"); 
	            wsheet.addCell(label);
	            label = new Label(30, 1, "nl"); 
	            wsheet.addCell(label);
	      /////////////////////////////////////////////////////////
	            
	            
	            label = new Label(0, 2, ""); 
	            wsheet.addCell(label); 
	            label = new Label(1, 2, ""); 
	            wsheet.addCell(label); 
	            label = new Label(2, 2, ""); 
	            wsheet.addCell(label); 
	            label = new Label(3, 2, ""); 
	            wsheet.addCell(label); 
	            label = new Label(4, 2, ""); 
	            wsheet.addCell(label); 
	            label = new Label(5, 2, "7"); 
	            wsheet.addCell(label); 
	            label = new Label(6, 2, ""); 
	            wsheet.addCell(label); 
	            label = new Label(7, 2, ""); 
	            wsheet.addCell(label); 
	            label = new Label(8, 2, "蔡馥霖"); 
	            wsheet.addCell(label); 
	            label = new Label(9, 2, "13580363581"); 
	            wsheet.addCell(label); 
	            label = new Label(10, 2, ""); 
	            wsheet.addCell(label); 
	            label = new Label(11, 2, "广州市越秀区东风东路745号之二金广大厦"); 
	            wsheet.addCell(label);
	            label = new Label(12, 2, ""); 
	            wsheet.addCell(label);
	            label = new Label(13, 2, ""); 
	            wsheet.addCell(label);
	            label = new Label(14, 2, "510000"); 
	            wsheet.addCell(label);
	            label = new Label(15, 2, "广州市"); 
	            wsheet.addCell(label);
	            label = new Label(16, 2, "CN"); 
	            wsheet.addCell(label);
	            label = new Label(17, 2, "16/2/16"); //下单日期
	            wsheet.addCell(label);
	            label = new Label(18, 2, ""); 
	            wsheet.addCell(label);
	            label = new Label(19, 2, "0"); 
	            wsheet.addCell(label);
	            label = new Label(20, 2, "Ref001"); 
	            wsheet.addCell(label);
	            label = new Label(21, 2, "1"); 
	            wsheet.addCell(label);
	            label = new Label(22, 2, "1"); 
	            wsheet.addCell(label);
	            label = new Label(23, 2, "1"); 
	            wsheet.addCell(label);
	            label = new Label(24, 2, ""); 
	            wsheet.addCell(label);
	            label = new Label(25, 2, "baby products"); 
	            wsheet.addCell(label);
	            label = new Label(26, 2, "1"); 
	            wsheet.addCell(label);
	            label = new Label(27, 2, "7"); 
	            wsheet.addCell(label);
	            label = new Label(28, 2, "100"); 
	            wsheet.addCell(label);
	            label = new Label(29, 2, "1901"); 
	            wsheet.addCell(label);
	            label = new Label(30, 2, "nl"); 
	            wsheet.addCell(label);
	         /*   
	            
	            // 收件人的电子邮件 ID
	            String to = "thomas653008262@163.com";
	       
	            // 发件人的电子邮件 ID
	            String from = "thomas65300826@163.com";
	       
	            // 假设您是从本地主机发送电子邮件
	            String host = "smtp.163.com";
	       
	            // 获取系统的属性
	            Properties properties = System.getProperties();
	            properties.put("mail.smtp.host", host); 
	            properties.put("mail.smtp.auth","true"); 
	           
	            properties.setProperty("mail.user", "thomas65300826@163.com");
	            properties.setProperty("mail.password", "thomas031209");
	       
	            // 设置邮件服务器
	            properties.setProperty("mail.smtp.host", host);
	  
	            // 获取默认的 Session 对象
	            Session session = Session.getDefaultInstance(properties);
	            
	      	  // 设置响应内容类型
	            response.setContentType("text/html");
	            PrintWriter out = response.getWriter();

	             try{
	               // 创建一个默认的 MimeMessage 对象
	               MimeMessage message = new MimeMessage(session);
	       
	               // 设置 From: header field of the header.
	               message.setFrom(new InternetAddress(from));
	       
	               // 设置 To: header field of the header.
	               message.addRecipient(Message.RecipientType.TO,
	                                        new InternetAddress(to));
	       
	               // 设置 Subject: header field
	               message.setSubject("This is the Subject Line!");
	       
	               // 创建消息部分 
	               BodyPart messageBodyPart = new MimeBodyPart();
	       
	               // 填写消息
	               messageBodyPart.setText("This is message body");
	               
	               // 创建一个多部分消息
	               Multipart multipart = new MimeMultipart();
	       
	               // 设置文本消息部分
	               multipart.addBodyPart(messageBodyPart);
	       
	               // 第二部分是附件
	               messageBodyPart = new MimeBodyPart();
	               String filename = "file.txt";
	               DataSource source = new FileDataSource(filename);
	               messageBodyPart.setDataHandler(new DataHandler(source));
	               messageBodyPart.setFileName(filename);
	               multipart.addBodyPart(messageBodyPart);
	       
	               // 发送完整的消息部分
	               message.setContent(multipart );
	       
	               // 发送消息
	               Transport.send(message);
	               String title = "发送电子邮件";
	               String res = "成功发送电子邮件...";
	               String docType =
	               "<!doctype html public \"-//w3c//dtd html 4.0 " +
	               "transitional//en\">\n";
	               out.println(docType +
	               "<html>\n" +
	               "<head><title>" + title + "</title></head>\n" +
	               "<body bgcolor=\"#f0f0f0\">\n" +
	               "<h1 align=\"center\">" + title + "</h1>\n" +
	               "<p align=\"center\">" + res + "</p>\n" +
	               "</body></html>");
	            }catch (MessagingException mex) {
	               mex.printStackTrace();
	            }
	             
	             */
	            

	            
	            wwb.write(); 
	            wwb.close(); 
	            customerForm.close(); 
	            response.flushBuffer();  
	   
	        } catch (Exception e) { 
	            System.out.println("生成信息表(Excel格式)时出错："); 
	            e.printStackTrace(); 
	        } 
		 
		 
	 try{
         String userName="chengui1989@sina.com";
         String password="thomas19891210";
         String smtp_server="smtp.sina.com";
         String from_mail_address=userName;
         String to_mail_address="thomas653008262@163.com";
         Authenticator auth=new PopupAuthenticator(userName,password);
         Properties mailProps=new Properties();
         mailProps.put("mail.smtp.host", smtp_server);
         mailProps.put("mail.smtp.auth", "true");
         mailProps.put("username", userName);
         mailProps.put("password", password);

         //Session mailSession=Session.getDefaultInstance(mailProps, auth);
         Session mailSession=Session.getInstance(mailProps, auth); 
         mailSession.setDebug(true);
         MimeMessage message=new MimeMessage(mailSession);
         message.setFrom(new InternetAddress(from_mail_address));
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(to_mail_address));
         //message.setSubject("测试邮件");
         message.setSubject(MimeUtility.encodeText("Order from Gui Chen", "UTF-8", "B"));
        // message.setContent("test content", "text/plain;charset=gb2312");
         
         // 创建消息部分 
         BodyPart messageBodyPart = new MimeBodyPart();
 
         // 填写消息
         //messageBodyPart.setText("test电子邮件测试内容");
         messageBodyPart.setContent("寄件人：Gui Chen\n" +
         		"提货地址：Pensionarispad 16, Delft, Netherlands\n"+
        		 "电话：0651941962\n"+
         		"邮箱：thomas65300826@gmail.com\n"+
        		 "提货日期：16/02/2016\n"+
         		"是否打印单：否\n", "text/plain;charset=gb2312");
         // 创建一个多部分消息
         Multipart multipart = new MimeMultipart();
 
         // 设置文本消息部分
         multipart.addBodyPart(messageBodyPart);

         
         
         // 第二部分是附件
         messageBodyPart = new MimeBodyPart();
         String filename = "/Users/user/Workspaces/MyEclipse 10/"+targetFile;
         DataSource source = new FileDataSource(filename);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(targetFile);
         multipart.addBodyPart(messageBodyPart);


         message.setContent(multipart);
         message.saveChanges();
         Transport.send(message);
         }
	 catch(Exception ex){
         System.err.println("邮件发送失败的原因是："+ex.getMessage());
         System.err.println("具体的错误原因");
         ex.printStackTrace(System.err);
         }
          
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

}


class PopupAuthenticator extends Authenticator{
private String username;
private String password;
public PopupAuthenticator(String username,String pwd){
this.username=username;
this.password=pwd;
}
public PasswordAuthentication getPasswordAuthentication(){
return new PasswordAuthentication(this.username,this.password);
}
}