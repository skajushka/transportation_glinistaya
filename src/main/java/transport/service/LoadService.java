package transport.service;

import transport.Load;

public interface LoadService {

    boolean isLoadAllowed(Load defaultLoad, Load requestedLoad);
}
