import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GUI extends JFrame {
    private JPanel mousepanel;
    private JLabel statusbar;

    public GUI() {
        super("Mouse Events");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }

    public class HandlerClass implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            statusbar.setText(String.format("Clicked at %d, %d", mouseEvent.getX(), mouseEvent.getY()));
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {
            statusbar.setText("You pressed down the mouse");
        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {
            statusbar.setText("You released the button");
        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {
            statusbar.setText("You entered the area");
            mousepanel.setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {
            statusbar.setText("The mouse has left the window");
            mousepanel.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent mouseEvent) {
            statusbar.setText("You are dragging the mouse");
        }

        @Override
        public void mouseMoved(MouseEvent mouseEvent) {
            statusbar.setText("You moved the mouse");
        }
    }
}
