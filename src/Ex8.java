
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;


class Ex8{
    public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20,100,80,30);
        value.setBounds(100,100,100,30);
        f.add(l1);
        f.add(value);
         f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}