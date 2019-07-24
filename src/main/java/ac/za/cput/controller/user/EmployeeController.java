package ac.za.cput.controller.user;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.service.EmployeeService;

public class EmployeeController {
    private EmployeeService service;

    public Employee create(Employee employee){
        return service.create(employee);
    }

    public Employee update(Employee employee){
        return service.update(employee);
    }

    public Employee delete(String s){
        return service.delete(s);
    }

    public Employee read(String s){
        return service.read(s);
    }


}
