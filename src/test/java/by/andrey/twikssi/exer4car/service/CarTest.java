package by.andrey.twikssi.exer4car.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    Car car;

    @Before
    public void setup(){
        car = new Car("BelarussianBus","black",160);
    }

    @Test
    public void isDrivingReturnFalse() {
        boolean expected = false;
        boolean actual = car.isDriving();

        assertEquals(expected,actual);
    }

    @Test
    public void isDrivingReturnTrue() {
        car.setCurrentSpeed(100);
        boolean expected = true;
        boolean actual = car.isDriving();

        assertEquals(expected,actual);
    }

    @Test
    public void testEqualsReturnTrue() {
        Car car2 = new Car("BelarussianBus","black",160);

        boolean expected = true;
        boolean actual = car2.equals(car);

        assertEquals(expected,actual);
    }

    @Test
    public void testEqualsReturnFalse() {
        Car car2 = new Car("BelarussianBuds","black",160);

        boolean expected = false;
        boolean actual = car2.equals(car);

        assertEquals(expected,actual);
    }

    @Test
    public void testHashCode() {
        int expected = -20109317;
        int actual = car.hashCode();

        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        String expected = "Car{model='BelarussianBus', color='black', MAX_SPEED=160, currentSpeed=0}";
        String actual = car.toString();

        assertEquals(expected,actual);
    }

    @Test
    public void isStoppedReturnTrue() {
        boolean expected = true;
        boolean actual = car.isStopped();

        assertEquals(expected,actual);
    }

    @Test
    public void isStoppedReturnFalse() {
        car.setCurrentSpeed(45);
        boolean expected = false;
        boolean actual = car.isStopped();

        assertEquals(expected,actual);
    }

    @Test
    public void canAccelerateReturnTrue() {
        car.setCurrentSpeed(45);
        boolean expected = true;
        boolean actual = car.canAccelerate();

        assertEquals(expected,actual);
    }

    @Test
    public void canAccelerateReturnFalse() {
        car.setCurrentSpeed(180);
        boolean expected = false;
        boolean actual = car.canAccelerate();

        assertEquals(expected,actual);
    }

    @Test
    public void accelerateSetSpeedMoreThanMax() {
        car.accelerate(180);
        int expected = 160;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }

    @Test
    public void accelerateSetMaxSpeed() {
        car.accelerate(160);
        int expected = 160;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }

    @Test
    public void accelerateSetSpeed() {
        car.accelerate(100);
        car.accelerate(40);
        int expected = 140;
        int actual = car.getCurrentSpeed();

        assertEquals(expected,actual);
    }
}