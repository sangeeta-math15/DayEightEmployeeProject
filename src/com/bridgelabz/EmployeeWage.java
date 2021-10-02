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
		if (empCheck == IS_Full_TIME) {
			empHr = 8; // employee hour for Full Day

		} else if (empCheck == IS_Part_Time) {
			empHr = 4; // Employee hour for Part Time
		} else {
			empHr = 0;
			System.out.println("Employee Absent");
		}
		// calculate employee Wage
		empWage = empHr * EMP_RATE_PER_HR;
		// print employee Wage
		System.out.println("Employee Wage=>" + empWage);

	}
}
