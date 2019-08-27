package transport;

import java.util.*;

public class UserInterface {

    private TransportService transportService = new TransportService();
    private InputReader inputReader = new InputReader();

    private static final int DESTINATION_TYPE_ISLAND = 1;
    private static final int DESTINATION_TYPE_RAILWAY_STATION = 2;
    private static final int DESTINATION_TYPE_OTHER = 3;
    private static final int LOAD_TYPE_CARGO = 1;
    private static final int LOAD_TYPE_PASSENGERS = 2;

    public void start() {
        List<Vehicle> vehicles = transportService.initVehicles();
        List<Vehicle> vehiclesForGivenDestination = filterBySelectedDestinationType(vehicles);
        List<Vehicle> vehiclesForRequestedLoad = filterByLoad(vehiclesForGivenDestination);
        double distance = inputReader.getDistance();
        System.out.println("The vehicle(s) you can use and the approximate time in which it can manage your request:");
        vehiclesForRequestedLoad.stream()
                .forEach(vehicle -> System.out.println(vehicle.getVehicleName() + " - " +
                        transportService.calculateJourneyTime(distance, vehicle) + "h"));
    }

    public List<Vehicle> filterBySelectedDestinationType(List<Vehicle> vehicles) {
        int selectedDestinationType = inputReader.selectDestinationType();
        DestinationType destinationType;

        switch(selectedDestinationType) {
            case DESTINATION_TYPE_ISLAND:
                destinationType = DestinationType.ISLAND;
                break;
            case DESTINATION_TYPE_RAILWAY_STATION:
                destinationType = DestinationType.RAILWAYSTATION;
                break;
            case DESTINATION_TYPE_OTHER:
                destinationType = DestinationType.OTHER;
                break;
            default:
                System.out.println("There is no such option!");
                throw new IllegalArgumentException("There is no such option!");
        }

        return transportService.selectVehiclesOfGivenDestinationType(vehicles, destinationType);
    }

    public int getSelectedLoadType() {
        int selectedVehicleType = inputReader.selectLoadType();

        if(selectedVehicleType == LOAD_TYPE_CARGO || selectedVehicleType == LOAD_TYPE_PASSENGERS) {
            return selectedVehicleType;
        } else {
            System.out.println("There is no such option!");
            throw new IllegalArgumentException("There is no such option!");
        }
    }

    public List<Vehicle> filterByLoad(List<Vehicle> vehicles) {
        int selectedLoadType = getSelectedLoadType();
        double loadAmount = inputReader.getLoadAmount();
        List<Vehicle> vehiclesFitLoadGiven = new ArrayList<>();
        LoadType loadType;

        switch(selectedLoadType) {
            case LOAD_TYPE_CARGO:
                loadType = LoadType.CARGO;
                break;
            case LOAD_TYPE_PASSENGERS:
                loadType = LoadType.PASSENGER;
                break;
            default:
                System.out.println("There is no such option!");
                throw new IllegalArgumentException("There is no such option!");
        }

        for (Vehicle vehicle : vehicles) {
            if (transportService.isLoadAmountAllowed(loadType, vehicle, loadAmount)) {
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
