package Hospital;

public abstract class HospitalEmployee
{

    // Fields
    private String employeeNumber;
    private String name;

    // Getters
    public String getEmployeeNumber() {return employeeNumber;}
    public String getName() {return name;}

    // Constructor
    public HospitalEmployee(String employeeNumber, String name)
    {
        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    // Abstract Methods
    public abstract int calculatePay();
}