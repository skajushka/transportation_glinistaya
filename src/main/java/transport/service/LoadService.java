package transport.service;

import transport.Load;

public interface LoadService {

    boolean isPassengersAmountAllowed(Load defaultLoad, Load requestedLoad);

    boolean isTonnageAcceptable(Load defaultLoad, Load requestedLoad);
}
