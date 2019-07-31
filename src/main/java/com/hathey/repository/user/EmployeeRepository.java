package com.hathey.repository.user;

import com.hathey.domain.user.Employee;
import com.hathey.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}

