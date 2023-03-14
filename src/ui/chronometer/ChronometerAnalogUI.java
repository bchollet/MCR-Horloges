package ui.chronometer;

import core.Chronometer;
import utils.TimeFormatter;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.nio.file.Paths;

public abstract class ChronometerAnalogUI extends ChronometerUI {
    private Image dial;
    private final Color minuteHandColor;
    private final Color secondHandColor;

    /**
     * Extension of ChronometerUI for analog chronometers
     * @param chronometer Observable chronometer the UI subscribes to
     * @param fileName filename of dial image
     * @param minuteHandColor Color of the minute hand
     * @param secondHandColor Color of the second hand
     */
    public ChronometerAnalogUI(Chronometer chronometer, String fileName, Color minuteHandColor, Color secondHandColor) {
        super(chronometer);
        dial = Toolkit.getDefaultToolkit().getImage(Paths.get("img/" + fileName).toString());
        dial = dial.getScaledInstance(DIAL_SIZE, DIAL_SIZE, Image.SCALE_SMOOTH);
        this.minuteHandColor = minuteHandColor;
        this.secondHandColor = secondHandColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Rectangle rect = SwingUtilities.calculateInnerArea(this, null);
        g2.translate(rect.getCenterX(), rect.getCenterY());
        g2.setStroke(new BasicStroke(2f));


        g.drawImage(dial, 0, 0, this);
        g.drawString("Chrono #" + getId(), (int) rect.getCenterX() - 28, (int) rect.getCenterY() + 20);
        float radius = DIAL_SIZE / 2f - 10f;


        //The following code was found here: https://java-swing-tips.blogspot.com/2021/05/drawing-analog-clock-hands-in-jpanel.html
        // Drawing the second hand
        paintHand(g2, DIAL_RADIUS - DIAL_RADIUS / 6,
                TimeFormatter.getSeconds(getSeconds()) * Math.PI / 30, secondHandColor);

        // Drawing the minute hand
        double minuteRot = TimeFormatter.getMinutes(getSeconds()) * Math.PI / 30;
        paintHand(g2, DIAL_RADIUS / 2, minuteRot, minuteHandColor);

        // Drawing the hour hand
        paintHand(g2, DIAL_RADIUS / 4, TimeFormatter.getHours(getSeconds()) * Math.PI / 6 + minuteRot / 12, Color.BLACK);

        g2.dispose();
        g.dispose();
    }

    /**
     * Draw a chronometer hand
     * @param g2 Graphic where the hand will be drawn
     * @param handLength Hand's length
     * @param rotation Hand's rotation value
     * @param color Hand's color
     */
    private void paintHand(Graphics2D g2, float handLength, double rotation, Color color) {
        Shape handShape = new Line2D.Float(0, 0, 0, -handLength);
        g2.setPaint(color);
        g2.draw(AffineTransform.getRotateInstance(rotation).createTransformedShape(handShape));
    }
}
