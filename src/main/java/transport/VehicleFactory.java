package transport;

public class VehicleFactory {
    
    //todo Сложно объяснить. Но мне не нравится. У тебя тут как-то получается, что фабрика инициализирует весь транспорт.
    //ИМХО, фабрика должна предоставлять экземпляр по запросу (на основании переданных условий)
    //Т.е. initVehicle (только лучше наверное createVehicleOfClass) еще соответствует патерну фабрики
    //а вот initVehicles - уже нет

    public static <T> T initVehicle(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
