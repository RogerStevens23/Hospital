package Hospital;

public class Surgeon extends Doctor
{
    // Fields
    private boolean isOperating;

    // Getters
    public boolean isOperating() {return isOperating;}

    // Constructor
    public Surgeon(String employeeNumber, String name, String speciality, boolean isOperating)
    {
        super(employeeNumber, name, speciality);
        this.isOperating = isOperating;
    }

    // Methods
    @Override
    public int calculatePay()
    {
        return 100000;
    }
}