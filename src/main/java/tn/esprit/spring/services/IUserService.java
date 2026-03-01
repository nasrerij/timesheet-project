<<<<<<< HEAD
package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.User;

public interface IUserService { 
	 
	List<User> retrieveAllUsers(); 
	User addUser(User u);
	void deleteUser(String id);
	User updateUser(User u);
	User retrieveUser(String id);

} 
=======
package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.User;

public interface IUserService { 
	 
	List<User> retrieveAllUsers(); 
	User addUser(User u);
	void deleteUser(String id);
	User updateUser(User u);
	User retrieveUser(String id);

} 
>>>>>>> 1d85df4fc1b33ae34aaa1adddc04a350b29fbf2b
 