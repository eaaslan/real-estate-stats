package com.eaaslan.realestate;

import java.util.Arrays;

class Application {
    public static void main(String[] args) {

        ResidenceRepositoryImp repository = new ResidenceRepositoryImp();

        System.out.println(repository.getResidencesTotalPrice());
        System.out.println(repository.getVillasTotalPrice());
        System.out.println(Arrays.toString(repository.filterBySalonCount()));
    }
}