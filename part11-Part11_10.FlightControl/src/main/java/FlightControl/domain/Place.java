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
public class Place {

    private String placeID;

    public Place(String placeID) {
        this.placeID = placeID;
    }

    public String getPlaceID() {
        return this.placeID;
    }

    @Override
    public String toString() {
        return this.placeID;
    }
}
