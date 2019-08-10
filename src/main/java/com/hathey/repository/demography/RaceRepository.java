package com.hathey.repository.demography;

import com.hathey.domain.demography.Race;
import com.hathey.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}
