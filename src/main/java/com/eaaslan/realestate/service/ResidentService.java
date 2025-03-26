package com.eaaslan.realestate.service;

import com.eaaslan.realestate.model.Residence;
import com.eaaslan.realestate.repository.BaseRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ResidentService {

    private final List<BaseRepository<? extends Residence>> repositories;

    public ResidentService(List<BaseRepository<? extends Residence>> repositories) {
        this.repositories = repositories;
    }
    
    public double calculateTotalPrice() {
        return repositories.stream()
                .flatMap(repo -> repo.findAll().stream())
                .map(Residence::getPrice)
                .reduce(0.0, Double::sum);
    }

    public double calculateAverageSquareMeter() {
        double average = repositories.stream()
                .flatMap(repo -> repo.findAll().stream())
                .mapToDouble(Residence::getSquareMeter)
                .average()
                .orElse(0);
        return Math.round(average * 100.0) / 100.0;
    }

    public List<Residence> filterByRoomCount(int roomCount) {
        return repositories.stream()
                .flatMap(repo -> repo.findAll().stream())
                .filter(residence -> residence.getRoomCount() == roomCount)
                .map(residence -> (Residence) residence)
                .collect(Collectors.toList());
    }

    public List<Residence> filterBySalonCount(int salonCount) {
        return repositories.stream()
                .flatMap(repo -> repo.findAll().stream())
                .filter(residence -> residence.getSalonCount() == salonCount)
                .map(residence -> (Residence) residence)
                .collect(Collectors.toList());
    }
    
    public List<Residence> findAll() {
        return repositories.stream()
                .flatMap(repo -> repo.findAll().stream())
                .map(residence -> (Residence) residence)
                .collect(Collectors.toList());
    }
}