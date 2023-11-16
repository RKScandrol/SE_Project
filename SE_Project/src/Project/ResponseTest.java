package Project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ResponseTest {
	
	//Tests getting the responseBody of the response object.
	@Test
	void getMemberTest() {
		Group testGroup1 = new Group("Standard Name");
		User testUser2 = new User("Bob", "ID", "pw", "11/11/2001", "Valdosta", "GA");
		membership m = new membership(testUser2, testGroup1);
		Response testResponse1 = new Response(m, "I disagree.", 1);
		
		assertEquals(m.getUser(), testResponse1.getUser());
	}
	
	//Tests getting the responseBody of the response object.
	@Test
	void getResponseBodyTest() {
		Group testGroup1 = new Group("Standard Name");
		User testUser2 = new User("Bob", "ID", "pw", "11/11/2001", "Valdosta", "GA");
		membership m = new membership(testUser2, testGroup1);
		Response testResponse1 = new Response(m, "I disagree.", 1);
		
		assertEquals("I disagree.", testResponse1.getPostBody());
	}

}
