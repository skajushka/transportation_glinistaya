package transport;

import java.util.Comparator;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Load)) return false;
        Load load = (Load) o;
        return Double.compare(load.getTonnage(), getTonnage()) == 0 &&
                getRidership() == load.getRidership();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTonnage(), getRidership());
    }
}
