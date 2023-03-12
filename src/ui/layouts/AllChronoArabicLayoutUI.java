package ui.layouts;

import core.Chronometer;
import ui.chronometer.ChronoAnalogArabicAnalogUI;

import java.util.List;

public class AllChronoArabicLayoutUI extends AllChronoLayoutUI{
    public AllChronoArabicLayoutUI(List<Chronometer> chronometers) {
        super();
        for (Chronometer c : chronometers) {
            this.add(new ChronoAnalogArabicAnalogUI(c));
        }
    }
}
