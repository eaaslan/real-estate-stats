package com.eaaslan.realestate.service;

import com.eaaslan.realestate.model.Villa;
import com.eaaslan.realestate.repository.BaseRepository;

public class VillaService extends BaseService<Villa> {
    public VillaService(BaseRepository<Villa> repository) {
        super(repository);
    }
}
