package models;

import intefaces.IRent;
import models.Building;

import java.time.LocalDate;

public class Office extends Building implements IRent {

    private String companyName;

    public Office(int numberOfRooms, LocalDate dateOfConstruction,String companyName){
        super(numberOfRooms, dateOfConstruction);
        this.companyName = companyName;
    }

     public String hireEmployee(LocalDate startDate){
        return "Congratulations, you're hired! You start on " + startDate;
    }

     public String hireEmployee(boolean selectedForInterview, LocalDate interviewDate){
        return "Interview status: " + true + ". Your interview date is " + interviewDate;
    }

    public String canRent(Building office){
        return "We need office space!";
    }


    public String rent(String rentalName){
        return "Office vehicle rented";
    }


}
