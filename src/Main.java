import Beepers.Beeper;
import Beepers.Horn;
import Beepers.NormalBeeper;
import Engines.Engine;
import Engines.EngineV12;
import Engines.EngineV6;
import Engines.EngineV8;
import FuelTanks.FuelTank;
import FuelTanks.FuelTankBus;
import FuelTanks.FuelTankSedan;
import FuelTanks.FuelTankTruck;
import LoadsCapacity.CapacityBus;
import LoadsCapacity.CapacitySedanCar;
import LoadsCapacity.CapacityTruck;
import LoadsCapacity.LoadCapacity;
import Passangers.PassangersBus;
import Passangers.PassangersCapacity;
import Passangers.PassangersSedanCar;
import Passangers.PassangersTruck;
import Transmissions.GearBoxAuto;
import Transmissions.GearBoxManual;
import Transmissions.Transmission;
import TypeOfCars.BusLIAZ;
import TypeOfCars.SedanCarV6;
import TypeOfCars.VolvoTruck;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Собираем седан
        Beeper beeperForSedan = new NormalBeeper(); //создаем гудок
        Engine engineForSedan = new EngineV6(); //создаем двигатель
        FuelTank tankForSedan = new FuelTankSedan(); //создаем топливный бак
        LoadCapacity loadForSedan = new CapacitySedanCar(); //определяем грузоподъемность
        Transmission sedanGearBox = new GearBoxAuto(); //создаем коробку передач
        PassangersCapacity passangersForSedan = new PassangersSedanCar(); //создаем посадочные места для пассажиров

        SedanCarV6 polo = new SedanCarV6(beeperForSedan, engineForSedan, sedanGearBox, tankForSedan, loadForSedan, passangersForSedan); //создаем машину и кидаем в нее все компоненты

        //Собираем Автобус
        Beeper busLIAZbeeper = new Horn();
        Engine busLIAZEngine = new EngineV8();
        FuelTank busLIAZFuelTank = new FuelTankBus();
        LoadCapacity busLIAZCapacity = new CapacityBus();
        Transmission busLIAZGearBox = new GearBoxManual();
        PassangersCapacity busLIAZPassangers = new PassangersBus();

        BusLIAZ busLIAZ2107 = new BusLIAZ(busLIAZbeeper, busLIAZEngine, busLIAZGearBox, busLIAZFuelTank, busLIAZCapacity, busLIAZPassangers);


        //Собираем грузовик
        Beeper volvoTruckBeeper = new Horn();
        Engine volvoTruckEngine = new EngineV12();
        FuelTank volvoTruckFuelTank = new FuelTankTruck();
        LoadCapacity volvoTruckCapacity = new CapacityTruck();
        Transmission volvoTruckGearBox = new GearBoxAuto();
        PassangersCapacity volvoTruckPassangers = new PassangersTruck();

        VolvoTruck volvoFM = new VolvoTruck(volvoTruckBeeper, volvoTruckEngine, volvoTruckGearBox, volvoTruckFuelTank, volvoTruckCapacity, volvoTruckPassangers);
    }
}