import java.awt.*;
public class ImagesGUI extends Frame{
    ImagesGUI(){
        setSize(500,300);
        setVisible(true);
        setTitle("Images");
    }
    public static void main(String[] args){
        ImagesGUI ig = new ImagesGUI();
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawRect(200,100,100,100);    // make Rectangle
        g.fillRect(200,100,100,100);

        g.setColor(Color.red);
        g.drawOval(200,100,100,100);    // make Circle
        g.fillOval(200,100,100,100);

        g.setColor(Color.black);
        g.drawLine(250,100,250,200);    // make Line
        g.drawLine(200,150,300,150);    // make Line
    }
}