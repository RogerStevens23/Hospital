package Hospital;

public class Janitor extends Administrator
{
    // Fields
    private boolean isCleaning;

    // Getters
    public boolean isCleaning() {return isCleaning;}

    // Constructor
    public Janitor(String employeeNumber, String name, String department, boolean isCleaning)
    {
        super(employeeNumber, name, department);
        this.isCleaning = isCleaning;
    }

    // Methods
    @Override
    public int calculatePay()
    {
        return 45000;
    }
}
