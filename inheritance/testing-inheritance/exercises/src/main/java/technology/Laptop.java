package technology;

public class Laptop extends Computer {
    private double screenSize;

    public Laptop(String brand, double price, double screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    public void adjustScreenBrightness(double brightness) {
        // Implementation to adjust screen brightness
    }

    // Getter and setter for screenSize
}
