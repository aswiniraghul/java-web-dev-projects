package technology;

public class Computer extends AbstractEntity {
    private String brand;
    private double price;
    private boolean isOn;

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return true;
    }
}


