import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String[] accessories  = {"Charing Cable", "HDMI Cable", "Power Cable", "Controller", "Hard drive"};
        Playstation p = new Playstation("Black", 3.13, accessories);
        System.out.println(p.getColor());
        System.out.println(p.getWeight());
        for (int i = 0; i < accessories.length; i++) {
            System.out.println(p.getAccessories()[i]);
        }
        p.powerOff();
        System.out.println(p.getPower());
        p.isStreaming();
        System.out.println(p.getPower());
    }
}
