package com.madhu.javaMail.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;

import com.madhu.javaMail.beans.SimpleMail;

public class SimpleMailTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("resource/spring/spring.xml");
		SimpleMailMessage mailMessage = container.getBean(SimpleMailMessage.class);
		SimpleMail msg = container.getBean(SimpleMail.class);
		try {

			System.out.println("Starting to send a mail");
			mailMessage.setTo("madhujbyouth@gmail.com");
			mailMessage.setBcc("madhujb2014@gmail.com");
			mailMessage.setSubject("Testing mail from SimpleMain ");
			mailMessage.setText(" hi send u a mail message");
			msg.sendMail(mailMessage);
		} catch (Exception e) {

			System.err.println("exception created :\t" + e.getMessage());
			e.printStackTrace();
		}
	}

}
