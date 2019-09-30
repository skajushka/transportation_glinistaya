package transport;

import transport.service.TransportServiceImpl;
import transport.vehicle.DestinationType;
import transport.vehicle.Vehicle;

import java.util.*;
import java.util.stream.Collectors;

public class UserInterface {

    private TransportServiceImpl transportService = new TransportServiceImpl();
    private InputReader inputReader = new InputReader();

    private static final int DESTINATION_TYPE_ISLAND = 1;
    private static final int DESTINATION_TYPE_RAILWAY_STATION = 2;
    private static final int DESTINATION_TYPE_OTHER = 3;

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

    public List<Vehicle> filterByLoad(List<Vehicle> vehicles) {
        int requestedPassengers = inputReader.getPassengersLoad();
        double requestedCargo = inputReader.getCargoLoad() - (double)requestedPassengers*0.08;
        Load requestedLoad = new Load(requestedPassengers, requestedCargo);

      return vehicles.stream()
              .filter(vehicle -> transportService.isLoadAllowed(vehicle, requestedLoad))
              .collect(Collectors.toList());
    }
}
