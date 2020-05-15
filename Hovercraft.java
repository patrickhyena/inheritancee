public class Hovercraft extends LandVehicle implements IsSeaVehicle {

    private int displacement;

    public Hovercraft(String name, int maxPassengers, int maxSpeed, int numWheels, int displacement) {
        super(name, maxPassengers, maxSpeed, numWheels);
        this.displacement = displacement;
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void launch() {
        System.out.println("Initiating TurboFan. Now launching your Yacht!");
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void enterLand() {
        System.out.println("Initiating land entrance protocol.");
    }

    public void enterSea() {
        System.out.println("Initiating water entrance protocol.");
    }

}