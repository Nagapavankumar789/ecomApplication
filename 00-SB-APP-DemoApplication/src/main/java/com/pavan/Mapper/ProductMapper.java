package com.pavan.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.context.annotation.Bean;

import com.pavan.DTO.ProductDTO;
import com.pavan.Entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	
	
	Product toEntity(ProductDTO productDTO);
	
	
	ProductDTO toDto(Product product);
	
	@Mapping(target ="productId", ignore = true)
	void UpdateEntityFromDto(ProductDTO productDTO, @MappingTarget Product existingProduct);
	
	

}
