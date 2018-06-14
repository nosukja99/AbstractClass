public class Car extends Vehicle{
    int speed;
    String name;

    public Car()
    {

    }

    public Car(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    void run() {

    }

    @Override
    void stop() {

    }

    @Override
    void accelerate() {

    }


}
