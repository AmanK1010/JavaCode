package org.singleton;

public  class SingletonClass {
	static SingletonClass ins;
	
private SingletonClass() {
}
	
	public static SingletonClass createInstance() {
		if(ins == null) {
			ins = new SingletonClass();
		}
		return ins;

	}
	
	
	public void anymethod() {
		System.out.println("Method of singleton class");
	}
}
