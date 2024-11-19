package com.appointmentsystem;

//继承基类extends
public class Pediatrician extends HealthProfessional {
	private String ageGroup; // 声明 新 字段

	// 构造函数
	public Pediatrician(int HealthProfessional_ID, String HealthProfessional_name, double price, String specialization,
			String place, String ageGroup) {
		super(HealthProfessional_ID, HealthProfessional_name, price, specialization, place); // 调用基类构造函数
		this.ageGroup = ageGroup;
	}

	// 方法重写
	@Override
	public void printDetails() {
		// 输出内容修改
		super.printDetails();
		System.out.println("Age Group: " + ageGroup);
	}
}
