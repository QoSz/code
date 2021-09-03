import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawGraphics extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(new Color(51, 51, 51));

        g.setColor(new Color(0, 255, 255));
        g.fill3DRect(25, 50, 50, 50, true);

        g.setColor(new Color(255, 26, 140));
        g.drawString("Hello my is Yash Shah", 25, 150);

        g.setColor(new Color(0, 230, 138));
        g.fill3DRect(80, 50, 50, 50, true);

        g.setColor(Color.RED);
        g.drawLine(30, 30, 60, 60);

        g.setColor(Color.ORANGE);
        g.drawOval(250, 40, 50, 50);
    }

}
