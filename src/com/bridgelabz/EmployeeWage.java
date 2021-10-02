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
	public static final int Num_Of_Working_Days = 20;

	// Driver Code
	public static void main(String args[]) {
		int empHr = 0;
		int empWage = 0;
		int day;
		int total_EmpWage = 0;
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		// Using for loop we have calculate total Employee Wage for month.
		// Assume Number of Working days is 20
		for (day = 1; day < Num_Of_Working_Days; day++) {
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
			// calculate total employee wages for month
			total_EmpWage = total_EmpWage + empWage;
			// print employee Wage
			System.out.println("Employee Wage=>" + empWage);
			System.out.println();

		}
		// Print Total Employee Wages
		System.out.println("Total Employee Wages for Month=>" + total_EmpWage);
	}
}
