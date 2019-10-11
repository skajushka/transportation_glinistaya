package transport.service;

import transport.Load;

public class LoadServiceImpl implements LoadService {

    private static final double PERSON_WEIGHT = 0.08;

    public boolean isLoadAllowed(Load vehicleLoad, Load requestedLoad) {
        boolean passengersAmountAllowed = isPassengersAmountAllowed(vehicleLoad, requestedLoad);
        boolean tonnageAmountAllowed = isTonnageAcceptable(vehicleLoad, requestedLoad);

        return passengersAmountAllowed && tonnageAmountAllowed;
    }

    private boolean isPassengersAmountAllowed(Load vehicleLoad, Load requestedLoad) {
        return vehicleLoad.getPassengers() >= requestedLoad.getPassengers();
    }

    private boolean isTonnageAcceptable(Load vehicleLoad, Load requestedLoad) {
        double passengersTonnage = (double)requestedLoad.getPassengers() * PERSON_WEIGHT;
        double requestedTonnage = passengersTonnage + requestedLoad.getCargo();
        double allowedTonnage = vehicleLoad.getCargo();

        return allowedTonnage >= requestedTonnage;
    }
}
