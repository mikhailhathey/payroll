package com.hathey.service.demography;

import com.hathey.domain.demography.Gender;
import com.hathey.service.IService;

public interface GenderService extends IService<Gender, String> {
    void getAll();
}
