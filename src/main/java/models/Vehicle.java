package models;

import intefaces.IRent;

public class Vehicle implements IRent {

    private int wheels;
    private boolean unleadedFuel;
    private String model;
    private double cost;

    public Vehicle(int wheels, boolean unleadedFuel, String model, double cost){
        this.wheels = wheels;
        this.unleadedFuel = unleadedFuel;
        this.model = model;
        this.cost = cost;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getCost(){
        return this.cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public String rent(String rentalName){
        return this.model + " was rented for " + this.cost;
    }


}
