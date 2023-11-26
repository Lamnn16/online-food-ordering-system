package com.lamnn.ordersys.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.lamnn.ordersys.entities.*;

public class FoodOrderingApp {
	private User currentUser;
	private List<Restaurant> restaurants;

	public FoodOrderingApp() {
		this.currentUser = null;
		this.restaurants = new ArrayList<>();
	}

	public void run() {
		while (true) {
			if (currentUser == null) {
				displayLoginRegisterOptions();
				int choice = getUserChoice();

				switch (choice) {
				case 1:
					login();
					break;
				case 2:
					register();
					break;
				case 3:
					exit();
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} else {
				displayMainMenu();
				int choice = getUserChoice();

				switch (choice) {
				case 1:
					browseRestaurants();
					break;
				case 2:
					viewProfile();
					break;
				case 3:
					placeOrder();
					break;
				case 4:
					logout();
					break;
				case 5:
					exit();
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			}
		}
	}

	private void displayLoginRegisterOptions() {
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");
	}

	private void displayMainMenu() {
		System.out.println("1. Browse Restaurants");
		System.out.println("2. View Profile");
		System.out.println("3. Place Order");
		System.out.println("4. Logout");
		System.out.println("5. Exit");
		System.out.print("Enter your choice: ");
	}

	private int getUserChoice() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private void login() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your email: ");
		String email = scanner.nextLine();

		System.out.print("Enter your password: ");
		String password = scanner.nextLine();

		User user = validateUserCredentials(email, password);

		if (user != null) {
			currentUser = user;
			System.out.println("Login successful. Welcome, " + currentUser.getName() + "!");
		} else {
			System.out.println("Invalid email or password. Please try again.");
		}
	}

	private User validateUserCredentials(String email, String password) {
		// Perform validation logic here (e.g., check against a database)
		// Return the User object if the credentials are valid, or null otherwise
		// This is just a placeholder implementation
		if (email.equals("user@example.com") && password.equals("password")) {
			return new User("John Doe", email, "","");
		}
		return null;
	}

	private void register() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your email: ");
		String email = scanner.nextLine();

		// Additional registration details can be prompted and collected here

		User newUser = new User(name, email, "","");
		// Save the new user to the database or add it to the user list
		// This is just a placeholder implementation that adds the user to the current
		// session
		currentUser = newUser;

		System.out.println("Registration successful. Welcome, " + currentUser.getName() + "!");
	}

	private void browseRestaurants() {
	    if (restaurants.isEmpty()) {
	        System.out.println("No restaurants available.");
	        return;
	    }

	    System.out.println("Available Restaurants:");
	    for (int i = 0; i < restaurants.size(); i++) {
	        System.out.println((i + 1) + ". " + restaurants.get(i).getName());
	    }

	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the number of the restaurant you want to browse: ");
	    int choice = scanner.nextInt();

	    if (choice > 0 && choice <= restaurants.size()) {
	        Restaurant selectedRestaurant = restaurants.get(choice - 1);
	        System.out.println("Menu for " + selectedRestaurant.getName() + ":");
	        for (MenuItem item : selectedRestaurant.getMenu().getItems()) {
	            System.out.println(item.getName() + " - $" + item.getPrice());
	        }
	    } else {
	        System.out.println("Invalid choice. Please try again.");
	    }
	}

	private void viewProfile() {
		System.out.println("User Profile:");
		System.out.println("Name: " + currentUser.getName());
		System.out.println("Email: " + currentUser.getEmail());
		// Additional profile information can be displayed here
	}

	private void placeOrder() {
		// Implement logic to place an order
		// Allow user to select a restaurant andchoose items from the menu
		// Prompt for delivery address, payment method, etc.
		// Calculate total amount, confirm order, etc.
		System.out.println("Place Order functionality not implemented.");
	}

	private void logout() {
		currentUser = null;
		System.out.println("Logout successful. Goodbye!");
	}

	private void exit() {
		System.out.println("Exiting the application. Goodbye!");
		System.exit(0);
	}

	public static void main(String[] args) {
		FoodOrderingApp app = new FoodOrderingApp();
		app.run();
	}
}