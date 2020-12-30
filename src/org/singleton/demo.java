package org.singleton;

public class demo {
	public static String name(String name) {

		return name;

	}

	public int add(int a, int b) {

		int c = a + b;

		return c;
	}

	public void sub() {
		int d = c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		name("aman");
		System.out.println("done");
		demo demo = new demo();
		demo.add(10, 5);

	}
}
