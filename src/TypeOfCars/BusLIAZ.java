package TypeOfCars;

import Beepers.Beeper;
import Engines.Engine;
import FuelTanks.FuelTank;
import LoadsCapacity.LoadCapacity;
import Passangers.PassangersCapacity;
import Transmissions.Transmission;

public class BusLIAZ extends Car implements Bus {
    public BusLIAZ(Beeper beeper, Engine engine, Transmission transmission, FuelTank fuelTank, LoadCapacity loadCapacity, PassangersCapacity passangersCapacity) {
        super(beeper, engine, transmission, fuelTank, loadCapacity, passangersCapacity);


    }

    @Override
    public void goingToRoute() {

    }

    @Override
    public void goingToStation() {

    }
}
