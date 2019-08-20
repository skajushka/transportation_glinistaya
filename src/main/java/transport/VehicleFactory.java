package transport;

public class VehicleFactory {

    public static <T> T createVehicleOfClass(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
