package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import javax.swing.event.ListDataEvent;
import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
       // given
       FlightFinder flightFinder = new FlightFinder();

        List<Flight> flightsTable = FlightRepository.getFlightsTable(); //

        //kopia danych z FlightRepository

        flightsTable.add(new Flight("Warsaw","London"));
        flightsTable.add(new Flight("Berlin","Warsaw"));
        flightsTable.add(new Flight("Paris","Berlin"));
        flightsTable.add(new Flight("Warsaw","Prague"));

        //when
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw","London"));
        expectedList.add(new Flight("Warsaw","Prague"));
         assertEquals(expectedList,result);

    }

    @Test
    public void  testFindFlightsTo(){

        // given

        FlightFinder flightFinder = new FlightFinder();

        List<Flight> flightsTable = FlightRepository.getFlightsTable();

        flightsTable.add(new Flight("Warsaw","London"));
        flightsTable.add(new Flight("Berlin","Warsaw"));
        flightsTable.add(new Flight("Paris","Berlin"));
        flightsTable.add(new Flight("Warsaw","Prague"));

        //when
        List<Flight> result = flightFinder.findFlightsTo("Warsaw");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin","Warsaw"));
        assertEquals(expectedList,result);

        }

    }




