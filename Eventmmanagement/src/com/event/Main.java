
//Main File
package com.event;
import java.util.Scanner;
 public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("** This is Eventery management system **");
		
		Even e1=new Even();
		while(true) {
			System.out.println("Choose your Choice from followings:\n 1.Add an event. \n 2.Show an event.\n3.Remove an event");
		int e=sc.nextInt();
		switch(e) {
		case 1:		
			System.out.println("Enter how many event you want to added 1 or 2 or 3");
            int s=sc.nextInt();
			e1.add(s);
			break;
		case 2:
			System.out.println("Enter how many event you want to added 1 or 2 or 3");
            int s1=sc.nextInt();
			e1.show(s1);
//			e1.update(e);
			break;
		case 3:
//			e1.Remove(e);
			break;
		case 4:
//			
			break;
		default:
			System.out.println("Not matches choice properly");
			
		
		}}
		
		
		
	}
}

