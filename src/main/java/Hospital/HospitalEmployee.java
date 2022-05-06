package Hospital;

public abstract class HospitalEmployee implements Comparable<HospitalEmployee>
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

    @Override
    public int compareTo(HospitalEmployee employee)
    {
        if(this.getName().compareTo(employee.getName()) < 0)
            return -1;
        else if(this.getName().compareTo(employee.getName()) > 0)
            return 1;
        return 0;
    }
}