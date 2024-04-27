package com.neel.hma;

import java.util.HashMap;
import java.util.Map;

public class AppointmentBookingSystem {
	private Map<String, Doctor> doctors = new HashMap<>();

    public void addDoctor(String name, String specialty) {
        doctors.put(name, new Doctor(name, specialty));
    }
    
    public void displayAllDoctors() {
        System.out.println("Available Doctors:");
        for (Doctor doctor : doctors.values()) {
            System.out.println(doctor.getName() + " (" + doctor.getSpecialty() + ")");
        }
    }

    public void bookAppointment(String patientName, String doctorName) {
        if (doctors.containsKey(doctorName)) {
            Doctor doctor = doctors.get(doctorName);
            System.out.println("Appointment booked for patient " + patientName +
                    " with Dr. " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        } else {
            System.out.println("Doctor not found.");
        }
    }
}
