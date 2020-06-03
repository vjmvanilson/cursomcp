package com.nelioalves.cursomcp.services;



import org.springframework.mail.SimpleMailMessage;


import com.nelioalves.cursomcp.domain.Cliente;
import com.nelioalves.cursomcp.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
