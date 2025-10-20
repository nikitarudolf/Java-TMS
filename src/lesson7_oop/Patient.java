package lesson7_oop;

public class Patient extends Person {
    private int treatmentPlan;
    private Doctor appointedDoctor;


    public Doctor getAppointedDoctor() {
        return appointedDoctor;
    }

    public void setAppointedDoctor(Doctor appointedDoctor) {
        this.appointedDoctor = appointedDoctor;
    }

    public int getTreatmentPlan() {
        return this.treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Patient(String n, String s, int bY, int plan) {
        super(n, s, bY);
        this.treatmentPlan = plan;
    }
}
