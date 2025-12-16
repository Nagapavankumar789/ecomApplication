package com.pavan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.DTO.ProductDTO;
import com.pavan.Entity.Product;
import com.pavan.Exception.ProductNotFoundException;
import com.pavan.Mapper.ProductMapper;
import com.pavan.Repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepo;

	public ProductService(ProductRepository productRepo) {
		this.productRepo =productRepo;
	}
	
	
	@Autowired
	private ProductMapper productMapper;
	
	// Create Product  Details from DTO -> Entity
	public ProductDTO createProduct(ProductDTO productDTO) {
		Product product = productMapper.toEntity(productDTO);
		Product saveProduct = productRepo.save(product);
		return productMapper.toDto(saveProduct);
	}
	// Get Product Details from DTO -> Entity
	public ProductDTO GetProduct(Long productId) {
		Product product = productRepo.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product Not Found"));
		return productMapper.toDto(product);
	}
	// Update Product Details from DTO -> Entity
	public ProductDTO updateProduct(Long productId , ProductDTO productDTO) {
		Product existingProduct = productRepo.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product Not Found"));
		productMapper.UpdateEntityFromDto(productDTO, existingProduct);
		Product updateProduct = productRepo.save(existingProduct);
		return productMapper.toDto(updateProduct);
	}
	
	// Delete Details from DTO -> Entity
	public void deletePrdouct(Long productId) {
		Product product = productRepo.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product Not Found"));
		productRepo.delete(product);
	}
	

}
