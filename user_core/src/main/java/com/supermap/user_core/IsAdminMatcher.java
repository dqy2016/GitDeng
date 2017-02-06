package com.supermap.user_core;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

/**
 * 断言一个给定的User对象是管理员
 */
public class IsAdminMatcher extends BaseMatcher<User> {
    /**
     * 对给定的对象进行断言判定，返回true则断言成功，否则断言失败
     */
	
    public boolean matches(Object item) {
    	User user = (User) item;
        if (item == null) {
            return false;
        }

        
        return "admin".equals(user.getUsername()) && "admin".equals(user.getPassword());
    }

    /**
     * 给期待断言成功的对象增加描述
     */
   
    public void describeTo(Description description) {
        description.appendText("Administrator with 'admin' as username and password");
    }
    /** 
     * 当断言失败时，描述实际上得到的错误的对象。 
     */  
    @Override  
    public void describeMismatch(Object item, Description description) {  
        if (item == null) {  
            description.appendText("was null");  
        } else {  
            User user = (User) item;  
            description.appendText("was a common user (")  
                    .appendText("username: ").appendText(user.getUsername()).appendText(", ")  
                    .appendText("password: ").appendText(user.getPassword()).appendText(")");  
        }  
    }  
}