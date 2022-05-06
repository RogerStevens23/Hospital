package Hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Hospital
{
    // Fields
    private HashMap<String, HospitalEmployee> employeeList = new HashMap<>();
    private HashMap<Integer, Patient> patientList = new HashMap<>();
    private int patientId;

    // Getters
    public Collection<HospitalEmployee> getAllEmployees() {return employeeList.values();}
    public Collection<Patient> getAllPatients() {return patientList.values();}
    public Collection<HospitalEmployee> getMedicalEmployees()
    {
        Collection<HospitalEmployee> medicalEmployees = new ArrayList<>();
        for(HospitalEmployee employee : employeeList.values())
        {
            if(employee instanceof MedicalDuties)
                medicalEmployees.add(employee);
        }
        return medicalEmployees;
    }

    // Methods
    public void hire(HospitalEmployee employeeToHire)
    {
        employeeList.put(employeeToHire.getEmployeeNumber(), employeeToHire);
    }
    public HospitalEmployee findEmployee(String employeeNumber)
    {
        return employeeList.get(employeeNumber);
    }
    public void admit(Patient patientToAdmit)
    {
        patientId++;
        patientList.put(patientId, patientToAdmit);
    }

    // String Methods
    public String employeePayRates()
    {
        StringBuilder result = new StringBuilder();
        result.append("Here are the pay rates at High St. Hospital:");
        for(HospitalEmployee employee : employeeList.values())
        {
            result.append("\n").append(employee.getName()).append(" gets paid a salary of ").append(employee.calculatePay()).append(" per year.");
        }
        return result.toString().trim();
    }
    public String employeesWhoCanDrawBlood()
    {
        StringBuilder result = new StringBuilder();
        result.append("Some employees can draw blood:");
        for(HospitalEmployee employee : employeeList.values())
        {
            if(employee instanceof MedicalDuties)
                result.append("\n").append(employee.getName()).append(" is capable of drawing blood");
        }
        return result.toString().trim();
    }
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        result.append("Here are the employees at High St. Hospital:");
        for(HospitalEmployee employee : employeeList.values())
        {
            result.append("\n").append(employee.getName()).append("  ").append(employee.getEmployeeNumber()).append("  ");
            if(employee instanceof Doctor && !(employee instanceof Surgeon))
                result.append(((Doctor) employee).getSpeciality());
            if(employee instanceof Surgeon)
                result.append(((Doctor) employee).getSpeciality()).append("  ").append(((Surgeon) employee).isOperating());
            if(employee instanceof Nurse)
                result.append(((Nurse) employee).getNumOfPatients());
            if(employee instanceof Receptionist)
                result.append(((Receptionist) employee).isOnPhone());
            if(employee instanceof Janitor)
                result.append(((Janitor) employee).isCleaning());
        }
        return result.toString().trim();
    }

    public void showAllEmployees()
    {
        ArrayList<HospitalEmployee> employeesList = new ArrayList<>(employeeList.values());
        Collections.sort(employeesList);

        for(HospitalEmployee employee : employeesList)
            System.out.println(employee.getName() + " " + employee.getEmployeeNumber());
    }
}