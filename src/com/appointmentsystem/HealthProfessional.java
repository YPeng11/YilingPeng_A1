package com.appointmentsystem;

//文件名: HealthProfessional.java
public class HealthProfessional {
 private int HealthProfessional_ID;
 private String HealthProfessional_name;
 private String specialization;

 // 默认构造函数
 public HealthProfessional() {}

 // 带参数的构造函数
 public HealthProfessional(int HealthProfessional_ID, String HealthProfessional_name, String specialization) {
     this.HealthProfessional_name = HealthProfessional_name;
     this.HealthProfessional_ID = HealthProfessional_ID;
     this.specialization = specialization;
 }

 // 打印详细信息的方法
 public void printDetails() {
     System.out.println("ID: " + HealthProfessional_ID);
     System.out.println("Name: " + HealthProfessional_name);
     System.out.println("Specialization: " + specialization);
 }
}
