package transport.service;

import transport.Load;
import transport.vehicle.DestinationType;
import transport.vehicle.Vehicle;
import transport.factory.VehicleFactory;
import transport.vehicle.automotive.*;
import transport.vehicle.marine.*;
import transport.vehicle.railway.*;

import java.util.*;
import java.util.stream.Collectors;

public class TransportServiceImpl implements TransportService {

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

    public boolean isLoadAllowed(Vehicle vehicle, Load load) {
        int res = vehicle.getDefaultLoad().compareTo(load);

        if ((res == 1) || (res == 0)) {
            return true;
        }
        return false;
    }

    public boolean isRouteValid(Vehicle vehicle, DestinationType destination) {
        return vehicle.getDestinations().contains(destination);
    }

    public List<Vehicle> selectVehiclesOfGivenDestinationType( List<Vehicle> vehicles, DestinationType destination) {
        return vehicles.stream()
                .filter(vehicle -> isRouteValid(vehicle, destination))
                .collect(Collectors.toList());
    }
}
