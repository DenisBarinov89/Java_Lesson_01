package TypeOfCars;

import Beepers.Beeper;
import Engines.Engine;
import FuelTanks.FuelTank;
import LoadsCapacity.LoadCapacity;
import Passangers.PassangersCapacity;
import Transmissions.Transmission;
import TypeOfCars.Car;

public class SedanCarV6 extends Car {

    public SedanCarV6(Beeper beeper, Engine engine, Transmission transmission, FuelTank fuelTank, LoadCapacity loadCapacity, PassangersCapacity passangersCapacity) {
        super(beeper, engine, transmission, fuelTank, loadCapacity, passangersCapacity);
    }
}

