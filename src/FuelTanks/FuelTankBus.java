package FuelTanks;

public class FuelTankBus implements FuelTank {
    @Override
    public String GetFuel() {
        return "ДТ";
    }

    @Override
    public String GetVolume() {
        return "60 литров";
    }
}
