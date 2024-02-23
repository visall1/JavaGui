

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student extends JFrame implements ActionListener,MouseListener{
    JLabel lbid,lbname,lbsex,lbscore,lbtitle;
    JTextField txid,txname,txsex,txscore;
    JButton btsave,btupdate,btdelete,btLogout;
    JTable table;
    DefaultTableModel model;
    Student(){
        lbtitle = new JLabel("Student");
        lbtitle.setBounds(300,20,250,30);
        lbtitle.setFont(new Font("Gigi",Font.LAYOUT_NO_LIMIT_CONTEXT,48));
        add(lbtitle);
        
        lbid = new JLabel("Student_ID       :");
        lbid.setBounds(50,100,100,30);
        add(lbid);
        txid = new JTextField();
        txid.setBounds(170,100,200,30);
        add(txid);
        
        lbname = new JLabel("Student_NAME :");
        lbname.setBounds(50,150,100,30);
        add(lbname);
        txname = new JTextField();
        txname.setBounds(170,150,200,30);
        add(txname);
        
        lbsex = new JLabel("Student_Gender:");
        lbsex.setBounds(50,200,100,30);
        add(lbsex);
        txsex = new JTextField();
        txsex.setBounds(170,200,200,30);
        add(txsex);
        
        lbscore = new JLabel("Student_Score:");
        lbscore.setBounds(50,250,100,30);
        add(lbscore);
        txscore = new JTextField();
        txscore.setBounds(170,250,200,30);
        add(txscore);
        
        btsave= new JButton("Save As");
        btsave.setBounds(50,300,100,30);
        add(btsave);
        
        btupdate= new JButton("Update");
        btupdate.setBounds(180,300,100,30);
        add(btupdate);
        
        btdelete= new JButton("Delete");
        btdelete.setBounds(310,300,100,30);
        add(btdelete);
        
        btLogout= new JButton("Exit");
        btLogout.setBounds(440,300,100,30);
        btLogout.addActionListener(this);
        add(btLogout);
        
       String col[]={"Student_ID","Student_Name","Student_Gender","Student_Score"};
        model = new DefaultTableModel();
        table= new JTable();
        model.setColumnIdentifiers(col);
        table.setModel(model); 
        
        btdelete.addActionListener(this);
        btupdate.addActionListener(this);
        btsave.addActionListener(this);
        btLogout.addActionListener(this);
        table.addMouseListener(this);
        
        JScrollPane js=new JScrollPane(table);
        js.setBounds(50,350,700,250);
        add(js);
        setSize(800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter(){
            public void windowclosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Student stu = new Student();
    }
    void clear(){
        txid.setText("  ");
        txname.setText("  ");
        txsex.setText("  ");
        txscore.setText("  ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(btsave== e.getSource()){
            model.setRowCount(0);
            String id=txid.getText();
            String name=txname.getText();
            String sex=txsex.getText();
            float score=Float.parseFloat(txscore.getText());
            Students stu = new Students(id,name,sex,score);
            Students.stu.add(stu);
            for(int i=0;i<Students.stu.size();i++){
                String idd=Students.stu.get(i).id;
                String nn=Students.stu.get(i).name;
                String ss=Students.stu.get(i).sex;
                float sc= Students.stu.get(i).score;
                Object obj[]={idd,nn,ss,sc};
                model.addRow(obj);
                clear();
            }
        }else if(btupdate == e.getSource()){
            int n  = table.getSelectedRow();
            String id =txid.getText();
            String name=txname.getText();
            String sex=txsex.getText();
            float score=Float.parseFloat(txscore.getText());
            
            model.setValueAt(id, n, 0);
            model.setValueAt(name, n, 1);
            model.setValueAt(sex, n, 2);
            model.setValueAt(score, n, 3);
            clear();
        }else if(btdelete==e.getSource()){
            int row = table.getSelectedRow();
            Students.stu.remove(row);
            model.removeRow(row);
            clear();
        }else{
           System.exit(0);
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int row=table.getSelectedRow();
        txid.setText(model.getValueAt(row, 0).toString());
        txname.setText(model.getValueAt(row, 1).toString());
        txsex.setText(model.getValueAt(row, 2).toString());
        txscore.setText(model.getValueAt(row, 3).toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}