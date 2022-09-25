package com.educandowe.course.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.educandowe.course.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "tb_order_item")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer Quantity;
	private Double Price;
	
	public OrderItem() {	
	}

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		Quantity = quantity;
		Price = price;
		id.setOrder(order);
		id.setProduct(product);
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order1) {
		id.setOrder(order1);
	} 
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product1) {
		id.setProduct(product1);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(Price, other.Price);
	}
}
