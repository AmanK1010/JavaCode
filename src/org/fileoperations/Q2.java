package org.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class Q2 {

	public static void main(String[] args) throws IOException {
		
//		FileReader f = new FileReader("D:\\Selenium\\CoreJava\\files\\java.txt.txt");
//		
//		BufferedReader br = new BufferedReader(f);
		File f1 = new File("D:\\Selenium\\DemoFolder\\inside\\india");
//		String content = FileUtils.readFileToString(f1);
//		System.out.println(content);
		
//		if(!f1.exists()) {
//			f1.mkdir();
//		}
		
//		File[] listFiles = f1.listFiles();
//		for (File a : listFiles) {
//			System.out.println(a);
//		}
//		
		f1.mkdirs();
		
		
		
		
		//for printing the last 5 lines
		
//		ArrayList<String> al = new ArrayList<String>();
//		String s;
//		while(( s=br.readLine()) != null) {
//			al.add(s);
//			if(al.size()>5) {
//				al.remove(0);
//			}
//			
//		}
		
		//System.out.println(al);
		
		//print the odd lines from the file
		
//		ArrayList<String> al = new ArrayList<String>();
//		String s;
//		while((s=br.readLine()) != null) {
//			al.add(s);
//		}
//		
//		for (int i = 0; i < al.size(); i++) {
//			if((i+1)%2==1) {
//				String string = al.get(i);
//				System.out.println(string);
//			}
//			
//		}
//		
		
		
		
		// for getting the number of lines
//		int lines = 0;
//		while (br.readLine() != null) lines++;
//		System.out.println(lines);
//		
		
//		int i=br.read();
//		while(i!=-1) {
//			System.out.print(i);
//		}
		
//		String line1 = br.readLine();
//		System.out.println("1 "+line1);
//		String line2 = br.readLine();
//		System.out.println("2 "+line2);
//		String line3 = br.readLine();
//		System.out.println("3 "+line3);
		//br.close();
		
		Map<String, Integer> m = new HashMap<>();
		m.put("aman", 101);
		m.put("deepak", 102);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
			
		}
			
		}
		
	}

}
