package ui.layouts;

import core.Chronometer;
import ui.chronometer.ChronoAnalogArabicAnalogUI;
import ui.chronometer.ChronometerUI;

import java.util.List;

public class AllChronoArabicLayoutUI extends AllChronoLayoutUI{
    public AllChronoArabicLayoutUI(List<Chronometer> chronometers) {
        super();
        for (Chronometer c : chronometers) {
            ChronometerUI chronoAnalogArabicAnalogUI = new ChronoAnalogArabicAnalogUI(c);
            this.chronometerUIs.add(chronoAnalogArabicAnalogUI);
            this.add(chronoAnalogArabicAnalogUI);
        }
    }
}
