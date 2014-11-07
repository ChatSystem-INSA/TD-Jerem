import javax.swing.*;
import java.awt.*;

/**
 * Created by Banana on 07/11/14.
 */
public class Fenetre extends JFrame {

    private JLabel label;
    private JTextField text;
    private JButton button;

    public Fenetre(String title) {
        super();
        initComponents();
    }

    private void initComponents()
    {
        label = new JLabel("Nom :");
        text = new JTextField(20);
        button = new JButton("OK");

        this.setLayout(new BorderLayout());
        this.add("West", label);
        this.add("Center", text);
        this.add("East", button);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        Fenetre f = new Fenetre("Youhou");
    }

}
