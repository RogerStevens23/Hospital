package Hospital;

import java.util.ArrayList;
import java.util.Collection;

public class HospitalApp
{
    public static void main(String[] args)
    {
        Hospital hospital = new Hospital();
        hospital.hire(new Doctor("1", "Phil", "Brain"));
        hospital.hire(new Surgeon("10", "Rosie", "Plastic", true));
        hospital.hire(new Nurse("3", "Jackie", 6));
        hospital.hire(new Receptionist("4", "Janine", "Front Desk",true));
        hospital.hire(new Janitor("5", "Rosie", "West Wing", true));

        hospital.admit(new Patient());
        hospital.admit(new Patient(10, 20));
        hospital.admit(new Patient(1,15));

        System.out.println();
        hospital.showAllEmployees();
        System.out.println();
        System.out.println(hospital);
        System.out.println();
        System.out.println(hospital.employeePayRates());
        System.out.println();
        System.out.println(hospital.employeesWhoCanDrawBlood());
        System.out.println();
    }
}