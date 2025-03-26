package com.eaaslan.realestate.factory;

import com.eaaslan.realestate.model.Residence;
import com.eaaslan.realestate.repository.BaseRepository;
import com.eaaslan.realestate.service.HolidayHomeService;
import com.eaaslan.realestate.service.HouseService;
import com.eaaslan.realestate.service.ResidentService;
import com.eaaslan.realestate.service.VillaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceFactory {

    private static HouseService houseService;
    private static VillaService villaService;
    private static HolidayHomeService holidayHomeService;
    private static ResidentService residentService;

    public static HouseService getHouseService() {
        if (houseService == null) {
            houseService = new HouseService(RepositoryFactory.getHouseRepository());
        }
        return houseService;
    }

    public static VillaService getVillaService() {
        if (villaService == null) {
            villaService = new VillaService(RepositoryFactory.getVillaRepository());
        }
        return villaService;
    }

    public static HolidayHomeService getHolidayHomeService() {
        if (holidayHomeService == null) {
            holidayHomeService = new HolidayHomeService(RepositoryFactory.getHolidayHomeRepository());
        }
        return holidayHomeService;
    }

    public static ResidentService getResidentService() {
        if (residentService == null) {
         List<BaseRepository<? extends Residence>> repositories= Arrays.asList(
            RepositoryFactory.getHouseRepository(),
            RepositoryFactory.getVillaRepository(),
            RepositoryFactory.getHolidayHomeRepository()
         );
            residentService = new ResidentService(repositories);
        }
        return residentService;
    }
}
