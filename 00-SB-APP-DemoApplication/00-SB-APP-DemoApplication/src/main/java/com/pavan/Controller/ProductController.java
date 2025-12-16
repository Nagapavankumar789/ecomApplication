package com.pavan.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.DTO.ProductDTO;
import com.pavan.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private ProductService productServ;

	public ProductController(ProductService productServ) {
		this.productServ =productServ;	
	}
	
	@PostMapping("/createProduct")
	public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
		return ResponseEntity.ok(productServ.createProduct(productDTO));
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<ProductDTO> getProduct(@PathVariable Long productId) {
		return ResponseEntity.ok(productServ.GetProduct(productId));
	}
	@PutMapping("/updateProduct/{productId}")
	public ResponseEntity<ProductDTO> UpdateProduct(@PathVariable Long productId , @RequestBody ProductDTO productDTO) {
		return ResponseEntity.ok(productServ.updateProduct(productId, productDTO));
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long productId) {
		productServ.deletePrdouct(productId);
		return ResponseEntity.ok("Product Deleted Successfully with Id: "+productId);
	}

}
