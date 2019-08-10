package com.hathey.service.user;

import com.hathey.domain.user.Employee;
import com.hathey.service.IService;

public interface EmployeeService extends IService<Employee, String> {


    void getAll();
}
