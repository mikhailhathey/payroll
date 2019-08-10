package com.hathey.service.demography;

import com.hathey.domain.demography.Race;
import com.hathey.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {
        Set<Race> getAll();
}
