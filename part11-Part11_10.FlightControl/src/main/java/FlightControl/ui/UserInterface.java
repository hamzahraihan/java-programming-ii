/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author Hamzah Raihan
 */
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import java.util.Scanner;
import java.util.Collection;

public class UserInterface {

    private FlightControl flightControl;
    private Scanner scanner;

    public UserInterface(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        startAirportAssetControl();
        System.out.println("==");
        startFlightControl();
    }

    private void startAirportAssetControl() {
        while (true) {
            System.out.println("Airport Asset Control:\n"
                    + "[1] Add an airplane\n"
                    + "[2] Add a flight\n"
                    + "[x] Exit Airport Asset Control");
            System.out.println(">");
//            System.out.println("Choose an action:");
//            System.out.println("[1] Add an airplane");
//            System.out.println("[2] Add a flight");
//            System.out.println("[x] Exit Airport Asset Control");
            String input = this.scanner.nextLine();
            if (input.toLowerCase().trim().contains("x")) {
                break;
            }
            if (input.contains("1")) {
                addAirplane();
            }
            if (input.contains("2")) {
                addFlight();
            }
        }
    }

    private void startFlightControl() {
        while (true) {
            System.out.println("Flight Control:\n"
                    + "[1] Print airplanes\n"
                    + "[2] Print flights\n"
                    + "[3] Print airplane details\n"
                    + "[x] Quit");
            System.out.println(">");
//            System.out.println("Choose an action:");
//            System.out.println("[1] Print airplanes");
//            System.out.println("[2] Print flights");
//            System.out.println("[3] Print airplane details");
//            System.out.println("[x] Quit");
            String input = this.scanner.nextLine();
            if (input.toLowerCase().trim().contains("x")) {
                break;
            }
            if (input.contains("1")) {
                printAirplanes();
            }
            if (input.contains("2")) {
                printFlights();
            }
            if (input.contains("3")) {
                System.out.println("Give the airplane id:");
                System.out.println(findAirplane());
            }
        }

    }

    private void addAirplane() {
        System.out.println("Give the airplane id:");
        String airplaneID = this.scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = this.scanner.nextInt();
        this.flightControl.addAirplane(airplaneID, capacity);
    }

    private void addFlight() {
        System.out.println("Give the airplane id:");
        Airplane airplane = findAirplane();
        System.out.println("Give the departure airport id:");
        String departureAirport = this.scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String targetAirport = this.scanner.nextLine();

        this.flightControl.addFligth(airplane, departureAirport, targetAirport);
    }

    private Airplane findAirplane() {
        String airplaneID = this.scanner.nextLine();
        Collection<Airplane> airplanes = this.flightControl.getAirplane();
        for (Airplane airplane : airplanes) {
            if (airplane.getAirplaneID().contains(airplaneID)) {
                return airplane;
            } else {
                System.out.println("No airplane with the id " + airplaneID + ".");
            }
        }
        return null;
    }

    private void printFlights() {
        Collection<Flight> flights = this.flightControl.getFlights();
        flights.stream().forEach(value -> System.out.println(value));
    }

    private void printAirplanes() {
        Collection<Airplane> airplanes = this.flightControl.getAirplane();
        airplanes.stream().forEach(value -> System.out.println(value));
    }
}
