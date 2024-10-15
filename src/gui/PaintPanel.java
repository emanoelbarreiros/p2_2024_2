package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

public class PaintPanel {
    private JPanel panel;

    private List<Point> pontos = new ArrayList<Point>();

    public PaintPanel() {
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                pontos.add(e.getPoint());

                Graphics g = panel.getGraphics();
                for (Point p : pontos) {
                    g.fillOval(p.x, p.y, 10, 10);
                }
            }
        });
    }

    public JPanel getPanel() { return panel; }
}
