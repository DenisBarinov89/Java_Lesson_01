package Transmissions;

public class GearBoxManual implements Transmission{
    @Override
    public String gearUp() {
        return "Ручное переключение передачи вверх";
    }

    @Override
    public String gearDown() {
        return "Ручное переключение передачи вниз";
    }
}
