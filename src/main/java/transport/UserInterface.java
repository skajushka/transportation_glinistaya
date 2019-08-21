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
        List<Vehicle> vehiclesOfRequestedType = filterBySelectedVehicleType(vehiclesForGivenDestination);
        List<Vehicle> vehiclesForRequestedLoad = filterByLoadAmount(vehiclesOfRequestedType);
        double distance = inputReader.getDistance();
        System.out.println("The vehicle(s) you can use and the approximate time in which it can manage your request:");
        vehiclesForRequestedLoad.stream()
                .forEach(vehicle -> System.out.println(vehicle.getVehicleName() + " - " +
                        transportService.calculateJourneyTime(distance, vehicle.getMaxSpeed()) + "h"));
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
                System.out.println("There is no such option!");
                throw new IllegalArgumentException("There is no such option!");
        }
    }

    public List<Vehicle> filterBySelectedVehicleType(List<Vehicle> vehicles) {
        int selectedVehicleType = inputReader.selectLoadType();

        switch(selectedVehicleType) {
            case LOAD_TYPE_CARGO:
                return transportService.selectVehiclesOfGivenLoadType(vehicles, LoadType.CARGO);
            case LOAD_TYPE_PASSENGERS:
                return transportService.selectVehiclesOfGivenLoadType(vehicles, LoadType.PASSENGER);
            default:
                System.out.println("There is no such option!");
                throw new IllegalArgumentException("There is no such option!");
        }
    }

    public List<Vehicle> filterByLoadAmount(List<Vehicle> vehicles) {
        double loadAmount = inputReader.getLoadAmount();
        List<Vehicle> vehiclesFitLoadGiven = new ArrayList<>();

        for(int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if(transportService.checkIfLoadAmountAllowed(vehicle, loadAmount)) {
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
