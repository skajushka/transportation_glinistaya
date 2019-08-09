package transport;

import java.util.ArrayList;
import java.util.List;

public class TransportService {

    private static final String RW_COMMUTER_TRAIN = "Commuter Train";
    private static final String RW_CARGO_TRAIN = "Cargo Train";
    private static final String RW_PASSENGER_TRAIN = "Passenger Train";
    private static final String AT_CAR = "Car";
    private static final String AT_LORRY = "Lorry";
    private static final String AT_BUS = "Bus";
    private static final String ST_BOAT = "Boat";
    private static final String ST_LAUNCH = "Launch";
    private static final String ST_YACHT = "Yacht";
    private static final String ST_FERRY = "Ferry";
    private static final String ST_BARGE = "Barge";
    private static final String ST_STEAMBOAT = "Steamboat";
    private static final String ST_TANKER = "Tanker";

    public RailwayTransport createCommuterTrain() {
        return new RailwayTransport(VehicleType.PASSENGER, RW_COMMUTER_TRAIN, 1050, 1000, 100);
    }

    public RailwayTransport createCargoTrain() {
        return new RailwayTransport(VehicleType.CARGO, RW_CARGO_TRAIN, 0, 10000, 90);
    }

    public RailwayTransport createPassengerTrain() {
        return new RailwayTransport(VehicleType.PASSENGER, RW_PASSENGER_TRAIN, 900, 1100, 130);
    }

    public AutoTransport createCar() {
        return new AutoTransport(VehicleType.PASSENGER, AT_CAR, 4, 200, 150);
    }

    public AutoTransport createLorry() {
        return new AutoTransport(VehicleType.CARGO, AT_LORRY, 0, 500, 90);
    }

    public AutoTransport createBus() {
        return new AutoTransport(VehicleType.PASSENGER, AT_BUS, 50, 300, 90);
    }

    public List<Vehicle> createVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(createCommuterTrain());
        vehicles.add(createCargoTrain());
        vehicles.add(createPassengerTrain());
        vehicles.add(createCar());
        vehicles.add(createLorry());
        vehicles.add(createBus());
        return vehicles;
    }

    public List<Vehicle> selectVehiclesOfGivenLoadType(List<Vehicle> vehicles, VehicleType vehicleType) {
        List<Vehicle> vehiclesOfGivenVehicleType = new ArrayList<>();

        for (int i =0; i <= vehicles.size(); i++ ) {
            Vehicle vehicle = vehicles.get(0);
            if (vehicle.getVehicleType() == vehicleType) {
                vehiclesOfGivenVehicleType.add(vehicle);
            }
        }

        return vehiclesOfGivenVehicleType;
    }

    public List<Vehicle> selectVehiclesOfGivenDestinationType( List<Vehicle> vehicles, DestinationType destinationType1, DestinationType destinationType2) {
        List<Vehicle> vehiclesOfGivenDestinationType = new ArrayList<>();

        for (int i =0; i <= vehicles.size(); i++ ) {
            Vehicle vehicle = vehicles.get(0);
            if (vehicle.checkIfRouteIsValid(destinationType1, destinationType2)) {
                vehiclesOfGivenDestinationType.add(vehicle);
            }
        }

        return vehiclesOfGivenDestinationType;
    }
}