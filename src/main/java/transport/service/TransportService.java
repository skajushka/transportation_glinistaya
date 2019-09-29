package transport.service;

import transport.vehicle.DestinationType;
import transport.vehicle.Vehicle;

import java.util.List;

public interface TransportService {

    double calculateJourneyTime(double distance, Vehicle vehicle);

    boolean isCargoAmountAllowed(Vehicle vehicle, int cargoAmount);

    boolean isPassengersAmountAllowed(Vehicle vehicle, int passengersAmount);

    boolean isRouteValid(Vehicle vehicle, DestinationType destination);

    List<Vehicle> selectVehiclesOfGivenDestinationType(List<Vehicle> vehicles, DestinationType destination);
}
