package com.org.test;

public class stringUppertoLower {
	
	public static void main(String[] args) {
		
		String s = "MaLayALam";
		
		String temp="";
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			
			// 						condition ? true : false  ;
			// datatype variable = boolean ? datatype : datatype;5  //?-->Ternary operator
			temp = Character.isUpperCase(c) ? temp+String.valueOf(c).toLowerCase() : temp+String.valueOf(c).toUpperCase();
			//we use wrapper class here because wrapper class only gives.isUppercase normal class wont give that
			
		}
		System.out.println(temp);
	
	}

}
