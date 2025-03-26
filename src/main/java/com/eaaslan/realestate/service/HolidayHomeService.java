package com.eaaslan.realestate.service;

import com.eaaslan.realestate.model.HolidayHome;
import com.eaaslan.realestate.repository.HolidayHomeRepository;

public class HolidayHomeService extends BaseService<HolidayHome> {
    public HolidayHomeService(HolidayHomeRepository repository) {
        super(repository);
    }
}
