package com.set;

import java.awt.font.NumericShaper.Range;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumConcept {

	enum Lang{
		JAVA,CSHARP,PYTHON,RUBY,GROOVY,JAVASCRIPT
	}
	
	
	public static void main(String[] args) {
		//new enumset using enum
		EnumSet<Lang> e1= EnumSet.allOf(Lang.class);
		System.out.println(e1);
		
		//empty enumset
		EnumSet<Lang> empty = EnumSet.noneOf(Lang.class);
		System.out.println(empty);
		
		//range enumset
		EnumSet<Lang> range = EnumSet.range(Lang.PYTHON, Lang.GROOVY);
		System.out.println(range);
		
		EnumSet<Lang> of = EnumSet.of(Lang.CSHARP,Lang.JAVA,Lang.GROOVY);
		System.out.println(of);
		
		//add
		empty.add(Lang.CSHARP);
		System.out.println(empty);
		
		//addall
		empty.addAll(range);
		System.out.println(empty);
		
		
		Iterator<Lang> iterator = e1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		//remove
		e1.remove(Lang.JAVA);
		System.out.println(e1);
		
		//removeAll
		of.removeAll(e1);
		System.out.println(of);
		
		
	
	}
}
