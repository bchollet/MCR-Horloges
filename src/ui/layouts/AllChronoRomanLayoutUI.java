package ui.layouts;

import core.Chronometer;
import ui.chronometer.ChronoAnalogRomanAnalogUI;
import ui.chronometer.ChronometerUI;

import java.util.List;

public class AllChronoRomanLayoutUI extends AllChronoLayoutUI {
    public AllChronoRomanLayoutUI(List<Chronometer> chronometers) {
        super();
        for (Chronometer c : chronometers) {
            ChronometerUI chronoAnalogRomanAnalogUI = new ChronoAnalogRomanAnalogUI(c);
            this.chronometerUIs.add(chronoAnalogRomanAnalogUI);
            this.add(chronoAnalogRomanAnalogUI);
        }
    }
}
