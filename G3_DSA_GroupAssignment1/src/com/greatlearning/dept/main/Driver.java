package com.greatlearning.dept.main;

import com.greatlearning.dept.service.AdminDepartment;
import com.greatlearning.dept.service.HrDepartment;
import com.greatlearning.dept.service.TechDepartment;

public class Driver {

	public static void main(String[] args) {

		AdminDepartment adminDept = new AdminDepartment();
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();

		System.out.println("Welcome to " + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());

		System.out.println("\nWelcome to " + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());

		System.out.println("\nWelcome to " + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());

	}

}
