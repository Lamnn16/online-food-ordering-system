package com.lamnn.ordersys.entities;

import com.lamnn.ordersts.constants.PaymentMethod;
import com.lamnn.ordersts.constants.PaymentStatus;

public class Payment {
    private int paymentId;
    private User user;
    private Order order;
    private double amount;
    private PaymentStatus paymentStatus;
    private PaymentMethod paymentMethod;

    // Constructor
    public Payment(int paymentId, User user, Order order, double amount, PaymentStatus paymentStatus,
            PaymentMethod paymentMethod) {
        this.paymentId = paymentId;
        this.user = user;
        this.order = order;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
    }

    public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void verifyPayment() {
        // Implement payment verification logic here
    }
}