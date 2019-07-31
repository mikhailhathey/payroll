package com.hathey.repository.user;

import com.hathey.domain.user.EmployeeGender;
import com.hathey.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}

