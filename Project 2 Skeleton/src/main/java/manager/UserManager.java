package manager;

import java.util.List;

import model.User;


public interface UserManager {

	List<User> findAll();
	
	List<User> findAll(int startIndex, int count);

	User findById(int id);

	User create(User e);

}
