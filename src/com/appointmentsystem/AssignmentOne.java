package com.appointmentsystem;

import java.util.List;

public class AssignmentOne {
	public static void main(String[] args) {
		// Part 3 – Using classes and objects
		System.out.println("// 第 3 部分 – 使用类和对象");

		// 创建 GeneralPractitioner 的三个对象
		GeneralPractitioner Doctor1 = new GeneralPractitioner(101, "Dr. Smith", 50.50, "General Medicine", "3 floor",
				List.of("09:00", "10:30", "14:00", "15:30"),
				"主任");

		GeneralPractitioner Doctor2 = new GeneralPractitioner(
				102,
				"Dr. Johnson",
				35.50,
				"Family Health",
				"外科部门502",
				List.of("08:00", "09:30", "13:00", "16:00"),
				"副主任");

		GeneralPractitioner Doctor3 = new GeneralPractitioner(
				103,
				"Dr. Williams",
				67.99,
				"Community Health",
				"主楼304",
				List.of("10:00", "11:00", "14:00", "17:00"),
				"主任");

		// 创建 Pediatrician 的两个对象
		Pediatrician pediatrician1 = new Pediatrician(201,
				"Dr. Brown", 56.77, "Neonatology", "儿科505", "2-5");
		Pediatrician pediatrician2 = new Pediatrician(202,
				"Dr. Taylor", 89.34, "Child Psychiatry", "405", "8-12");

		// 打印所有全科医生的详细信息
		Doctor1.printDetails();
		Doctor2.printDetails();
		Doctor3.printDetails();
		pediatrician1.printDetails();
		pediatrician2.printDetails();

		// 添加分隔线
		System.out.println("------------------------------");
	}
}
