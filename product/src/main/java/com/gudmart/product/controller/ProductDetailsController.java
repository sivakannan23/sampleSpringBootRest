package com.gudmart.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gudmart.api.product.type.Product;

@RestController
@RequestMapping(path = "/api/product")
public class ProductDetailsController {

	@RequestMapping(path = "/add", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		System.out.println("Inside productdetails " + product);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
}
