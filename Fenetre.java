import javax.swing.*;
import java.awt.*;

/**
 * Created by Banana on 07/11/14.
 */
public class Fenetre extends JFrame {

    private JLabel label;
    private JTextField text;
    private JButton button;
    private JLabel disp_text;

    public Fenetre(String title) {
        super();
        initComponents();
    }

    private void initComponents()
    {
        label = new JLabel("Nom :");
        text = new JTextField(20);
        button = new JButton("OK");
        disp_text = new JLabel();

        button.addActionListener(new ButtonListener(this));

        this.setLayout(new BorderLayout());
        this.add("West", label);
        this.add("Center", text);
        this.add("East", button);
        this.add("South", disp_text);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    void afficherNom()
    {
        this.disp_text.setText(this.text.getText());
        this.text.setText("");
        this.pack();
    }

    public static void main(String[] args)
    {
        Fenetre f = new Fenetre("Youhou");
    }

}
