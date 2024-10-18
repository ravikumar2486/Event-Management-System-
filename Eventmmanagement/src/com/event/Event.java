package com.event;


import java.util.ArrayList;
import java.util.Scanner;

//event date,purpose of event
class Even {
//	ArrayList<> arrayList = new ArrayList<>();
//
//	String name;
//	int duration;
//	String date;
	String s;
	int s1;
	String s2;
	int s3;
	String s4;
	int s5;
	String s6;
	int s7;
	String s8;
	int s9;
	String z1;
	String z2;
	String z3;
	String z4;
	String z5;
	String z6;
	String s10;
	int s11;
	
//	
	
//	HashMap<String,Integer> event=new HashMap<>();
	public void add(int e3) {
		Scanner sc=new Scanner(System.in);
//		switch (key) {
//		case value: {
//			
////			yield type;
////		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + key);
//		}
		switch(e3) {
		case 1:
		System.out.println("Enter event name:");
		s=sc.nextLine();
		System.out.println("Enter event time duration in hours");
		s1=sc.nextInt();
		System.out.println("Enter event time");
		z1=sc.nextLine();
//		event.put(s,s1);
		System.out.println("Event added Successfully");
		break;
		case 2:
			System.out.println("Enter event name:");
			s2=sc.nextLine();
			System.out.println("Enter event time duration in hours");
			s3=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the event date");
			z2=sc.nextLine();
			System.out.println("Enter second event name:");
		    s4=sc.nextLine();
		    System.out.println("Enter time duration of event in hours");
		    s5=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the event date:");
			z3=sc.nextLine();
			
			
			System.out.println("Event added Successfully");
			break;
		    case 3:
			System.out.println("Enter event name:");
			s6=sc.nextLine();
			System.out.println("Enter event time duration in hours");
			s7=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the event date:");
			z4=sc.nextLine();
			System.out.println("Enter second event name:");
		    s8=sc.nextLine();
		    System.out.println("Enter time duration of event in hours");
		    s9=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the event date:");
			z5=sc.nextLine();
			System.out.println("Enter third event name:");
		    s10=sc.nextLine();
		    
		    System.out.println("Enter time duration of event in hours");
		    s11=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the event date:");
			z6=sc.nextLine();
			System.out.println("Event added Successfully");
			break;
		    default:
			System.out.println("more than 3 cannot be accepeted");
		
	}}
	public void show(int e2) {
		if(e2==1) {		
			System.out.println("Event Information: ["+ s+","+s1+","+z1+"]");
             }
		else if(e2==2) {
			System.out.println("Event Information: ["+ s2+","+s3+","+z2+"]");
			System.out.println("Event Information: ["+ s4+","+s5+","+z3+"]");
		}
		else if(e2==3){
			System.out.println("Event Information: ["+ s6+","+s7+","+z4+"]");
			System.out.println("Event Information: ["+ s8+","+s9+","+z5+"]");
			System.out.println("Event Information: ["+ s10+","+s11+","+z6+"]");
            
		}
		
	}}
//	public void delete() {
//		System.out.println("Enter Student id: ");
//		int id = sc.nextInt();
//		
//		Student student = findStudentById(id);
//		if(arrayList.remove(student)) {
//			System.out.println("Student Record Delete Success");
//		}else {
//			System.out.println("Student Record NOt  Delete ");
//		}
//	
//	}