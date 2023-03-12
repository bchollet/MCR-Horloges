package ui.layouts;

import javax.swing.*;
import java.awt.*;

public abstract class AllChronoLayoutUI extends JPanel {
    protected AllChronoLayoutUI() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
    }
}
