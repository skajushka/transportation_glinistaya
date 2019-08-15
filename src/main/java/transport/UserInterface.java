package transport;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {

    private TransportService transportService = new TransportService();
    private VehicleFactory vehicleFactory = new VehicleFactory();
    private InputReader inputReader = new InputReader();

    public void start() {
        List<Vehicle> vehicles = vehicleFactory.initVehicles();
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

        if(selectedDestinationType == 1) {
            return transportService.selectVehiclesOfGivenDestinationType(vehicles, DestinationType.ISLAND);
        } else if(selectedDestinationType == 2) {
            return transportService.selectVehiclesOfGivenDestinationType(vehicles, DestinationType.RAILWAYSTATION);
        } else if(selectedDestinationType == 3) {
            return transportService.selectVehiclesOfGivenDestinationType(vehicles, DestinationType.OTHER);
        } else {
            throw new IllegalArgumentException("There is no such option!");
        }
    }

    public List<Vehicle> filterBySelectedVehicleType(List<Vehicle> vehicles) {
        int selectedVehicleType = inputReader.selectVehicleType();

        if(selectedVehicleType == 1) {
            return transportService.selectVehiclesOfGivenLoadType(vehicles, VehicleType.CARGO);
        } else if(selectedVehicleType == 2) {
            return transportService.selectVehiclesOfGivenLoadType(vehicles, VehicleType.PASSENGER);
        } else {
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
