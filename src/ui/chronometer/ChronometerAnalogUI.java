package ui.chronometer;

import core.Chronometer;
import utils.TimeFormatter;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.nio.file.Paths;

import static utils.ProgramConstant.DIAL_SIZE;

public abstract class ChronometerAnalogUI extends ChronometerUI {
    private Image dial;
    private final Color minuteHandColor;
    private final Color secondHandColor;

    public ChronometerAnalogUI(Chronometer chronometer, String fileName, Color minuteHandColor, Color secondHandColor) {
        super(chronometer);
        dial = Toolkit.getDefaultToolkit().getImage(Paths.get("img/" + fileName).toString());
        //TODO: Vérif que le fichier existe
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
        float r = radius / 6f;
        float secondHandLen = radius - r;
        Shape secondHand = new Line2D.Float(0f, 0f, 0f, -secondHandLen);
        double secondRot = TimeFormatter.getSeconds(getSeconds()) * Math.PI / 30d;
        g2.setPaint(secondHandColor);
        g2.draw(AffineTransform.getRotateInstance(secondRot).createTransformedShape(secondHand));

        // Drawing the minute hand
        float minuteHandLen = radius / 2f;
        Shape minuteHand = new Line2D.Float(0f, 0f, 0f, -minuteHandLen);
        double minuteRot = TimeFormatter.getMinutes(getSeconds()) * Math.PI / 30d;
        g2.setPaint(minuteHandColor);
        g2.draw(AffineTransform.getRotateInstance(minuteRot).createTransformedShape(minuteHand));

        // Drawing the hour hand
        float hourHandLen = radius / 4f;
        Shape hourHand = new Line2D.Float(0f, 0f, 0f, -hourHandLen);
        double hourRot = TimeFormatter.getHours(getSeconds()) * Math.PI / 6d + minuteRot / 12d;
        g2.setPaint(Color.BLACK);
        g2.draw(AffineTransform.getRotateInstance(hourRot).createTransformedShape(hourHand));

        g2.dispose();
        g.dispose();
    }
}
