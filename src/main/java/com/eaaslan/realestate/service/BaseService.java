package com.eaaslan.realestate.service;

import com.eaaslan.realestate.model.Residence;
import com.eaaslan.realestate.repository.BaseRepository;

import java.util.List;

public abstract class BaseService <T extends Residence >{

    private final BaseRepository<T> repository;

    protected BaseService(BaseRepository<T> repository) {
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public double calculateTotalPrice(){
        return repository.findAll()
                .stream()
                .map(Residence::getPrice)
                .reduce(0.0, Double::sum);
    }

    public double calculateAverageSquareMeter(){
        double average= repository.findAll()
                .stream()
                .mapToDouble(Residence::getSquareMeter)
                .average()
                .orElse(0);

        return Math.round(average * 100.0) / 100.0;
    }

    public List<T> filterByRoomCount(int roomCount) {
        return repository.findAll()
                .stream()
                .filter(residence -> residence.getRoomCount() == roomCount)
                .toList();
    }

    public List<T> filterBySalonCount(int salonCount) {
        return repository.findAll()
                .stream()
                .filter(residence -> residence.getSalonCount() == salonCount)
                .toList();
    }


}
