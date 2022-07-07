package financeapp.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import financeapp.models.User;



@Repository
public interface UserRepository extends CrudRepository<User,Long>
{
	public ArrayList<User> findAll();
//	select * from user where user.name=?
//	select * form user where user.email=?
	public User findByEmail(String email);
	
};