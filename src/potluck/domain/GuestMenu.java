package potluck.domain;

import util.Input;

public class GuestMenu {

	//UserLogin userLogin;
	RecipeFactory recipeFactory;

	public GuestMenu(){
		System.out.println();
		System.out.println("-------------------------\n"
				         + "|   Guest Recipe Menu   |\n"
				         + "-------------------------\n");
		recipeFactory = new RecipeFactory();
		System.out.println("Please select an option below.");
		System.out.println("1. Add Recipe\n2. View Recipes\n3. Search Category\n4. Search Tag\n5. Logout\n6. Exit\n");
		int option = 0;
		while (option < 1 || option > 6) {
			option = Input.instance.getInt("Option: "); 
		}
		
		switch (option) {
        case 1:  recipeFactory.addRecipe();
                 break;
        case 2:  recipeFactory.viewRecipe();
                 break;
        case 3:  //recipeFactory.searchCategory();
                 break;
        case 4:  //recipeFactory.searchTag();
                 break;
        case 5:  recipeFactory.logout();
                 break;
        case 6:  recipeFactory.exit();
                 break;
		}
	}
}