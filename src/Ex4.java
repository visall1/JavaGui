
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class Ex4 extends JFrame{
    JLabel lbid,lbname,lbgender,lbscore,lbtitle;
    JTextField txtid,txtname,txtgender,txtscore;
    JButton btsave,btupdate,btdelete,btexit,btref;
    JTable table;
    DefaultTableModel model;
    Ex4(){
        lbtitle= new JLabel("Student");
        lbtitle.setBounds(300,30,500,30);
        lbtitle.setFont(new Font("Al Bayan",Font.LAYOUT_NO_LIMIT_CONTEXT,30));
        add(lbtitle);
        
        lbid = new JLabel("Student ID : ");
        lbid.setBounds(50, 100, 100, 40);
        add(lbid);
        txtid=new JTextField();
        txtid.setBounds(150, 100, 200, 30);
        add(txtid);
        
        lbname = new JLabel("Name : ");
        lbname.setBounds(50, 150, 100, 40);
        add(lbname);
        txtname=new JTextField();
        txtname.setBounds(150, 150, 200, 30);
        add(txtname);
        
        lbgender = new JLabel("Gender : ");
        lbgender.setBounds(50, 200, 100, 40);
        add(lbgender);
        txtgender=new JTextField();
        txtgender.setBounds(150, 200, 200, 30);
        add(txtgender);
        
        lbscore = new JLabel("Score : ");
        lbscore.setBounds(50, 250, 100, 40);
        add(lbscore);
        txtscore=new JTextField();
        txtscore.setBounds(150, 250, 200, 30);
        add(txtscore);
        
        btsave=new JButton("Save");
        btsave.setBounds(50, 300, 100, 30);
        btsave.setFocusable(false);
        add(btsave);
        
        btupdate=new JButton("Update");
        btupdate.setBounds(200, 300, 100, 30);
        btupdate.setFocusable(false);
        add(btupdate);
        
        btdelete=new JButton("Delete");
        btdelete.setBounds(350, 300, 100, 30);
        btdelete.setFocusable(false);
        add(btdelete);
        
        btexit=new JButton("Exit");
        btexit.setBounds(500, 300, 100, 30);
        btexit.setFocusable(false);
        add(btexit);
        
        String col[]={"Student-ID","Name","Gender","Score"};
        model=new DefaultTableModel();
        table= new JTable();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        
        JScrollPane js=new JScrollPane(table);
        js.setBounds(50, 350, 700, 250);
        add(js);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,700);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Ex4 e = new Ex4();
    }
}