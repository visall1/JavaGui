
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.plaf.TableUI;
import javax.swing.table.DefaultTableModel;


public class Test extends JFrame {
    JLabel lbid,lbname,lbprice,lbqty,lbtotal,lbtitle;
    JTextField txid,txname,txprice,txqty,txtotal;
    JButton btsave,btupdate,btdelete,btexit;
    JTable ttable;
    DefaultTableModel model;
    Test(){
        lbtitle = new JLabel("Mart Project");
        lbtitle.setBounds(350,20,250,30);
        lbtitle.setFont(new Font("null",Font.LAYOUT_NO_LIMIT_CONTEXT,20));
        add(lbtitle);
        
        lbid = new JLabel("Code :");
        lbid.setBounds(50,80,100,30);
        txid = new JTextField();
        txid.setBounds(100,80,200,30);
        add(txid);
        add(lbid);
        
        lbname = new JLabel("Name :");
        lbname.setBounds(50,120,100,30);
        txname = new JTextField();
        txname.setBounds(100,120,200,30);
        add(txname);
        add(lbname);
        
        lbqty = new JLabel("Qautity :");
        lbqty.setBounds(50,160,100,30);
        txqty = new JTextField();
        txqty.setBounds(100,160,200,30);
        add(txqty);
        add(lbqty);
        
        lbprice = new JLabel("Price :");
        lbprice.setBounds(50,200,100,30);
        txprice = new JTextField();
        txprice.setBounds(100,200,200,30);
        add(txprice);
        add(lbprice);
        
        btsave = new JButton("Save");
        btsave.setBounds(100,250,100,30);
        add(btsave);
        
        btupdate = new JButton("Update");
        btupdate.setBounds(220,250,100,30);
        add(btupdate);
        
        btdelete = new JButton("Delete");
        btdelete.setBounds(340,250,100,30);
        add(btdelete);
        
        btexit = new JButton("Exit");
        btexit.setBounds(460,250,100,30);
        add(btexit);
        
        String col[] = {"Code","Name","Qty","Price","Total"};
        model = new DefaultTableModel();
        ttable = new JTable();
        model.setColumnIdentifiers(col);
        ttable.setModel(model);
        
        JScrollPane js = new JScrollPane(ttable);
        js.setBounds(10,300,700,400);
        add(js);
        
        
        setSize(800,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
    }
    public static void main(String[] args) {
        new Test();
    }
}