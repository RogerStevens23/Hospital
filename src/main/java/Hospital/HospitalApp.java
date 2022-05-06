package Hospital;

import java.util.ArrayList;
import java.util.Collection;

public class HospitalApp
{
    public static void main(String[] args)
    {
        Hospital hospital = new Hospital();
        hospital.hire(new Doctor("111", "Phil", "Brain"));
        hospital.hire(new Surgeon("222", "Harry", "Plastic", true));
        hospital.hire(new Nurse("333", "Jackie", 6));
        hospital.hire(new Receptionist("444", "Janine", "Front Desk",true));
        hospital.hire(new Janitor("555", "Rosie", "West Wing", true));

        hospital.admit(new Patient());
        hospital.admit(new Patient(10, 20));
        hospital.admit(new Patient(1,15));

        System.out.println();
        System.out.println(hospital);
        System.out.println();
        System.out.println(hospital.employeePayRates());
        System.out.println();
        System.out.println(hospital.employeesWhoCanDrawBlood());
        System.out.println();
        System.out.println("Some employees can administer patient care:");
        for(HospitalEmployee employee : hospital.getMedicalEmployees())
        {
            if(employee instanceof Doctor || employee instanceof Nurse)
            {
                for(Patient patient : hospital.getAllPatients())
                {
                    System.out.println(employee.getName() + " has increased health of patient.");
                    ((MedicalDuties) employee).careForPatient(patient);
                    System.out.println(employee.getName() + " has taken some blood from the patient.");
                    ((MedicalDuties) employee).drawBlood(patient);
                }
            }
        }
    }
}
