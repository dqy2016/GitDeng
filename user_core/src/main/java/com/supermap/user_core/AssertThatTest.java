package com.supermap.user_core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static com.supermap.user_core.MyMatchers.*;

public class AssertThatTest {
	User user = new User("admin", "admin"); 
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdmin() throws Exception{
		//assertThat(user,new IsAdminMatcher());
	
		assertThat(user,isAdmin());
	}

}
