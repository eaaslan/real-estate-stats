package com.eaaslan.realestate.repository;

import com.eaaslan.realestate.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class VillaRepository implements BaseRepository<Villa> {

    private final List<Villa> villas =new ArrayList<Villa>();

    public VillaRepository() {
        villas.add(new Villa( 200000, 300, 2, 1));
        villas.add(new Villa( 300000, 400, 3, 2));
        villas.add(new Villa( 400000, 500, 4, 3));
    }

    @Override
    public List<Villa> findAll() {
        return villas;
    }

//    public List<Villa> getVillas() {
//        return villas;
//    }
//    double getVillaTotalPrice() {
//        return villas
//                .stream()
//                .mapToDouble(Villa::getPrice)
//                .sum();
//    }
//    double getAverageVillaSquareMeter() {
//        return villas
//                .stream()
//                .mapToDouble(Villa::getSquareMeter)
//                .average()
//                .orElse(0);
//    }
}
