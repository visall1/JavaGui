
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


class Ex10 extends JFrame implements ActionListener{
    JRadioButton rb1,rb2;
    JButton b;
    Ex10(){
        rb1=new JRadioButton("Male");
        rb1.setBounds(100,50,100,30);
        rb2=new JRadioButton("Female");
        rb2.setBounds(100,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1); bg.add(rb2);
        b=new JButton("click");
        b.setBounds(100,150,80,30);
        b.addActionListener(this);
        add(rb1);add(rb2);add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex10();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(rb1.isSelected()){
            JOptionPane.showMessageDialog(this, "You are Male.");
        }
        if(rb2.isSelected()){
            JOptionPane.showMessageDialog(this, "You are Female.");
        }
    }
    
}