package transport;

public abstract class Vehicle {

    private VehicleType vehicleType;
    private String vehicleName;
    private int maxTonnage;
    private int maxRidership;
    private double maxSpeed;

    public Vehicle (VehicleType vehicleType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
        this.maxRidership = maxRidership;
        this.maxTonnage = maxTonnage;
        this.maxSpeed = maxSpeed;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public int getMaxRidership() {
        return maxRidership;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public abstract boolean checkIfRouteIsValid(DestinationType destination);

    //todo Для пассажирского транспорта как этот метод узнает, что мне надо везти? Груз или пассажиров?
    public boolean checkIfLoadAmountAllowed(double loadAmount) {

        if(getVehicleType() == VehicleType.PASSENGER) {
            return getMaxRidership() >= loadAmount;
        } else {
            return getMaxTonnage() >= loadAmount;
        }
    }

    //todo Я и сам этим грешен. Но этого метода не должно быть у vehicle. Фактически Vehicle - это контейнер данных. 
    //Калькуляции должны проходить в сервисных классах
    //checkIf... методы по хорошему должны быть там же
    public double calculateJourneyTime(double distance, double speed) {
        return distance / speed;
    }
}
