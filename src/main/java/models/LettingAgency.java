package models;

import models.Building;

import java.util.ArrayList;

public class LettingAgency {

    private ArrayList<Building> buildings;  // letting agency has an array list of buildings to be rented as office space

    public LettingAgency(){
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }

    public int countBuildings(){
        return this.buildings.size();
    }


    public void rentBuilding(Office office, Building building){
        office.canRent(building);
    }

        // picks a building and rents it to office


}
