package com.supermap.user_core;

import org.hamcrest.Matcher;


public class MyMatchers {  
    public static Matcher<User> isAdmin() {  
        return new IsAdminMatcher();  
    }  
}  
