package bai_3;

public class Car {
    String brand;
    int maxSpeed;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void run() {
        System.out.println("Xe " + brand + " dang chay voi toc do toi da " + maxSpeed + " km/h");
    }
}
