package com.org.test;

public class Sample {
	public static void main(String[] args) {
		
		String s = "Java";
	int identityHashCode = System.identityHashCode(s);
	System.out.println(identityHashCode);
		String s1= "Java" ;
		int identityHashCode2 = System.identityHashCode(s1);
		System.out.println(identityHashCode2);
		
		String concat = s.concat("Python");
		System.out.println(concat);
		int identityHashCode21 = System.identityHashCode(concat);
System.out.println(identityHashCode21);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
//		String s = "Welcome to java class" ; 
//		
//		System.out.println(s.length());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.indexOf("W"));
//		System.out.println(s.lastIndexOf("e"));
//		String w ="Welcome to Java class" ; 
//		System.out.println(w.equals(s));
//		System.out.println(w.equalsIgnoreCase(w));
//		System.out.println(s.substring(3, 15));
//		System.out.println(s.replace("c", "C"));
//		System.out.println(s.replaceAll("java", "CSS"));
//		System.out.println(s.charAt(6));
//		System.out.println("\n"+s.concat(w));
		
		
		
	}

}
