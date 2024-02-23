
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame implements ActionListener{
    JTextField txemail,txpass;
    JLabel lbemail,lbpass,lbtitle;
    JButton btLogin,btexit;
    JPasswordField txpas;
    public Login(){
        lbtitle = new JLabel("Login");
        lbtitle.setBounds(200,20,500,30);
        lbtitle.setFont(new Font("MV Boli",Font.PLAIN,30));
        add(lbtitle);
        
        lbemail=new JLabel("Email : ");
        lbemail.setBounds(50,100,50,30);
        add(lbemail);
        txemail= new JTextField();
        txemail.setBounds(150,100,200,30);
        add(txemail);
        
        lbpass= new JLabel("Password : ");
        lbpass.setBounds(50,150,200,30);
        add(lbpass);
        
        txpass=new JTextField();
        txpass.setBounds(150,150,200,30);
        add(txpass);
        
        btLogin = new JButton("Login");
        btLogin.setBounds(150,200,80,30);
        add(btLogin);
        
        btexit = new JButton("Exit");
        btexit.setBounds(270,200,80,30);
        add(btexit);
        
        btexit.addActionListener(this);
        btLogin.addActionListener(this);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btLogin){
            String email=txemail.getText();
            String pass=txpass.getText();
            if(email.equals("Hello")){
                if(pass.equals("123")){
                    Student.main(null);
                    dispose();
                }else{
                    JOptionPane.showInputDialog("Error password...!");
                }
            }else{
                JOptionPane.showInputDialog("Error Email...!");
            }
        }else{
            System.exit(0);
        }
    }
    
}