abstract class RacingCar {

    private String Type;
    private String PowerSource;
    private String Track;
    private int TopSpeed;

    public RacingCar(String Type, String PowerSource, String Track, int TopSpeed) {
        this.Type = Type;
        this.PowerSource = PowerSource;
        this.Track = Track;
        this.TopSpeed = TopSpeed;
    }

    public String getType() {
        return Type;
    }

    public String getPowerSource() {
        return PowerSource;
    }

    public String getTrack() {
        return Track;
    }

    public int getTopSpeed() {
        return TopSpeed;
    }

    abstract void sound();

    public void displayInfo() {
        System.out.println("Type: " + Type);
        System.out.println("Power Source: " + PowerSource);
        System.out.println("Track: " + Track);
        System.out.println("Top Speed: " + TopSpeed + " km/h");
    }
}

class ElectricCar extends RacingCar {

    public ElectricCar(String Type, String PowerSource, String Track, int TopSpeed) {
        super(Type, PowerSource, Track, TopSpeed);
    }

    @Override
    void sound() {
        System.out.println("Electric race car sounds more quietly");
    }
}

class GasCar extends RacingCar {

    public GasCar(String Type, String PowerSource, String Track, int TopSpeed) {
        super(Type, PowerSource, Track, TopSpeed);
    }

    @Override
    void sound() {
        System.out.println("Gas race car sounds louder");
    }
}

public class mobil {
    public static void main(String[] args) {

        RacingCar carElectric = new ElectricCar("Formula E", "Electric", "Street Circuits", 320);
        RacingCar carGas = new GasCar("Formula 1", "Gasoline", "Permanent Circuits", 350);

        carElectric.displayInfo();
        carElectric.sound();

        System.out.println();

        carGas.displayInfo();
        carGas.sound();
    }
}