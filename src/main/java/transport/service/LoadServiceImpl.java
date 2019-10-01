package transport.service;

public class LoadServiceImpl implements LoadService {

    public double calculateRequestedCargo(double givenCargoAmount, double givenPassengersAmount) {
        return givenCargoAmount + givenPassengersAmount*0.08;
    }
}
