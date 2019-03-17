package com.madhu.javaMail.beans;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class SimpleMail {

	private JavaMailSender mailSend;

	public SimpleMail() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void sendMail(SimpleMailMessage message) {
		try {
			System.out.println("Starting to send a mail");
			mailSend.send(message);
			System.out.println("mail sent successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception created :\t");
			e.printStackTrace();
		}

		finally {

		}

	}

	public JavaMailSender getMailSend() {
		return mailSend;
	}

	public void setMailSend(JavaMailSender mailSend) {
		this.mailSend = mailSend;
	}

}
