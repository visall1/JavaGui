
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ex14 implements ActionListener{
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectALL;
    JTextArea ta;
    Ex14(){
        f=new JFrame();
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectALL = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectALL.addActionListener(this);
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut); edit.add(copy); edit.add(paste); edit.add(selectALL);
        mb.add(file); mb.add(edit); mb.add(help);
        ta = new JTextArea();
        ta.setBounds(5,5,360,320);
        f.add(mb); f.add(ta);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex14();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cut){
            ta.cut();
        }
        if(e.getSource() == paste){
            ta.paste();
        }
        if(e.getSource() == copy){
            ta.copy();
        }
        if(e.getSource() == selectALL){
            ta.selectAll();
        }
    }
    
}
