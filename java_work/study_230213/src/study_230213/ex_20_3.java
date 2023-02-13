package study_230213;

import java.util.Arrays;

class Person3 implements Comparable {
	private String name;
	private int age;
	
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		Person3 p = (Person3)o;
		return this.name.compareTo(p.name);
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
}

public class ex_20_3 {
	public static void main(String[] args) {
		Person3[] ar = new Person3[3];
		
		ar[0] = new Person3("LeeJooHoney", 29);
		ar[1] = new Person3("MinHyunk", 15);
		ar[2] = new Person3("YooKiHyun", 37);
		Arrays.sort(ar);
		
		int idx =  Arrays.binarySearch(ar,  new Person3("YooKiHyun", 25));
		System.out.println(ar[idx]);
	}
}
