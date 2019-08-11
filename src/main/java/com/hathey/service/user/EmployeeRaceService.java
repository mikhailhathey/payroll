package com.hathey.service.user;

import com.hathey.domain.user.EmployeeRace;
import com.hathey.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
