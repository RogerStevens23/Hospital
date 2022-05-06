package Hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties
{
    // Fields
    private String speciality;

    // Getters
    public String getSpeciality() {return speciality;}

    // Constructor
    public Doctor(String employeeNumber, String name, String speciality)
    {
        super(employeeNumber, name);
        this.speciality = speciality;
    }

    // Methods
    @Override
    public void careForPatient(Patient sickPatient)
    {
        sickPatient.increaseHealthLevel(10);
    }
    @Override
    public void drawBlood(Patient sickPatient)
    {
        sickPatient.decreaseBloodLevel(5);
    }
    @Override
    public int calculatePay()
    {
        return 90000;
    }
}