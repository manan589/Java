import java.awt.*;
import java.awt.event.*;

public class MovingBannerApp extends Frame implements ActionListener, Runnable {
    TextField tfMessage, tfColor, tfSize;
    Choice chDirection;
    Button btnStart;

    String message = "";
    Color textColor = Color.BLACK;
    int fontSize = 20;
    String direction = "Left";

    int x = 100, y = 300; // Banner coordinates
    Thread bannerThread;
    boolean isRunning = false;

    public MovingBannerApp() {
        setTitle("Moving Banner Application");
        setSize(700, 450);
        setLayout(new FlowLayout());

        // UI Components
        add(new Label("Message:"));
        tfMessage = new TextField("Hello World", 15);
        add(tfMessage);

        add(new Label("Color (red/green/blue):"));
        tfColor = new TextField("red", 8);
        add(tfColor);

        add(new Label("Size:"));
        tfSize = new TextField("24", 5);
        add(tfSize);

        add(new Label("Direction:"));
        chDirection = new Choice();
        chDirection.add("Left");
        chDirection.add("Right");
        add(chDirection);

        btnStart = new Button("Start");
        btnStart.addActionListener(this);
        add(btnStart);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                isRunning = false;
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Read input values
        message = tfMessage.getText();
        direction = chDirection.getSelectedItem();

        // Parse color
        String col = tfColor.getText().trim().toLowerCase();
        if (col.equals("red")) textColor = Color.RED;
        else if (col.equals("green")) textColor = Color.GREEN;
        else if (col.equals("blue")) textColor = Color.BLUE;
        else textColor = Color.BLACK;

        // Parse font size
        try {
            fontSize = Integer.parseInt(tfSize.getText().trim());
        } catch (NumberFormatException ex) {
            fontSize = 20;
        }

        // Initialize x position based on direction
        if (direction.equals("Left")) {
            x = getWidth();
        } else {
            x = -150;
        }

        // Start thread
        if (bannerThread == null || !isRunning) {
            isRunning = true;
            bannerThread = new Thread(this);
            bannerThread.start();
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            if (direction.equals("Left")) {
                x -= 5;
                if (x < -200) {
                    x = getWidth(); // Wrap around
                }
            } else { // "Right"
                x += 5;
                if (x > getWidth()) {
                    x = -200; // Wrap around
                }
            }

            repaint();

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (!message.isEmpty()) {
            g.setColor(textColor);
            g.setFont(new Font("Arial", Font.BOLD, fontSize));
            g.drawString(message, x, y);
        }
    }

    public static void main(String[] args) {
        new MovingBannerApp();
    }
}