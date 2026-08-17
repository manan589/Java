import java.awt.*;
public class Form extends Frame{
    Form(){
        setSize(500,200);
        setVisible(true);
        setTitle("Form");

        setLayout(new GridLayout(5,2));

        // name
        Label l1 = new Label("Name:");
        add(l1);
        TextField tf1 = new TextField("Patel Manan V.");
        add(tf1);

        //address
        Label l2 = new Label("Address:");
        add(l2);
        TextArea ta1 = new TextArea("Address");
        add(ta1);

        // hobby
        Label l3 = new Label("Hobby:");
        add(l3);
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        Checkbox cb1 = new Checkbox("Playing");
        Checkbox cb2 = new Checkbox("Coding");
        p.add(cb1);
        p.add(cb2);
        add(p);

        //Mobile No
        Label l4 = new Label("Mobile No:");
        add(l4);
        TextField tf2 = new TextField("+91 1234567890");
        add(tf2);

        //Submit and Reset BUtton
        Button b1 = new Button("Submit");
        add(b1);
        Button b2 = new Button("Reset");
        add(b2);
    }
    public static void main(String[] args){
        Form f = new Form();
    }
}