import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButton_ extends JFrame {
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;

    public RadioButton_() {
        super("Radio Buttons");
        setLayout(new FlowLayout());

        // Adding text field to window
        tf = new JTextField("Buck is awesome", 20);
        add(tf);

        // Creating the fonts to be used
        pf = new Font("Serif", Font.PLAIN, 20);
        bf = new Font("Serif", Font.BOLD, 20);
        itf = new Font("Serif", Font.ITALIC, 20);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
        tf.setFont(pf);

        // Adding the radio buttons to the window
        pb = new JRadioButton("Plain Button", true);
        bb = new JRadioButton("Bold Button", true);
        ib = new JRadioButton("Italic Button", true);
        bib = new JRadioButton("Bold and Italic Button", true);
        add(pb);
        add(bb);
        add(ib);
        add(bib);

        // Grouping the buttons so it knows which button has been selected.
        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        // Adding an actions when the button is clicked
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
    }

    private class HandlerClass implements ItemListener {
        private Font font;

        public HandlerClass(Font f) {
            font = f;
        }

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            tf.setFont(font);
        }
    }
}
