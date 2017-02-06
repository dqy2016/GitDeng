package com.supermap.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class MyServlet extends HttpServlet {   
	  
    protected static boolean initialized = false;   
  
    public void init(ServletConfig servletConfig) throws ServletException   
    {   
        super.init(servletConfig);   
           
        if (MyServlet.initialized)   
            return;   
           
        MyServlet.initialized = true;   
    }   
       
    public boolean getInitialized() {   
        return MyServlet.initialized;   
    }   
}  