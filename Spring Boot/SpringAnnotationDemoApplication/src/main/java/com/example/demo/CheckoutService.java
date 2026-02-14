package com.example.demo;

import org.springframework.stereotype.Service;

@Service

public class CheckoutService {
	
	private final PaymentGateway paymentGateway;
	
	public CheckoutService(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	
	public void checkout(double amount) {
		paymentGateway.pay(amount);
	}
}