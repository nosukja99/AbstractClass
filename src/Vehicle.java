public abstract class Vehicle {

    int numWheel;

    public Vehicle() {
    }

    public Vehicle(int numWheel) {
        this.numWheel = numWheel;
    }

    public int getNumWheel() {
        return numWheel;
    }

    public void setNumWheel(int numWheel) {
        this.numWheel = numWheel;
    }

    abstract void run();
    abstract void stop();
    abstract void accelerate();

}

