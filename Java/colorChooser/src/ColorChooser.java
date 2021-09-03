import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser extends JFrame {

    private JButton b;
    private Color color = Color.WHITE;
    private JPanel panel;

    public ColorChooser() {
        super("Background Color picker");
        panel = new JPanel();
        panel.setBackground(color);

        b = new JButton("Pick a background color");
        b.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        color = JColorChooser.showDialog(null, "Pick a background color", color);
                        if (color == null)
                            color = Color.WHITE;

                        panel.setBackground(color);
                    }
                }
        );

        add(panel, BorderLayout.CENTER);
        add(b, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }
}