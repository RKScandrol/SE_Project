package Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SystemManagerTest {

	@Test
	void testLogin_Success_User() {
		User u1 = new User("Jack", "jackster3", "HKb@wser!");
		User u2 = new User("Dan", "theWiz", "WartH@g77");
		User u3 = new User("Carol", "WestCarolina", "P!zzaH$t");
		User u4 = new User("Dulaney", "LegalTrouble", "D@uble&Tr@uble");
		User u5 = new User("Ethan", "IDK", "WHY#5");
		
		SystemManager.addUser(u1);
		SystemManager.addUser(u2);
		SystemManager.addUser(u3);
		SystemManager.addUser(u4);
		SystemManager.addUser(u5);
		
		boolean tf = SystemManager.login("LegalTrouble", "D@uble&Tr@uble");
		
		assertEquals(true, tf);
	}
	
	@Test
	void testLogin_Failure_Username_User() {
		User u1 = new User("Jack", "jackster3", "HKb@wser!");
		User u2 = new User("Dan", "theWiz", "WartH@g77");
		User u3 = new User("Carol", "WestCarolina", "P!zzaH$t");
		User u4 = new User("Dulaney", "LegalTrouble", "D@uble&Tr@uble");
		User u5 = new User("Ethan", "IDK", "WHY#5");
		
		SystemManager.addUser(u1);
		SystemManager.addUser(u2);
		SystemManager.addUser(u3);
		SystemManager.addUser(u4);
		SystemManager.addUser(u5);
		
		boolean tf = SystemManager.login("Failure", "D@uble&Tr@uble");
		
		assertEquals(false, tf);
	}
	
	
	@Test
	void testLogin_Failure_Password_User() {
		User u1 = new User("Jack", "jackster3", "HKb@wser!");
		User u2 = new User("Dan", "theWiz", "WartH@g77");
		User u3 = new User("Carol", "WestCarolina", "P!zzaH$t");
		User u4 = new User("Dulaney", "LegalTrouble", "D@uble&Tr@uble");
		User u5 = new User("Ethan", "IDK", "WHY#5");
		
		SystemManager.addUser(u1);
		SystemManager.addUser(u2);
		SystemManager.addUser(u3);
		SystemManager.addUser(u4);
		SystemManager.addUser(u5);
		
		boolean tf = SystemManager.login("LegalTrouble", "Failure");
		
		assertEquals(false, tf);
	}
	
	@Test
	void testLogin_Success_Admin() {
		Admin a1 = new Admin("Jack", "jackster3", "HKb@wser!");
		Admin a2 = new Admin("Dan", "theWiz", "WartH@g77");
		
		SystemManager.addAdmin(a1);
		SystemManager.addAdmin(a2);
		
		boolean tf = SystemManager.login("jackster3", "HKb@wser!");
		
		assertEquals(true, tf);
	}
	
	@Test
	void testLogin_Failure_Username_Admin() {
		Admin a1 = new Admin("Jack", "jackster3", "HKb@wser!");
		Admin a2 = new Admin("Dan", "theWiz", "WartH@g77");
		
		SystemManager.addAdmin(a1);
		SystemManager.addAdmin(a2);
		
		boolean tf = SystemManager.login("jackster7", "HKb@wser!");
		
		assertEquals(false, tf);
	}
	
	@Test
	void testLogin_Falilure_Password_Admin() {
		Admin a1 = new Admin("Jack", "jackster3", "HKb@wser!");
		Admin a2 = new Admin("Dan", "theWiz", "WartH@g77");
		
		SystemManager.addAdmin(a1);
		SystemManager.addAdmin(a2);
		
		boolean tf = SystemManager.login("jackster3", "Failure");
		
		assertEquals(false, tf);
	}

}
