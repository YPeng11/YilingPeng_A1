package com.appointmentsystem;

public class Appointment {
    private String patientName; // 患者姓名
    private String mobilePhone; // 患者手机号
    private String preferredTimeSlot; // 首选时间段
    private HealthProfessional doctor; // 所选医生（全科医生或其他健康专业人员）

    // 默认构造函数
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "Unknown";
        this.preferredTimeSlot = "Not Specified";
        this.doctor = null; // 默认没有选择医生
    }

    // 第二个构造函数，用于初始化所有实例变量
    public Appointment(String patientName, String mobilePhone, String preferredTimeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.doctor = doctor;
    }

    // 打印所有实例变量的方法
    public void printAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        if (doctor != null) {
            System.out.println("Doctor Details: ");
            doctor.printDetails(); // 调用医生的 `printDetails` 方法打印医生详细信息
        } else {
            System.out.println("No doctor assigned.");
        }
    }

    // Getter 和 Setter 方法
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}
