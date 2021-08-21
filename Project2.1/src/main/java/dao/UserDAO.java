package dao;
import org.springframework.data.jpa.repository.JpaRepository;

import model.User;
public interface UserDAO extends JpaRepository<User, Integer> {

}
