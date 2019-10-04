package transport;

import java.util.Comparator;

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

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public int compareTo(Load requestedLoad) {
        return Comparator.comparing((Load l) -> l.passengers)
                .thenComparing(l -> l.cargo)
                .compare(this, requestedLoad);
    }
}
