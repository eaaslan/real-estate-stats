package com.eaaslan.realestate.service;

import com.eaaslan.realestate.model.House;
import com.eaaslan.realestate.repository.HouseRepository;

public class HouseService extends BaseService<House> {
    public HouseService(HouseRepository repository) {
        super(repository);
    }
}
