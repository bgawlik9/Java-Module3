package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

   public static List <Flight> getFlightsTable(){

      List<Flight> flightsTable = new ArrayList<>();

       flightsTable.add(new Flight("Warsaw","London"));
       flightsTable.add(new Flight("Berlin","Warsaw"));
       flightsTable.add(new Flight("Paris","Berlin"));
       flightsTable.add(new Flight("Warsaw","Prague"));

       return flightsTable;
   }
}
