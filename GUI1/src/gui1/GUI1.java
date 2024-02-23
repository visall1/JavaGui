package gui1;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

class Test extends JFrame{
    Test(){
        ImageIcon icon = new ImageIcon("BB.jpg");
        this.setIconImage(icon.getImage());
        getContentPane().setBackground(new Color(0x12345));
        
        this.setTitle("Hello_World");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}