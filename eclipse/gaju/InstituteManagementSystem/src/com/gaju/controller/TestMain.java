package com.gaju.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.gaju.service.OperationServiceInterfaceI;
import com.gaju.service.OperationServiceInterfaceImpl;

public class TestMain 
{
	public static void main(String[] args) {
		OperationServiceInterfaceI osi=new OperationServiceInterfaceImpl();
		int ch=0;
		String s;
		System.out.println("************************************************");
		System.out.println("********College Management Application**********");
		System.out.println("************************************************");
		System.out.println();
		do{
		System.out.println();
		System.out.println("1.Add Course");
		System.out.println("2.View Course");
		System.out.println("3.Add Faculty");
		System.out.println("4.View Faculty");
		System.out.println("5.Add Batch");
		System.out.println("6.view Batch");
		System.out.println("7.Add Student");
		System.out.println("8.View Student");
		System.out.println("9.Exit");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter UR choice");
		try {
		ch=sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("Please Enter Must Valid Number Input");
		}
			switch (ch) {
			case 1:
				osi.addCourse();
				break;
			case 2:
				osi.viewCourse();
				break;
			case 3:
				osi.addFaculty();
				break;
			case 4:
				osi.viewFaculty();
				break;
			case 5:
				osi.addBatch();
				break;
			case 6:
				osi.viewbatch();
				break;
			case 7:
				osi.addStudent();
				break;
			case 8:
				osi.viewStudent();
				break;
			case 9:
				System.exit(9);
				break;
			default:
				break;
			}
			System.out.println();
			System.out.println("Do you want to continue Press Y for Yes And N for No");
			s=sc.next();
		}
		while(s.equals("Y")||s.equals("y"));
		System.out.println("Thank You for visit Have Good Day !!");
		
		
	}
}
		


