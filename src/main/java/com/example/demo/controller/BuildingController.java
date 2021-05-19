package com.example.demo.controller;

import com.example.demo.model.Building;
import com.example.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class BuildingController {
    @Autowired
    private BuildingService buildingService;
    @RequestMapping(method = RequestMethod.GET, value = "/building-all")
    public Iterable<Building> buildingAll() {
        return buildingService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/building-add")
    public @ResponseBody String buildingAdd(Building building)throws ParseException {
        buildingService.save(building);
        return "added";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/building-delete")
    public @ResponseBody String buildingDelete(Building building) {
        buildingService.buildingDelete(building);
        return "deleted";
    }
    /*@GetMapping(value = "/building/{buildingId}/address")
    public @ResponseBody Address showAddress(@PathVariable("buildingId") Long buildingId){
        return buildingService.showAddress(buildingId);
    }*/
    @GetMapping(value = "/building/creation-date")
    public List<Building> filterCreationDate(@RequestParam String creationDate){
        return buildingService.filterCreationDate(creationDate);
    }
    @GetMapping(value = "/building/type")
    public List<Building> filterType(@RequestParam String type){
        return buildingService.filterType(type);
    }
}
