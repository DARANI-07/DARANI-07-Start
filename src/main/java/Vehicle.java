public class Vehicle {
    int currentSpeed;
    String make;
    String model;

    public int accelerate() {
        currentSpeed = currentSpeed + 5;
        return currentSpeed;
    }

    public String honk() {
        return "HONNNK";
    }
}
