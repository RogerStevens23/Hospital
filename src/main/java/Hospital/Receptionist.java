package Hospital;

public class Receptionist extends Administrator
{
    // Fields
    private boolean isOnPhone;

    // Getters
    public boolean isOnPhone() {return isOnPhone;}

    // Constructor
    public Receptionist(String employeeNumber, String name, String department, boolean isOnPhone)
    {
        super(employeeNumber, name, department);
        this.isOnPhone = isOnPhone;
    }

    // Methods
    @Override
    public int calculatePay()
    {
        return 50000;
    }
}