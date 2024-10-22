package com.gorakh.projects.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvoiceProcessingSystemParentApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceProcessingSystemParentApplication.class, args);
		System.out.println("Invoice Processor Running...");
	}

}
