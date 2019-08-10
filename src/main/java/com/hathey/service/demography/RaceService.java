package com.hathey.service.demography;

import com.hathey.domain.demography.Race;
import com.hathey.service.IService;

public interface RaceService extends IService<Race, String> {
        void getAll();
}
