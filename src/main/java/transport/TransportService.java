package transport;

import java.util.List;
import java.util.stream.Collectors;

public class TransportService {

    public List<Vehicle> selectVehiclesOfGivenLoadType(List<Vehicle> vehicles, VehicleType vehicleType) {

        return vehicles.stream()
                .filter(vehicle -> vehicle.getVehicleType() == vehicleType)
                .collect(Collectors.toList());
    }

    public List<Vehicle> selectVehiclesOfGivenDestinationType( List<Vehicle> vehicles, DestinationType destinationType1,
                                                               DestinationType destinationType2) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.checkIfRouteIsValid(destinationType1, destinationType2))
                .collect(Collectors.toList());
    }
}