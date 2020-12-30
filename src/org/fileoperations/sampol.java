package org.fileoperations;

import java.util.ArrayList;

public class sampol {
public static void main(String[] args) {
	
	ArrayList<sample> arrayList = new ArrayList<>();
	
	sample s = new sample();
	s.setEmpid(101);
	
	sample s1 = new sample();
	s1.setEmpid(102);
	
	sample s2 = new sample();
	s2.setEmpid(103);
	
	arrayList.add(s);
	arrayList.add(s1);
	arrayList.add(s2);
	
	for (sample sample : arrayList) {
		int empid = sample.getEmpid();
		System.out.println(empid);
	}
	
}
}
