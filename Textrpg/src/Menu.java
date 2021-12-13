import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.IOException;
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
    static ImageIcon imageW = new ImageIcon("Textrpg\\Images\\Crystal.png");
    JLabel tn;
    JTextArea commbox;
    JLabel commboxtex;
    JLabel inf;

    static JLabel l;
    static JLabel i1;
    static JLabel i2;
    static JLabel i3;
    static JLabel i4;
    static JButton option1;
    static JButton option2;
    static JButton option3;
    static JButton options_c;
    static JButton options_ts;
    static JButton commboxnext;
    JButton tex;
    JButton b;
    JPanel b1;
    JPanel b2;
    JPanel b3;
    JPanel b4;

    JButton e1;


     // upgrades //

    JPanel upgradeMenu;
    JButton upgradeMenuButton;
    static JLabel i5;
    static JLabel i6;
    static JLabel i7;
    static JButton powerUpgradeButton;
    static JButton healthUpgradeButton;
    static JButton goldUpgradeButton;
    static JLabel pointsText;


    // upgrades //

    // Elements_Main_Menu //

    static JPanel elementsMenu;
    static JPanel chosen_Main_Element;
   static JLabel chosen_Main_Element_Picture;
   static JLabel chosen_Main_Element_Name;
static JTextArea chosen_Main_Element_Description;
static JButton choose_Element;

    // Elements_Main_Menu //


    static JFrame frame;
    static JProgressBar button1;

    JPanel panel1, panel2;
    JPanel panel3;
    JPanel fighting_options;
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



        i1 = new JLabel();
        i1.setForeground(new Color(255,0,160));
        i1.setFont(new Font("Times new Roman", Font.PLAIN, 60));
     //   i1.setBounds(200, 400, 400, 0);
        i1.setSize(20, 20);
        i1.setBackground(Color.WHITE);
        i1.setVisible(true);
        i1.setFocusable(false);
        i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
        i1.setText("        Ancient         ");

        i2 = new JLabel();
        i2.setForeground(new Color(160,0,255));
        i2.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        i2.setBounds(200, 400, 400, 0);
        i2.setSize(20, 20);
        i2.setBackground(Color.WHITE);
        i2.setVisible(true);
        i2.setFocusable(false);
        i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Cosmic.png").getImage().getScaledInstance(80, 60, Image.SCALE_AREA_AVERAGING)));
        i2.setText("    Meteor Attack     ");

        i3 = new JLabel();
        i3.setForeground(new Color(160,0,255));
        i3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
      //  i3.setBounds(200, 400, 400, 0);
        i3.setSize(20, 20);
        i3.setBackground(Color.WHITE);
        i3.setVisible(true);
        i3.setFocusable(false);
        i3.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Void.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
        i3.setText("        Void         ");

        i4 = new JLabel();
        i4.setForeground(new Color(0,220,255));
        i4.setFont(new Font("Times new Roman", Font.PLAIN, 60));
      //  i3.setBounds(200, 400, 400, 0);
      i4.setSize(20, 20);
      i4.setBackground(Color.WHITE);
      i4.setVisible(true);
      i4.setFocusable(false);
      i4.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal2.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
      i4.setText("        Crysral         ");


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

        fighting_options = new JPanel();
        // optionsmenu_colors.setBounds(1.x, 1.y, );
        fighting_options.setVisible(false);
        fighting_options.setBackground(Color.BLACK);
        fighting_options.setFocusable(false);
        fighting_options.setBounds(38, 480, 1200, 300);
        fighting_options.setBorder(new LineBorder(Color.white));

        ImageIcon url = new ImageIcon("W.png");

        b1 = new JPanel();
        b1.setForeground(new Color(255,0,150));
        b1.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b1.setBounds(150, 150, 240, 2540);
        b1.setBackground(Color.black);
        b1.setVisible(true);
        b1.setFocusable(false);
        tn.setIcon(url);
        tn.setText("text");
    //    e1.addActionListener(this);
     //   e1.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        b2 = new JPanel();
        b2.setForeground(new Color(200,255,80));
        b2.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b2.setBounds(150, 150, 240, 2540);
        b2.setBackground(Color.black);
        b2.setVisible(true);
        b2.setFocusable(false);
     //   e2.addActionListener(this);
     //   e2.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));


        b3 = new JPanel();
        b3.setForeground(new Color(255,0,150));
        b3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b3.setBounds(150, 150, 240, 2540);
        b3.setBackground(Color.black);
        b3.setVisible(true);
        b3.setFocusable(false);
    //    e3.addActionListener(this);
    //    e3.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));


        b4 = new JPanel();
        b4.setForeground(new Color(255,255,255));
        b4.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b4.setBounds(150, 150, 240, 2540);
        b4.setBackground(Color.black);
        b4.setVisible(true);
        b4.setFocusable(false);
     //   e4.addActionListener(this);
     //   e4.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        e1 = new JButton();
        e1.setForeground(new Color(255,0,140));
        e1.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e1.setBounds(0, 0, 0, 0);
        e1.setBackground(Color.black);
        e1.setVisible(true);
        e1.setFocusable(false);
        e1.addActionListener(this);
        e1.setActionCommand("E");

        javax.swing.JButton e2 = new JButton();
        e2.setForeground(new Color(80,0,255));
        e2.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e2.setBounds(0, 0, 0, 0);
        e2.setBackground(Color.black);
        e2.setVisible(true);
        e2.setFocusable(false);
        e2.addActionListener(this);
        e2.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        javax.swing.JButton e3 = new JButton();
        e3.setForeground(new Color(255,255,255));
        e3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e3.setBounds(0, 0, 0, 0);
        e3.setBackground(Color.black);
        e3.setVisible(true);
        e3.setFocusable(false);
        e3.addActionListener(this);
        e3.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        javax.swing.JButton e4 = new JButton();
        e4.setForeground(new Color(255,255,255));
        e4.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e4.setBounds(0, 0, 0, 0);
        e4.setBackground(Color.black);
        e4.setVisible(true);
        e4.setFocusable(false);
        e4.addActionListener(this);
        e4.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));


        frame.add(fighting_options);
        fighting_options.add(b1);
        fighting_options.add(b2);
        fighting_options.add(b3);
        fighting_options.add(b4);
        b1.add(e1);
        b2.add(e2);
        b3.add(e3);
        b4.add(e4);


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
        commboxtex.setBounds(300, 30, 400, 0);
        commboxtex.setSize(400, 400);
        commboxtex.setBackground(Color.WHITE);
        commboxtex.setVisible(true);
      //  commboxtex.setFocusable(false);





      upgradeMenu = new JPanel();
      upgradeMenu.setForeground(new Color(255,0,150));
      upgradeMenu.setFont(new Font("Times new Roman", Font.PLAIN, 60));
      upgradeMenu.setBounds(680, 150, 400, 400);
      upgradeMenu.setBackground(Color.black);
      upgradeMenu.setVisible(false);
      upgradeMenu.setFocusable(false);
      upgradeMenu.setBorder(new LineBorder(Color.white));
      
      powerUpgradeButton = new JButton();
      powerUpgradeButton.setForeground(new Color(255,255,255));
      powerUpgradeButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
      powerUpgradeButton.setBounds(0, 0, 0, 0);
      powerUpgradeButton.setBackground(Color.black);
      powerUpgradeButton.setVisible(true);
      powerUpgradeButton.setFocusable(false);
      powerUpgradeButton.setAlignmentX(80);
      powerUpgradeButton.addActionListener(this);
      powerUpgradeButton.setActionCommand("PowerUpgrade");
      powerUpgradeButton.setBorder(new LineBorder(Color.white));

      healthUpgradeButton = new JButton();
      healthUpgradeButton.setForeground(new Color(255,255,255));
      healthUpgradeButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
      healthUpgradeButton.setBounds(0, 0, 0, 0);
      healthUpgradeButton.setBackground(Color.black);
      healthUpgradeButton.setVisible(true);
      healthUpgradeButton.setFocusable(false);
      healthUpgradeButton.setAlignmentX(80);
      healthUpgradeButton.addActionListener(this);
      healthUpgradeButton.setActionCommand("HealthUpgrade");
      healthUpgradeButton.setBorder(new LineBorder(Color.white));



      goldUpgradeButton = new JButton();
      goldUpgradeButton.setForeground(new Color(255,255,255));
      goldUpgradeButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
      goldUpgradeButton.setBounds(0, 0, 0, 0);
      goldUpgradeButton.setBackground(Color.black);
      goldUpgradeButton.setVisible(true);
      goldUpgradeButton.setFocusable(false);
      goldUpgradeButton.setAlignmentX(80);
      goldUpgradeButton.addActionListener(this);
      goldUpgradeButton.setActionCommand("GoldUpgrade");
      goldUpgradeButton.setBorder(new LineBorder(Color.white));

      pointsText = new JLabel(" Points:  " + CuPower.Points);
      pointsText.setForeground(new Color(255,255,255));
      pointsText.setFont(new Font("Times new Roman", Font.PLAIN, 40));
      pointsText.setBounds(280, 0, 60, 80);
      pointsText.setBackground(Color.black);
      pointsText.setVisible(true);
      pointsText.setFocusable(false);
      pointsText.setAlignmentX(80);
     // upgrade1.addActionListener(this);
     // upgrade1.setActionCommand("E");
     pointsText.setBorder(new LineBorder(Color.black));


      upgradeMenuButton = new JButton("+");
      upgradeMenuButton.setForeground(Color.white);
      upgradeMenuButton.setFont(new Font("Times new Roman", Font.PLAIN, 40));
      upgradeMenuButton.setBounds(50, 50, 350, 350);
      upgradeMenuButton.setSize(80, 50);
      upgradeMenuButton.setBackground(Color.black);
      upgradeMenuButton.setVisible(true);
      upgradeMenuButton.setFocusable(false);
      upgradeMenuButton.addActionListener(this);
      upgradeMenuButton.setActionCommand("+");
      upgradeMenuButton.setBorder(new LineBorder(Color.white));


      



      i5 = new JLabel();
      i5.setForeground(Color.white);
      i5.setFont(new Font("Times new Roman", Font.PLAIN, 50));
    //  i3.setBounds(200, 400, 400, 0);
    i5.setSize(80, 80);
  //  i5.setBackground(Color.WHITE);
    i5.setVisible(true);
    i5.setFocusable(false);
    i5.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Damage.png").getImage().getScaledInstance(55, 50, Image.SCALE_AREA_AVERAGING)));
    i5.setText("    Power: " + CuPower.Power + " ");
    powerUpgradeButton.add(i5);

    i6 = new JLabel();
    i6.setForeground(Color.white);
    i6.setFont(new Font("Times new Roman", Font.PLAIN, 50));
  //  i3.setBounds(200, 400, 400, 0);
  i6.setSize(80, 80);
//  i5.setBackground(Color.WHITE);
i6.setVisible(true);
i6.setFocusable(false);
i6.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\HealI.png").getImage().getScaledInstance(55, 50, Image.SCALE_AREA_AVERAGING)));
i6.setText("  Health: " + CuPower.Health + " ");
  

i7 = new JLabel();
i7.setForeground(Color.white);
i7.setFont(new Font("Times new Roman", Font.PLAIN, 50));
//  i3.setBounds(200, 400, 400, 0);
i7.setSize(80, 80);
//  i5.setBackground(Color.WHITE);
i7.setVisible(true);
i7.setFocusable(false);
i7.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Coin.png").getImage().getScaledInstance(55, 50, Image.SCALE_AREA_AVERAGING)));
i7.setText("   Gold: " + CuPower.GoldEarn + "x  ");

powerUpgradeButton.add(i5);
healthUpgradeButton.add(i6);
goldUpgradeButton.add(i7);


upgradeMenu.add(pointsText);
upgradeMenu.add(powerUpgradeButton);
upgradeMenu.add(healthUpgradeButton);
upgradeMenu.add(goldUpgradeButton);



elementsMenu = new JPanel();
elementsMenu.setBounds(200, 80, 750, 455);
elementsMenu.setVisible(false);
elementsMenu.setBackground(Color.BLACK);
elementsMenu.setFocusable(false);
        // optionsmenu.setForeground(Color.BLACK);
        elementsMenu.setBorder(new LineBorder(Color.white));


        frame.add(elementsMenu);



        chosen_Main_Element = new JPanel();
        chosen_Main_Element.setForeground(new Color(255,0,150));
        chosen_Main_Element.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        chosen_Main_Element.setBounds(960, 80, 310, 455);
        chosen_Main_Element.setBackground(Color.black);
        chosen_Main_Element.setVisible(false);
        chosen_Main_Element.setFocusable(false);
        chosen_Main_Element.setBorder(new LineBorder(Color.white));


       chosen_Main_Element_Picture = new JLabel();
       chosen_Main_Element_Picture.setForeground(new Color(255,255,255));
       chosen_Main_Element_Picture.setFont(new Font("Times new Roman", Font.PLAIN, 40));
       chosen_Main_Element_Picture.setBounds(280, 0, 60, 80);
       chosen_Main_Element_Picture.setBackground(Color.black);
       chosen_Main_Element_Picture.setVisible(false);
       chosen_Main_Element_Picture.setFocusable(false);
       chosen_Main_Element_Picture.setAlignmentX(80);
       // upgrade1.addActionListener(this);
       // upgrade1.setActionCommand("E");
       chosen_Main_Element_Picture.setBorder(new LineBorder(Color.white));


       chosen_Main_Element_Name = new JLabel("Ancient");
       chosen_Main_Element_Name.setForeground(new Color(255,255,255));
       chosen_Main_Element_Name.setFont(new Font("Times new Roman", Font.PLAIN, 40));
       chosen_Main_Element_Name.setBounds(280, 0, 140, 80);
       chosen_Main_Element_Name.setBackground(Color.black);
       chosen_Main_Element_Name.setVisible(false);
       chosen_Main_Element_Name.setFocusable(false);
       chosen_Main_Element_Name.setAlignmentX(80);
       // upgrade1.addActionListener(this);
       // upgrade1.setActionCommand("E");
       chosen_Main_Element_Name.setBorder(new LineBorder(Color.white));


       chosen_Main_Element_Description = new JTextArea(" Feuer: Strong against Heal and Crystal | weak agains Erde and Wasser");
       chosen_Main_Element_Description.setForeground(new Color(255,255,255));
       chosen_Main_Element_Description.setFont(new Font("Times new Roman", Font.PLAIN, 20));
       chosen_Main_Element_Description.setBounds(280, 0, 290, 180);
       chosen_Main_Element_Description.setBackground(Color.black);
       chosen_Main_Element_Description.setVisible(false);
       chosen_Main_Element_Description.setFocusable(false);
       chosen_Main_Element_Description.setAlignmentX(80);
       chosen_Main_Element_Description.setLineWrap(true);
       // upgrade1.addActionListener(this);
       // upgrade1.setActionCommand("E");

       choose_Element = new JButton(" Wählen ");
       choose_Element.setForeground(new Color(0,255,80));
       choose_Element.setFont(new Font("Times new Roman", Font.PLAIN, 40));
       choose_Element.setBounds(50, 50, 350, 350);
       choose_Element.setSize(80, 50);
       choose_Element.setBackground(Color.black);
       choose_Element.setVisible(false);
       choose_Element.setFocusable(false);
       choose_Element.addActionListener(this);
      // choose_Element.setActionCommand("choose_Element");
       choose_Element.setBorder(new LineBorder(Color.white));

       chosen_Main_Element_Description.setBorder(new LineBorder(Color.white));


       chosen_Main_Element.add(chosen_Main_Element_Picture);
       chosen_Main_Element.add(chosen_Main_Element_Name);
       chosen_Main_Element.add(chosen_Main_Element_Description);
       chosen_Main_Element.add(choose_Element);

        frame.add(chosen_Main_Element);
        JLabel ei;

        for (int e = 0; e < Elemente.elements.length;e++) {
            // System.out.println(c);
            // System.out.println(colors[c]);

          //  if (Elemente.elements[e] != null){

            javax.swing.JButton elemB = new JButton();
            elemB.setForeground(new Color(80,0,255));
            elemB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
            elemB.setBounds(0, 0, 0, 0);
            elemB.setBackground(Color.black);
            elemB.setVisible(true);
            elemB.setFocusable(false);
            elemB.addActionListener(this);
            elemB.setActionCommand(Elemente.elements[e]);
            elemB.setBorder(new LineBorder(Color.white));

            ei = new JLabel();
            ei.setForeground(colors2[c]);
            ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            // color.setBounds(500, 500, 350, 350);
            ei.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[e] + ".png").getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
            ei.setSize(800, 800);
            ei.setBackground(Color.white);
            ei.setVisible(true);
            ei.setFocusable(false);
          //  ei.addActionListener(this);
            //ei.setActionCommand(colors[c]);
            ei.setBorder(new LineBorder(Color.white));
            //ei.setActionCommand(colors[c]);
            // color.setBorder(BorderFactory.createBevelBorder(200, Color.white,
            // Color.BLACK));

        //    elementsMenu.add(ei);
            elementsMenu.add(elemB);
elemB.add(ei);
           // commbox.setVisible(true);

           // if (Elemente.elements[e] == null) {
             //   break;
            //} else {
                
           // }
      //  }


        }

      JButton color;


      commboxnext = new JButton(">");
      commboxnext.setForeground(new Color(255,255,255));
      commboxnext.setFont(new Font("Arial", Font.PLAIN, 25));
      commboxnext.setBounds(700, 500, 75, 35);
      commboxnext.setBackground(Color.black);
      commboxnext.setVisible(true);
      commboxnext.setFocusable(false);
      commboxnext.setAlignmentX(80);
      commboxnext.addActionListener(this);
      commboxnext.setActionCommand("commboxnext1");
      commboxnext.setBorder(new LineBorder(Color.white));


      frame.add(commboxnext);




     //   commbox.add(commboxtex);
        // optionsmenu_colors.setForeground(Color.white);
        // Option1.setBackground(Color.white);
        // Option1 = startname.clone

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

        }

        frame.add(commbox);
        frame.add(upgradeMenuButton);
frame.add(upgradeMenu);

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
        e1.add(i1);
        e2.add(i2);
        e3.add(i3);
        e4.add(i4);
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


        if (e.getActionCommand() == "+") {
            upgradeMenu.setVisible(!upgradeMenu.isVisible());
        }


        if (e.getActionCommand() == "PowerUpgrade") {
            System.out.println("PowerUpgrade");
            if (CuPower.Points >= 1){
                CuPower.Power++;
                i5.setText("    Power: " + CuPower.Power + " ");
                CuPower.Points--;
               pointsText.setText(" Points:  " + CuPower.Points);
            }
        }


        if (e.getActionCommand() == "HealthUpgrade") {
            System.out.println("HealthUpgrade");
            if (CuPower.Points >= 1){
                CuPower.Health = CuPower.Health +5;
                i6.setText("  Health: " + CuPower.Health + " ");
                CuPower.Points--;
               pointsText.setText(" Points:  " + CuPower.Points);
            }
        }


        if (e.getActionCommand() == "GoldUpgrade") {
            if (CuPower.Points >= 1){
                CuPower.GoldEarn = (float) (CuPower.GoldEarn + 0.5);
                i7.setText("   Gold: " + CuPower.GoldEarn + "x  ");
                CuPower.Points--;
               pointsText.setText(" Points:  " + CuPower.Points);
            }
        }

        if (e.getActionCommand() == "startb") {
         //   System.out.println(CuPower.Power);
          //  CuPower.Power++;
          //  option3.setText("Your power is: " + CuPower.Power);
            
            l.setVisible(!l.isVisible());

            // panel3.setVisible(true);
            startname.setVisible(false);
        //    option1.setVisible(false);
            option2.setVisible(false);
         //   option3.setVisible(false);
            options_c.setVisible(false);
            options_ts.setVisible(false);
            optionsmenu.setVisible(false);
            optionsmenu_colors.setVisible(false);
            optionsmenu_colorsoutlines.setVisible(false);
            optionsmenu_options.setVisible(false);
            fighting_options.setVisible(false);
            upgradeMenu.setVisible(false);
            option3.setVisible(false);
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
          //  System.out.println("Dsalkgbw");
         //   frame.add(commboxtex);
        //    l.setVisible(true);
         //   l.setIcon(imageW);

           // commboxtex.setVisible(true);
            frame.setVisible(false);
        //   commboxtex.setIcon(imageW);

        }

        if (e.getActionCommand().equals("options_c")) {
            System.out.println("options_c");
            System.out.println("Dsalkgbw");

            frame.setVisible(false);

        }

        if (e.getActionCommand().equals("Main_Choose")) {
            System.out.println("Main_Choose");
            //System.out.println("Dsalkgbw");
            

           // frame.setVisible(false);
           try {
               
            animateText(" du hast"+ "  '"+chosen_Main_Element_Name.getText()+"'  " +"als Haupt Element gewählt", null,commbox, 12, "");
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
          //  e1.printStackTrace();
        }
        CuPower.Main_Element = chosen_Main_Element_Name.getText();
        choose_Element.setActionCommand("Second_Choose");

        try {
               
            animateText(" Now choose your second Element. Your second Element is weaker than your main Element. But it's still affective", null,commbox, 12, "");
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
          //  e1.printStackTrace();
        }

        for (int t = 0;t<Elemente.elements.length; t++){
        //    System.out.println(Elemente.elements[t]+":"+CuPower.Main_Element);
System.out.println(Elemente.elements[t].charAt(0) + " element");
System.out.println(CuPower.Main_Element.charAt(2) + " Main");
System.out.println(Elemente.elements[t].charAt(1));
System.out.println(CuPower.Main_Element.charAt(3) + " Main");
System.out.println(Elemente.elements[t].charAt(2));
System.out.println(CuPower.Main_Element.charAt(4) + " Main");
            if (Elemente.elements[t].charAt(0) == CuPower.Main_Element.charAt(2) && Elemente.elements[t].charAt(1) == CuPower.Main_Element.charAt(3) && Elemente.elements[t].charAt(2) == CuPower.Main_Element.charAt(4) && Elemente.elements[t].charAt(3) == CuPower.Main_Element.charAt(5)){
                System.out.println("PowerReached");
elementsMenu.getComponent(t).setEnabled(false);
            }
        }

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

        if (e.getActionCommand().equals("commboxnext1")) {

            try {
                commbox2();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
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

        for (v = 0; v < Elemente.elements.length ; v++) {
            if (e.getActionCommand().equals(Elemente.elements[v])) {

                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);

                chosen_Main_Element_Picture.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[v] + ".png").getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
chosen_Main_Element_Name.setText("  " + Elemente.elements[v] + "  ");
chosen_Main_Element_Name.setForeground(Elemente.elemetColors[v]);
chosen_Main_Element_Description.setText("           " + Elemente.elements[v] + " effective agains                      | " + Elemente.elementsPowers[v] + " |");
commbox.setText(Elemente.elements[v] + " " + Elemente.elementsWeaks[v]);

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

   
     //   System.out.println(message.toCharArray());
        // System.out.println(message.length());
        Thread.sleep(1000);
        if (tex!= null){
            tex.setText("");
            if (standardText != null){
                tex.setText(standardText);
            }
        for (Byte m1 = 0; m1 < message.length(); m1++) {
          //  System.out.print(message.charAt(m1));
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
        animateText(" Looks like you are new here", null,commbox, 12, "Welcome to The Day."); // Text in String ist die Nachricht, zweites Wort ist die JLabel, die deren Text geändert sein muss, die Zahl am Ende ist die Geschwindigkeit; je weniger desto schneller
        animateText(" We are going to learn about this game with the tutorial", null,commbox, 12, "Welcome to The Day. Looks like you are new here."); // Text in String ist die Nachricht, zweites Wort ist die JLabel, die deren Text geändert sein muss, die Zahl am Ende ist die Geschwindigkeit; je weniger desto schneller
        animateText(" ....", null,commbox, 350, "Welcome to The Day. Looks like you are new here. We are going to learn about this game with the tutorial."); // Text in String ist die Nachricht, zweites Wort ist die JLabel, die deren Text geändert sein muss, die Zahl am Ende ist die Geschwindigkeit; je weniger desto schneller

        animateText(" So let's begin with the basics", null,commbox, 12, "Welcome to The Day. Looks like you are new here. We are going to learn about this game with the tutorial. ....");

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


        Thread.sleep(3000);
        animateText(" Now choose your main element. Your main element is strongest             element you will get.", null,commbox, 12, null);

        Thread.sleep(1000);

        elementsMenu.setVisible(true);

        chosen_Main_Element.setVisible(true);
choose_Element.setActionCommand("Main_Choose");
        Thread.sleep(500);
        animateText(" Each element has positive and negative things.     For example Crystal is weak against 'Fire' but strong against 'Earth' ", null,commbox, 12, " Now choose your main element. Your main element is strongest             element you will get.");
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

    public void commbox2() throws InterruptedException{
        Thread.sleep(2000);
        animateText(" The first thing you need to know is to never trust anyone in this world. ", null,commbox, 12, null);

        Thread.sleep(3000);
        animateText(" During your adventure you are going to be meeting many enemies. ", null,commbox, 12, " The first thing you need to know is to never trust anyone in this world. ");
        Thread.sleep(2000);
        animateText("        Their main goal is to protect their bosses as long as they can. ", null,commbox, 12, " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.");
        Thread.sleep(2000);
        animateText("               every enemy has different stats such as Speed, HP, Power,etc...", null,commbox, 12, " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.        Their main goal is to protect their bosses as long as they can.  ");


        Thread.sleep(3000);
        animateText(" Now choose your main element. Your main element is strongest             element you will get.", null,commbox, 12, null);

        Thread.sleep(1000);

        elementsMenu.setVisible(true);

        chosen_Main_Element.setVisible(true);
choose_Element.setActionCommand("Main_Choose");
        Thread.sleep(500);
        animateText(" Each element has positive and negative things.     For example Crystal is weak against 'Fire' but strong against 'Earth' ", null,commbox, 12, " Now choose your main element. Your main element is strongest             element you will get.");
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