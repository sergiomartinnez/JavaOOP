package UI;

import model.Doctor;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Bienvenido: " + UIMenu.patientlogged.getName());
            System.out.println("1. Boook an appointment");
            System.out.println("2. My appointments");
            System.out.println("3. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response!=0);
    }

    private static void showBookAppointmentMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println(":: Select Date:");

            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailabeAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailabeAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointmens = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointmens.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailabeAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointmens);

                }
                
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");
            for (Map.Entry<Integer, Doctor> doc: doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() + ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. yes \n2. Change");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                UIMenu.patientlogged.addAppointmentDoctors(doctorSelected, doctorSelected.getAvailableAppointments().get(indexDate).getDate(null), doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();
            }

        }while (response!=0);
    }
    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println("::My Appointments");
            if (UIMenu.patientlogged.getAppointmentDoctors().size() == 0){
                System.out.println("No tiene appointments");
                break;
            }
            for (int i = 0; i < UIMenu.patientlogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " + "Date: "+ UIMenu.patientlogged.getAppointmentDoctors().get(i).getDate() +
                        " Time: " + UIMenu.patientlogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.patientlogged.getAppointmentDoctors().get(i).getDoctor());
                
            }

            System.out.println("0. return");
            
        }while (response!=0);
    }

}
