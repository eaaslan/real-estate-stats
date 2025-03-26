package com.eaaslan.realestate.repository;

import com.eaaslan.realestate.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository  implements BaseRepository<House>{
   private final List<House> houses = new ArrayList<>();
    public HouseRepository() {
        houses.add(new House( 220000, 100, 2, 1));
        houses.add(new House( 350000, 200, 3, 2));
        houses.add(new House( 400000, 250, 4, 3));
    }

    @Override
    public List<House> findAll() {
        return houses;
    }
}
