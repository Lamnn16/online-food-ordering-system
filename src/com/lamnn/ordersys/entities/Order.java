package com.lamnn.ordersys.entities;

import java.util.List;

import com.lamnn.ordersys.constants.OrderStatus;

public class Order {
	private int orderId;
	private User user;
	private Restaurant restaurant;
	private List<MenuItem> items;
	private double totalAmount;
	private OrderStatus status;

	// Constructor
	public Order(int orderId, User user, Restaurant restaurant, List<MenuItem> items, double totalAmount,
			OrderStatus status) {
		this.orderId = orderId;
		this.user = user;
		this.restaurant = restaurant;
		this.items = items;
		this.totalAmount = totalAmount;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public List<MenuItem> getItems() {
		return items;
	}

	public void setItems(List<MenuItem> items) {
		this.items = items;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(MenuItem item) {
		// Implement item addition logic here
	}

	public void removeItem(MenuItem item) {
		// Implement item removal logic here
	}

	public double calculateTotalAmount() {
		// Implement total amount calculation logic here
		return 0.0;
	}

	public void updateStatus(OrderStatus status) {
		// Implement status update logic here
	}
}