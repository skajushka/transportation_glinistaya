package transport;

public class CommuterTrain extends Vehicle implements Passanger{
    private int maxTonnage;
    private int maxRidership;
    private int maxSpeed;

    public CommuterTrain(int maxRidership, int maxTonnage, int maxSpeed) {
        this.maxRidership = maxRidership;
        this.maxTonnage = maxTonnage;
        this.maxSpeed = maxSpeed;
    }

    public void setMaxTonnage(int maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public int getMaxRidership() {
        return maxRidership;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean checkIfTonnageAllowed(CommuterTrain commuterTrain, int tonnage) {
        return commuterTrain.getMaxTonnage() >= tonnage;
    }

    public boolean checkIfRidershipAllowed(CommuterTrain commuterTrain, int ridership) {
        return commuterTrain.getMaxRidership() >= ridership;
    }

    @Override
    public void transportPassengers() {

    }

    @Override
    public void transportCargo() {

    }
}
