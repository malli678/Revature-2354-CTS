package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service

public class RazorpayGateway implements PaymentGateway {
	@Override
	public void pay(double amount){
		System.out.println(" paid " + amount + "using RazorPay");
	}
	
}