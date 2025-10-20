package lesson7_oop;
import java.util.Scanner;

public class Therapist extends Doctor {
    Scanner in = new Scanner(System.in);
    @Override
    public void heal() {
        super.heal();
        System.out.println("Терапевт провел лечение медикаментами");
    }

    public void setDoctorAndHeal(Patient patient, Surgeon surgeon, Dentist dentist) {
        while(true) {
            System.out.println("Что вас беспокоит?\n1) Меня нужно прооперировать\n2) Мне болит зуб\n3) Нужно лечение терапевта\n0) Я здоров");
            if(!in.hasNextInt()) {
                in.next();
                System.out.println("Неверный выбор");
                continue;
            }
            patient.setTreatmentPlan(in.nextInt());
            switch (patient.getTreatmentPlan()) {
                case 1:
                    patient.setAppointedDoctor(surgeon);
                    patient.getAppointedDoctor().heal();
                    break;
                case 2:
                    patient.setAppointedDoctor(dentist);
                    patient.getAppointedDoctor().heal();
                    break;
                case 3:
                    patient.setAppointedDoctor(this);
                    patient.getAppointedDoctor().heal();
                    break;
                case 0:
                    System.out.println("Досвидания, "+patient.getName()+". Крепкого вам здоровья!");
                    return;
                default:
                    break;
            }
        }


    }

    Therapist (String n, String s, int bY) {
        super(n, s, bY);
    }


}
