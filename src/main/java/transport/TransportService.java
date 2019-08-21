package transport;

import transport.automotive.*;
import transport.marine.*;
import transport.railway.*;

import java.util.Arrays;
import java.util.List;
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

    public double calculateJourneyTime(double distance, double speed) {
        return distance / speed;
    }

    //todo Для пассажирского транспорта как этот метод узнает, что мне надо везти? Груз или пассажиров?
    public boolean checkIfLoadAmountAllowed(Vehicle vehicle, double loadAmount) {

        if(vehicle.getLoadType() == LoadType.PASSENGER) {
            return vehicle.getMaxRidership() >= loadAmount;
        } else {
            return vehicle.getMaxTonnage() >= loadAmount;
        }
    }

    public boolean checkIfRouteIsValid(Vehicle vehicle, DestinationType destination) {
        if(vehicle instanceof AutoTransport) {
            return destination != DestinationType.ISLAND;
        } else if(vehicle instanceof RailwayTransport) {
            return destination == DestinationType.RAILWAYSTATION;
        } else if(vehicle instanceof SeaTransport) {
            return destination == DestinationType.ISLAND;
        } else {
            throw new IllegalArgumentException("There is no such vehicle to handle requested destination!");
        }
    }

    public List<Vehicle> selectVehiclesOfGivenLoadType(List<Vehicle> vehicles, LoadType loadType) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getLoadType() == loadType)
                .collect(Collectors.toList());
    }

    public List<Vehicle> selectVehiclesOfGivenDestinationType( List<Vehicle> vehicles, DestinationType destination) {
        return vehicles.stream()
                .filter(vehicle -> checkIfRouteIsValid(vehicle, destination))
                .collect(Collectors.toList());
    }
}