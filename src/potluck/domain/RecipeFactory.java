package potluck.domain;

import java.util.ArrayList;

public class RecipeFactory {
	
	ArrayList<Recipe> recipeArray;
	Ingredient ingredient;
	Category category;
	Tag tag;
	Comment comment;
	
	public RecipeFactory(){
		recipeArray = new ArrayList<>();
		ingredient = new Ingredient();
	    category = new Category();
		tag = new Tag();
		comment = new Comment();
	}
	
	public void addRecipe(){
		System.out.println();
		ingredient.inputAllFields();
		category.inputAllFields();
		tag.inputAllFields();
		comment.inputAllFields();
	}
	
	// TODO Functions
	public void removeRecipe(){	}
	
	public void viewRecipe(){ 		
		System.out.print("\n"+ingredient.toString());
		System.out.print(category.toString());
		System.out.print(tag.toString());
		System.out.print(comment.toString());
	}
	
	public void searchCategory(){ }
	
	public void searchTag(){ }
	
	public void logout(){ new UserLogin(); }
	
	public void exit() { System.exit(0); }
}