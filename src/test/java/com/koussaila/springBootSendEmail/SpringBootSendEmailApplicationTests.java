package com.koussaila.springBootSendEmail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.koussaila.springBootSendEmail.service.EmailService;


@SpringBootTest
class SpringBootSendEmailApplicationTests {

	 @Autowired
	    private EmailService emailService;

	    @Test
	    public void testEmail() {
	        emailService.sendMail("frank23@example.com", "Test subject", "Test mail");
	    }

}
