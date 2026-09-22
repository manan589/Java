import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;

public class Exception_AWT_program extends Frame implements ActionListener{
    TextField tf1,tf2;
    Button b;
    int[] arr;
    Exception_AWT_program(){
        setSize(500,500);
        setVisible(true);
        setTitle("Exception with AWT");

        setLayout(new FlowLayout());
        Label l = new Label("Enter index");
        add(l);
        tf1 = new TextField(10);
        tf2 = new TextField(20);
        tf2.setEditable(false);
        add(tf1);
        add(tf2);
        b = new Button("Show");
        add(b);
        b.addActionListener(this);
        arr = new int[100];
        for(int i=0;i<100;i++){
            arr[i] = (int)(Math.random() * 101);
        }
    }
    public void actionPerformed(ActionEvent e){
        try{
            int idx = Integer.parseInt(tf1.getText());
            tf2.setText(arr[idx] + " ");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            tf2.setText("Index is not Found");
        }
    }
    public static void main(String[] args){
        Exception_AWT_program ewp = new Exception_AWT_program();
    }
}