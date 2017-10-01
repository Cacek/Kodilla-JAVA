package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Random;

public class FlightSearchRunner {

    public void Findflight(Flight flight)  {
        HashMap<String, Boolean> airportAvailability = new HashMap<>();
        Random randomBool = new Random();

        airportAvailability.put("A Airport", randomBool.nextBoolean());
        airportAvailability.put("B Airport", randomBool.nextBoolean());
        airportAvailability.put("C Airport", randomBool.nextBoolean());
        airportAvailability.put("D Airport", randomBool.nextBoolean());

        try {
            if (airportAvailability.containsKey(flight.getDepartureAirport()) && airportAvailability.containsKey(flight.getArrivalAirport())) {
                System.out.println("Jest polaczenie");
            } else {
                throw new RouteNotFoundException();
            }

        } catch (RouteNotFoundException e) {
            System.out.println("Brak polaczenia");
        }
    }

    public static void main(String[] args) {
        FlightSearchRunner flightSearchRunner = new FlightSearchRunner();

        //flightSearchRunner.Findflight().forEach((key, value) -> System.out.println("Lotnisko: " + key + "::" + value));

        Flight lot = new Flight("A Airport", "B Airport");
        flightSearchRunner.Findflight(lot);

        Flight lot2 = new Flight("C Airport", "E Airport");
        flightSearchRunner.Findflight(lot2);
    }
}



