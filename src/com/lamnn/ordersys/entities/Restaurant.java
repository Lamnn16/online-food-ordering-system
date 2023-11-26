package com.lamnn.ordersys.entities;

public class Restaurant {
	private String name;
    private String address;
    private String contactDetails;
    private String operatingHours;
    private Menu menu; 
    
    public Restaurant(String name, String address, String contactDetails, String operatingHours) {
        this.name = name;
        this.address = address;
        this.contactDetails = contactDetails;
        this.operatingHours = operatingHours;
        this.menu = new Menu();
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public void addMenu(Menu menu) {
        // Implement menu addition logic here
    }

	public void updateMenu(Menu menu) {
        // Implement menu update logic here
    }

    public Menu getMenu() {
        return menu;
    }
}