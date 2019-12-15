package potluck.domain;

import java.util.ArrayList;

public class Member {
	
	ArrayList<String> memberList = new ArrayList<>();
	ArrayList<String> adminList = new ArrayList<>();
	
	GuestMenu memberMenu;
	AdminMenu adminMenu;
	
	private boolean contains;
	private String memberID;
	private String memberAlias;
	private String memberFirstName;
	private String memberLastName;
	private String memberEmail;
	private String memberUserName;
	private String memberPassword;
	
	private String adminID;
	private String adminAlias;
	private String adminFirstName;
	private String adminLastName;
	private String adminEmail;
	private String adminUserName;
	private String adminPassword;
	
	
	public Member(){
		memberID = "01";
		memberAlias = "FirstGuest";
		memberFirstName = "Joe";
		memberLastName = "Pepsi";
		memberEmail = "doej@algonquinlive.com";
		memberUserName = "guest";
		memberPassword = "pass";
		
		adminID = "01";
		adminAlias = "FirstAdmin";
		adminFirstName = "John";
		adminLastName = "Doe";
		adminEmail = "flowj@algonquinlive.com";
		adminUserName = "admin";
		adminPassword = "pass";
		
		memberList.add(memberID+memberAlias+memberFirstName+memberLastName+memberEmail+memberUserName+memberPassword);
		adminList.add(adminID+adminAlias+adminFirstName+adminLastName+adminEmail+adminUserName+adminPassword);
	}
	
	public void verifyGuestLogin(String userName, String userPassword, UserLogin frame){
		String login = userName+userPassword;
		contains = false;
		for (String members : memberList) {
			//member login verification
			if (members.contains(login)) {
				contains = true;
				memberMenu = new GuestMenu();
			} else  if (!members.contains(login)) {
				contains = false;
			}
		}
	}
	
	public void verifyAdminLogin(String userName, String userPassword, UserLogin frame){
		String login = userName+userPassword;
		contains = false;
		for (String admin : adminList) {
			//Admin login verification
			if (admin.contains(login)) {
				contains = true;
				adminMenu = new AdminMenu();
			} else if (!admin.contains(login)){
				contains = false;
			}
		}
	}
	
	// MUTATOR METHODS
	public void setContains(boolean contains){ this.contains = contains; }
	public void setmemberID(String memberID){ this.memberID = memberID; }
	public void setAlias(String alias) { this.memberAlias = alias; }
	public void setFirstName(String firstName) { this.memberFirstName = firstName; }
	public void setLastName(String lastName) { this.memberLastName = lastName; }
	public void setEmail(String email) { this.memberEmail = email; }
	public void setUserName(String userName) { this.memberUserName = userName; }
	public void setPassword(String password) { this.memberPassword = password; }
	
	// ACCESSOR METHODS
	public boolean getContains(){ return contains; }
	public String getmemberID(){ return memberID; }
	public String getAlias() { return memberAlias; }
	public String getFirstName() { return memberFirstName; }
	public String getLastName() { return memberLastName; }
	public String getEmail() { return memberEmail;}
	public String getUserName() { return memberUserName; }
	public String getPassword() { return memberPassword; }
	
	@Override
	public String toString(){ 
		return String.format("\nmember ID: %d", memberID ); 
	}
}