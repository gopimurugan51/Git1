package com.org.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserDefinedSet {
	public static void main(String[] args) {
		List<EncapPro> s = new ArrayList<>();
		
		EncapPro a = new EncapPro ();
		a.setEmpId(12);
		a.setEmpName("Mike");
		
		EncapPro b = new EncapPro ();
		b.setEmpId(26);
		b.setEmpName("Heisenberg");
		
		s.add(a);
		s.add(b);
	
	for (int i = 0; i < s.size(); i++) {
		System.out.println(s.get(i).getEmpId());
		System.out.println(s.get(i).getEmpName());
		
	}
		
				
	}
			
		}
	


