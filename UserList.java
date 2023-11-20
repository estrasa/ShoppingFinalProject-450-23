package depaul.edu;
import java.util.*;

public class UserList {

	ArrayList<User> userList = new ArrayList<User>();
	
	public void createAccount(String username, String password) {
		User user = new User(username, password);
		userList.add(user);
	}
}
