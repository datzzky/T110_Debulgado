import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    Panel panel;
    public Window(){
        panel = new Panel();
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }


}
