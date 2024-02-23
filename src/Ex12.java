
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


class DemoSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Table Example");
        String data[][]={ {"101","Amit","670000"},
                        {"102","Jal","870000"},
                        {"103","Sachin","770000"}};
                    String column[]={"ID","Name","Salary"};
                    final JTable jt=new JTable(data,column);
    jt.setCellSelectionEnabled(true);
    ListSelectionModel select=jt.getSelectionModel();
    select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    select.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String Data = null;
                int [] row = jt.getSelectedRows();
                int [] column =jt.getSelectedColumns();
                for(int i = 0;i<row.length;i++){
                    for(int j=0;j<column.length;j++){
                        Data = (String) jt.getValueAt(row[i], column[j]);
                    }
                }
                System.out.println("Table element selected is :"+ Data);
            }
        
    });
    JScrollPane sp =new JScrollPane(jt);
    f.add(sp);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(300,300);
    f.setVisible(true);
    f.pack();
                        
                
    }
}