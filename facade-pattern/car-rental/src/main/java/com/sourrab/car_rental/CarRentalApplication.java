package com.sourrab.car_rental;

import com.sourrab.car_rental.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentalApplication implements CommandLineRunner{
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside car rental application");
		System.out.println("Create new Order");
		orderService.createOrder();
		System.out.println("Order has been created");
	}
}
