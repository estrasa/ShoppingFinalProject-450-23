/*	Sara Estrada
 * 	SE 450 Fall 2023
 * 	Final Project
 */
package depaul.edu;

public class MainClass {//implements IOAndMenuManager{
	
	public static void main(String[] args) {
		
		IOAndMenuManager manager = new IOAndMenuManager();
		manager.scan = manager.getInStream();

		UserList userList =  new UserList(); 
		OrderLog orderlog = new OrderLog(); 
		
		manager.WelcomeMenu();
	}


}
