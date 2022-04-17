package FuelTanks;

public class FuelTankSedan implements FuelTank {
    @Override
    public String GetFuel() {
        return "АИ-95";
    }

    @Override
    public String GetVolume() {
        return "60 литров";
    }
}
