package by.andrey.twikssi.exer4car.service;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    public final int MAX_SPEED;
    private int currentSpeed;

    public Car(String model, String color, int MAX_SPEED) {
        this.model = model;
        this.color = color;
        this.MAX_SPEED = MAX_SPEED;
    }

    public boolean isDriving() {
        if (currentSpeed > 0){
           return true;
        }
        return false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return MAX_SPEED == car.MAX_SPEED &&
                currentSpeed == car.currentSpeed &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, MAX_SPEED, currentSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", MAX_SPEED=" + MAX_SPEED +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
