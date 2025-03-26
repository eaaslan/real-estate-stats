package com.eaaslan.realestate.repository;

import com.eaaslan.realestate.model.Residence;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ResidenceRepository {

    private final HolidayHomeRepository holidayHomeRepository;
    private final VillaRepository villaRepository;
    private final HouseRepository houseRepository;

    public ResidenceRepository() {
        this.holidayHomeRepository = new HolidayHomeRepository();
        this.villaRepository = new VillaRepository();
        this.houseRepository = new HouseRepository();
    }
    public List<Residence> findAll() {
        List<Residence> allResidences = new ArrayList<>();
        allResidences.addAll(holidayHomeRepository.findAll());
        allResidences.addAll(villaRepository.findAll());
        allResidences.addAll(houseRepository.findAll());
        return allResidences;
    }



//    void save(Residence residence);
//
//    Residence findById(UUID id);
//
//    double getResidencesTotalPrice();
//
//    double getVillasTotalPrice();
//
//    double getHolidaysHomeTotalPrice();
//
//    double getHouseTotalPrice();
//
//    List<Residence> findAll();
//
//    void deleteById(UUID id);
//
//    List<Residence> findByPriceRange(double minPrice, double maxPrice);
//
//    List<Residence> findBySquareMeterRange(double minSquareMeter, double maxSquareMeter);
//
//    List<Residence> findByRoomCount(int roomCount);
//
//    List<Residence> findBySalonCount(int salonCount);
//
//    double getAverageSquareMeter();
//    double getAverageVillasSquareMeter();
//    double getAverageHouseSquareMeter();
//    double getAverageHolidaysHomeSquareMeter();
//    Residence[] filterBySalonCount();
//    Residence[] filterBySalonsCount();
}
