import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Enter your first number here: ");
        String sn = JOptionPane.showInputDialog("Enter your second number here: ");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The answer is: " + sum, "The Answer", JOptionPane.PLAIN_MESSAGE);
    }
}
