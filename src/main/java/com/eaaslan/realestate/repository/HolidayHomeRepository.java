package com.eaaslan.realestate.repository;

import com.eaaslan.realestate.model.HolidayHome;

import java.util.ArrayList;
import java.util.List;

public class HolidayHomeRepository implements BaseRepository<HolidayHome> {

    private final List<HolidayHome> holidayHomes=new ArrayList<>();
    public HolidayHomeRepository() {
        holidayHomes.add(new HolidayHome(230000, 300, 2, 1));
        holidayHomes.add(new HolidayHome(360000, 420, 3, 2));
        holidayHomes.add(new HolidayHome(480000, 570, 4, 3));
    }

    @Override
    public List<HolidayHome> findAll() {
        return holidayHomes;
    }
}
