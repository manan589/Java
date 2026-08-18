import java.awt.*;
import java.awt.event.*;
public class Mouse extends Frame implements MouseListener{
    int x;
    int y;
    Mouse(){
        setSize(500,500);
        setVisible(true);
        setTitle("Mouse Point");
        addMouseListener(this);
    }
    public void mouseExited(MouseEvent e){
        // setBackground(Color.yellow);
    }
    public void mouseEntered(MouseEvent e){
        // setBackground(Color.orange);
    }
    public void mouseClicked(MouseEvent e){
        // setBackground(Color.red);
        x = e.getX();
        y = e.getY();
        repaint();
    }
    public void mousePressed(MouseEvent e){
        // setBackground(Color.blue);
    }
    public void mouseReleased(MouseEvent e){
        // setBackground(Color.green);
    }
    public void paint(Graphics g){
        g.drawString("("+x+","+y+")",x,y);
    }
    public static void main(String[] args){
        Mouse m = new Mouse();
    }
}