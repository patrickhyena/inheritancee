public class PoliceCar extends LandVehicle implements IsEmergency {

    private int turboSpeed;

    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels, int turboSpeed) {
        super(name, maxPassengers, maxSpeed, numWheels);
        this.turboSpeed = turboSpeed;
    }

    public void useTurbo() {
        System.out.println("Turbo Mode Activate. Speed is now " + (turboSpeed + this.getMaxSpeed()));
    }

    public int getTurboSpeed() {
        return turboSpeed;
    }

    public void setTurboSpeed(int turboSpeed) {
        this.turboSpeed = turboSpeed;
    }

    @Override
    public void soundSiren() {
        System.out.println("WOOP WOOP THATS THE SOUND OF THE POLICE");

    }
    
}