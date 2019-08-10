package com.hathey.service.user;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.service.IService;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    void getAll();
}
