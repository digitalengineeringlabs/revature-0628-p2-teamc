package manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDAO;
import model.User;


@Service
public class UserManagerImpl implements UserManager{
	
	@Autowired
	private UserDAO dao;

	@Override
	public User create(User u) {
		
		return dao.save(u);
	}

}
