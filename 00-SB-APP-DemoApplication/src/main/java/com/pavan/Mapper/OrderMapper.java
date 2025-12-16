package com.pavan.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.context.annotation.Bean;

import com.pavan.DTO.OrderDTO;
import com.pavan.Entity.Order;


@Mapper(componentModel = "spring")
public interface OrderMapper {
	@Bean
	OrderDTO toDto(Order order);
	
	@Bean
	Order toEntity(OrderDTO orderDTO);
	
	
	 @Mapping(target = "orderId", ignore = true)
	void updateEntityFromDTO(OrderDTO orderDTO, @MappingTarget Order existingOrder);


}
