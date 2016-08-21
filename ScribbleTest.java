import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ScribbleTest {
    JFrame f;
    JPanel p;

    public void init(){
        f=new JFrame();
        p = new JPanel();
        f.setSize(500,500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        p.setSize(500,500);
        p.setBounds(0,0,500,500);
        p.setBackground(Color.cyan);
        f.add(p);
        f.setVisible(true);
    }

    public void run(){
     p.addMouseListener(new Mause());
    }


    public static void main(String[] args){
        ScribbleTest scribbletest = new ScribbleTest();
        scribbletest.init();
        scribbletest.run();
    }
}
