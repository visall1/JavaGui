
import java.awt.Frame;
import javax.swing.JFrame;

class Test5 extends Frame{
    Test5(){
       JFrame J = new JFrame();
       J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setSize(800,700);
        J.setLayout(null);
        J.setVisible(true);
        J.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Test5();
    }
}