package com.supermap.test;

import org.apache.cactus.ServletTestCase;  
import org.apache.cactus.WebRequest;
import org.apache.cactus.extension.jetty.JettyTestSetup;

import junit.framework.Test;
import junit.framework.TestSuite;  
  
public class TestSampleServletIntegration extends ServletTestCase  
{  
    private SampleServlet servlet;      
  
    public static Test suite()  
    {  
        System.setProperty("cactus.contextURL", "http://localhost:8090/user_servlet");// 这步很重要，一定要有  
  
        TestSuite suite = new TestSuite("All tests with Jetty");  
        suite.addTestSuite(TestSampleServletIntegration.class);  
        return new JettyTestSetup(suite);  
        
    }  
  
    protected void setUp()  
    {  
        servlet = new SampleServlet();  
    }  
      
    public void testIsAuthenticatedAuthenticated()  
    {  
        session.setAttribute("authenticated", "true");  
          
        assertTrue(servlet.isAuthenticated(request));  
    }  
  
    public void testIsAuthenticatedNotAuthenticated()  
    {  
        assertFalse(servlet.isAuthenticated(request));  
    }  
  
    public void beginIsAuthenticatedNoSession(WebRequest request)  
    {  
        request.setAutomaticSession(false);  
    }  
      
    public void testIsAuthenticatedNoSession()  
    {  
        assertFalse(servlet.isAuthenticated(request));  
    }  
}  
