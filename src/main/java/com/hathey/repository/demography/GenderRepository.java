package com.hathey.repository.demography;

import com.hathey.domain.demography.Gender;
import com.hathey.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
