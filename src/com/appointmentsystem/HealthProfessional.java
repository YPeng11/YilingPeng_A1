package com.appointmentsystem;

public class HealthProfessional {
	// TODO Auto-generated method stub
		    private int ID;
		    private String name;
		    private String specialization;

		    public HealthProfessional() {}

		    public HealthProfessional(int ID, String name, String specialization) {
		        this.ID = ID;
		        this.name = name;
		        this.specialization = specialization;
		    }

		    public void printDetails() {
		        System.out.println("ID: " + ID);
		        System.out.println("Name: " + name);
		        System.out.println("Specialization: " + specialization);
		    }
		
}
