package com.csi.control;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.csi.product1.Product;
import com.csi.service.ProductDao;
@RestController
@RequestMapping("/pp")

public class ProductController {
	@Autowired
	ProductDao productDao;
	
	@GetMapping("/getproduct")
    public List<Product> getproductdetails() throws ParseException{
		List<Product> productlist=productDao.getproduct();
		return productlist;
	}
	@PostMapping("/savedata")
    public String savedata(@RequestBody Product product1) {
		productDao.saveproduct(product1);
		return "save data";
	}
	
@PutMapping("/updatedata/{productId}")
	public String updatedata(@PathVariable("productId") int productId,@RequestBody Product product) {
		productDao.updateproduct(productId, product);
		return "updata data";
		
	}
	@DeleteMapping("/deletedata/{productId}")
	public String deletedata(@PathVariable ("productId") int productId) {
		productDao.deleteproduct(productId);
		return "delete data";
		
	}
}
	

