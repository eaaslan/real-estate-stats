package com.eaaslan.realestate.repository;

import com.eaaslan.realestate.model.HolidayHome;

import java.util.ArrayList;
import java.util.List;

public class HolidayHomeRepository implements BaseRepository<HolidayHome> {

    private final List<HolidayHome> holidayHomes=new ArrayList<>();

    HolidayHomeRepository() {
        holidayHomes.add(new HolidayHome(200000, 300, 2, 1));
        holidayHomes.add(new HolidayHome(300000, 400, 3, 2));
        holidayHomes.add(new HolidayHome(400000, 500, 4, 3));
    }

    @Override
    public List<HolidayHome> findAll() {
        return holidayHomes;
    }
}
