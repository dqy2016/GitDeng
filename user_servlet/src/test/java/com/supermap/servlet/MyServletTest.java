package com.supermap.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.apache.cactus.extension.jetty.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyServletTest extends TestCase {
	ServletConfig servletConfig;
	protected void setUp() throws Exception {
		super.setUp();
	}

	public MyServletTest(String theName) throws Exception   
    {   
        super(theName);   
           
        System.setProperty("cactus.contextURL", "http://localhost:8090/user_servlet");   
    }   
  
    public static Test suite()   
    {   
        TestSuite suite = new TestSuite();           
        suite.addTestSuite(MyServletTest.class);   
        return new JettyTestSetup(suite);   
    }   
  
    public void testMyServletInitialized()   
    {   
        MyServlet servlet = new MyServlet();   
        try {   
            servlet.init(servletConfig);   
        } catch (ServletException e) {   
            e.printStackTrace();   
        }   
        assertTrue(servlet.getInitialized());   

}
}
