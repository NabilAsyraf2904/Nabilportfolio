package com.nabil.nabilasyraf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SendEmail {
	
	@Autowired
	private JavaMailSender mailSender;
	private String receiver = "nabilasyraf215@gmail.com";
	private String body = "";
	
		public void sendSimpleEmail(String toEmail, String subject, String body) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("fromemail@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		mailSender.send(message);
		System.out.println("Email Sent");

	}
	@PostMapping("/contactMe")
    public ModelAndView contact(@RequestParam("name") String name, @RequestParam("email") String email,@RequestParam("subject") String subject, @RequestParam("msg") String message) {
		body= body.concat("Name: ".concat(name) + "\n").concat("Email: ".concat(email) + "\n").concat("Message: ".concat(message)+ "\n");
		System.out.println(subject);
		System.out.println(body);
		sendSimpleEmail(receiver, subject, body);

		
		return new ModelAndView("redirect:/nabil");
    }

}
