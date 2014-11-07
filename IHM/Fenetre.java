package IHM;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 * Created by Banana on 07/11/14.
 */
public class Fenetre extends JFrame {

    private BufferedWriter write;
    private BufferedReader reader;
    private JButton bReceive;
    private JButton bSend;
    private JLabel lMessRec;
    private JLabel lMessSend;
    private JTextArea textRec;
    private JTextArea textToSend;

    public Fenetre() {
        super();
        this.initComponents();
    }

    void initComponents()
    {
        this.lMessSend = new JLabel("message to send");
        this.lMessRec = new JLabel("message recv");
        this.textRec = new JTextArea();
        this.textRec.setEditable(false);
        JScrollPane scrollRec = new JScrollPane(textRec, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.textToSend = new JTextArea();
        JScrollPane scrollSend = new JScrollPane(textToSend, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.bReceive = new JButton("recv");
        this.bSend = new JButton("send");

        this.setLayout(new GridLayout(3, 2));
        this.add(lMessSend);
        this.add(scrollSend);
        this.add(bSend);
        this.add(bReceive);
        this.add(lMessRec);
        this.add(scrollRec);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        Fenetre f = new Fenetre();
    }

}
