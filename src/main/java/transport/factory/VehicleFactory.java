package transport.factory;

import transport.vehicle.Vehicle;

public class VehicleFactory {

    public static <T extends Vehicle> T createVehicleOfClass(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
