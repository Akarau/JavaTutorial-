import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.lang.StackWalker.Option;
import java.lang.reflect.Array;
import java.util.EventObject;
import java.util.Timer;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.synth.ColorType;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

import org.w3c.dom.css.RGBColor;

public class Menu implements ActionListener {

    private static final Component JButton = null;
    ImageIcon imageW = new ImageIcon("W.png");
    JLabel tn;
    JTextArea commbox;
    JLabel commboxtex;

    static JLabel l;
    static JButton option1;
    static JButton option2;
    static JButton option3;
    static JButton options_c;
    static JButton options_ts;
    JButton tex;
    JButton b;

    static JFrame frame;
    static JProgressBar button1;

    JPanel panel1, panel2;
    JPanel panel3;
    static JPanel optionsmenu;
    static JPanel optionsmenu_colors;
    static JPanel optionsmenu_colorsoutlines;
    static JPanel optionsmenu_options;

    JPanel colors_R;
    JFrame frameLoading;
    Font titelgröße = new Font("Times new Roman", Font.PLAIN, 80);
    Font startschrift = new Font("Times new Roman", Font.PLAIN, 60);
    JButton startname;

    String[] colors = { "Weiß", "Dunkel Grau", "Rot", "Gelb", "Grün", "Hell Blau", "Blau", "Rosa", "Dunkel Rosa" };
    Color[] colors2 = { Color.white, Color.darkGray, Color.red, Color.yellow, Color.green, new Color(25, 255, 255),
            new Color(25, 105, 255), new Color(255, 0, 255), new Color(255, 0, 80) };

    public Menu() throws InterruptedException {

        Enemy r;
        
        frame = new JFrame();
        // fenster.setSize(1920, 1080);

        // Setzt das Fenster immer auf Fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Entfernt den oberen Rahmen
        frame.setUndecorated(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        r = new Enemy();
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
        startname.setBackground(Color.BLACK);
        startname.setSize(400, 400);
        startname.setFont(startschrift);
        startname.setForeground(Color.WHITE);
        startname.setVisible(false);
        // startname.setFocusable(false);
        startname.addActionListener(this);
        startname.setActionCommand("startname");
        startname.setBorder(new LineBorder(Color.white));

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
        option1.setVisible(true);
        option1.setFocusable(false);
        option1.addActionListener(this);
        option1.setActionCommand("startb");
        option1.setBorder(new LineBorder(Color.white));

        option2 = new JButton("   Options   ");
        option2.setForeground(Color.white);
        option2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        option2.setBounds(500, 400, 350, 350);
        option2.setSize(300, 70);
        option2.setBackground(Color.black);
        option2.setVisible(true);
        option2.setFocusable(false);
        option2.addActionListener(this);
        option2.setActionCommand("option2");
        option2.setBorder(new LineBorder(Color.white));

        option3 = new JButton("   Exit   ");
        option3.setForeground(Color.white);
        option3.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        option3.setBounds(500, 500, 350, 350);
        option3.setSize(300, 70);
        option3.setBackground(Color.black);
        option3.setVisible(true);
        option3.setFocusable(false);
        option3.addActionListener(this);
        option3.setActionCommand("option3");
        option3.setBorder(new LineBorder(Color.white));

        options_ts = new JButton("   Speed   ");
        options_ts.setForeground(Color.white);
        options_ts.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        options_ts.setBounds(500, 500, 350, 350);
        options_ts.setSize(300, 70);
        options_ts.setBackground(Color.black);
        options_ts.setVisible(false);
        options_ts.setFocusable(false);
        options_ts.addActionListener(this);
        options_ts.setActionCommand("option");
        options_ts.setBorder(new LineBorder(Color.white));

        optionsmenu = new JPanel();
        optionsmenu.setBounds(900, 200, 500, 650);
        optionsmenu.setVisible(false);
        optionsmenu.setBackground(Color.BLACK);
        optionsmenu.setFocusable(false);
        // optionsmenu.setForeground(Color.BLACK);
        optionsmenu.setBorder(new LineBorder(Color.white));

        options_c = new JButton("   Colors   ");
        options_c.setForeground(Color.white);
        options_c.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        options_c.setBounds(150, 150, 0, 0);
        options_c.setBackground(Color.black);
        options_c.setVisible(false);
        options_c.setFocusable(false);
        options_c.addActionListener(this);
        options_c.setActionCommand("c#1");
        options_c.setBorder(new LineBorder(Color.white));

        colors_R = new JPanel();
        colors_R.setBounds(60, 120, 30, 30);
        colors_R.setVisible(false);
        colors_R.setBackground(RGBColor(30, 30, 30));
        colors_R.setFocusable(false);
        // colors_R.setForeground(Color.white);

        optionsmenu_options = new JPanel();
        // optionsmenu_colors.setBounds(1.x, 1.y, );
        optionsmenu_options.setVisible(false);
        optionsmenu_options.setBackground(Color.BLACK);
        optionsmenu_options.setFocusable(false);
        optionsmenu_options.setBounds(830, 300, 70, 160);
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        tex = new JButton("T");
        tex.setForeground(Color.white);
        tex.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        tex.setBounds(150, 150, 0, 0);
        tex.setBackground(Color.black);
        tex.setVisible(false);
        tex.setFocusable(false);
        tex.addActionListener(this);
        tex.setActionCommand("t#1");

        b = new JButton("□");
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        b.setBounds(150, 150, 0, 0);
        b.setBackground(Color.black);
        b.setVisible(false);
        b.setFocusable(false);
        b.addActionListener(this);
        b.setActionCommand("b#1");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        optionsmenu_options.add(tex);
        optionsmenu_options.add(b);

        optionsmenu_colors = new JPanel();
        // optionsmenu_colors.setBounds(1.x, 1.y, );
        optionsmenu_colors.setVisible(false);
        optionsmenu_colors.setBackground(Color.BLACK);
        optionsmenu_colors.setFocusable(false);
        optionsmenu_colors.setBounds(900, 300, 500, 570);
        optionsmenu_colors.setBorder(new LineBorder(Color.white));

        optionsmenu_colorsoutlines = new JPanel();
        // optionsmenu_colors.setBounds(1.x, 1.y, );
        optionsmenu_colorsoutlines.setVisible(false);
        optionsmenu_colorsoutlines.setBackground(Color.BLACK);
        optionsmenu_colorsoutlines.setFocusable(false);
        optionsmenu_colorsoutlines.setBounds(900, 300, 500, 570);
        optionsmenu_colorsoutlines.setBorder(new LineBorder(Color.white));

        panel3 = new JPanel();
        panel3.setBounds(0, 0, 1500, 1500);
        panel3.setBackground(Color.black);
        panel3.setVisible(false);
        frame.add(panel3);

        commbox = new JTextArea("");
        commbox.setForeground( new Color(60,60,60));
        commbox.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        commbox.setBounds(200, 550, 700, 100);
        commbox.setSize(850, 200);
        commbox.setBackground( new Color(200,200,200));
        commbox.setLineWrap(true);
        commbox.setVisible(false);
        commbox.setFocusable(false);
        commbox.setBorder(new LineBorder(Color.darkGray));

        commboxtex = new JLabel("Welcome to The Day");
        commboxtex.setForeground(Color.black);
        commboxtex.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        commboxtex.setBounds(540, 30, 400, 0);
        commboxtex.setSize(850, 200);
        commboxtex.setBackground(Color.WHITE);
        commboxtex.setVisible(true);
        commboxtex.setFocusable(false);
     //   commbox.add(commboxtex);
        // optionsmenu_colors.setForeground(Color.white);
        // Option1.setBackground(Color.white);
        // Option1 = startname.clone

        JButton color;

        for (int c = 0; c < colors.length; c++) {
            // System.out.println(c);
            // System.out.println(colors[c]);

            color = new JButton("   " + colors[c] + "   ");
            color.setForeground(colors2[c]);
            color.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            // color.setBounds(500, 500, 350, 350);
            color.setSize(800, 80);
            color.setBackground(null);
            color.setVisible(true);
            color.setFocusable(false);
            color.addActionListener(this);
            color.setActionCommand(colors[c]);
            color.setBorder(new LineBorder(colors2[c]));
            color.setActionCommand(colors[c]);
            // color.setBorder(BorderFactory.createBevelBorder(200, Color.white,
            // Color.BLACK));

            optionsmenu_colors.add(color);

            frame.add(commbox);

        }

        for (int c = 0; c < colors.length; c++) {
            // System.out.println(c);
            // System.out.println(colors[c]);

            color = new JButton("  " + "□" + "  ");
            color.setForeground(colors2[c]);
            color.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            // color.setBounds(500, 500, 350, 350);
            color.setSize(400, 80);
            color.setBackground(null);
            color.setVisible(true);
            color.setFocusable(false);
            color.addActionListener(this);
            color.setActionCommand("B" + colors[c]);
            color.setBorder(new LineBorder(colors2[c]));
            // color.setBorder(BorderFactory.createBevelBorder(200, Color.white,
            // Color.BLACK));
            optionsmenu_colorsoutlines.add(color);

        }

        frame.add(panel2);
        frame.add(optionsmenu_colors);
        frame.add(optionsmenu_options);
        frame.add(optionsmenu_colorsoutlines);
        panel1.add(tn);
        frame.add(l);
        frame.add(optionsmenu);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(panel1);
        optionsmenu.add(options_c);
        optionsmenu.add(options_ts);
        // options_c.add(colors_R);
        // tn.add(optionsmenu);
        frame.setVisible(true);

        while (l.isVisible() == false) {
            Loading();
            Thread TH = new Thread();
            TH.sleep(1000);
            // System.out.println("x");
            if (l.isVisible() == true) {
                Loading();
            }
        }

        // addActionListener((ActionListener) new ActionListiner());{
        // kann gelöscht werden delete comment after

    }

    int i;
    int n1;
    char c;
    String t = "loading:";

    public void actionPerformed(java.awt.event.ActionEvent e) {
        // System.out.println(e.getSource());
        // if (e.getSource()==l){
        // l.setVisible(!l.isVisible());
        // }

        // System.out.println(e.getActionCommand());;

        if (e.getActionCommand() == "startname") {
            System.out.println("startname");
            l.setVisible(!l.isVisible());

        }
        if (e.getActionCommand() == "startb") {
            l.setVisible(!l.isVisible());

            // panel3.setVisible(true);
            startname.setVisible(false);
            option1.setVisible(false);
            option2.setVisible(false);
            option3.setVisible(false);
            options_c.setVisible(false);
            options_ts.setVisible(false);
            optionsmenu.setVisible(false);
            optionsmenu_colors.setVisible(false);
            optionsmenu_colorsoutlines.setVisible(false);
            optionsmenu_options.setVisible(false);
        }

        if (e.getActionCommand() == "option2") {
            System.out.println("option2");
            optionsmenu.setVisible(!optionsmenu.isVisible());
            options_c.setVisible(!options_c.isVisible());
            colors_R.setVisible(!colors_R.isVisible());
            options_ts.setVisible(!options_ts.isVisible());
            optionsmenu_options.setVisible(false);
            optionsmenu_colors.setVisible(false);
            optionsmenu_colorsoutlines.setVisible(false);
            b.setVisible(false);
            tex.setVisible(false);
        }

        if (e.getActionCommand() == "option3") {
            System.out.println("option3");
            System.out.println("Dsalkgbw");
            frame.add(commboxtex);
            l.setVisible(true);
            l.setIcon(imageW);

            commboxtex.setVisible(true);
           // frame.setVisible(false);
           commboxtex.setIcon(imageW);

        }

        if (e.getActionCommand().equals("options_c")) {
            System.out.println("options_c");
            System.out.println("Dsalkgbw");

            frame.setVisible(false);

        }

        if (e.getActionCommand().equals("c#1")) {
            tex.setVisible(!tex.isVisible());
            b.setVisible(!b.isVisible());
            optionsmenu_options.setVisible(!optionsmenu_options.isVisible());

        }
        if (e.getActionCommand().equals("t#1")) {
            optionsmenu_colorsoutlines.setVisible(false);
            optionsmenu_colors.setVisible(!optionsmenu_colors.isVisible());
            b.setForeground(Color.darkGray);
            tex.setForeground(Color.WHITE);
        }

        if (e.getActionCommand().equals("b#1")) {
            optionsmenu_colors.setVisible(false);
            optionsmenu_colorsoutlines.setVisible(!optionsmenu_colorsoutlines.isVisible());
            tex.setForeground(Color.darkGray);
            b.setForeground(Color.WHITE);

        }

        Byte v;

        for (v = 0; v < colors.length; v++) {
            if (e.getActionCommand().equals(colors[v])) {
                startname.setForeground(colors2[v]);
                tn.setForeground(colors2[v]);
                tex.setForeground(colors2[v]);
                option1.setForeground(colors2[v]);
                option2.setForeground(colors2[v]);
                option3.setForeground(colors2[v]);
                options_c.setForeground(colors2[v]);
                options_ts.setForeground(colors2[v]);
                optionsmenu_colors.setForeground(colors2[v]);
                optionsmenu_colorsoutlines.setForeground(colors2[v]);
                optionsmenu_options.setForeground(colors2[v]);
                l.setForeground(colors2[v]);

            }
        }

        for (v = 0; v < colors.length; v++) {
            if (e.getActionCommand().equals("B" + colors[v])) {
                startname.setBorder(new LineBorder(colors2[v]));
                optionsmenu_colors.setBorder(new LineBorder(colors2[v]));
                option1.setBorder(new LineBorder(colors2[v]));
                option2.setBorder(new LineBorder(colors2[v]));
                option3.setBorder(new LineBorder(colors2[v]));
                options_c.setBorder(new LineBorder(colors2[v]));
                options_ts.setBorder(new LineBorder(colors2[v]));
                optionsmenu.setBorder(new LineBorder(colors2[v]));
                optionsmenu_colors.setBorder(new LineBorder(colors2[v]));
                optionsmenu_colorsoutlines.setBorder(new LineBorder(colors2[v]));
                optionsmenu_options.setBorder(new LineBorder(colors2[v]));

            }
        }

    }

    

    // Ren();

    public void Loading() throws InterruptedException {
        // System.out.println("not Vis");
        if (l.isVisible() == true) {
            // System.out.println("Visible");
            // Thread.sleep(2000);
            l.setVisible(true);
            l.setText("LoadingC");
            int i;
            for (i = 1;; i++) {
                l.setText("Loading: " + i + "%");
                Thread.sleep(i / i);

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
                    l.setText("Loading: 99%..");
                    // Thread.sleep(500);
                    l.setText("Loading: 99%...");
                    // Thread.sleep(2000);
                    l.setText("Loading: 100%");

                    // L.setText("Loading completed");
                    // L.setText("Loading: 100%");
                    Thread.sleep(1000);
                    l.setText("Loading completed");
                    
                    // startname.setVisible(!startname.isVisible());
                    tn.setVisible(false);
                    // System.out.println(l.getBounds());

                    break;
                }
                

            }
            for (i = 1; i <= 100; i++) {
                // System.out.println(l.getBounds());
                Thread.sleep(3);
                l.setBounds(540, 30 - i - 5, 500, 500);
                if (i >= 100) {
                    Thread.sleep(80);
                    // option1.setVisible(true);
                    Thread.sleep(200);
                    // option2.setVisible(true);
                    Thread.sleep(200);
                    // option3.setVisible(true);

                    String message;

                    message = "        The Day";
                    System.out.println(message.toCharArray());
                    // System.out.println(message.length());
                    Thread.sleep(1000);
                    l.setText("");
                    for (Byte m1 = 8; m1 < message.length(); m1++) {
                        System.out.print(message.charAt(m1));
                        // Option1.setText(message.charAt(m1));
                        Thread.sleep(28);

                        l.setText(l.getText() + message.charAt(m1));
                        // commbox.setText(l.getText() + message.charAt(m1));
                    }

                    Thread.sleep(1000);

                    // TEST


                }

            }

            startb();

            
        }

       // animateText("E", l);

        // startb();

        

    }


    public void animateText(String message, JLabel tex, JTextArea a, int w, String standardText) throws InterruptedException  {

   
        System.out.println(message.toCharArray());
        // System.out.println(message.length());
        Thread.sleep(1000);
        if (tex!= null){
            tex.setText("");
            if (standardText != null){
                tex.setText(standardText);
            }
        for (Byte m1 = 0; m1 < message.length(); m1++) {
            System.out.print(message.charAt(m1));
            // Option1.setText(message.charAt(m1));
            tex.setText(tex.getText() + message.charAt(m1));
            Thread.sleep(w);
            }

        
            // commbox.setText(l.getText() + message.charAt(m1));
        }

        if (a!= null){
            a.setText("");
            if (standardText != null){
                a.setText(standardText);
            }
            for (Byte m1 = 0; m1 < message.length(); m1++) {
                System.out.print(message.charAt(m1));
                // Option1.setText(message.charAt(m1));
                Thread.sleep(w);
                a.setText(a.getText() + message.charAt(m1));
                }
        
        }
   
   
    }



    

    public void startb() throws InterruptedException {
        panel3.setVisible(true);
        System.out.println("Startb");
        int i;
        for (i = 1; i < 255; i++) {
            Thread.sleep(i / i * 1, 3);
            panel3.setBackground(new Color(i, i, i));
            System.out.println("i: " + i);
            // if (i<255){
            // break;
            // }
        }

        Thread.sleep(1500);

        System.out.println("D");
commbox.setText("                                                                                                                                                                                                                            ");
        commbox.setVisible(true);

        

        animateText("Welcome to The Day.", null,commbox, 12, null); // Text in String ist die Nachricht, zweites Wort ist die JLabel, die deren Text geändert sein muss, die Zahl am Ende ist die Geschwindigkeit; je weniger desto schneller
        Thread.sleep(2000);
        animateText(" Look like you are new here", null,commbox, 12, "Welcome to The Day."); // Text in String ist die Nachricht, zweites Wort ist die JLabel, die deren Text geändert sein muss, die Zahl am Ende ist die Geschwindigkeit; je weniger desto schneller
        animateText(" We are going to learn about this game with the tutorial", null,commbox, 15, "Welcome to The Day. Look like you are new here."); // Text in String ist die Nachricht, zweites Wort ist die JLabel, die deren Text geändert sein muss, die Zahl am Ende ist die Geschwindigkeit; je weniger desto schneller
        animateText(" ....", null,commbox, 350, "Welcome to The Day. Look like you are new here. We are going to learn about this game with the tutorial."); // Text in String ist die Nachricht, zweites Wort ist die JLabel, die deren Text geändert sein muss, die Zahl am Ende ist die Geschwindigkeit; je weniger desto schneller

        animateText(" So let's begin with the basics", null,commbox, 12, "Welcome to The Day. Look like you are new here. We are going to learn about this game with the tutorial. ....");

        Thread.sleep(2000);
      //  panel3.add(commbox);

        for (i = 1; i < 235; i++) {
            Thread.sleep(i / i * 1, 3);
            panel3.setBackground(new Color(255 - i, 255 - i, 255 - i));
            System.out.println("i: " + i);

        }

        // Thread.sleep(1000);

        // panel3.setVisible(false);
        frame.setBackground(new Color(20, 20, 20));
        // panel3.setVisible(false);
        panel3.setVisible(false);
        commbox.setVisible(false);

        Thread.sleep(1500);
        commbox.setText("");
        commbox.setVisible(true);
        commbox.setBackground(Color.black);
        commbox.setForeground(Color.white);
        commbox.setBorder(new LineBorder(Color.white));
        animateText(" The first thing you need to know is to never trust anyone in this world. ", null,commbox, 12, null);

        Thread.sleep(3000);
        animateText(" During your adventure you are going to be meeting many enemies. ", null,commbox, 12, " The first thing you need to know is to never trust anyone in this world. ");
        Thread.sleep(2000);
        animateText("        Their main goal is to protect their bosses as long as they can. ", null,commbox, 12, " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.");
        Thread.sleep(2000);
        animateText("               every enemy has different stats such as Speed, HP, Power,etc...", null,commbox, 12, " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.        Their main goal is to protect their bosses as long as they can.  ");

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
            // Loading();
            System.out.print("Start");
        }

    }
    
    // @Override

}