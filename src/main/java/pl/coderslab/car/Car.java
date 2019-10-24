package pl.coderslab.car;

public class Car {
    private Long id;
    private int maxSpeed;
    private String brand;

    public Car(Long id, int maxSpeed, String brand) {
        this.id = id;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
