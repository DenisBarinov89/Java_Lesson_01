package Transmissions;

public class GearBoxAuto implements Transmission {
    @Override
    public String gearUp() {
        return "Автоматическое переключение передачи вверх";
    }

    @Override
    public String gearDown() {
        return "Автоматическое переключение передачи вниз";
    }
}
