import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"b.png", "x.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};

    public GUI() {
        super("Combo Boxes");
        setLayout(new FlowLayout());
        box = new JComboBox(filename);

        box.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent itemEvent) {
                        if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                            picture.setIcon(pics[box.getSelectedIndex()]);
                        }
                    }
                }
        );
        add(box);
        picture = new JLabel(pics[0]);
        add(picture);
    }
}
