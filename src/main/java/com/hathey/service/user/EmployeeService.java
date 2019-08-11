package com.hathey.service.user;

import com.hathey.domain.user.Employee;
import com.hathey.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
