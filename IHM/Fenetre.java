package IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by Banana on 07/11/14.
 */
public class Fenetre extends JFrame {

    private BufferedWriter writer;
    private BufferedReader reader;
    private JButton bReceive;
    private JButton bSend;
    private JLabel lMessRec;
    private JLabel lMessSend;
    private JTextArea textRec;
    private JTextArea textToSend;

    public Fenetre(String in, String out) {
        super();

        try {
            this.reader = new BufferedReader(new FileReader(in));
            this.writer = new BufferedWriter(new FileWriter(out));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

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

        this.bSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    writer.write(textToSend.getText() + "\n");
                    writer.flush();
                    textToSend.setText("");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        this.bReceive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String in = reader.readLine();
                    if(in != null)
                    {
                        textRec.append(in+"\n");
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

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
        if(args.length != 2)
        {
            System.out.println("Usage :");
            System.out.println("\tprogram <file_in> <file_out>");
            return;
        }

        System.out.println("Using "+args[0]+" and "+args[1]);
        Fenetre f = new Fenetre(args[0], args[1]);
    }

}
