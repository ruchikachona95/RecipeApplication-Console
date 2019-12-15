package potluck.domain;

import util.Input;

/**
 * Program Description:
 * 
 *  Program will allow users to add, remove, and search for recipes using a graphical user interface.
 * 
 * @author	  Ruchika Chona		  
 * @version   1.0.0
 * 
 * Assignment: Project 1 - Recipe Program 
 *  
 *	<i>UserLogin</i> class will display a GUI login for the user to enter the proper user name and login.
 *
 */
public class UserLogin{
	Member member = new Member();
	private String userName;
	private String userPassword;

	public UserLogin(){
		System.out.println();
		System.out.println("-------------------------\n"
				         + "|         Login         |\n"
				         + "-------------------------\n");
		System.out.println("Please enter your username and password.");
		userName = Input.instance.getString("Username: ");
		userPassword = Input.instance.getString("Password: ");

		checkLogin();
	}

	private void checkLogin(){
		member.verifyGuestLogin(userName, userPassword, this);
		member.verifyAdminLogin(userName, userPassword, this);

		//If the user enters the wrong user name or password.
		//This will update the feedback to display to the user the error they made.
		if (member.getContains() == false) {
			System.out.println("Wrong username or password.");
			new UserLogin();
		}
	}
}