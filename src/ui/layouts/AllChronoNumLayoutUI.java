package ui.layouts;

import core.Chronometer;
import ui.chronometer.ChronometerNumUI;

import java.util.List;

public class AllChronoNumLayoutUI extends AllChronoLayoutUI {
    public AllChronoNumLayoutUI(List<Chronometer> chronometers) {
        super();
        for (Chronometer c : chronometers) {
            this.add(new ChronometerNumUI(c));
        }
    }
}
