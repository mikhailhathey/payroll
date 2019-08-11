package com.hathey.repository.user;

import com.hathey.domain.user.EmployeeRace;
import com.hathey.repository.IRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
