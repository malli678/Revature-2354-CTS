package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobilePhone {
	@Autowired
	private SimCard simCard;
	
	public void makeCall() {
		System.out.println(simCard.Connect());
		System.out.println("Making Call");
	}
}
