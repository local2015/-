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


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mause implements MouseListener,MouseMotionListener {

    boolean flag;
    public Point Nah;
    public Point Con;

    int chetchicstrok;
    double po[][]= new double [10][3];

    Mause(){
        flag=false;
        Nah = new Point();
        Con = new Point();
    }


    @Override
    public void mousePressed(MouseEvent e) {
        Nah=e.getPoint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Con=e.getPoint();
        //System.out.println(Nah+Con.toString());
       look();
    }

    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()>1){
        }
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}

    public void look(){
        po[chetchicstrok][0]=Nah.getX();
        po[chetchicstrok][1]=Nah.getY();
        po[chetchicstrok][2]=Con.getX();
        po[chetchicstrok][3]=Con.getY();
        System.out.println(po[chetchicstrok][1]);
        //chetchicstrok++;
    }

}
