import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.lang.StackWalker.Option;
import java.util.EventObject;
import java.awt.*;
import java.awt.event.*;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import org.w3c.dom.css.RGBColor;

public class Menu implements ActionListener {

    JLabel tn;
    static JLabel l;
    static JButton Option1;
    static JButton Option2;
    static JButton Option3;

    JFrame frame;
    static JProgressBar button1;

    JPanel panel1, panel2;

    JFrame frameLoading;
    Font titelgröße = new Font("Times new Roman", Font.PLAIN, 80);
    Font startschrift = new Font("Times new Roman", Font.PLAIN, 60);
    JButton startname;

    public Menu() throws InterruptedException {

        frame = new JFrame();
        // fenster.setSize(1920, 1080);

        // Setzt das Fenster immer auf Fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Entfernt den oberen Rahmen
        frame.setUndecorated(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // fenster.getContentPane().setBackground(Color.green);
        // fenster.setLayout(null);
        // fenster.getContentPane();

        byte RG = 127;
        panel1 = new JPanel();
        panel1.setBounds(800, 200, 350, 100);
        panel1.setBackground(Color.black);
        tn = new JLabel("The Day");
        tn.setForeground(Color.white);
        tn.setFont(titelgröße);
        tn.setBackground(Color.WHITE);

        panel2 = new JPanel();
        panel2.setBounds(460, 600, 350, 800);
        panel2.setBackground(Color.BLACK);
        panel2.setForeground(Color.black);
        startname = new JButton("     Spielen     ");
        // startname.setFont(startschrift);
        startname.setBorderPainted(false);
        startname.setBackground(Color.BLACK);
        startname.setSize(400, 400);
        startname.setFont(startschrift);
        startname.setForeground(Color.WHITE);
        // startname.setFocusable(false);
        startname.addActionListener(this);
        startname.setActionCommand("startname");

        button1 = new JProgressBar();
        button1.setBorderPainted(false);
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setBounds(460, 300, 350, 500);
        button1.setVisible(true);
        panel2.add(startname);
        panel2.add(button1);

        l = new JLabel("Loading: ");
        l.setForeground(Color.white);
        l.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        l.setBounds(540, 30, 400, 0);
        l.setSize(500, 500);
        l.setBackground(Color.WHITE);
        l.setVisible(false);
        l.setFocusable(false);


        Option1 = new JButton("   Start   ");
        Option1.setForeground(Color.white);
        Option1.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        Option1.setBounds(500, 300, 350, 350);
        Option1.setSize(300, 70);
        Option1.setBackground(Color.black);
        Option1.setVisible(false);
        Option1.setFocusable(false);
        Option1.addActionListener(this);
        Option1.setActionCommand("Option1");

        Option2 = new JButton("   Options   ");
        Option2.setForeground(Color.white);
        Option2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        Option2.setBounds(500, 400, 350, 350);
        Option2.setSize(300, 70);
        Option2.setBackground(Color.black);
        Option2.setVisible(false);
        Option2.setFocusable(false);
        Option2.addActionListener(this);
        Option2.setActionCommand("Option2");

        Option3 = new JButton("   Exit   ");
        Option3.setForeground(Color.white);
        Option3.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        Option3.setBounds(500, 500, 350, 350);
        Option3.setSize(300, 70);
        Option3.setBackground(Color.black);
        Option3.setVisible(false);
        Option3.setFocusable(false);
        Option3.addActionListener(this);
        Option3.setActionCommand("Option3");
       //   Option1.setBackground(Color.white);
      //  Option1 = startname.clone
        frame.add(panel2);
        panel1.add(tn);
        frame.add(l);
        frame.add(Option1);
        frame.add(Option2);
        frame.add(Option3);
        frame.add(panel1);
        frame.setVisible(true);

        while (l.isVisible() == false) {
            Loading();
            Thread TH = new Thread();
            TH.sleep(1000);
            System.out.println("x");
            if (l.isVisible() == true) {
                Loading();
            }
        }

        // addActionListener((ActionListener) new ActionListiner());{

    }

    int i;
    int n1;
    char c;
    String t = "loading:";
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println(e.getSource());
     //   if (e.getSource()==l){
       //     l.setVisible(!l.isVisible());
        //}

       // System.out.println(e.getActionCommand());;

        if (e.getActionCommand()=="startname"){
            System.out.println("startname");
            l.setVisible(!l.isVisible());


        }
        if (e.getActionCommand()=="Option1"){
            System.out.println("Option1");
        }

        if (e.getActionCommand()=="Option2"){
            System.out.println("Option2");
            //Bild von Durchlauf hinzufügen

        }

        if (e.getActionCommand()=="Option3"){
            System.out.println("Option3");
            System.out.println("Dsalkgbw");
            frame.setVisible(false);

        }
        
    }

    // Ren();

    public void Loading() throws InterruptedException {
        System.out.println("not Vis");
        if (l.isVisible() == true) {
            System.out.println("Visible");
            // Thread.sleep(2000);
            l.setVisible(true);
            l.setText("LoadingC");
            int i;
            for (i = 1;; i++) {
                l.setText("Loading: " + i + "%");
                Thread.sleep(i - 1);

                if (i >= 99 && i <= 99) {
                    // Thread.sleep(500);
                    l.setText("Loading: 99%.");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%..");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%...");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%.");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%..");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%...");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%.");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%...");
                    // Thread.sleep(2000);
                    l.setText("Loading: 100%");

                    // L.setText("Loading completed");
                    // L.setText("Loading: 100%");
                    Thread.sleep(1000);
                    l.setText("Loading completed");
                    startname.setVisible(!startname.isVisible());
                    tn.setVisible(false);
                    System.out.println(l.getBounds());
                    break;
                }
            }

            for (i = 1; i <= 100; i++) {
                System.out.println(l.getBounds());
                Thread.sleep(3); 
                l.setBounds(540, 30 - i - 5, 500, 500);
                if (i >= 100) {
                    
                    Thread.sleep(500);
                    l.setText("               D");
                    Thread.sleep(80);
                    l.setText("              Di");
                    Thread.sleep(80);
                    l.setText("             Dia");
                    Thread.sleep(80);
                    l.setText("            Dial");
                    Thread.sleep(80);
                    l.setText("           Dialo");
                    Thread.sleep(80);
                    l.setText("          Dialog");
                    Thread.sleep(80);
                    Option1.setVisible(true);
                    Thread.sleep(200);
                    Option2.setVisible(true);
                    Thread.sleep(200);
                    Option3.setVisible(true);

                    

                    for (n1 = 0;; n1++){
                       // System.out.println(t.charAt(0-n1));
                        System.out.println(t.copyValueOf(null, 1, n1));
                       // l.setText(t.charAt(0-n1));
                        }
                }

            }
        }

    }

    

    private void notify(int i) {
    }

    

    private Color RGBColor(int i, int j, int k) {
        return null;
    }

    public static void Ren() {
        button1.setValue(10);

    }

    public void GUI() {
        JPanel F = new JPanel();
        F.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

    }

    public <ActionEvent> void CL(ActionEvent e) throws InterruptedException {
        // if(((EventObject) e).getSource()==startname){
        if (((EventObject) e).getSource() == this.startname) {
            Loading();
            System.out.print("D");
        }

        if (((EventObject) e).getSource() == this.Option1) {
          //  Loading();
            System.out.print("Start");
        }

    }
    // @Override

    
}
