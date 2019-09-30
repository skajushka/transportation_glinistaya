package transport;

import java.util.Comparator;

public class Load {
    private double tonnage;
    private int ridership;

    public Load(int ridership, double tonnage) {
        this.tonnage = tonnage;
        this.ridership = ridership;
    }

    public double getTonnage() {
        return tonnage;
    }

    public int getRidership() {
        return ridership;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public void setRidership(int ridership) {
        this.ridership = ridership;
    }

    public int compareTo(Load requestedLoad) {
        return Comparator.comparing((Load l) -> l.ridership)
                .thenComparing(l -> l.tonnage)
                .compare(this, requestedLoad);
    }
}
