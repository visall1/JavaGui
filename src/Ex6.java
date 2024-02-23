
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class Ex6{
    public static void main(String[] args) {
        JFrame f= new JFrame("TextField Example");
        JTextField t1,t2,t3;
        JLabel lb1,lb2,lb3;
        JButton bt1,bt2,bt3;
        lb1 = new JLabel("Input A: ");
        lb1.setBounds(10,50,90,30);
        f.add(lb1);
        t1 = new JTextField("Input A:");
        t1.setBounds(100,50,200,30);
        f.add(t1);
        
        lb2 = new JLabel("Input B: ");
        lb2.setBounds(10,100,90,30);
        t2 = new JTextField("Input B:");
        t2.setBounds(100,100,200, 30);
        f.add(t2);
        f.add(lb2);
        
        lb3 = new JLabel("Result : ");
        lb3.setBounds(10,150,90,30);
        t3 = new JTextField("Result : ");
        t3.setBounds(100,150,200,30);
        f.add(t3);
        f.add(lb3);
        
        bt1 = new JButton("CAl");
        bt1.setBounds(30,200,80,30);
        f.add(bt1);
        
        bt2 = new JButton("CLEAR");
        bt2.setBounds(150, 200, 80, 30);
        f.add(bt2);
        
        bt3 = new JButton("Exit");
        bt3.setBounds(270,200,80,30);
        f.add(bt3);
        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}