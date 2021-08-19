package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	public List<User> findByGenderAndAge(String gender, int age);
	
	@Query(value="select e from Employee e where e.salary between :start and :end")
	public List<User> getEmployeesWithMedian(@Param("start") int start, @Param("end") int end);
	
	@Query(value="select * from employee where age > ?1",nativeQuery = true)
	public List<User> getSeniorEmployees(int limit);
	
	@Query("select e.gender as gender, AVG(e.salary) as average from Employee e group by e.gender")
	List<GenderSalary> fetchSalaryDataByGender();


}
