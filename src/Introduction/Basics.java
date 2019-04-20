package Introduction;

import java.util.Arrays;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

public class Basics {

	static void intialize() {
		int a[] = new int[10];
		System.out.println("Intialize");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	static void literals() {
		System.out.println("direct literals");
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		a = new int[] { 1, 2, 3, 4, 5, 5, 6, 7 };
		System.out.println("in-direct  literals");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("for each loop");
		for (int temp : a) {
			System.out.println(temp);
		}
	}

	static void exceptions() {
		try {
			int a[] = { 1, 2, 3, 4 };
			System.out.println(a[a.length]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array out of Bounds");
		} finally {
			System.out.println("exception caught");
		}
	}

	static void array_operations() {
		Student stu[] = new Student[5];
		stu[0] = new Student(1, "hello1");
		stu[1] = new Student(2, "hello2");
		stu[3] = new Student(3, "hello3");

		for (Student s : stu) {
			if (s != null) {
				System.out.println(s.id);
				System.out.println(s.name);
			}
		}
	}

	static void twoDarrays() {
		int a[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

	static void cloneable() {
		int a[]= {1,2,3,4,5};
		int b[]=a.clone();
		System.out.println(a==b);
		System.out.println(Arrays.equals(a,b));
		
	}
	public static void main(String[] args) {
		intialize();
		literals();
		exceptions();
		array_operations();
		twoDarrays();
		cloneable();

	}
}
