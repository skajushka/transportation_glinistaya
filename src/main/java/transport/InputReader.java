package transport;

import java.util.Scanner;

public class InputReader {

   private Scanner in = new Scanner(System.in);

    public int selectDestinationType() {
        System.out.println("Please select the type of destination points:");
        System.out.println("1 - Islands");
        System.out.println("2 - Railway Stations");
        System.out.println("3 - Other");

        return (int)readOption();
    }

    public int getCargoLoad() {
        System.out.println("Please enter the amount of cargo(in tonnes) to be transported");
        return (int)readOption();
    }

    public int getPassengersLoad() {
        System.out.println("Please enter the amount of passengers to be transported");
        return (int)readOption();
    }

    public double getDistance() {
        System.out.println("Please enter the distance in km");
        return readOption();
    }

    private double readOption() {
        try {
            return  Double.parseDouble(in.next());
        } catch (NumberFormatException e) {
            System.out.println("There is no such option!");
            throw e;
        }
    }
}
