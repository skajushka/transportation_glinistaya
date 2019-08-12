package transport;

import java.util.List;

public class UserInterface {

    private TransportService transportService = new TransportService();
    private VehicleFactory vehicleFactory = new VehicleFactory();
    private InputReader inputReader = new InputReader();

    public void start() {
        List<Vehicle> vehicles = vehicleFactory.initVehicles();
        List<Vehicle> vehicles1 = filterBySelectedDestinationType(vehicles);
        List<Vehicle> vehicles2 = filterBySelectedVehicleType(vehicles1);
        vehicles2.stream()
                .forEach(vehicle -> System.out.println(vehicle.getVehicleName()));
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
}
