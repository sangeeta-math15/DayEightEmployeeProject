package com.bridgelabz;

/**
 * Refactoring the Code to write a Class Method to Compute Employee Wage - Use
 * Class Method and Class
 * 
 * @author CHANDRU
 *
 */
class EmpWage {
	// declaration of variables
	int empHr = 0;
	int empWage = 0;
	int totalEmpWage = 0;
	int totalWorkingDays = 0;
	int totalEmpHr = 0;

	public static final int IS_Full_TIME = 1;
	public static final int IS_Part_Time = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final int Num_Of_Working_Days = 20;
	public static final int MAX_HR_IN_MONTH = 100;

	public void calculateWage() {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		// while condition use of total working hours or days is reached for a month
		// Assume 100 hours and 20 days
		while (totalEmpHr <= MAX_HR_IN_MONTH && totalWorkingDays < Num_Of_Working_Days) {
			totalWorkingDays++;
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
			totalEmpWage = totalEmpWage + empWage;
			// calculate total Employee hour
			totalEmpHr = totalEmpHr + empHr;
			System.out.println("days" + " " + totalWorkingDays + " " + "emphrs" + " " + empHr);
			System.out.println("Employee Wage=>" + empWage);
			System.out.println();

		}
		// Print Total Employee Wages
		System.out.println("Total hour=>" + totalEmpHr);
		System.out.println("Total Employee Wages for Month=>" + totalEmpWage);
	}

}

public class EmployeeWage {

	// Driver Code
	public static void main(String args[]) {
		EmpWage emp = new EmpWage();

		emp.calculateWage();

	}
}
