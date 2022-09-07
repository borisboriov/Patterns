package com.boris.patterns.creationPatterns.Builder;


import com.boris.patterns.creationPatterns.Builder.car.Car;
import com.boris.patterns.creationPatterns.Builder.car.CarType;
import com.boris.patterns.creationPatterns.Builder.components.Engine;
import com.boris.patterns.creationPatterns.Builder.components.GPSNavigator;
import com.boris.patterns.creationPatterns.Builder.components.Transmission;
import com.boris.patterns.creationPatterns.Builder.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
