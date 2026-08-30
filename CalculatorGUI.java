import java.awt.*;
import java.awt.event.*;
public class CalculatorGUI extends Frame implements ActionListener{
    TextField tf3,tf1,tf2;
    int a,b;
    CalculatorGUI(){
        setSize(500,500);
        setTitle("Calculator");
        setVisible(true);

        setLayout(new GridLayout(3,1));

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(1,2));
        tf1 = new TextField();
        tf2 = new TextField();
        p1.add(tf1);
        p1.add(tf2);
        add(p1);

        tf3 = new TextField();
        add(tf3);

        Button b1 = new Button("Add");
        b1.addActionListener(this);
        Button b2 = new Button("Sub");
        b2.addActionListener(this);
        Button b3 = new Button("Mul");
        b3.addActionListener(this);
        Button b4 = new Button("Div");
        b4.addActionListener(this);
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(1,4));
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        add(p2);
        
    }
    public void actionPerformed(ActionEvent  e){
        a = Integer.parseInt(tf1.getText());
        b = Integer.parseInt(tf2.getText());

        if(e.getActionCommand() == "Add"){
            tf3.setText((a+b) + "");
        }
        else if(e.getActionCommand() == "Sub"){
            tf3.setText(a-b + "");
        }
        else if(e.getActionCommand() == "Mul"){
            tf3.setText(a*b + "");
        }
        else{
            tf3.setText(a/b + "");
        }
    }
    public static void main(String[] args){
        CalculatorGUI cg = new CalculatorGUI();
    }
}