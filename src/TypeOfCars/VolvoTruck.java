package TypeOfCars;

import Beepers.Beeper;
import Engines.Engine;
import FuelTanks.FuelTank;
import LoadsCapacity.LoadCapacity;
import Passangers.PassangersCapacity;
import Transmissions.Transmission;

public class VolvoTruck extends Car implements Truck{
    public VolvoTruck(Beeper beeper, Engine engine, Transmission transmission, FuelTank fuelTank, LoadCapacity loadCapacity, PassangersCapacity passangersCapacity) {
        super(beeper, engine, transmission, fuelTank, loadCapacity, passangersCapacity);
    }

    @Override
    public void getCargo() {

    }

    @Override
    public void unloadCargo() {

    }
}
