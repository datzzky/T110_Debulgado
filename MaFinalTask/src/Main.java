import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[]args){
        Window window = new Window();
        window.setTitle("Spinning Tire");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
    }
}
