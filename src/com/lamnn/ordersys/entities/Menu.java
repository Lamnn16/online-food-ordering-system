package com.lamnn.ordersys.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> items;

	public Menu() {
		this.items = new ArrayList<>();
	}

	public List<MenuItem> getItems() {
		return items;
	}

	public void setItems(List<MenuItem> items) {
		this.items = items;
	}

	public void addItem(MenuItem item) {
		// Implement item addition logic here
	}

	public void updateItem(MenuItem item) {
		// Implement item update logic here
	}

	public void removeItem(MenuItem item) {
		// Implement item removal logic here
	}
}
