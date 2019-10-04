package transport.service;

import transport.Load;

public class LoadServiceImpl implements LoadService {

    public double calculateRequestedCargo(double givenCargoAmount, double givenPassengersAmount) {
        return givenCargoAmount + givenPassengersAmount*0.08;
    }

    public boolean isLoadAllowed(Load requestedLoad, Load defaultLoad) {
        double requestedCargo = calculateRequestedCargo(requestedLoad.getCargo(), requestedLoad.getPassengers());
        requestedLoad.setCargo(requestedCargo);
        return defaultLoad.compareTo(requestedLoad) >= 0;
    }
}
