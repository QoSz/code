import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JFrame{
    private JList leftlist;
    private JList rightlist;
    private JButton move;
    private String[] foods = {"Paneer", "Pizza", "Chips", "Pasta", "Rice"};

    public GUI() {
        super("LOL");
        setLayout(new FlowLayout());

        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        move = new JButton("Move ---->");
        move.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        rightlist.setListData(leftlist.getSelectedValuesList().toArray());
                    }
                }
        );
        add(move);

        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellHeight(20);
        rightlist.setFixedCellWidth(400);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));
    }
}
