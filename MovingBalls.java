import java.awt.*;

public class MovingBalls extends Frame implements Runnable{
    Thread t1,t2,t3,t4;
    int x1 = 100,y1 = 100;
    int x2 = 300,y2 = 100;
    int x3 = 150,y3 = 300;
    int x4 = 500,y4 = 300;

    int dx1 = 3, dy1 = 2;
    int dx2 = -3, dy2 = 2;
    int dx3 = 3, dy3 = -2;
    int dx4 = -3, dy4 = -2;
    MovingBalls(){
        setSize(700,450);
        setTitle("Moving Balls");
        setVisible(true);

        t1 = new Thread(this);
        t2 = new Thread(this);
        t3 = new Thread(this);
        t4 = new Thread(this);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
    public void run(){
        Thread t = Thread.currentThread();
        while(true){
            if(t == t1){
                x1 = x1 + dx1;
                y1 = y1 + dy1;

                while(x1 <= 0 || x1+30 >= getWidth()){
                    dx1 = -dx1;
                }
                while(y1 <= 30 || y1+30 >= getHeight()){
                    dy1 = -dy1;
                }
            }
            else if(t == t2){
                x2 = x2 + dx1;
                y2 = y2 + dy2;

                while(x2 <= 0 || x2+30 >= getWidth()){
                    dx2 = -dx2;
                }
                while(y2 <= 30 || y2+30 >= getHeight()){
                    dy2 = -dy2;
                }
            }
            else if(t == t3){
                x3 = x3 + dx3;
                y3 = y3 + dy3;

                while(x3 <= 0 || x3+30 >= getWidth()){
                    dx3 = -dx3;
                }
                while(y3 <= 30 || y3+30 >= getHeight()){
                    dy3 = -dy3;
                }
            }
            else if(t == t4){
                x4 = x4 + dx4;
                y4 = y4 + dy4;

                while(x4 <= 0 || x4+30 >= getWidth()){
                    dx4 = -dx4;
                }
                while(y4 <= 30 || y4+30 >= getHeight()){
                    dy4 = -dy4;
                }
            }
            repaint();
            try {
                    Thread.sleep(30);
            }
            catch (Exception e) {
                break;
            }
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.drawOval(x1,y1,30,30);

        g.setColor(Color.blue);
        g.drawOval(x2,y2,30,30);

        g.setColor(Color.green);
        g.drawOval(x3,y3,30,30);

        g.setColor(Color.orange);
        g.drawOval(x4,y4,30,30);
    }
    public static void main(String[] args){
        MovingBalls mb = new MovingBalls();
    }
}