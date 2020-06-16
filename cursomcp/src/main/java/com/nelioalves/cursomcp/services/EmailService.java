package com.nelioalves.cursomcp.services;



import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;


import com.nelioalves.cursomcp.domain.Cliente;
import com.nelioalves.cursomcp.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
	
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
	
}
