package com.eaaslan.realestate.repository;

import com.eaaslan.realestate.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class VillaRepository implements BaseRepository<Villa> {

    private final List<Villa> villas =new ArrayList<Villa>();

    public VillaRepository() {
        villas.add(new Villa( 280000, 300, 2, 1));
        villas.add(new Villa( 305000, 430, 3, 2));
        villas.add(new Villa( 402000, 540, 4, 3));
    }

    @Override
    public List<Villa> findAll() {
        return villas;
    }

}
