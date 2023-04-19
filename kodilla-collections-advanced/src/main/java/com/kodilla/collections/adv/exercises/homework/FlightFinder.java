package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {


    List<Flight> flightFinder = FlightRepository.getFlightsTable();


    public  List<Flight> findFlightsFrom(String departure){
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight searchedFlight : flightFinder){
            if(searchedFlight.getDeparture().equals(departure)){
                flightsFrom.add(searchedFlight);

            }
        }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival){
        List<Flight> flightsTo = new ArrayList<>();
        for (Flight searchedFlight : flightFinder){
            if(searchedFlight.getArrival().equals(arrival))
            {
                flightsTo.add(searchedFlight);
            }
        }
        return flightsTo;

    }




}
