package transport;

import transport.automotive.*;
import transport.marine.*;
import transport.railway.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Vehicle> initVehicles() {
        return Arrays.asList(
                Bus.class,
                Car.class,
                Lorry.class,
                CommuterTrain.class,
                PassengerTrain.class,
                CargoTrain.class,
                Barge.class,
                Boat.class,
                Ferry.class,
                Launch.class,
                Steamboat.class,
                Tanker.class,
                Yacht.class
        ).stream()
            .map(VehicleFactory::initVehicle)
            .collect(Collectors.toList());
    }
}
