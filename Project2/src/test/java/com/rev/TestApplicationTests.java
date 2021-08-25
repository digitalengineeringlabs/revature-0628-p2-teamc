package com.rev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project2.main.dao.UserDAO;
import com.project2.main.manager.UserManager;
import com.project2.main.model.User;

@SpringBootTest
class TestApplicationTests {

	List<User> sample = new ArrayList<User>();


	public void setSample() {
		sample.clear();
		sample.add(new User(1, "Chris", "pass1", false));
		sample.add(new User(2, "Eddie", "pass2", false));
		sample.add(new User(3, "Thomas", "pass3", false));
		sample.add(new User(4, "Zyon", "pass4", false));
		sample.add(new User(5, "testManager", "pass5", true));
	}

	@Autowired
	private UserManager manager;

	@MockBean
	private UserDAO dao;

	@Test
	@DisplayName("Find all users test method.")
	public void findAllTest() {
//		when(dao.findAll()).thenReturn(Stream.of(new User(), new User()).collect(Collectors.toList()));
//		assertEquals(2, manager.findAll().size());
		setSample();
		when(dao.findAll()).thenReturn(sample);
		assertEquals(sample.size(), manager.findAll().size());
	}


	@Test
	@DisplayName("Find User by username and password test method.")
	public void loginTest() {
		//String username = "Chris", password = "pass1";
		setSample();
		User user1 = sample.get(0);
		when(dao.findByUsernameAndUserpassword(user1.getUsername(), user1.getUserpassword())).thenReturn(user1);
		assertEquals(user1, manager.login(user1.getUsername(), user1.getUserpassword()));
	}

}
