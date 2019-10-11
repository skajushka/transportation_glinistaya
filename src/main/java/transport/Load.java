package transport;

public class Load {

    private double cargo;
    private int passengers;

    public Load(int passengers, double cargo) {
        this.cargo = cargo;
        this.passengers = passengers;
    }

    public double getCargo() {
        return cargo;
    }

    public int getPassengers() {
        return passengers;
    }
}
