package ac.za.cput.repository.user.impl;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.repository.user.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {

    private EmployeeRepository repository;
    private Employee employee;

    private Employee getSavedEmployee(){
        Set<Employee> savedEmployees = this.repository.getAll();
        return savedEmployees.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.buildEmployee("Mikhail", "Hathey");
    }


    @Test
    public void create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void update() {
        String newname = "New Test Employee Name created";
        Employee employee = new Employee.Builder().copy(getSavedEmployee()).employeeFirstName(newname).build();
        System.out.println("In update, about to be updated = " + employee);
        Employee updated = this.repository.update(employee);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getEmployeeFirstName());
        getAll();
    }

    @Test
    public void delete() {
        Employee savedEmployee = getSavedEmployee();
        this.repository.delete(savedEmployee.getEmployeeNumber());
        getAll();
    }

    @Test
    public void read() {
        Employee savedEmployee = getSavedEmployee();
        System.out.println("In read, employee id = " + savedEmployee.getEmployeeNumber());
        Employee read = this.repository.read(savedEmployee.getEmployeeNumber());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedEmployee, read);
    }

    @Test
    public void getAll() {
        Set<Employee> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
        //Assert.assertSame(1, all.size());
    }
}