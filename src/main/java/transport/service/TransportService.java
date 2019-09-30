package transport.service;

import transport.Load;
import transport.vehicle.DestinationType;
import transport.vehicle.Vehicle;

import java.util.List;

public interface TransportService {

    double calculateJourneyTime(double distance, Vehicle vehicle);

    boolean isLoadAllowed(Vehicle vehicle, Load load);

    boolean isRouteValid(Vehicle vehicle, DestinationType destination);

    List<Vehicle> selectVehiclesOfGivenDestinationType(List<Vehicle> vehicles, DestinationType destination);
}
