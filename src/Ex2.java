import java.awt.*;
class AWTFisPro extends Frame{
    AWTFisPro(){
        TextField tf1,tf2,tf3;
        Button b1,b2;
       Label lb1,lb2,lb3;
       lb1= new Label("Input A:");
       lb1.setBounds(10, 50, 100,20);
       
       tf1=new TextField();
       tf1.setBounds(100,50,150,20);
       
       lb2=new Label("Input B:");
       lb2.setBounds(10,100,100,20);
       
       tf2=new TextField();
       tf2.setBounds(100,100,150,20);
       
       lb3=new Label("Result:");
       lb3.setBounds(10,150,100,20);
       tf3=new TextField();
       tf3.setBounds(100,150,150,20);
       tf3.setEditable(false);
       b1=new Button("Sum");
       b1.setBounds(50,200,50,50);
       b2=new Button("Sub");
       b1.setBounds(120,200,50,50);
       add(lb1);add(lb2);add(lb3);
       add(tf1);add(tf2);add(tf3);add(b1);add(b2);
       setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        AWTFistPro f= new AWTFistPro();
    }
    
}
