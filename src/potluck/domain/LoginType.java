package potluck.domain;

import util.Input;

/**
 * Program Description:
 * 
 * Program will allow users to add, remove, and search for recipes using a graphical user interface.
 * 
 * @author    Ruchika Chona 			  
 * @version   1.0.0 
 * 
 * Assignment: Project 1 - Recipe Program 
 *
 *	<i>LoginType</i> class presents the user with the option to select what type of user they are login in as (admin or guest).
 *	
 *
 */
public class LoginType {

	UserLogin userLogin;
	private boolean guestUser;
	private boolean adminUser;

	public LoginType(){
		System.out.println("-------------------------\n"
				         + "|      Login Type       |\n"
				         + "-------------------------\n");
		System.out.println("Please select your login type.");
		System.out.println("1. Admin\n2. Guest\n");
		int type = 0;
		while (type < 1 || type > 2) {
			type = Input.instance.getInt("Type: "); 
		}

		System.out.println();
		
		if (type == 1) {
			new UserLogin();
			adminUser = true;
		} else {
			new UserLogin();
			guestUser = true;
		}
	}

	// MUTATOR METHODS
	public void setGuest(boolean guestUser){ this.guestUser = guestUser; }
	public void setAdmin(boolean adminUser){ this.adminUser = adminUser; }

	// ACCESSOR METHODS
	public boolean getGuestUser(){ return guestUser; }
	public boolean getAdminUser(){ return adminUser; }
}