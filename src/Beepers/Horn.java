package Beepers;

import Beepers.Beeper;

public class Horn implements Beeper {
    @Override
    public String MakeSound() {
        return "Hooooo";
    }
}
