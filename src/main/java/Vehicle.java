public class Vehicle {
    public int currentSpeed;    // ✅ Make public
    public String make;         // ✅ Make public
    public String model;        // ✅ Make public

    public int accelerate() {
        currentSpeed = currentSpeed + 5;
        return currentSpeed;
    }

    public String honk() {
        return "HONNNK";
    }
}