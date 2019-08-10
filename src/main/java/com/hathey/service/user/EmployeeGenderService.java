package com.hathey.service.user;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
