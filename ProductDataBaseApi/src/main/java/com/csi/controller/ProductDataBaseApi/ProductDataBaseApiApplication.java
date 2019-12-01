package com.csi.controller.ProductDataBaseApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.csi.control","com.csi.service","com.csi.product1"})
public class ProductDataBaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductDataBaseApiApplication.class, args);
	}

}
