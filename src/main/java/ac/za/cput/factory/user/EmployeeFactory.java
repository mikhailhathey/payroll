package ac.za.cput.factory.user;

import ac.za.cput.domain.demography.Gender;
import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.demography.GenderFactory;
import ac.za.cput.util.Misc;

public class EmployeeFactory {

    public static Employee buildEmployee(String firstName, String lastName){
        return new Employee.Builder()
                .employeeNumber(Misc.generateId())
                .employeeFirstName(firstName)
                .employeeLastName(lastName)
                .build();
    }

}
