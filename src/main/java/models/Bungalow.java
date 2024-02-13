package models;

import intefaces.IRent;
import models.Building;

import java.time.LocalDate;
public class Bungalow extends Building implements IRent {

    private boolean central_heating;

    public Bungalow(int numberOfRooms, LocalDate dateOfConstruction,boolean central_heating){
        super(numberOfRooms, dateOfConstruction);
        this.central_heating = central_heating;
    }

    public int roomCount(){
        return this.numberOfRooms;
    }

    public String rent(String rentalName){
        return "Building rented successfully!";
    }



}
