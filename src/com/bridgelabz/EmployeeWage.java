package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		// use random function gives value 0 or 1
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		// print random values
		System.out.println("Random values=>" + empCheck);
		if (empCheck == 1) {
			System.out.println("Employee Present");
		} else {
			System.out.println("Employee Absent");
		}
	}

}
