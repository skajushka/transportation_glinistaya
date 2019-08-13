package transport;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {

    private TransportService transportService = new TransportService();
    private VehicleFactory vehicleFactory = new VehicleFactory();
    private InputReader inputReader = new InputReader();

    public void start() {
        List<Vehicle> vehicles = vehicleFactory.initVehicles();
        List<Vehicle> vehicles1 = filterBySelectedDestinationType(vehicles);
        List<Vehicle> vehicles2 = filterBySelectedVehicleType(vehicles1);
        List<Vehicle> vehicles3 = filterByLoadAmount(vehicles2);
        int distance = inputReader.getDistance();
        vehicles3.stream()
                .forEach(vehicle -> System.out.println(vehicle.getVehicleName() + " - " +
                        vehicle.calculateJourneyTime(distance, vehicle.getMaxSpeed())));
    }

    public List<Vehicle> filterBySelectedDestinationType(List<Vehicle> vehicles) {
        int selectedDestinationType = inputReader.selectDestinationType();

        if(selectedDestinationType == 1) {
            return transportService.selectVehiclesOfGivenDestinationType(vehicles,
                    DestinationType.ISLAND, DestinationType.ISLAND);
        } else if(selectedDestinationType == 2) {
            return transportService.selectVehiclesOfGivenDestinationType(vehicles,
                    DestinationType.RAILWAYSTATION, DestinationType.RAILWAYSTATION);
        } else if(selectedDestinationType == 3) {
            return transportService.selectVehiclesOfGivenDestinationType(vehicles,
                    DestinationType.OTHER, DestinationType.OTHER);
        } else {
            System.out.println("There is no such option!");
        }

        return vehicles;
    }

    public List<Vehicle> filterBySelectedVehicleType(List<Vehicle> vehicles) {
        int selectedVehicleType = inputReader.selectVehicleType();

        if(selectedVehicleType == 1) {
            return transportService.selectVehiclesOfGivenLoadType(vehicles, VehicleType.CARGO);
        } else if(selectedVehicleType == 2) {
            return transportService.selectVehiclesOfGivenLoadType(vehicles, VehicleType.PASSENGER);
        } else {
            System.out.println("There is no such option!");
        }

        return vehicles;
    }

    public List<Vehicle> filterByLoadAmount(List<Vehicle> vehicles) {
        int loadAmount = inputReader.getLoadAmount();
        List<Vehicle> vehicles1 = new ArrayList<>();

        for(int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            if(vehicle.checkIfLoadAmountAllowed(loadAmount)) {
                vehicles1.add(vehicle);
            }
        }

        if(vehicles1.size() == 0) {
            System.out.println("There is no such vehicle to handle requested load!");
        }

        return vehicles1;
    }
}
