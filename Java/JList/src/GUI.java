import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;
import java.awt.FlowLayout;

public class GUI extends JFrame{
    // Initializing variables
    private JList<String> list;
    private Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

    // Setting up the default constructor
    public GUI() {
        super("List of Colors");
        setLayout(new FlowLayout());

        // Creating a new list and setting the visible rows in the list and only allowing one thing to be
        // selected from the list. Then adding the list to the screens display window.
        String[] colornames = {"Black", "Blue", "Red", "White"};
        list = new JList<>(colornames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        // Adding an Listener to perform some actions when one of the options on the list has been selected.
        list.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent listSelectionEvent) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                    }
                }
        );
    }
}
