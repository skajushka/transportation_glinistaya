package transport.service;

import transport.Load;

public interface LoadService {

    double calculateRequestedCargo(double givenCargoAmount, double givenPassengersAmount);

    boolean isLoadAllowed(Load requestedLoad, Load defaultLoad);
}
