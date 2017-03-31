package com.main;

public class Capitalize {
	
	  public static String setStringCase ( String string ) {
		  if(string.isEmpty()){
			  System.out.println("Please enter something valid");
			  return "";
		  }
		  else {
	      String firstLetter = string.substring(0,1).toUpperCase();
	      String restLetters = string.substring(1).toLowerCase();
	      return firstLetter + restLetters;
		  }
	  }
	}
