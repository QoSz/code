import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Message extends JFrame {
    private JLabel item1;

    public Message() {
        super("The Title Bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a sentence");
        item1.setToolTipText("This message shows up on hover.");
        add(item1);
    }
}
