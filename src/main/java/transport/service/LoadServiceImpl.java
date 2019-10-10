package transport.service;

import transport.Load;

public class LoadServiceImpl implements LoadService {

    private static final double PERSON_WEIGHT = 0.08;

    @Override
    public boolean isPassengersAmountAllowed(Load vehicleLoad, Load requestedLoad) {
        return vehicleLoad.getPassengers() >= requestedLoad.getPassengers();
    }

    @Override
    public boolean isTonnageAcceptable(Load vehicleLoad, Load requestedLoad) {
        double passengersTonnage = (double)requestedLoad.getPassengers() * PERSON_WEIGHT;
        double requestedTonnage = passengersTonnage + requestedLoad.getCargo();
        double allowedTonnage = vehicleLoad.getCargo();

        return allowedTonnage >= requestedTonnage;
    }
}
