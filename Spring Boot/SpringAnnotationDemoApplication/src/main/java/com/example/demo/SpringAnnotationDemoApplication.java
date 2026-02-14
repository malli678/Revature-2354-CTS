package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAnnotationDemoApplication {
	
	private final InternationalCheckoutService internationalCheckoutService;

    SpringAnnotationDemoApplication(InternationalCheckoutService internationalCheckoutService) {
        this.internationalCheckoutService = internationalCheckoutService;
    }
	
	@Bean
	CommandLineRunner runDemo(
		CheckoutService checkOutService,
		InternationalCheckoutService internationalCheckoutService,
		VipCheckoutService vipCheckOutService) {
		
		return args ->{
			System.out.println(" spring annotation demo started ");
			checkOutService.checkout(1000);
			internationalCheckoutService.checkout(4000);
			vipCheckOutService.checkout(8000);
			
			System.out.println("payment done...");
		};
	}
	
	
		
		
		

}