package ui.layouts;

import core.Chronometer;
import ui.chronometer.ChronoAnalogRomanAnalogUI;

import java.util.List;

public class AllChronoRomanLayoutUI extends AllChronoLayoutUI {
    public AllChronoRomanLayoutUI(List<Chronometer> chronometers) {
        super();
        for (Chronometer c : chronometers) {
            this.add(new ChronoAnalogRomanAnalogUI(c));
        }
    }
}
