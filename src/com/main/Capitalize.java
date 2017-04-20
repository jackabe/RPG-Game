package com.main;

public class Capitalize {

//	http://www.java2s.com/Tutorial/Java/0040__Data-Type/Makesthefirstlettercapsandtherestlowercase.htm
	
	  public static String setStringCase ( String word ) {
		  if(word.isEmpty()){
			  System.out.println("Please enter something valid");
			  return "";
		  }
		  else {
	      String letter1 = word.substring(0,1).toUpperCase();
	      String otherLetters = word.substring(1).toLowerCase();
	      return letter1 + otherLetters;
		  }
	  }
}
