package transport.marine;

public class Yacht extends SeaTransport {

    private static final String ST_YACHT = "Yacht";
    private static final int RIDERSHIP = 20;
    private static final int TONNAGE = 7000;
    private static final int SPEED = 90;

    public Yacht() {
        super (ST_YACHT, RIDERSHIP, TONNAGE, SPEED);
    }
}
