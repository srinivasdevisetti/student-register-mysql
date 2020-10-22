package studentList;

import java.awt.Menu;
import java.util.Scanner;

public class ui {
   static student s= new student();
	public static void menu() {
		int ch=0;
		System.out.println("select the folling options:");
		System.out.println("1 - list of students");
		System.out.println("2 -add student to list");
		System.out.println("3 - remove student from list");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your option:");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			s.print();
			menu();
			break;
		case 2:
			s.add();
			menu();
			break;
		case 3:
			s.remove();
		menu();
		}
	}
	public static void main(String[] args) {
		menu();
	}

}
