public class Vehicle {
    public int currentSpeed;  
    public String make;       
    public String model;      

    public int accelerate() {
        currentSpeed += 5;
        return currentSpeed;
    }

    public String honk() {
        return "HONNNK";
    }
}
