package UI;

import model.Doctor;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailabeAppointments = new ArrayList<>();

    public static void showDoctorMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorlogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. my scheduled appointments");
            System.out.println("0. log out");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println();
            System.out.println("Add available appointment");
            System.out.println("::Selkect a month");

            for (int i = 0; i < 3; i++) {
                int j = i +1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response <4){
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected-1]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: " + date + " [16:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while (responseTime == 2);

                UIMenu.doctorlogged.addAvailableAppointment(date,time);
                checkDoctorAvailabeAppointments(UIMenu.doctorlogged);


            }else if (response == 0){
                showDoctorMenu();
            }

        }while (response != 0);
    }

    private static void checkDoctorAvailabeAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailabeAppointments.contains(doctor)){
            doctorsAvailabeAppointments.add(doctor);
        }
    }
}
