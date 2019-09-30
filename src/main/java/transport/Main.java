package transport;

import transport.service.TransportServiceImpl;

public class Main {

    public static void main(String... args) {
        TransportServiceImpl transportService = new TransportServiceImpl();
        InputReader inputReader = new InputReader();
        UserInterface userInterface = new UserInterface(transportService, inputReader);
        userInterface.start();
    }
}
