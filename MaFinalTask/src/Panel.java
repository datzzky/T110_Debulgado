import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Panel extends JPanel {
    URL url = getClass().getResource("tire.png");
    Image img = new ImageIcon(url).getImage();
    Panel(){
        this.setPreferredSize(new Dimension(500, 500));
    }


    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        AffineTransform old = g2D.getTransform();
        g2D.rotate(Math.toRadians(50));
        //draw shape/image (will be rotated)
        g2D.setTransform(old);
        g2D.drawImage(img,50,50,400,400,this);
    }
}
