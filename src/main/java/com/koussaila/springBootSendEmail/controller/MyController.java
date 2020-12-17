package com.koussaila.springBootSendEmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.koussaila.springBootSendEmail.service.EmailService;

@Controller
public class MyController {
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping(value ="/sendmail")
	public String sendmail() {
		//7313ef58f6-a56fb5@inbox.mailtrap.io
		emailService.sendMail("mail@mailtrap.io", "Test Envoi Mail", "Azul Fellawen, Bonjour tout le monde, Hello World !");
	
		return "emailsent";
	}

}

