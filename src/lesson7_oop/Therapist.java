package lesson7_oop;

public class Therapist extends Doctor {

    public void heal() {
        super.heal();
        System.out.println("Терапевт провел лечение медикаментами");
    }

    public void setDoctor(Patient patient, Surgeon surgeon, Dentist dentist) {
        switch (patient.getTreatmentPlan()) {
            case 1:
                patient.setAppointedDoctor(surgeon);
                patient.getAppointedDoctor().heal();
                break;
            case 2:
                patient.setAppointedDoctor(dentist);
                patient.getAppointedDoctor().heal();
                break;
            default:
                patient.setAppointedDoctor(this);
                patient.getAppointedDoctor().heal();

        }

    }

    Therapist (String n, String s, int bY) {
        super(n, s, bY);
    }


}
