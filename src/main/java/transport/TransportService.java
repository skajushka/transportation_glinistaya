package transport;

import transport.automotive.*;
import transport.marine.*;
import transport.railway.*;

import java.util.*;
import java.util.stream.Collectors;

public class TransportService {

    public List<Vehicle> initVehicles() {
        return Arrays.asList(
                Bus.class,
                Car.class,
                Lorry.class,
                CommuterTrain.class,
                PassengerTrain.class,
                CargoTrain.class,
                Barge.class,
                Boat.class,
                Ferry.class,
                Launch.class,
                Steamboat.class,
                Tanker.class,
                Yacht.class
        ).stream()
                .map(VehicleFactory::createVehicleOfClass)
                .collect(Collectors.toList());
    }

    public double calculateJourneyTime(double distance, Vehicle vehicle) {
        return distance / vehicle.getMaxSpeed();
    }

    public boolean isLoadAmountAllowed(LoadType loadType, Vehicle vehicle, double loadAmount) {

        if(loadType == LoadType.PASSENGER) {
            return vehicle.getMaxRidership() >= loadAmount;
        } else {
            return vehicle.getMaxTonnage() >= loadAmount;
        }
    }

    public boolean isRouteValid(Vehicle vehicle, DestinationType destination) {
        return vehicle.getDestination().contains(destination);
    }

    public List<Vehicle> selectVehiclesOfGivenDestinationType( List<Vehicle> vehicles, DestinationType destination) {
        return vehicles.stream()
                .filter(vehicle -> isRouteValid(vehicle, destination))
                .collect(Collectors.toList());
    }
}
