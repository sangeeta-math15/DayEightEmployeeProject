package com.bridgelabz;

public class EmployeeWage {

	public static final int IS_Full_TIME = 1;
	public static final int EMP_RATE_PER_HR = 20;

	// Driver Code
	public static void main(String args[]) {
		int empHr = 0;
		int empWage = 0;

		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		// use random function gives value 0 or 1
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		// print random values
		System.out.println("Random values=>" + empCheck);
		if (empCheck == IS_Full_TIME) {
			empHr = 8;
			System.out.println("Employee Present");
		} else {
			System.out.println("Employee Absent");
		}
		empWage = empHr * EMP_RATE_PER_HR;
		System.out.println("Employee Wage=>" + empWage);

	}
}
