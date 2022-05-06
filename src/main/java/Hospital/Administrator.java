package Hospital;

public abstract class Administrator extends HospitalEmployee
{
    // Fields
    private String department;

    // Getters
    public String getDepartment() {return department;}

    // Constructor
    public Administrator(String employeeNumber, String name, String department)
    {
        super(employeeNumber, name);
        this.department = department;
    }

    // Methods
    public abstract int calculatePay();
}