package Hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties
{
    // Fields
    private int numOfPatients;

    // Getters
    public int getNumOfPatients() {return numOfPatients;}

    // Constructor
    public Nurse(String employeeNumber, String name, int numOfPatients)
    {
        super(employeeNumber, name);
        this.numOfPatients = numOfPatients;
    }

    // Methods
    @Override
    public void careForPatient(Patient sickPatient)
    {
        sickPatient.increaseHealthLevel(5);
    }
    @Override
    public void drawBlood(Patient sickPatient)
    {
        sickPatient.decreaseBloodLevel(5);
    }
    @Override
    public int calculatePay()
    {
        return 80000;
    }
}