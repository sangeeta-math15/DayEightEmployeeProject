package com.bridgelabz;

/**
 * Employee Wage Computation Problem
 * 
 * @author CHANDRU
 *
 */
public class EmployeeWage {
	public static final int IS_Full_TIME = 1;
	public static final int IS_Part_Time = 2;
	public static final int EMP_RATE_PER_HR = 20;

	// Driver Code
	public static void main(String args[]) {
		int empHr = 0;
		int empWage = 0;

		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		// use random function gives value 0 or 1
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		// print random values
		System.out.println("Random values=>" + empCheck);
		// using Switch Cases we are solving the Employee Wage Problem
		switch (empCheck) {
		case 1:
			empHr = 8; // Employee hour for Full Day
			System.out.println("Full Time");
			break;
		case 2:
			empHr = 4; // Employee hour for Part Time
			System.out.println("Part Time");
			break;
		case 3:
			empHr = 0; // Employee hour for Employee Absent
			System.out.println("Employee Absent");
			break;
		default:
			empHr = 0; // Default Employee hour
			break;
		}

		// calculate employee Wage
		empWage = empHr * EMP_RATE_PER_HR;
		// print employee Wage
		System.out.println("Employee Wage=>" + empWage);

	}
}
