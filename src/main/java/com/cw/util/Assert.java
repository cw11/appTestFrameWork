package com.cw.util;

import java.util.ArrayList;
import java.util.List;



public class Assert {
	
	    public static boolean flag = true;
	    public static final List<Error> errors = new ArrayList<>();

	    public static void assertFalse(boolean condition, String message){
	        try{
	            Assert.assertFalse(condition,message);
	        }catch(Error e){
	            errors.add(e);
	            flag=false;
	        }
	    }
	    public static void assertFalse(boolean condition){
	        try{
	            Assert.assertFalse(condition);
	        }catch(Error e){
	            errors.add(e);
	            flag=false;
	        }
	    }
	    public static void assertTrue(boolean condition, String message){
	        try{
	            Assert.assertTrue(condition,message);
	        }catch(Error e){
	            errors.add(e);
	            flag=false;
	        }
	    }
	    public static void assertTrue(boolean condition){
	        try{
	            Assert.assertTrue(condition);
	        }catch(Error e){
	            errors.add(e);
	            flag=false;
	        }
	    }
	    public static void assertEquals(Object actual,Object expected){
	        try{
	            Assert.assertEquals(actual,expected);
	        }catch(Error e){
	            errors.add(e);
	            flag=false;
	        }
	    }

	    public static void assertEquals(Object actual,Object expected,String message){
	        try{
	            Assert.assertEquals(actual, expected, message);
	        }catch(Error e){
	            errors.add(e);
	            flag=false;
	        }
	    }
	    public static void assertNull(Object actual,String message){
	        try{
	            Assert.assertNull(actual,message);
	        }catch(Error e){
	            errors.add(e);
	            flag=false;
	        }
	    }
	
	    
}
