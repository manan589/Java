import java.awt.*;
import java.awt.event.*;

public class Windows98Calculator extends Frame implements ActionListener{
    double num1 = 0,num2 = 0,result = 0;
    char op;
    TextField display;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button add,sub,mul,div,equal,clear;
    Windows98Calculator(){
        setSize(500,500);
        setVisible(true);
        setTitle("Calculator");

        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.fill = GridBagConstraints.BOTH;
        g.weightx = 1;
        g.weighty = 1;
        g.insets = new Insets(5,5,5,5);

        display = new TextField();
        display.setEditable(false);

        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 4;
        add(display,g);

        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        div = new Button("/");

        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        mul = new Button("*");

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        sub = new Button("-");

        b0 = new Button("0");
        equal = new Button("=");
        add = new Button("+");
        clear = new Button("C");

        g.gridwidth = 1;

        g.gridx = 0;
        g.gridy = 1;
        add(b7,g);

        g.gridx = 1;
        add(b8,g);

        g.gridx = 2;
        add(b9,g);

        g.gridx = 3;
        add(div,g);

        g.gridx = 0;
        g.gridy = 2;
        add(b4,g);

        g.gridx = 1;
        add(b5,g);

        g.gridx = 2;
        add(b6,g);

        g.gridx = 3;
        add(mul,g);

        g.gridx = 0;
        g.gridy = 3;
        add(b1,g);

        g.gridx = 1;
        add(b2,g);

        g.gridx = 2;
        add(b3,g);

        g.gridx = 3;
        add(sub,g);

        g.gridx = 0;
        g.gridy = 4;
        add(clear,g);

        g.gridx = 1;
        add(b0,g);

        g.gridx = 2;
        add(equal,g);

        g.gridx = 3;
        add(add,g);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        clear.addActionListener(this);
        equal.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);


        addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        if(command.equals("0") || command.equals("1") || command.equals("2") || command.equals("3") 
        || command.equals("4") || command.equals("5") || command.equals("6") || command.equals("7") 
        || command.equals("8") || command.equals("9")){
            display.setText(display.getText() + command);
        }
        else if(command.equals("C")){
            display.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
        }
        else if(command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")){
            num1 = Double.parseDouble(display.getText());
            op = command.charAt(0);
            display.setText("");
        }
        else if(command.equals("=")){
            num2 = Double.parseDouble(display.getText());
            switch(op){
                case '+' : result = num1 + num2; break;
                case '-' : result = num1 - num2; break;
                case '*' : result = num1 * num2; break;
                case '/' : if(num2 == 0){display.setText("Error"); return;}
                            result = num1 / num2; break;
            }
            display.setText(String.valueOf(result));
        }
    }
    public static void main(String[] args){
        Windows98Calculator wc = new Windows98Calculator();
    }
}