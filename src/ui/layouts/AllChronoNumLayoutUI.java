package ui.layouts;

import core.Chronometer;
import ui.chronometer.ChronometerNumUI;
import ui.chronometer.ChronometerUI;

import java.util.List;

public class AllChronoNumLayoutUI extends AllChronoLayoutUI {

    /**
     * A Panel containing one numeric chronometer for each subject instantiates
     * @param chronometers a list of chronometer subject
     */
    public AllChronoNumLayoutUI(List<Chronometer> chronometers) {
        super();
        for (Chronometer c : chronometers) {
            ChronometerUI chronometerNumUI = new ChronometerNumUI(c);
            this.chronometerUIs.add(chronometerNumUI);
            this.add(chronometerNumUI);
        }
    }
}
