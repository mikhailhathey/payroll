package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.user.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepository repository = null;

    private Set<Employee> employees;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeRepositoryImpl(){
        this.employees = new HashSet<>();
        this.employeeGenders = new HashSet<>();
    }

    public static EmployeeRepository getRepository(){
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee updatedEmployee = null;
        //Employee em = new Employee.Builder().copy(employee).employeeFirstName(); #Due to using SET this is not needed
        Employee e = read(employee.getEmployeeNumber());
        if (e != null){
            delete(employee.getEmployeeNumber());
            this.employees.add(employee);
            updatedEmployee = employee;
        }
        return updatedEmployee;
    }

    @Override
    public Employee delete(String s) {
        Employee e = read(s);
        if (e != null) {
            this.employees.remove(e);
        }
        return e;
    }

    @Override
    public Employee read(final String s) {
        return this.employees.stream().filter(e -> e.getEmployeeNumber().equals(s)).findAny().orElse(null);
    }
}
