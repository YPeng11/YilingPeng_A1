package com.appointmentsystem;

import java.util.List;

//继承基类extends
public class GeneralPractitioner extends HealthProfessional {
	private List<String> availableSlots;; // 声明 新 字段，可预约的时间段
	private String doctorType; // 医生类型

	// 构造函数
	public GeneralPractitioner(int HealthProfessional_ID, String HealthProfessional_name, double price,
			String specialization,
			String place, List<String> availableSlots, String doctorType) {
		super(HealthProfessional_ID, HealthProfessional_name, price, specialization, place); // 调用基类构造函数
		this.availableSlots = availableSlots;
		this.doctorType = doctorType;
	}

	// getter和setter方法
	public List<String> getAvailableSlots() {
		return availableSlots;
	}

	public void setAvailableSlots(List<String> availableSlots) {
		this.availableSlots = availableSlots;
	}

	public String getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}

	// 方法重写
	@Override
	public void printDetails() {
		// 输出内容修改
		super.printDetails();
		System.out.println("Price: " + availableSlots);
		System.out.println("Place: " + doctorType);
	}
}
