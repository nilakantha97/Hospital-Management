package com.neel.hma;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        AppointmentBookingSystem bookingSystem = new AppointmentBookingSystem();
        bookingSystem.addDoctor("Dr. Smith", "Cardiology");
        bookingSystem.addDoctor("Dr. Johnson", "Dermatology");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        
        bookingSystem.displayAllDoctors();

        System.out.print("Enter doctor name (e.g., Dr. Smith): ");
        String doctorName = scanner.nextLine();

        bookingSystem.bookAppointment(patientName, doctorName);
        scanner.close();
    }
}
