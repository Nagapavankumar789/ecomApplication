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

import com.pavan.DTO.OrderDTO;
import com.pavan.Service.OrderService;

@RestController
@RequestMapping("/yourOrders")
public class OrderContorller {
	
	private OrderService orderServ;

	public OrderContorller(OrderService orderServ) {
		this.orderServ =orderServ;
	}
	
	@PostMapping("/placeOrder")
	public ResponseEntity<OrderDTO> placeOrder(@RequestBody OrderDTO orderDTO) {
		return ResponseEntity.ok(orderServ.placeOrder(orderDTO));
	}
	@GetMapping("/{orderId}")
	public ResponseEntity<OrderDTO> getOrder(@PathVariable Long orderId) {
		return ResponseEntity.ok(orderServ.getOrder(orderId));
	}
	
	@PutMapping("/updateorder/{orderId}")
	public ResponseEntity<OrderDTO> updateOrder(@PathVariable Long orderId , @RequestBody OrderDTO orderDTO) {
		return ResponseEntity.ok(orderServ.updateOrder(orderId, orderDTO));
	}
	
	@DeleteMapping("/deleteorder/{orderId}")
	public ResponseEntity<String> cancelOrder(@PathVariable Long orderId) {
		orderServ.deleteOrder(orderId);
		return ResponseEntity.ok("Order canceled Successfully with id: "+ orderId);
	}
	

}
