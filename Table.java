import java.awt.*;
public class Table extends Frame{
    Table(){
        setSize(700,500);
        setVisible(true);
        setTitle("FORM");
    }
    public static void main(String[] args){
        Table t = new Table();
    }
    public void paint(Graphics g){
        int k = 20;
        int l = 20;
        for(int i=1;i<=10;i++){
            l = 50;
            for(int j=1;j<=10;j++){
                g.drawString(i+" x " + j +" = " + i*j ,k,l);
                l += 35;
            }
            k += 65;
        }
    }
}