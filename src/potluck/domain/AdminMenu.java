package potluck.domain;

import util.Input;

public class AdminMenu{

	//UserLogin userLogin;
	RecipeFactory recipeFactory;

	public AdminMenu(){
		System.out.println();
		System.out.println("-------------------------\n"
				         + "|   Admin Recipe Menu   |\n"
				         + "-------------------------\n");
		recipeFactory = new RecipeFactory();
        System.out.println("Please select an option below.");
		System.out.println("1. Add Recipe\n2. Remove Recipes\n3. View Recipes\n4. Search Category\n5. Search Tag\n6. Logout\n7. Exit\n");
		int option = 0;
		while (option < 1 || option > 7) {
			option = Input.instance.getInt("Option: ");
		}
		
		switch (option) {
        case 1:  recipeFactory.addRecipe();
                 break;
        case 2:  //recipeFactory.removeRecipe();
                 break;
        case 3:  recipeFactory.viewRecipe();
                 break;
        case 4:  //recipeFactory.searchCategory();
                 break;
        case 5:  //recipeFactory.searchTag();
                 break;
        case 6:  recipeFactory.logout();
                 break;
        case 7:  recipeFactory.exit();
                 break;
		}
	}
}