import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkbox_ extends JFrame {
    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public Checkbox_() {
        super("The check boxes");
        setLayout(new FlowLayout());

        tf = new JTextField("This is a text field", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 20));
        add(tf);

        boldbox = new JCheckBox("Bold");
        italicbox = new JCheckBox("Italics");
        add(boldbox);
        add(italicbox);

        HandlerClass handler = new HandlerClass();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);
    }

    private class HandlerClass implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            Font font;

            if (boldbox.isSelected() && italicbox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
            } else if (boldbox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 20);
            } else if (italicbox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 20);
            } else {
                font = new Font("Serif", Font.PLAIN, 20);
            }

            tf.setFont(font);
        }
    }
}
