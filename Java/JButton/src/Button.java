import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.logging.Handler;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Button extends JFrame {

    private JButton reg;
    private JButton custom;

    public Button() {
        super("Creating Buttons");
        setLayout(new FlowLayout());

        reg = new JButton("Regular Button");
        add(reg);

        Icon b = new ImageIcon(getClass().getResource("b.png"));
        Icon x = new ImageIcon(getClass().getResource("x.png"));
        custom = new JButton("Custom Button", b);
        custom.setRolloverIcon(x);
        add(custom);

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }

    private class HandlerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, String.format("You clicked on the %s", actionEvent.getActionCommand()));
        }
    }
}
