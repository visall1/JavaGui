
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class Example extends JFrame implements ActionListener,MouseListener{
    JLabel lbid,lbfname,lblname,lbDOB,lbadd,lbpro,lbms,lbcountry;
    JTextField txid,txfname,txlname,txDOB,txadd,txpro,txms,txcountry;
    JTable table;
    JButton btnew,btsave,btdelete,btre;
    DefaultTableModel model;
    JMenuBar menubar;
    JComboBox cb;
    Example(){
        JFrame f= new JFrame("Database Application");
        Border border=BorderFactory.createLineBorder(Color.BLUE,1);
        menubar =new JMenuBar();
        f.setJMenuBar(menubar);
        JMenu file=new JMenu("File");
        menubar.add(file);
        JMenuItem newfile=new JMenuItem("New File");
        JMenuItem open =new JMenuItem("Open");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem exit=new JMenuItem("Exit");
        exit.addActionListener(this);
        file.add(newfile);file.add(open);file.add(save);file.add(exit);
        
        JMenu help = new JMenu("Help");
        menubar.add(help);
        JMenuItem about=new JMenuItem("About");
        JMenuItem contact=new JMenuItem("Contact");
        help.add(about);help.add(contact);
        
        this.lbid=new JLabel("Student ID   :");
        this.lbid.setBounds(20,180,90,30);
        this.lbid.setFont(new Font("Serif", Font.PLAIN, 14));
        f.add(lbid);
        
        
        this.txid=new JTextField();
        this.txid.setBounds(150,180,600,30);
        f.add(this.txid);
        
        this.lbfname=new JLabel("First_Name :");
        this.lbfname.setFont(new Font("Serif", Font.PLAIN, 14));
        this.lbfname.setBounds(20,220,90,30);
        f.add(lbfname);
        
        this.txfname=new JTextField();
        this.txfname.setBounds(150,220,600,30);
        f.add(txfname);
       
        
        this.lblname=new JLabel("Last_Name  :");
        this.lblname.setFont(new Font("Serif", Font.PLAIN, 14));
        this.lblname.setBounds(20,260,90,30);
        f.add(lblname);
        
        this.txlname=new JTextField();
        this.txlname.setBounds(150,260,600,30);
        f.add(txlname);
        
        this.lbDOB=new JLabel("Date Of Birth  :");
        this.lbDOB.setFont(new Font("Serif", Font.PLAIN, 14));
        this.lbDOB.setBounds(20,300,90,30);
        f.add(lbDOB);
        
        this.txDOB=new JTextField();
        this.txDOB.setBounds(150,300,600,30);
        f.add(txDOB);
        
        this.lbadd=new JLabel("Address     :");
        this.lbadd.setBounds(20,340,90,30);
        this.lbadd.setFont(new Font("Serif", Font.PLAIN, 14));
        f.add(lbadd);
        
        this.txadd=new JTextField();
        this.txadd.setBounds(150,340,600,30);
        f.add(txadd);
        
        this.lbpro=new JLabel("Programming  :");
        this.lbpro.setBounds(20,380,90,30);
        this.lbpro.setFont(new Font("Serif", Font.PLAIN, 14));
        f.add(lbpro);
        
        this.txpro=new JTextField();
        this.txpro.setBounds(150,380,600,30);
        f.add(txpro);
        
        this.lbms=new JLabel("Marital_Status    : ");
        this.lbms.setBounds(20,420,90,30);
        this.lbms.setFont(new Font("Serif", Font.PLAIN, 14));
        f.add(lbms);
        
        this.txms=new JTextField();
        this.txms.setBounds(150,420,600,30);
        f.add(txms);
        
        this.lbcountry=new JLabel("Country      :");
        this.lbcountry.setBounds(20,460,90,30);
        this.lbcountry.setFont(new Font("Serif", Font.PLAIN, 14));
        f.add(lbcountry);
       
        this.txcountry=new JTextField();
        this.txcountry.setBounds(150,460,600,30);
        f.add(txcountry);
        
      /*  String country[]={"Cambodia","Thailand","USA","Lao","Chinese"};
        final JComboBox cb=new JComboBox(country);
        cb.setBounds(150,460,200,30);
        f.add(cb);*/
        
        String col[]={"ID","First-Name","Last-Name","Date Of Births","Address","Programming","Marital_Status","Country"};
        model=new DefaultTableModel();
        table=new JTable();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        JScrollPane js=new JScrollPane(table);
        js.setBounds(20,20,750,150);
        f.add(js);
        
        btnew = new JButton("New");
        btnew.setBounds(250,510,100,30);
        f.add(this.btnew);
        btdelete = new JButton("Delete");
        btdelete.setBounds(380,510,100,30);
        f.add(btdelete);
        btre = new JButton("Refresh");
        btre.setBounds(510,510,100,30);
        f.add(btre);
        
        btsave = new JButton("Save");
        btsave.setBounds(650,510,100,30);
        btsave.setForeground(new Color(0,0,255));
        f.add(btsave);
        btsave.addActionListener(this);
        btdelete.addActionListener(this);
        
        btsave.setBorder(border);
        f.setResizable(false);
        f.setSize(800,700);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Example();
    }
    void clear(){
        txid.setText("  ");
        txfname.setText("   ");
        txlname.setText("   ");
        txDOB.setText(" ");
        txadd.setText(" ");
        txpro.setText(" ");
        txms.setText("  ");
        txcountry.setText(" ");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.btsave==e.getSource()){
            model.setRowCount(0);
            String id=txid.getText();
            String fname=txfname.getText();
            String lname=txlname.getText();
            String DOB=txDOB.getText();
            String add=txadd.getText();
            String pro=txpro.getText();
            String ms=txms.getText();
           String country=txcountry.getText();
           //String country=(String) cb.getItemAt(cb.getSelectedIndex());
            Test_2 T=new Test_2(id,fname,lname,DOB,add,pro,ms,country);
            Test_2.T.add(T);
            for(int i=0;i<Test_2.T.size();i++){
                String idd=Test_2.T.get(i).id;
                String nfn=Test_2.T.get(i).fname;
                String nln=Test_2.T.get(i).lname;
                String dd=Test_2.T.get(i).DOB;
                String ad=Test_2.T.get(i).add;
                String proo=Test_2.T.get(i).pro;
                String mss=Test_2.T.get(i).ms;
                String cun=Test_2.T.get(i).country;
                Object obj[]={idd,nfn,nln,dd,ad,proo,mss,cun};
                model.addRow(obj);
                clear();
            }
        }
        else if(this.btdelete==e.getSource()){
            int row = table.getSelectedRow();
            Test_2.T.remove(row);
            model.removeRow(row);
            clear();
        }else
        {
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       int row=table.getSelectedRow();
       txid.setText(model.getValueAt(row, 0).toString());
       txfname.setText(model.getValueAt(row, 1).toString());
       txlname.setText(model.getValueAt(row, 2).toString());
       txDOB.setText(model.getValueAt(row, 3).toString());
       txadd.setText(model.getValueAt(row, 4).toString());
       txpro.setText(model.getValueAt(row, 5).toString());
       txms.setText(model.getValueAt(row, 6).toString());
       txcountry.setText(model.getValueAt(row, 7).toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}