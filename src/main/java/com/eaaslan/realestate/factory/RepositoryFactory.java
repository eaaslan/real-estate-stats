package com.eaaslan.realestate.factory;

import com.eaaslan.realestate.repository.HolidayHomeRepository;
import com.eaaslan.realestate.repository.HouseRepository;
import com.eaaslan.realestate.repository.VillaRepository;

public class RepositoryFactory {

    private static HouseRepository houseRepository ;
    private static VillaRepository villaRepository ;
    private static HolidayHomeRepository holidayHomeRepository ;


    public static HouseRepository getHouseRepository() {
        if (houseRepository == null) {
            houseRepository = new HouseRepository();
        }
        return houseRepository;
    }
    public static VillaRepository getVillaRepository() {
        if (villaRepository == null) {
            villaRepository = new VillaRepository();
        }
        return villaRepository;
    }
    public static HolidayHomeRepository getHolidayHomeRepository() {
        if (holidayHomeRepository == null) {
            holidayHomeRepository = new HolidayHomeRepository();
        }
        return holidayHomeRepository;
    }
   


}
