package technology;

public class SmartPhone extends Computer {
    private int batteryLife;

    public SmartPhone(String brand, double price, int batteryLife) {
        super(brand, price);
        this.batteryLife = batteryLife;
    }

    public void charge(int hours) {
        // Implementation to charge the phone
    }

    // Getter and setter for batteryLife
}

