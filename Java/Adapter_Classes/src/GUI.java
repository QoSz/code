import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame{
    private String details;
    private JLabel statusbar;

    public GUI() {
        super("Mouse clicks");

        statusbar = new JLabel("This is the default label");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());
    }

    private class MouseClass extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            details = String.format("You clicked %d times ", e.getClickCount());

            if (e.isMetaDown()) {
                details += "with the right mouse button";
            } else if (e.isAltDown()) {
                details += "with the middle mouse button";
            } else {
                details += "with the left mouse button";
            }

            statusbar.setText(details);
        }
    }
}

