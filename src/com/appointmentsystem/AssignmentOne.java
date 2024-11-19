package com.appointmentsystem;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
	private static ArrayList<Appointment> appointments = new ArrayList<>();

	public static void main(String[] args) {
		// Part 3 – Using classes and objects
		System.out.println("// 第 3 部分 – 使用类和对象");

		GeneralPractitioner Doctor1 = new GeneralPractitioner(1, "Dr. Jane", 50.50, "General Medicine", "3 floor",
				List.of("09:00", "10:30", "14:00", "15:30"), "主任");

		GeneralPractitioner Doctor2 = new GeneralPractitioner(2, "Dr. Peng", 35.50, "Family Health", "外科部门502",
				List.of("08:00", "09:30", "13:00", "16:00"), "副主任");

		GeneralPractitioner Doctor3 = new GeneralPractitioner(3, "Dr. Aura", 67.99, "Community Health", "主楼304",
				List.of("10:00", "11:00", "14:00", "17:00"), "主任");

		Pediatrician pediatrician1 = new Pediatrician(4, "Dr. Blue", 56.77, "Neonatology", "儿科505", "2-5");
		Pediatrician pediatrician2 = new Pediatrician(5, "Dr. Yolo", 89.34, "Child Psychiatry", "405", "8-12");

		Doctor1.printDetails();
		Doctor2.printDetails();
		Doctor3.printDetails();
		pediatrician1.printDetails();
		pediatrician2.printDetails();

		System.out.println("------------------------------");

		// Part 5 – Collection of appointments

		System.out.println("// Part 5 – Collection of appointments  ");

		createAppointment("Salad", "2736282649", "09:00", Doctor1);
		createAppointment("Ding", "37354960441", "11:00", Doctor2);
		createAppointment("Zoo", "25324648232", "14:00", pediatrician1);
		createAppointment("Yang", "67890123455", "15:00", pediatrician2);

		printExistingAppointments();
		System.out.println("------------------------------");

		cancelBooking("2736282649");

		printExistingAppointments();
		// 测试错误时间段
		System.out.println("// 测试时间段错误");
		Appointment appointment = new Appointment("John Doe", "1234567890", "09:00", Doctor1);
		try {
			appointment.setPreferredTimeSlot("12:00"); // doctor1 不提供此时间段
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// 创建新约会的方法
	public static void createAppointment(String patientName, String mobilePhone, String preferredTimeSlot,
			HealthProfessional doctor) {
		if (patientName == null || mobilePhone == null || preferredTimeSlot == null || doctor == null) {
			System.out.println("Error: Missing required information. Cannot create appointment.");
			return;
		}
		try {
			Appointment newAppointment = new Appointment(patientName, mobilePhone, preferredTimeSlot, doctor);
			appointments.add(newAppointment);
			System.out.println("Appointment created successfully for " + patientName + " with " + doctor.getName() +
					" at " + preferredTimeSlot);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// 打印现有约会的方法
	public static void printExistingAppointments() {
		if (appointments.isEmpty()) {
			System.out.println("No existing appointments.");
		} else {
			System.out.println("Existing Appointments:");
			for (Appointment appointment : appointments) {
				appointment.printAppointmentDetails();
				System.out.println("------------------------------");
			}
		}
	}

	// 取消约会的方法
	public static void cancelBooking(String mobilePhone) {
		boolean appointmentFound = false;
		for (int i = 0; i < appointments.size(); i++) {
			if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
				appointments.remove(i);
				appointmentFound = true;
				System.out.println("Appointment for mobile phone " + mobilePhone + " has been cancelled.");
				break;
			}
		}
		if (!appointmentFound) {
			System.out.println("Error: No appointment found for mobile phone " + mobilePhone);
		}
	}
}