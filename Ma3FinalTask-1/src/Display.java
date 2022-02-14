import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame implements ActionListener {
private String t1, t2, t3, t4, t5;//this variables are use to store temporary value from jtextfield
    JButton button = new JButton("Get Average");
    JLabel error = new JLabel();
    JTextField txtBox1 = new JTextField();
    JTextField txtBox2 = new JTextField();
    JTextField txtBox3 = new JTextField();
    JTextField txtBox4 = new JTextField();
    JTextField txtBox5 = new JTextField();
    JTextField avgTxtBox = new JTextField();
    public Display(){
        super("Average Calculator");//
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 500, 500);
        setLayout(null);

        int x = 200,y = 40, h = 30, w = 50;//the value inside this variable will be use later
        /* this is to make the components flexible in value*/
        JLabel label = new JLabel("Enter your grades Bellow");
        label.setBounds(170,10,200,30);
        this.add(label);

 //here the textBox bounds are set
        txtBox1.setBounds(x,y,w,h);
        txtBox2.setBounds(x,y+40,w,h);
        txtBox3.setBounds(x,y+80,w,h);
        txtBox4.setBounds(x,y+120,w,h);
        txtBox5.setBounds(x,y+160,w,h);
//and here the components will be added to the frame
        this.add(txtBox1);
        this.add(txtBox2);
        this.add(txtBox3);
        this.add(txtBox4);
        this.add(txtBox5);


//this block of code here is the output section of calculated average value
        JLabel avgLabel = new JLabel("Average: ");
        avgLabel.setBounds(170,240,200,30);
        avgTxtBox.setBounds(230,240,w,h);
        avgTxtBox.setEditable(false);
        this.add(avgLabel);
        this.add(avgTxtBox);

        error.setBounds(150, 350, 500, 30);
        error.setForeground(Color.RED);
        this.add(error);

        button.setBounds(x-30,y+240, 120, 30);
        button.setFocusPainted(false);
        this.add(button);
        button.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent onClick){
        float average = 0;
        error.setVisible(false);
        avgTxtBox.setText("...");
    if(onClick.getSource() == button){
/*this action will be perform once the button is click.
* the try catch is use to catch error during the run time especially field that the user did not fill in
* and triggers numberFormat exception*/
        try{
                t1 = txtBox1.getText();
                float a = Float.parseFloat(t1);
                t2 = txtBox2.getText();
                float b = Float.parseFloat(t2);
                t3 = txtBox3.getText();
                float c = Float.parseFloat(t3);
                t4 = txtBox4.getText();
                float d = Float.parseFloat(t4);
                t5 = txtBox5.getText();
                float e = Float.parseFloat(t5);
                if(a > 5||b>5||c>5||d>5||e>5||a<1||b<1||c<1||d<1||e<1){
          //this condition is use to validate if the data enter by the user is 5> 0r <1
                    error.setText("ERROR! value should not Greater than 5 or Less than 1");
                    error.setVisible(true);
                }else{
          //if the data is correct then the required calculation will be perform
                    average = (a+b+c+d+e)/5;
                    avgTxtBox.setText(String.valueOf(average));
                }
            }catch (NumberFormatException e){
                error.setText("ERROR!    ERROR!    ERROR!");
                error.setVisible(true);
            }
        }
    this.add(avgTxtBox);
    }
}
