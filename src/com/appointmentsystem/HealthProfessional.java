package com.appointmentsystem;

//文件名: HealthProfessional.java
public class HealthProfessional {
    protected int HealthProfessional_ID;
    protected String HealthProfessional_name;
    protected double price;
    protected String specialization;
    protected String place;

    // 默认构造函数
    public HealthProfessional() {
    }

    // 带参数的构造函数,初始化所有实例变量
    public HealthProfessional(int HealthProfessional_ID, String HealthProfessional_name, double price,
            String specialization, String place) {
        this.HealthProfessional_name = HealthProfessional_name;
        this.HealthProfessional_ID = HealthProfessional_ID;
        this.price = price;
        this.specialization = specialization;
        this.place = place;
    }

    // 打印详细信息的方法
    public void printDetails() {
        System.out.println("ID: " + HealthProfessional_ID);
        System.out.println("Name: " + HealthProfessional_name);
        System.out.println("Price: " + price);
        System.out.println("Specialization: " + specialization);
        System.out.println("Place: " + place);
    }

    // 添加 getName 方法
    public String getName() {
        return HealthProfessional_name;
    }

}
