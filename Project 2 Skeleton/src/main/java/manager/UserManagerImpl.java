package manager;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import dao.UserDao;
import model.User;

@Service
public class UserManagerImpl implements UserManager {
	
	@Autowired
	private UserDao dao;

	@Override
	public List<User> findAll() {

		return dao.getUsers();
		
	}
	
	@Override
	public List<User> findAll(int startIndex, int count) {
		
		Pageable pageable = PageRequest.of(startIndex, count);
		
		return StreamSupport.stream(dao.findAll(pageable).spliterator(), false)
				.collect(Collectors.toList());
	}

	@Override
	public User findById(int id) {
		return dao.findById(Integer.valueOf(id)).get();
	}

	@Override
	public User create(User e) {
		return dao.save(e);
	}

}
