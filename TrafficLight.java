import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends Frame implements ActionListener{
    MenuItem Red,Yellow,Green;
    int c = 0;
    TrafficLight(){
        setSize(500,500);
        setVisible(true);
        setTitle("Traffic Light");
        setLayout(new FlowLayout());

        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu Traffic = new Menu("Traffic Light");
        mb.add(Traffic);

        Red = new MenuItem("Red");
        Yellow = new MenuItem("Yellow");
        Green = new MenuItem("Green");

        Traffic.add(Red);
        Traffic.add(Yellow);
        Traffic.add(Green);

        Red.addActionListener(this);
        Yellow.addActionListener(this);
        Green.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Red){
            c = 1;
        }
        else if(e.getSource() == Yellow){
            c = 2;
        }
        else if(e.getSource() == Green){
            c = 3;
        }
        repaint();
    }
    public void paint(Graphics g){
        g.drawRect(200,150,50,150);
        g.drawOval(200,150,50,50);
        g.drawOval(200,200,50,50);
        g.drawOval(200,250,50,50);
        if(c == 1){
            g.setColor(Color.red);
            g.fillOval(200,150,50,50);
        }
        else if(c == 2){
            g.setColor(Color.yellow);
            g.fillOval(200,200,50,50);
        }
        else if(c == 3){
            g.setColor(Color.green);
            g.fillOval(200,250,50,50);
        }
    }
    public static void main(String[] args){
        TrafficLight tl = new TrafficLight();
    }
}