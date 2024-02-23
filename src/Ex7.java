
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


class Ex7{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("Welcome to ETEC I.T Professional");
        JLabel lbl=new JLabel("Result:");
        lbl.setBounds(20, 20, 100, 30);
        area.setBounds(100, 30, 200, 200);
        f.add(lbl);
        f.add(area);
        f.setSize(400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
