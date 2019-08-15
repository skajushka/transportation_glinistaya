package transport;

import java.util.List;
import java.util.stream.Collectors;

public class TransportService {

    public List<Vehicle> selectVehiclesOfGivenLoadType(List<Vehicle> vehicles, VehicleType vehicleType) {

        return vehicles.stream()
                .filter(vehicle -> vehicle.getVehicleType() == vehicleType)
                .collect(Collectors.toList());
    }

    public List<Vehicle> selectVehiclesOfGivenDestinationType( List<Vehicle> vehicles, DestinationType destination) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.checkIfRouteIsValid(destination))
                .collect(Collectors.toList());
    }
}