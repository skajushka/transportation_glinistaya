package transport;

import transport.service.LoadServiceImpl;
import transport.service.TransportServiceImpl;

public class Main {

    public static void main(String... args) {
        TransportServiceImpl transportService = new TransportServiceImpl();
        LoadServiceImpl loadService = new LoadServiceImpl();
        InputReader inputReader = new InputReader();
        TransportManager transportManager = new TransportManager(transportService, loadService, inputReader);
        transportManager.start();
    }
}
