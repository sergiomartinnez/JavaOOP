package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;

    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email){
        super(name, email);

    }

    //comportamientos


    public void addAvailableAppointment(String date, String time) throws ParseException {
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    public  ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nspeciality='" + speciality + '\'' +
                "\navailable=" + availableAppointments.toString() +
                '.';
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Oncologia");
    }

    @Override
    public AppointmentDoctor get(int j) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }


    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointment(String date, String time) throws ParseException {
            this.date = format.parse(date);
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment:" +
                    "\ndate=" + date +
                    "\ntime='" + time + '\'' +
                    '.';
        }
    }



}
