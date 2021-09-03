import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawGraphics draw = new DrawGraphics();
        f.add(draw);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
