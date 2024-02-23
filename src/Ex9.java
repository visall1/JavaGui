
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


class Ex9 extends JFrame implements ActionListener{
    JLabel l;
    JCheckBox b1,b2,b3;
    JButton b;
    Ex9(){
        l=new JLabel("Food Ordering System");
        l.setBounds(50,50,300,20);
        b1= new JCheckBox("Pizza @ 100");
        b1.setBounds(100,100,150,20);
        b2= new JCheckBox("Buger @ 30");
        b2.setBounds(100,150,150,20);
        b3= new JCheckBox("Tea @ 10");
        b3.setBounds(100,200,150,20);
        b= new JButton("Order");
        b.setBounds(100,250,80,30);
        b.addActionListener(this);
        add(l);add(b1);add(b2);add(b3);add(b);    
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg="";
        if(b1.isSelected()){
            amount+=100;
            msg="Pizza : 100\n";
        }
        if(b2.isSelected()){
            amount+=30;
            msg="Buger: 30\n";
        }
        if(b3.isSelected()){
            amount+=10;
            msg="Tea: 10\n";
        }
        msg+="-----------------\n";
        JOptionPane.showMessageDialog(this, msg+"Total: "+amount);
    }
    public static void main(String args[]){
        new Ex9();
    }
    
}