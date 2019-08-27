package transport.automotive;

import transport.DestinationType;
import transport.Vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AutoTransport extends Vehicle {

    protected static final List<DestinationType> DESTINATIONS = Collections.unmodifiableList(Arrays.asList(DestinationType.RAILWAYSTATION, DestinationType.OTHER));
    //todo Это лучше не так делать
    //1. Если у тебя везде Destinations одинаков для автотранспорта, то ты можешь вообще не запрашивать этот параметр
    //2. Если как правило он одинаков, но ты хочешь оставить возможность его изменить, то просто сделай два конструктора

    public AutoTransport(String vehicleName, int maxRidership, int maxTonnage, int maxSpeed,
                         List<DestinationType> destination) {
        super (vehicleName, maxRidership, maxTonnage, maxSpeed, destination);
    }
}
