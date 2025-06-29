/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author Hamzah Raihan
 */
public class Flight {

    private Airplane airplane;
    private Place destinationAirport;
    private Place departureAirport;

    public Flight(Airplane airplane, Place destinationAirport, Place departureAirport) {
        this.airplane = airplane;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getDestinationAirport() {
        return this.destinationAirport;
    }

    public Place getDepartureAirport() {
        return this.departureAirport;
    }

    @Override
    public String toString() {
        return this.airplane + " " + "(" + this.destinationAirport + "-" + this.departureAirport + ")";
    }
}
