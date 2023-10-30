package Project;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class WriteFileTest {
	
	
	
	@Test
	void testWriteFile_Admins() {
		
		Admin a1 = new Admin("Jeremy", "unth!nk@b1e", "password#3", "04/27/1992", "New York City", "New York", "11/11/2011");
		Admin a2 = new Admin("Grayson", "theGr@yS0n", "r@inB0wR0@DL0s3r", "03/09/2012", "Macon", "Georgia", "03/09/2011");
		Admin a3 = new Admin("Ryan", "RKScandrol", "N0tT311iN", "08/08/1999", "Pensacola", "Florida", "07/07/2010");
		Admin a4 = new Admin("John", "J0hnW!ck", "n0tth3D0g", "01/01/0001", "Boring", "Oregon", "12/29/2020");
		Admin a5 = new Admin("Himanshu", "the01dM@n", "L3t5D0Th!s", "07/23/1836", "Climax", "Michigan", "12/09/2007");
		
		SystemManager manager = new SystemManager();
		
		manager.addAdmin(a1);
		manager.addAdmin(a2);
		manager.addAdmin(a3);
		manager.addAdmin(a4);
		manager.addAdmin(a5);
		
		String fileName = ".\\SE_Project\\src\\Project\\TextFiles\\WriteFiles_Test_Admins.txt";
		
		try {
			WriteFile.writeFile(manager, fileName);
			
			assertEquals(true, true);
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
		
		
	}

	@Test
	void testWriteFile_Users() {
		
		User u1 = new User("Jack", "jackster3", "HKb@wser!", "10/10/1997", "Valdosta", "Georgia");
		User u2 = new User("Dan", "theWiz", "WartH@g77", "10/10/1997", "Valdosta", "Georgia");
		User u3 = new User("Carol", "WestCarolina", "P!zzaH$t", "10/10/1997", "Valdosta", "Georgia");
		User u4 = new User("Dulaney", "LegalTrouble", "D@uble&Tr@uble", "10/10/1997", "Valdosta", "Georgia");
		User u5 = new User("Ethan", "IDK", "WHY#5", "10/10/1997", "Valdosta", "Georgia");
		
		SystemManager manager = new SystemManager();
		
		manager.addUser(u1);
		manager.addUser(u2);
		manager.addUser(u3);
		manager.addUser(u4);
		manager.addUser(u5);
		
		String fileName = ".\\SE_Project\\src\\Project\\TextFiles\\WriteFile_Test_Users.txt";
		
		try {
			
			WriteFile.writeFile(manager, fileName);
			
			assertEquals(true, true);
			
		} catch (IOException e) {
			
			
			
			e.printStackTrace();
			fail();
		}
		
	}
	
	
	@Test
	void testWriteFile_Categories() {
		
		SystemManager manager = new SystemManager();
		
		category c1 = new category("Sports");
		category c2 = new category("Foods");
		category c3 = new category("Games");
		
		manager.addCategory(c1);
		manager.addCategory(c2);
		manager.addCategory(c3);
		
		String fileName = ".\\SE_Project\\src\\Project\\TextFiles\\WriteFile_Test_Categories.txt";
		
		try {
			
			WriteFile.writeFile(manager, fileName);
			
			assertEquals(true, true);
			
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
		
	}
	
	
	@Test
	void testWriteFile_Groups() {
		
		SystemManager manager = new SystemManager();
		
		category c1 = new category("Sports");
		Group g1 = new Group("Football");
		Group g2 = new Group("Soccer");
		c1.addGroup(g1);
		c1.addGroup(g2);
		
		category c2 = new category("Foods");
		Group g3 = new Group("Pizza");
		Group g4 = new Group("Tacos");
		Group g5 = new Group("Steak");
		c2.addGroup(g3);
		c2.addGroup(g4);
		c2.addGroup(g5);
		
		manager.addCategory(c1);
		manager.addCategory(c2);
		
		String fileName = ".\\SE_Project\\src\\Project\\TextFiles\\WriteFile_Test_Groups.txt";
		
		
		try {
			
			WriteFile.writeFile(manager, fileName);
			
			assertEquals(true, true);
			
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
		
		
	}

}
