package ac.za.cput.service;

import ac.za.cput.domain.user.Employee;

public interface EmployeeService extends IService<Employee, String> {
    Employee saveEmployee(String firstName, String lastName, String gender);
}
