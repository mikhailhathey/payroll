package com.hathey.service.demography;

import com.hathey.domain.demography.Gender;
import com.hathey.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
