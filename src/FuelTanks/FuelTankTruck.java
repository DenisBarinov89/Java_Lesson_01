package FuelTanks;

public class FuelTankTruck implements FuelTank {
    @Override
    public String GetFuel() {
        return "ДТ";
    }

    @Override
    public String GetVolume() {
        return "80 литров";
    }
}
