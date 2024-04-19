package technology;
public class Program {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple", 1200.0, 15.6);
        SmartPhone smartPhone = new SmartPhone("Samsung", 700.0, 3000);

        laptop.turnOn();
        smartPhone.turnOn();

        System.out.println("Laptop ID: " + laptop.getId());
        System.out.println("SmartPhone ID: " + smartPhone.getId());
    }
}
