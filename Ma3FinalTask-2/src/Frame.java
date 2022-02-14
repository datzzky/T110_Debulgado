import javax.swing.*;
import java.awt.*;

public class Frame  extends JFrame {
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton bsIT = new JRadioButton("BSIT");
    JRadioButton bsEMC = new JRadioButton("BSEMC");
    JRadioButton msIT = new JRadioButton("MSIT");
    JLabel helloGUI = new JLabel("Hello GUI");
    JLabel label = new JLabel("This a Java Swing Program");
    JButton redButton = new JButton("Red Team");
    JButton blueButton = new JButton("Blue Team");
    JTextField textField = new JTextField();
    JPasswordField pswrdField = new JPasswordField();
    Font font = new Font(Font.SERIF,Font.PLAIN,12);

    public Frame(){
        String[] college = {"BSIT", "BSEMC", "MSIT"};
        JComboBox comboBox = new JComboBox(college);
        setBounds(300, 150, 250,300);
        this.setLayout(null);

        int x = 12,y = 10,w = 70,h =12;
        bsIT.setBounds(x, y, w, h);
        bsIT.setSelected(true);
        bsEMC.setBounds(x+w, y, w, h);
        msIT.setBounds(x+w+w, y, w, h);
        helloGUI.setBounds(x,y+35,w,h);
        textField.setBounds(x+w,y+30,w,h+8);
        pswrdField.setBounds(x+w+w+3,y+30,w,h+8);
        label.setBounds(x+20,y+60,w*3,h+18);
        redButton.setBounds(x,y+90,w+30,h+18);
        blueButton.setBounds(x+105,y+90,w+30,h+18);
        comboBox.setBounds(x+w,y+140,w,h+18);

        this.add(bsIT);
        this.add(bsEMC);
        this.add(msIT);
        this.add(helloGUI);
        this.add(textField);
        this.add(pswrdField);
        this.add(label);
        this.add(redButton);
        this.add(blueButton);
        this.add(comboBox);

        bsIT.setFont(font);
        bsEMC.setFont(font);
        msIT.setFont(font);

        buttonGroup.add(bsIT);
        buttonGroup.add(bsEMC);
        buttonGroup.add(msIT);

        helloGUI.setForeground(Color.white);
        bsIT.setForeground(Color.white);
        bsEMC.setForeground(Color.white);
        msIT.setForeground(Color.white);
        label.setForeground(Color.white);
        redButton.setForeground(Color.white);
        blueButton.setForeground(Color.white);

        bsIT.setBackground(Color.DARK_GRAY);
        bsEMC.setBackground(Color.DARK_GRAY);
        msIT.setBackground(Color.DARK_GRAY);
        blueButton.setBackground(Color.BLUE);
        redButton.setBackground(Color.RED);
    }


}
