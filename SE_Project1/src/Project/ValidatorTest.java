package Project;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ValidatorTest {

	@Test
	void testValidUsername_Users_Success() {
		User u1 = new User("Jack", "jackster3", "HKb@wser!");
		User u2 = new User("Dan", "theWiz", "WartH@g77");
		User u3 = new User("Carol", "WestCarolina", "P!zzaH$t");
		User u4 = new User("Dulaney", "LegalTrouble", "D@uble&Tr@uble");
		User u5 = new User("Ethan", "IDK", "WHY#5");
		
		ArrayList<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
		User actual = Validator.validUserName_Users(users, "WestCarolina");
		User expected = u3;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testValidUsername_Users_Failure() {
		User u1 = new User("Jack", "jackster3", "HKb@wser!");
		User u2 = new User("Dan", "theWiz", "WartH@g77");
		User u3 = new User("Carol", "WestCarolina", "P!zzaH$t");
		User u4 = new User("Dulaney", "LegalTrouble", "D@uble&Tr@uble");
		User u5 = new User("Ethan", "IDK", "WHY#5");
		
		ArrayList<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
		User actual = Validator.validUserName_Users(users, "EastCarolina");
		User expected = null;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testValidUsername_Admins_Success() {
		Admin a1 = new Admin("Jack", "jackster3", "HKb@wser!");
		Admin a2 = new Admin("Dan", "theWiz", "WartH@g77");
				
		ArrayList<Admin> admins = new ArrayList<>();
		admins.add(a1);
		admins.add(a2);
				
		User actual = Validator.validUserName_Admins(admins, "theWiz");
		Admin expected = a2;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testValidUsername_Admins_Failure() {
		Admin a1 = new Admin("Jack", "jackster3", "HKb@wser!");
		Admin a2 = new Admin("Dan", "theWiz", "WartH@g77");
				
		ArrayList<Admin> admins = new ArrayList<>();
		admins.add(a1);
		admins.add(a2);
				
		User actual = Validator.validUserName_Admins(admins, "failure");
		Admin expected = null;
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testValidateCategoryNameExists_True() {
		ArrayList<category> categories = new ArrayList<category>();
		
		category c1 = new category("Sports");
		category c2 = new category("Games");
		category c3 = new category("Video Games");
		category c4 = new category("Foods");
		category c5 = new category("Apples");
		
		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		categories.add(c4);
		categories.add(c5);
		
		Boolean actual = Validator.validateCategoryNameExists(categories, "Foods");
		
		assertEquals(true, actual);
	}
	
	
	@Test
	void testValidateCategoryNameExists_False() {
		ArrayList<category> categories = new ArrayList<category>();
		
		category c1 = new category("Sports");
		category c2 = new category("Games");
		category c3 = new category("Video Games");
		category c4 = new category("Foods");
		category c5 = new category("Apples");
		
		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		categories.add(c4);
		categories.add(c5);
		
		Boolean actual = Validator.validateCategoryNameExists(categories, "Computers");
		
		assertEquals(false, actual);
	}

}
