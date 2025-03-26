package com.eaaslan.realestate;

import com.eaaslan.realestate.factory.ServiceFactory;
import com.eaaslan.realestate.service.HolidayHomeService;
import com.eaaslan.realestate.service.HouseService;
import com.eaaslan.realestate.service.ResidentService;
import com.eaaslan.realestate.service.VillaService;


class Application {
    public static void main(String[] args) {

        // Initialize service instances
        HouseService houseService = ServiceFactory.getHouseService();
        VillaService villaService =  ServiceFactory.getVillaService();
        HolidayHomeService holidayHomeService = ServiceFactory.getHolidayHomeService();
        ResidentService residentService = ServiceFactory.getResidentService();
        System.out.println();
        System.out.println("========== REAL ESTATE SUMMARY ==========");

// Price calculations
        System.out.println("\n----- TOTAL PRICES -----");
        System.out.println("Total price of houses: $" + houseService.calculateTotalPrice());
        System.out.println("Total price of villas: $" + villaService.calculateTotalPrice());
        System.out.println("Total price of holiday homes: $" + holidayHomeService.calculateTotalPrice());
        System.out.println("Total price of all properties: $" + residentService.calculateTotalPrice());

// Square meter calculations
        System.out.println("\n----- AVERAGE SQUARE METERS -----");
        System.out.println("Average square meters of houses: " + houseService.calculateAverageSquareMeter() + " m²");
        System.out.println("Average square meters of villas: " + villaService.calculateAverageSquareMeter() + " m²");
        System.out.println("Average square meters of holiday homes: " + holidayHomeService.calculateAverageSquareMeter() + " m²");
        System.out.println("Average square meters of all properties: " + residentService.calculateAverageSquareMeter() + " m²");

// Property counts
        System.out.println("\n----- PROPERTY COUNTS -----");
        System.out.println("Total number of properties: " + residentService.findAll().size());
        System.out.println("Number of houses: " + houseService.findAll().size());
        System.out.println("Number of villas: " + villaService.findAll().size());
        System.out.println("Number of holiday homes: " + holidayHomeService.findAll().size());

// Filtering examples
        System.out.println("\n----- FILTERED PROPERTIES -----");
        System.out.println("Properties with 3 rooms: " + residentService.filterByRoomCount(3).size());
        System.out.println("Properties with 2 salons: " + residentService.filterBySalonCount(2).size());

        System.out.println("\n========== END OF REPORT ==========");
        System.out.println();


    }
}