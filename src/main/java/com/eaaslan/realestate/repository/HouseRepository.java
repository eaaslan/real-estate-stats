package com.eaaslan.realestate.repository;

import com.eaaslan.realestate.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository  implements BaseRepository<House>{
   private final List<House> houses = new ArrayList<>();
    public HouseRepository() {
        houses.add(new House( 200000, 300, 2, 1));
        houses.add(new House( 300000, 400, 3, 2));
        houses.add(new House( 400000, 500, 4, 3));
    }

    @Override
    public List<House> findAll() {
        return houses;
    }

//    public List<House> getHouses() {
//        return houses;
//    }
//    double getHouseTotalPrice() {
//        return houses
//                .stream()
//                .mapToDouble(House::getPrice)
//                .sum();
//    }
//    double getAverageHouseSquareMeter() {
//        return houses
//                .stream()
//                .mapToDouble(House::getSquareMeter)
//                .average()
//                .orElse(0);
//    }


}
