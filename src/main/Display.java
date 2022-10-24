package main;

import java.util.ArrayList;

import recipe.Recipe;
import review.Review;
import user.User;

public class Display {
	public void mainMenu() {
		System.out.println("=====================================================");
		System.out.println("|          	WELCOME TO CALORIES LOG             |");
		System.out.println("=====================================================");
		System.out.println("Please choose role for login");
		System.out.println("1. User");
		System.out.println("2. Admin");
		System.out.println("3. Exit");
	}
	
	public void header() {
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("|          	      CALORIES LOG                  |");
		System.out.println("=====================================================");
		System.out.println();
	}
	
	public void menuUser(String name, ArrayList<User> users) {
		header();
		System.out.println("Welcome, " + name);
		System.out.println();
		System.out.println();
		System.out.println("Choose menu: ");
		System.out.println("1. Calculate BMI Test");
		System.out.println("2. View Recipes");
		System.out.println("3. View Article");
		System.out.println("4. Review");
		System.out.println("5. Back");
	}

	
	public void BMICategory() {
		System.out.println("=====================================================");
		System.out.println("|          	      BMI Test                      |");
		System.out.println("=====================================================");
		System.out.println("");
		System.out.println("====================================");
		System.out.println("|     Category    |       BMI      |");
		System.out.println("====================================");
		System.out.println("|     Kurang      |      <18,5     |");
		System.out.println("|     Normal      |   18,5 - 22,9  |");
		System.out.println("|    Berlebih     |    23 - 29,9   |");
		System.out.println("|    Obesitas     |       >30      |");
		System.out.println("====================================");
	}
	
	public void viewAllReview(ArrayList<Review> reviews) {
		int i=1;
		for (Review review : reviews) {
			System.out.println(i);
			System.out.println("Review ID : " + review.getId());
			System.out.println("UserId : " + review.getUserId());
			System.out.println("Rating : " + review.getRating());
			System.out.println("Description : " + review.getDescription());
			System.out.println();
			System.out.println();
			System.out.println("==============================================================");
			i++;
		}
	}
	
	public void viewRecipes(ArrayList<Recipe> recipes) {
		int i=1;
		for (Recipe recipe : recipes) {
			System.out.println(i);
			System.out.println(recipe.getTitle());
			System.out.println("Category: " + recipe.getCategory());
			System.out.println("Ingredients: ");
			System.out.println(recipe.getIngredients());
			System.out.println("Method: ");
			System.out.println(recipe.getMethod());
			System.out.println("=================================");
			System.out.println("| Calorie    | " + recipe.getCalorie() + "|");
			System.out.println("| Sugar      | " + recipe.getSugar()+"|");
			System.out.println("| Fiber      | " + recipe.getFiber()+"|");
			System.out.println("| Protein    | " + recipe.getProtein()+"|");
			System.out.println("| Salt       | " + recipe.getSalt()+"|");
			System.out.println("| Fat        | " + recipe.getFat()+"|");
			System.out.println("| Saturate   | " + recipe.getSaturate()+"|");
			System.out.println("| Carbs      | " + recipe.getCarbs()+"|");
			System.out.println("=================================");
			System.out.println();
			System.out.println();
			
		}
	}
	
}
