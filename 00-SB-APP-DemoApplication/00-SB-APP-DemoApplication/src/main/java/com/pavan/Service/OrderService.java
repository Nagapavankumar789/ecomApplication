package com.pavan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.DTO.OrderDTO;
import com.pavan.Entity.Order;
import com.pavan.Exception.OrderNotFoundException;
import com.pavan.Mapper.OrderMapper;
import com.pavan.Repository.OrderRepository;

@Service
public class OrderService {
	
	
	private OrderRepository OrderRepo;

	public OrderService(OrderRepository OrderRepo) {
		this.OrderRepo = OrderRepo;
	}
	
	@Autowired
	private OrderMapper OrderMapper;
	
	// Create Order Details from DTO -> Entity
	public OrderDTO placeOrder(OrderDTO orderDTO) {
		Order order = OrderMapper.toEntity(orderDTO);
		Order SaveOrder = OrderRepo.save(order);
		return OrderMapper.toDto( SaveOrder);
	}
	
	// Get  Order Details from DTO -> Entity
	public OrderDTO getOrder(Long orderId) {
		Order order = OrderRepo.findById(orderId).orElseThrow(() -> new OrderNotFoundException("Order Not Found"+orderId));
		return OrderMapper.toDto(order);
	}
	
	// Update Order Details from DTO -> Entity
	public OrderDTO updateOrder(Long orderId , OrderDTO orderDTO) {
		Order existingOrder = OrderRepo.findById(orderId).orElseThrow(() -> new OrderNotFoundException("Order Not Found"+orderId));
		OrderMapper.updateEntityFromDTO(orderDTO, existingOrder);
		Order updateOrder = OrderRepo.save(existingOrder);
		return OrderMapper.toDto(updateOrder);
		
	}
	
	// Delete Order Details from DTO -> Entity
	public void deleteOrder(Long orderId) {
		Order order = OrderRepo.findById(orderId).orElseThrow(() -> new OrderNotFoundException("Order Not Found"+orderId));
		OrderRepo.delete(order);
	}
	

	
	

}
