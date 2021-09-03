import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Flowlayout_ extends JFrame {
    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;

    public Flowlayout_() {
        super("Flow Layout");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        // Left button
        lb = new JButton("Left Button");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );

        // Center button
        cb = new JButton("Center Button");
        add(cb);
        cb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );

        // Right button
        rb = new JButton("Right Button");
        add(rb);
        rb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );
    }

}
