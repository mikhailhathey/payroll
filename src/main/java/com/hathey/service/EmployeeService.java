package com.hathey.service;

import com.hathey.domain.user.Employee;

public interface EmployeeService extends IService<Employee, String> {


    void getAll();
}
