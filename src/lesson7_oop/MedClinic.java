package lesson7_oop;

import java.util.Scanner;

public class MedClinic
{
    public void medClinic() {

        Patient patient = new Patient("Egor", "Sokolov", 2001, 1);
        Surgeon surgeon = new Surgeon("Aleksandr", "Kovalev", 1981);
        Dentist dentist = new Dentist("Elena", "Ivanova", 1991);
        Therapist therapist = new Therapist("Irina", "Grigorieva", 1980);

        therapist.setDoctor(patient,surgeon,dentist);






    }
}
