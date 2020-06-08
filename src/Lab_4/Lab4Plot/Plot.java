package Lab_4.Lab4Plot;

import Lab_4.MBeans.Shot;
import Lab_4.MBeans.Square;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;

public class Plot extends JFrame {
    private static Shot shot;
    private static Square square;

    public static void setShot(Shot sht) {
        shot = sht;
    }

    public static void setSquare(Square sqr) {
        square = sqr;
    }

    private JSlider slider = new JSlider(5, 200, 100);
    private JPanel pan = new JPanel();
    private int radius = slider.getValue();

    public Plot(int w, int h, String title) {
        this.setSize(w, h);
        this.setTitle(title);
        JPanel panel = new JPanel() {
            public void paint(Graphics graphics) {
                graphics.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
                graphics.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
                int[] x = {getWidth() / 2 - radius, getWidth() / 2, getWidth() / 2, getWidth() / 2 - radius, getWidth() / 2 - radius};
                int[] y = {getHeight() / 2 + radius / 2, getHeight() / 2 + radius / 2, getHeight() / 2 - radius, getHeight() / 2, getHeight() / 2 + radius / 2};
                graphics.drawPolygon(x, y, 5);
                graphics.drawArc(getWidth() / 2 - radius / 2, getHeight() / 2 - radius / 2, radius, radius, 0, 90);
                graphics.fillPolygon(x, y, 5);
                graphics.fillArc(getWidth() / 2 - radius / 2, getHeight() / 2 - radius / 2, radius, radius, 0, 90);
            }
        };

        setLayout(new BorderLayout());
        pan.add(slider);
        add(pan, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                radius = slider.getValue();
                repaint();
                square.calcSquare(radius);
            }
        });
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                square.calcSquare(radius);
                int[] x = {panel.getWidth() / 2 - radius, panel.getWidth() / 2, panel.getWidth() / 2, panel.getWidth() / 2 - radius, panel.getWidth() / 2 - radius};
                int[] y = {panel.getHeight() / 2 + radius / 2, panel.getHeight() / 2 + radius / 2, panel.getHeight() / 2 - radius, panel.getHeight() / 2, panel.getHeight() / 2 + radius / 2};
                Polygon polygon = new Polygon(x, y, 5);
                Shape arc = new Arc2D.Float(panel.getWidth() / 2 - radius / 2, panel.getHeight() / 2 - radius / 2, radius, radius, 0, 90, 2);
                Area area = new Area(arc);
                Graphics graph = panel.getGraphics();
                if ((polygon.contains(e.getPoint().x, e.getPoint().y)) | (area.contains(e.getPoint().x, e.getPoint().y))) {
                    shot.addPoint(false);
                    graph.setColor(new Color(7, 255, 0));
                    graph.drawOval(e.getPoint().x, e.getPoint().y, 3, 3);
                } else {
                    shot.addPoint(true);
                    graph.setColor(new Color(255, 0, 0));
                    graph.drawOval(e.getPoint().x, e.getPoint().y, 3, 3);
                }

            }
        });
    }
}
