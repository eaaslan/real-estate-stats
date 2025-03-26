package com.eaaslan.realestate.repository;

import com.eaaslan.realestate.model.Residence;

import java.util.List;

public interface BaseRepository <T extends Residence>{

    List<T>findAll();

}
