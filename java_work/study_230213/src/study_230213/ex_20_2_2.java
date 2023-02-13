package study_230213;

import java.util.Arrays;

class Person2 implements Comparable{
	private String name;
	private int age;
	
	public Person2 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		return this.name.length() - p.name.length();
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
}

public class ex_20_2_2 {
	public static void main(String[] args) {
		Person2[] ar = new Person2[3];
		ar[0] = new Person2("LeeJooHoney", 29);
		ar[1] = new Person2("MinHyunk", 15);
		ar[2] = new Person2("YooKiHyun", 37);
	
		Arrays.sort(ar);
		for(Person2 p : ar)
			System.out.println(p);
	}

}
