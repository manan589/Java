import java.awt.*;
import java.awt.event.*;
public class Figures extends Frame implements ItemListener{
    CheckboxGroup group;
    Checkbox circle,rectangle,oval,line;

    String figure = "Circle";
    Figures(){
        setSize(500,500);
        setTitle("Figures");
        setVisible(true);

        setLayout(new FlowLayout());
        group = new CheckboxGroup();

        circle = new Checkbox("Circle",group,true);
        rectangle = new Checkbox("Rectangle",group,false);
        oval = new Checkbox("Oval",group,false);
        line = new Checkbox("line",group,false);

        circle.addItemListener(this);
        rectangle.addItemListener(this);
        oval.addItemListener(this);
        line.addItemListener(this);

        add(circle);
        add(rectangle);
        add(oval);
        add(line);
    }
    public void itemStateChanged(ItemEvent e){
        Checkbox selected = group.getSelectedCheckbox();
        figure = selected.getLabel();
        repaint();
    }
    public static void main(String[] args){
        Figures f = new Figures();
    }
    public void paint(Graphics g){
        super.paint(g);
        if(figure.equals("Circle")){
            g.drawOval(200,100,150,150);
        }
        else if(figure.equals("Rectangle")){
            g.drawRect(200,100,150,200);
        }
        else if(figure.equals("Oval")){
            g.drawOval(200,100,200,100);
        }
        else if(figure.equals("line")){
            g.drawLine(200,200,300,300);
        }
    }
}