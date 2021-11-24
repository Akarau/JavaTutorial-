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
import javax.swing.text.AttributeSet.ColorAttribute;

import org.w3c.dom.css.RGBColor;

public class Menu implements ActionListener {

    JLabel tn;
    static JLabel l;
    static JButton option1;
    static JButton option2;
    static JButton option3;

    JFrame frame;
    static JProgressBar button1;

    JPanel panel1, panel2;

    JFrame frameLoading;
   static JLabel optionsmenu;
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


        option1 = new JButton("   Start   ");
        option1.setForeground(Color.white);
        option1.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        option1.setBounds(500, 300, 350, 350);
        option1.setSize(300, 70);
        option1.setBackground(Color.black);
        option1.setVisible(false);
        option1.setFocusable(false);
        option1.addActionListener(this);
        option1.setActionCommand("Option1");

        option2 = new JButton("   Options   ");
        option2.setForeground(Color.white);
        option2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        option2.setBounds(500, 400, 350, 350);
        option2.setSize(300, 70);
        option2.setBackground(Color.black);
        option2.setVisible(false);
        option2.setFocusable(false);
        option2.addActionListener(this);
        option2.setActionCommand("option2");

        option3 = new JButton("   Exit   ");
        option3.setForeground(Color.white);
        option3.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        option3.setBounds(500, 500, 350, 350);
        option3.setSize(300, 70);
        option3.setBackground(Color.black);
        option3.setVisible(false);
        option3.setFocusable(false);
        option3.addActionListener(this);
        option3.setActionCommand("option3");

        optionsmenu= new JLabel();
        optionsmenu.setBounds(500,500,600,600);
        optionsmenu.setVisible(false);
        optionsmenu.setBackground(Color.red);
        optionsmenu.setFocusable(false);
optionsmenu.setForeground(Color.white);
       //   Option1.setBackground(Color.white);
      //  Option1 = startname.clone
        frame.add(panel2);
        panel1.add(tn);
        frame.add(l);
        frame.add(optionsmenu);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(panel1);
      //  tn.add(optionsmenu);
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


        if (e.getActionCommand()=="option2"){
            System.out.println("option2");
optionsmenu.setVisible(true);
        }

        if (e.getActionCommand()=="option3"){
            System.out.println("option3");
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
                    Thread.sleep(80);
                    option1.setVisible(true);
                    Thread.sleep(200);
                    option2.setVisible(true);
                    Thread.sleep(200);
                    option3.setVisible(true);

                    String message;

                    message = "        The Day";
System.out.println(message.toCharArray());
//System.out.println(message.length());
Thread.sleep(1000);
l.setText("");
                    for (Byte m1 = 0;m1<message.length();m1++){
                    System.out.print(message.charAt(m1));
                   // Option1.setText(message.charAt(m1));
                    Thread.sleep(28);
                    
                    l.setText(l.getText() + message.charAt(m1));
                    }

                    for (n1 = 0;; n1++){
                       // System.out.println(t.charAt(0-n1));
                        System.out.println(t.copyValueOf(null, 1, n1));
                       // l.setText(t.charAt(0-n1));
                        }

                     
                        //TEST

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

        if (((EventObject) e).getSource() == this.option1) { 
          //  Loading();
            System.out.print("Start");
        }

    }
    // @Override

    
}
