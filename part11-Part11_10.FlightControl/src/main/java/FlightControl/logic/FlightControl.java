/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author Hamzah Raihan
 */
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private Map<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String airplaneID, int capacity) {
        this.airplanes.put(airplaneID, new Airplane(airplaneID, capacity));
    }

    public void addFligth(Airplane airplane, String destinationAirport, String departureAirport) {
        this.places.putIfAbsent(destinationAirport, new Place(destinationAirport));
        this.places.putIfAbsent(departureAirport, new Place(departureAirport));

        Flight flight = new Flight(airplane, this.places.get(destinationAirport), this.places.get(departureAirport));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplane() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Collection<Place> getPlaces() {
        return this.places.values();
    }
}
