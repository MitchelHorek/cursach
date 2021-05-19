package com.example.demo.service;

import com.example.demo.model.Building;

import java.util.List;

public interface IBuildingService {
    Iterable<Building> findAll();
    void save(Building building);
    void buildingDelete(Building building);
    List<Building> filterCreationDate(String creationDate);
    List<Building> filterType(String type);
}
