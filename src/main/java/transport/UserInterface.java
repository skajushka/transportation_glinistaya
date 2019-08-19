package transport;

import transport.automotive.*;
import transport.marine.*;
import transport.railway.*;

import java.util.*;
import java.util.stream.Collectors;


public class UserInterface {

    private TransportService transportService = new TransportService();
    private InputReader inputReader = new InputReader();

    private static final int DESTINATION_TYPE_ISLAND = 1;
    private static final int DESTINATION_TYPE_RAILWAY_STATION = 2;
    private static final int DESTINATION_TYPE_OTHER = 3;
    private static final int LOAD_TYPE_CARGO = 1;
    private static final int LOAD_TYPE_PASSENGERS = 2;

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
                .map(VehicleFactory::initVehicle)
                .collect(Collectors.toList());
    }

    public void start() {
        List<Vehicle> vehicles = initVehicles();
        List<Vehicle> vehiclesForGivenDestination = filterBySelectedDestinationType(vehicles);
        List<Vehicle> vehiclesOfRequestedType = filterBySelectedVehicleType(vehiclesForGivenDestination);
        List<Vehicle> vehiclesForRequestedLoad = filterByLoadAmount(vehiclesOfRequestedType);
        double distance = inputReader.getDistance();
        System.out.println("The vehicle(s) you can use and the approximate time in which it can manage your request:");
        vehiclesForRequestedLoad.stream()
                .forEach(vehicle -> System.out.println(vehicle.getVehicleName() + " - " +
                        vehicle.calculateJourneyTime(distance, vehicle.getMaxSpeed()) + "h"));
    }

    public List<Vehicle> filterBySelectedDestinationType(List<Vehicle> vehicles) {
        int selectedDestinationType = inputReader.selectDestinationType();

        switch(selectedDestinationType) {
            case DESTINATION_TYPE_ISLAND:
                return transportService.selectVehiclesOfGivenDestinationType(vehicles, DestinationType.ISLAND);
            case DESTINATION_TYPE_RAILWAY_STATION:
                return transportService.selectVehiclesOfGivenDestinationType(vehicles, DestinationType.RAILWAYSTATION);
            case DESTINATION_TYPE_OTHER:
                return transportService.selectVehiclesOfGivenDestinationType(vehicles, DestinationType.OTHER);
            default:
                throw new IllegalArgumentException("There is no such option!");
        }
    }

    public List<Vehicle> filterBySelectedVehicleType(List<Vehicle> vehicles) {
        int selectedVehicleType = inputReader.selectVehicleType();

        switch(selectedVehicleType) {
            case LOAD_TYPE_CARGO:
                return transportService.selectVehiclesOfGivenLoadType(vehicles, VehicleType.CARGO);
            case LOAD_TYPE_PASSENGERS:
                return transportService.selectVehiclesOfGivenLoadType(vehicles, VehicleType.PASSENGER);
            default:
                throw new IllegalArgumentException("There is no such option!");
        }
    }

    public List<Vehicle> filterByLoadAmount(List<Vehicle> vehicles) {
        double loadAmount = inputReader.getLoadAmount();
        List<Vehicle> vehiclesFitLoadGiven = new ArrayList<>();

        for(int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if(vehicle.checkIfLoadAmountAllowed(loadAmount)) {
                vehiclesFitLoadGiven.add(vehicle);
            }
        }

        if(vehiclesFitLoadGiven.isEmpty()) {
            System.out.println("There is no such vehicle to handle requested load!");
            throw new IllegalArgumentException("There is no such vehicle to handle requested load!");
        }

        return vehiclesFitLoadGiven;
    }
}
