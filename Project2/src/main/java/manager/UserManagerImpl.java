package manager;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import model.User;

@Service
@Transactional
public class UserManagerImpl implements UserManager {

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(int startIndex, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(User u) {
		// TODO Auto-generated method stub
		return null;
	}

}
