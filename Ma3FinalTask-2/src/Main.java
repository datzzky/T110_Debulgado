import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[]args){
        Frame frame = new Frame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setTitle("Hello GUI");
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
