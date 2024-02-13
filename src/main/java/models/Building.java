package models;

import intefaces.IRent;

import java.time.LocalDate;
public abstract class Building implements IRent {

    public int numberOfRooms;
    private LocalDate dateOfConstruction;

    public Building(int numberOfRooms, LocalDate dateOfConstruction){
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
    }

    public int roomCount(){
        return this.numberOfRooms;
    }

    public String canRent(Building office){
        return "We need office space!";
    }

}
