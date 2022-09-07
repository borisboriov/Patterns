package com.boris.patterns.creationPatterns.Builder;


import com.boris.patterns.creationPatterns.Builder.car.CarType;
import com.boris.patterns.creationPatterns.Builder.components.Engine;
import com.boris.patterns.creationPatterns.Builder.components.GPSNavigator;
import com.boris.patterns.creationPatterns.Builder.components.Transmission;
import com.boris.patterns.creationPatterns.Builder.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
