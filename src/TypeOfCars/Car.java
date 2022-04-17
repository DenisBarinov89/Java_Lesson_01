package TypeOfCars;

import Beepers.Beeper;
import Engines.Engine;
import FuelTanks.FuelTank;
import LoadsCapacity.LoadCapacity;
import Passangers.PassangersCapacity;
import Transmissions.Transmission;

public abstract class Car {

    public Beeper beeper;
    public Engine engine;
    public Transmission transmission;
    public FuelTank fuelTank;
    public LoadCapacity loadCapacity;
    public PassangersCapacity passangersCapacity;





    public Car(Beeper beeper, Engine engine, Transmission transmission, FuelTank fuelTank, LoadCapacity loadCapacity, PassangersCapacity passangersCapacity) {
        this.beeper = beeper;
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.transmission = transmission;
        this.loadCapacity = loadCapacity;
        this.passangersCapacity = passangersCapacity;
    }
}
