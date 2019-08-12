package transport;

import java.util.Scanner;

public class InputReader {

    Scanner in = new Scanner(System.in);

    public int selectDestinationType() {
        System.out.println("1 - Islands");
        System.out.println("2 - Railway Stations");
        System.out.println("3 - Other");

        return readOption();
    }

    public int selectVehicleType() {
        System.out.println("Please select the type of transportation");
        System.out.println("1 - Cargo");
        System.out.println("2 - Passenger");

        return readOption();
    }

    public int getDistance() {
        System.out.println("Please enter the distance");
        return readOption();
    }

    private int readOption() {
        Integer option = null;

        try {
            option = Integer.parseInt(in.next());
        } catch (NumberFormatException e) {
            System.out.println("There is no such option!");
            option = 0;
        }

        return option;
    }
}
