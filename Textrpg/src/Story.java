import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.lang.StackWalker.Option;
import java.lang.annotation.Repeatable;
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
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.synth.ColorType;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

import org.w3c.dom.css.RGBColor;

public class Story implements ActionListener {

    CuPower spieler = new CuPower();

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
    JButton e2;

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

    // Health //

    JPanel Healthbar;

    // Health //

    // Name //

  static  JTextField texarea;
   static JButton confirmName;

    // Name //

    // EnemyStats //

    static JLabel enemyImage;

    // EnemyStats //

    // element //

    static JLabel elementImage;

    // element //

    byte at;


// EnemyInfo //

JLabel enemyInfoName;
JLabel enemyInfoDifficulty;
JLabel enemyInfoMainElement;
JLabel enemyInfoImage;
JLabel enemyInfoSecondElement;
JLabel enemyInfoHP;
JLabel enemyInfoThirdElement;
JLabel enemyInfoLastElement;

// EnemyInfo

    Enemy en;


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

    public Story(Game game) throws InterruptedException {
        //pGame.cuPower.playerhealdamageanimation(pPanel);
       // Enemy r;
        
        frame = new JFrame();
        // fenster.setSize(1920, 1080);

        // Setzt das Fenster immer auf Fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Entfernt den oberen Rahmen
        frame.setUndecorated(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // r = new Enemy();
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
        i1.setForeground(new Color(255, 0, 160));
        i1.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        // i1.setBounds(200, 400, 400, 0);
        i1.setSize(20, 20);
        i1.setBackground(Color.WHITE);
        i1.setVisible(true);
        i1.setFocusable(false);
        i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage()
                .getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
        i1.setText("        Ancient         ");

        i2 = new JLabel();
        i2.setForeground(new Color(160, 0, 255));
        i2.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        i2.setBounds(200, 400, 400, 0);
        i2.setSize(20, 20);
        i2.setBackground(Color.WHITE);
        i2.setVisible(true);
        i2.setFocusable(false);
        i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Cosmic.png").getImage().getScaledInstance(60,
                60, Image.SCALE_AREA_AVERAGING)));
        i2.setText("    Meteor Attack     ");

        i3 = new JLabel();
        i3.setForeground(new Color(255, 255, 255));
        i3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        // i3.setBounds(200, 400, 400, 0);
        i3.setSize(20, 20);
        i3.setBackground(Color.WHITE);
        i3.setVisible(true);
        i3.setFocusable(false);
        i3.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Damage.png").getImage().getScaledInstance(60,
                60, Image.SCALE_AREA_AVERAGING)));
        i3.setText("        Angriff        ");

        i4 = new JLabel();
        i4.setForeground(new Color(0, 220, 255));
        i4.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        // i3.setBounds(200, 400, 400, 0);
        i4.setSize(20, 20);
        i4.setBackground(Color.WHITE);
        i4.setVisible(true);
        i4.setFocusable(false);
        i4.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal2.png").getImage()
                .getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
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
        fighting_options.setVisible(true);
        fighting_options.setBackground(Color.BLACK);
        fighting_options.setFocusable(true);
        fighting_options.setBounds(38, 480, 1200, 300);
        fighting_options.setBorder(new LineBorder(Color.white));

        ImageIcon url = new ImageIcon("W.png");

        b1 = new JPanel();
        b1.setForeground(new Color(255, 0, 150));
        b1.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b1.setBounds(150, 150, 240, 2540);
        b1.setBackground(Color.black);
        b1.setVisible(true);
        b1.setFocusable(false);
        tn.setIcon(url);
        tn.setText("text");
        // e1.addActionListener(this);
        // e1.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        b2 = new JPanel();
        b2.setForeground(new Color(200, 255, 80));
        b2.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b2.setBounds(150, 150, 240, 2540);
        b2.setBackground(Color.black);
        b2.setVisible(true);
        b2.setFocusable(false);
        // e2.addActionListener(this);
        // e2.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        b3 = new JPanel();
        b3.setForeground(new Color(255, 0, 150));
        b3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b3.setBounds(150, 150, 240, 2540);
        b3.setBackground(Color.black);
        b3.setVisible(true);
        b3.setFocusable(false);
        // e3.addActionListener(this);
        // e3.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        b4 = new JPanel();
        b4.setForeground(new Color(255, 255, 255));
        b4.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b4.setBounds(150, 150, 240, 2540);
        b4.setBackground(Color.black);
        b4.setVisible(true);
        b4.setFocusable(false);
        // e4.addActionListener(this);
        // e4.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        e1 = new JButton();
        e1.setForeground(new Color(255, 0, 140));
        e1.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e1.setBounds(0, 0, 0, 0);
        e1.setBackground(Color.black);
        e1.setVisible(true);
        e1.setFocusable(false);
        e1.addActionListener(this);
        e1.setActionCommand("Attack#1");

        e2 = new JButton();
        e2.setForeground(new Color(80, 0, 255));
        e2.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e2.setBounds(0, 0, 0, 0);
        e2.setBackground(Color.black);
        e2.setVisible(true);
        e2.setFocusable(false);
        e2.addActionListener(this);
        e2.setActionCommand("Attack#2");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        javax.swing.JButton e3 = new JButton();
        e3.setForeground(new Color(255, 255, 255));
        e3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e3.setBounds(0, 0, 0, 0);
        e3.setBackground(Color.black);
        e3.setVisible(true);
        e3.setFocusable(false);
        e3.addActionListener(this);
        e3.setActionCommand("E");
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        javax.swing.JButton e4 = new JButton();
        e4.setForeground(new Color(255, 255, 255));
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
        commbox.setForeground(new Color(60, 60, 60));
        commbox.setFont(new Font("Times new Roman", Font.PLAIN, 30));
        commbox.setBounds(200, 550, 700, 100);
        commbox.setSize(850, 200);
        commbox.setBackground(new Color(200, 200, 200));
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
        // commboxtex.setFocusable(false);

        upgradeMenu = new JPanel();
        upgradeMenu.setForeground(new Color(255, 0, 150));
        upgradeMenu.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        upgradeMenu.setBounds(680, 150, 400, 400);
        upgradeMenu.setBackground(Color.black);
        upgradeMenu.setVisible(false);
        upgradeMenu.setFocusable(false);
        upgradeMenu.setBorder(new LineBorder(Color.white));

        powerUpgradeButton = new JButton();
        powerUpgradeButton.setForeground(new Color(255, 255, 255));
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
        healthUpgradeButton.setForeground(new Color(255, 255, 255));
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
        goldUpgradeButton.setForeground(new Color(255, 255, 255));
        goldUpgradeButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        goldUpgradeButton.setBounds(0, 0, 0, 0);
        goldUpgradeButton.setBackground(Color.black);
        goldUpgradeButton.setVisible(true);
        goldUpgradeButton.setFocusable(false);
        goldUpgradeButton.setAlignmentX(80);
        goldUpgradeButton.addActionListener(this);
        goldUpgradeButton.setActionCommand("GoldUpgrade");
        goldUpgradeButton.setBorder(new LineBorder(Color.white));

        pointsText = new JLabel(" Points:  " + spieler.Points);
        pointsText.setForeground(new Color(255, 255, 255));
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
        // i3.setBounds(200, 400, 400, 0);
        i5.setSize(80, 80);
        // i5.setBackground(Color.WHITE);
        i5.setVisible(true);
        i5.setFocusable(false);
        i5.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Damage.png").getImage().getScaledInstance(55,
                50, Image.SCALE_AREA_AVERAGING)));
        i5.setText("    Power: " + spieler.Power + " ");
        powerUpgradeButton.add(i5);

        i6 = new JLabel();
        i6.setForeground(Color.white);
        i6.setFont(new Font("Times new Roman", Font.PLAIN, 50));
        // i3.setBounds(200, 400, 400, 0);
        i6.setSize(80, 80);
        // i5.setBackground(Color.WHITE);
        i6.setVisible(true);
        i6.setFocusable(false);
        i6.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\HealI.png").getImage().getScaledInstance(55,
                50, Image.SCALE_AREA_AVERAGING)));
        i6.setText("  Health: " + spieler.Health + " ");

        i7 = new JLabel();
        i7.setForeground(Color.white);
        i7.setFont(new Font("Times new Roman", Font.PLAIN, 50));
        // i3.setBounds(200, 400, 400, 0);
        i7.setSize(80, 80);
        // i5.setBackground(Color.WHITE);
        i7.setVisible(true);
        i7.setFocusable(false);
        i7.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Coin.png").getImage().getScaledInstance(55, 50,
                Image.SCALE_AREA_AVERAGING)));
        i7.setText("   Gold: " + spieler.GoldEarn + "x  ");

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
        chosen_Main_Element.setForeground(new Color(255, 0, 150));
        chosen_Main_Element.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        chosen_Main_Element.setBounds(960, 80, 310, 455);
        chosen_Main_Element.setBackground(Color.black);
        chosen_Main_Element.setVisible(true);
        chosen_Main_Element.setFocusable(false);
        chosen_Main_Element.setBorder(new LineBorder(Color.white));

        chosen_Main_Element_Picture = new JLabel();
        chosen_Main_Element_Picture.setForeground(new Color(255, 255, 255));
        chosen_Main_Element_Picture.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        chosen_Main_Element_Picture.setBounds(280, 0, 60, 80);
        chosen_Main_Element_Picture.setBackground(Color.black);
        chosen_Main_Element_Picture.setVisible(true);
        chosen_Main_Element_Picture.setFocusable(false);
        chosen_Main_Element_Picture.setAlignmentX(80);
        // upgrade1.addActionListener(this);
        // upgrade1.setActionCommand("E");
        chosen_Main_Element_Picture.setBorder(new LineBorder(Color.white));

        chosen_Main_Element_Name = new JLabel("Ancient");
        chosen_Main_Element_Name.setForeground(new Color(255, 255, 255));
        chosen_Main_Element_Name.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        chosen_Main_Element_Name.setBounds(280, 0, 140, 80);
        chosen_Main_Element_Name.setBackground(Color.black);
        chosen_Main_Element_Name.setVisible(true);
        chosen_Main_Element_Name.setFocusable(false);
        chosen_Main_Element_Name.setAlignmentX(80);
        // upgrade1.addActionListener(this);
        // upgrade1.setActionCommand("E");
        chosen_Main_Element_Name.setBorder(new LineBorder(Color.white));

        chosen_Main_Element_Description = new JTextArea(
                " Feuer: Strong against Heal and Crystal | weak agains Erde and Wasser");
        chosen_Main_Element_Description.setForeground(new Color(255, 255, 255));
        chosen_Main_Element_Description.setFont(new Font("Times new Roman", Font.PLAIN, 20));
        chosen_Main_Element_Description.setBounds(280, 0, 290, 180);
        chosen_Main_Element_Description.setBackground(Color.black);
        chosen_Main_Element_Description.setVisible(true);
        chosen_Main_Element_Description.setFocusable(false);
        chosen_Main_Element_Description.setAlignmentX(80);
        chosen_Main_Element_Description.setLineWrap(true);
        // upgrade1.addActionListener(this);
        // upgrade1.setActionCommand("E");

        choose_Element = new JButton(" Wählen ");
        choose_Element.setForeground(new Color(0, 255, 80));
        choose_Element.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        choose_Element.setBounds(50, 50, 350, 350);
        choose_Element.setSize(80, 50);
        choose_Element.setBackground(Color.black);
        choose_Element.setVisible(true);
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


texarea = new JTextField(10);
texarea.setBounds(520,400,200,60);
//texarea.setLineWrap(true);
//texarea.setWrapStyleWord(true);
texarea.setVisible(true);
texarea.setBackground(Color.BLACK);
texarea.setForeground(Color.WHITE);
texarea.setFont(new Font("Arial",Font.BOLD,20));
texarea.setBorder(new LineBorder(Color.white));
//texarea.setEditable(true);





JPanel enemyInfo = new JPanel();

enemyInfo.setVisible(true);

enemyInfo.setOpaque(false);

enemyInfo.setFocusable(false);

enemyInfo.setBounds(0, 110, 500, 150);

enemyInfo.setBorder(new LineBorder(Color.white));

 

en = new Enemy(null);

 

enemyInfoImage = new JLabel();

enemyInfoImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Enemies\\DunkleFlamme.png").getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));

enemyInfoImage.setBounds(20,120,140,120);

enemyInfoImage.setForeground(en.enemyColors[0]);

enemyInfoImage.setFont(new Font("Times new Roman", Font.PLAIN, 30));

enemyInfoImage.setBorder(new LineBorder(en.enemyColors[1]));

 

enemyInfoName = new JLabel("  DunkleFlamme  ");

enemyInfoName.setBounds(175,120,300,40);

enemyInfoName.setForeground(en.enemyColors[0]);

enemyInfoName.setFont(new Font("Times new Roman", Font.PLAIN, 30));

enemyInfoName.setBorder(new LineBorder(en.enemyColors[1]));

 

enemyInfoHP = new JLabel("          " +en.enemiesHP[1]);

enemyInfoHP.setBounds(175,170,220,40);

enemyInfoHP.setForeground(Color.red);

enemyInfoHP.setFont(new Font("Times new Roman", Font.PLAIN, 30));

enemyInfoHP.setBorder(new LineBorder(Color.red));

 

enemyInfoMainElement = new JLabel();

enemyInfoMainElement.setBounds(175,215,40,40);

enemyInfoMainElement.setForeground(Color.red);

enemyInfoMainElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));

//enemyInfoMainElement.setBorder(new LineBorder(Color.red));

enemyInfoMainElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Main_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
 

enemyInfoSecondElement = new JLabel();

enemyInfoSecondElement.setBounds(220,215,40,40);

enemyInfoSecondElement.setForeground(Color.red);

enemyInfoSecondElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));

//enemyInfoMainElement.setBorder(new LineBorder(Color.red));

enemyInfoSecondElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Second_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

enemyInfoThirdElement = new JLabel();

enemyInfoThirdElement.setBounds(265,215,40,40);

enemyInfoThirdElement.setForeground(Color.red);

enemyInfoThirdElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));

//enemyInfoMainElement.setBorder(new LineBorder(Color.red));

enemyInfoThirdElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Third_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));


enemyInfoLastElement = new JLabel();

enemyInfoLastElement.setBounds(310,215,40,40);

enemyInfoLastElement.setForeground(Color.red);

enemyInfoLastElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));

//enemyInfoMainElement.setBorder(new LineBorder(Color.red));

enemyInfoLastElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Last_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));




enemyInfoDifficulty = new JLabel(en.enemyDifficulty[0]);

enemyInfoDifficulty.setBounds(450,220,40,40);

enemyInfoDifficulty.setForeground(en.difficultyColors[0]);

enemyInfoDifficulty.setFont(new Font("Times new Roman", Font.PLAIN, 20));

//enemyInfoMainElement.setBorder(new LineBorder(Color.red));

frame.add(enemyInfoDifficulty);

frame.add(enemyInfoMainElement);

frame.add(enemyInfoSecondElement);

frame.add(enemyInfoThirdElement);

frame.add(enemyInfoLastElement);

frame.add(enemyInfoName);

frame.add(enemyInfoHP);

frame.add(enemyInfo);

frame.add(enemyInfoImage);


confirmName = new JButton("/");
confirmName.setForeground(new Color(255, 255, 255));
confirmName.setFont(new Font("Times new Roman", Font.PLAIN, 60));
confirmName.setBounds(740, 400, 60, 60);
confirmName.setBackground(Color.black);
confirmName.setVisible(true);
confirmName.setFocusable(false);
confirmName.addActionListener(this);
confirmName.setActionCommand("ConfirmName");
confirmName.setBorder(new LineBorder(Color.white));

elementImage = new JLabel();

elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Cosmic.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

elementImage.setBounds(500,280,400,400);

elementImage.setForeground(en.enemyColors[0]);

elementImage.setVisible(false);

frame.add(elementImage);


 enemyImage = new JLabel();

enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Enemies\\DunkleFlamme.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

enemyImage.setBounds(500,280,400,400);

enemyImage.setForeground(en.enemyColors[0]);

enemyImage.setVisible(false);


frame.add(enemyImage);

frame.add(texarea);
frame.add(confirmName);
        JLabel ei;

        for (int e = 0; e < Elemente.elements.length; e++) {
            // System.out.println(c);
            // System.out.println(colors[c]);

            // if (Elemente.elements[e] != null){

            javax.swing.JButton elemB = new JButton();
            elemB.setForeground(new Color(80, 0, 255));
            elemB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
            elemB.setBounds(0, 0, 0, 0);
            elemB.setBackground(Color.black);
            elemB.setVisible(true);
            elemB.setFocusable(false);
            elemB.addActionListener(this);
            elemB.setActionCommand(Elemente.elements[e]);
            choose_Element.setActionCommand("Main_Choose");
            elemB.setBorder(new LineBorder(Color.white));

            ei = new JLabel();
            ei.setForeground(colors2[c]);
            ei.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            // color.setBounds(500, 500, 350, 350);
            ei.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[e] + ".png")
                    .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
            ei.setSize(800, 800);
            ei.setBackground(Color.white);
            ei.setVisible(true);
            ei.setFocusable(false);
            // ei.addActionListener(this);
            // ei.setActionCommand(colors[c]);
            ei.setBorder(new LineBorder(Color.white));
            // ei.setActionCommand(colors[c]);
            // color.setBorder(BorderFactory.createBevelBorder(200, Color.white,
            // Color.BLACK));

            // elementsMenu.add(ei);
            elementsMenu.add(elemB);
            elemB.add(ei);
            // commbox.setVisible(true);

            // if (Elemente.elements[e] == null) {
            // break;
            // } else {

            // }
            // }

        }

        JButton color;

        commboxnext = new JButton(">");
        commboxnext.setForeground(new Color(255, 255, 255));
        commboxnext.setFont(new Font("Arial", Font.PLAIN, 25));
        commboxnext.setBounds(700, 500, 75, 35);
        commboxnext.setBackground(Color.black);
        commboxnext.setVisible(true);
        commboxnext.setFocusable(false);
        commboxnext.setAlignmentX(80);
        commboxnext.addActionListener(this);
        commboxnext.setActionCommand("commboxnext1");
        commboxnext.setBorder(new LineBorder(Color.white));

        // TODO FIX
       // peterlustig.playerhealdamageanimation(Healthbar);

        frame.add(commboxnext);

        // commbox.add(commboxtex);
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


        while (startname.isVisible() == false) {
            Loading();
            Thread TH = new Thread();
            TH.sleep(1000);
             System.out.println("x");
            if (l.isVisible() == true) {
                Loading();
                l.setVisible(false);
            //    break;
            }
            if (elementImage.isVisible()==true){
                System.out.println("Ddfgwiopg");
                if (at == 1){
                    animateElement(spieler.Main_Element,null,(byte) 1);
                }
                if (at == 2){
                    System.out.println("at = 2");;
                    animateElement(null,spieler.Second_Element,(byte) 2);
                }
            }
        }

        for (int t = 1; t<50000; t++){
         //   enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
            for (int a = 1; a<80; a++){
        enemyImage.setBounds(480+a,280,400,400);
            Thread.sleep(3);
                     }
        
                     for (int a = 1; a<80; a++){
                        enemyImage.setBounds(560-a,280,400,400);
                            Thread.sleep(3);
                                     }
           
            
           
                   }



        i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));

        for (int t = 1; t<50; t++){
            i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
            for (int a = 1; a<18; a++){
            i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Ancient\\" + a + ".png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
            Thread.sleep(0);
                     }
           
            
           
                   }



        // addActionListener((ActionListener) new ActionListiner());{
        // kann gelöscht werden delete comment after

    }

    int i;
    int n1;
    char c;
    String t = "loading:";

    java.awt.event.ActionEvent e;

    public void clickEvenet(java.awt.event.ActionEvent d) throws InterruptedException {
        if (d.getSource() == this.option3) {
        //    damage("Anc", "E");
            System.out.print("D");
        }
    }
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
        //    texarea.setEditable(false);
          //  texarea.setText("D");
          spawnEnemy("Bosses", 0, 0, 0);
        }

        if (e.getActionCommand() == "PowerUpgrade") {
            System.out.println("PowerUpgrade");
            if (spieler.Points >= 1) {
                spieler.Power++;
                i5.setText("    Power: " + spieler.Power + " ");
                spieler.Points--;
                pointsText.setText(" Points:  " + spieler.Points);
            }
        }

        if (e.getActionCommand() == "HealthUpgrade") {
            System.out.println("HealthUpgrade");
            if (spieler.Points >= 1) {
                spieler.Health = spieler.Health + 5;
                i6.setText("  Health: " + spieler.Health + " ");
                spieler.Points--;
                pointsText.setText(" Points:  " + spieler.Points);
            }
        }

        if (e.getActionCommand() == "GoldUpgrade") {
            if (spieler.Points >= 1) {
                spieler.GoldEarn = (float) (spieler.GoldEarn + 0.5);
                i7.setText("   Gold: " + spieler.GoldEarn + "x  ");
                spieler.Points--;
                pointsText.setText(" Points:  " + spieler.Points);
            }
        }

        if (e.getActionCommand() == "startb") {
            // System.out.println(CuPower.Power);
            // CuPower.Power++;
            // option3.setText("Your power is: " + CuPower.Power);

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

   /*     if (e.getActionCommand() == "option3") {
            System.out.println("option3");
            // System.out.println("Dsalkgbw");
            // frame.add(commboxtex);
            // l.setVisible(true);
            // l.setIcon(imageW);

            // commboxtex.setVisible(true);
            frame.setVisible(false);
            // commboxtex.setIcon(imageW);

        }
*/

        if (e.getActionCommand() == "ConfirmName") {
           // texarea.setEditable(false);
           spieler.playerName = texarea.getText();
           System.out.println(spieler.playerName);
           System.out.println(texarea.getText());

texarea.setVisible(false);
confirmName.setVisible(false);
texarea.setEditable(false);
commbox.setVisible(true);
option1.setVisible(false);
fighting_options.setVisible(true);





           commbox.setText(" Welcome " + "'"+texarea.getText()+"'" + ", your name is terrible.                                                    Now choose your main element. Your main element is strongest             element you will get.  Each element has positive and negative things.     For example Crystal is weak against 'Fire' but strong against 'Earth' ");

         //  Thread.sleep(spieler.thread1);
          // spieler.thread1 = 1000;
   
   
           elementsMenu.setVisible(true);
   
           chosen_Main_Element.setVisible(true);
           choose_Element.setActionCommand("Main_Choose");
        }

        if (e.getActionCommand().equals("options_c")) {
            System.out.println("options_c");
            System.out.println("Dsalkgbw");

            frame.setVisible(false);

        }

        if (e.getActionCommand().equals("Main_Choose")) {
            System.out.println("Main_Choose");
            // System.out.println("Dsalkgbw");

            // frame.setVisible(false);
            try {

                animateText(
                        " du hast" + "  '" + chosen_Main_Element_Name.getText() + "'  " + "als Haupt Element gewählt",
                        null, commbox, spieler.textSpeed, "");
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                // e1.printStackTrace();
            }
            spieler.Main_Element = chosen_Main_Element_Name.getText();
            choose_Element.setActionCommand("Second_Choose");

            try {

                animateText(
                        " Now choose your second Element. Your second Element is weaker than your main Element. But it's still affective",
                        null, commbox, spieler.textSpeed, "");
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                // e1.printStackTrace();
            }

            for (int t = 0; t < Elemente.elements.length; t++) {
                // System.out.println(Elemente.elements[t]+":"+CuPower.Main_Element);
                System.out.println(Elemente.elements[t].charAt(0) + " element");
                System.out.println(spieler.Main_Element.charAt(2) + " Main");
                System.out.println(Elemente.elements[t].charAt(1));
                System.out.println(spieler.Main_Element.charAt(3) + " Main");
                System.out.println(Elemente.elements[t].charAt(2));
                System.out.println(spieler.Main_Element.charAt(4) + " Main");
                if (Elemente.elements[t].charAt(0) == spieler.Main_Element.charAt(2)
                        && Elemente.elements[t].charAt(1) == spieler.Main_Element.charAt(3)
                        && Elemente.elements[t].charAt(2) == spieler.Main_Element.charAt(4)
                        && Elemente.elements[t].charAt(3) == spieler.Main_Element.charAt(5)) {
                    System.out.println("PowerReached");
                    // chosen_Main_Element.setVisible(false);
                    i1.setIcon(
                            new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[t] + ".png")
                                    .getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                    i1.setText(Elemente.elementsName[t]);
                    i1.setForeground(Elemente.elemetColors[t]);
                    elementsMenu.getComponent(t).setEnabled(false);

                }
            }



        }

        // fighting_options.setVisible(true);

        if (e.getActionCommand().equals("Second_Choose")) {
            System.out.println("Second_Choose");
            // System.out.println("Dsalkgbw");

            // frame.setVisible(false);
            try {

                animateText(
                        " du hast" + "  '" + chosen_Main_Element_Name.getText() + "'  " + "als Second Element gewählt",
                        null, commbox, spieler.textSpeed, "");
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                // e1.printStackTrace();
            }
            spieler.Second_Element = chosen_Main_Element_Name.getText();
            choose_Element.setActionCommand("/");

            for (int t = 0; t < Elemente.elements.length; t++) {
                // System.out.println(Elemente.elements[t]+":"+CuPower.Main_Element);
                // System.out.println(Elemente.elements[t].charAt(0) + " element");
                // System.out.println(CuPower.Main_Element.charAt(2) + " Main");
                // System.out.println(Elemente.elements[t].charAt(1));
                // System.out.println(CuPower.Main_Element.charAt(3) + " Main");
                // System.out.println(Elemente.elements[t].charAt(2));
                // System.out.println(CuPower.Main_Element.charAt(4) + " Main");
                if (Elemente.elements[t].charAt(0) == spieler.Second_Element.charAt(2)
                        && Elemente.elements[t].charAt(1) == spieler.Second_Element.charAt(3)
                        && Elemente.elements[t].charAt(2) == spieler.Second_Element.charAt(4)
                        && Elemente.elements[t].charAt(3) == spieler.Second_Element.charAt(5)) {
                    // System.out.println("PowerReached");
                    System.out.println(Elemente.elements[t]);
                    i2.setIcon(
                            new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[t] + ".png")
                                    .getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                    i2.setText(Elemente.elementsName[t]);
                    i2.setForeground(Elemente.elemetColors[t]);
                    chosen_Main_Element.setVisible(false);
                    elementsMenu.getComponent(t).setEnabled(false);

                    try {

                        animateText(" You have chosen" + spieler.Main_Element + "as the main element and "
                                + spieler.Second_Element + "as the second element", null, commbox, spieler.textSpeed, "");
                    } catch (InterruptedException e1) {
                        // TODO Auto-generated catch block
                        // e1.printStackTrace();
                    }

                }
            }

        }



        if (e.getActionCommand().equals("Attack#1")) {
       //  Fight.fightAnimation(CuPower.Main_Element);
       elementImage.setBounds(5000,280,400,400);
//spieler.Main_Element = "  " +"Cosmic"+ "  ";
       e2.setEnabled(false);
       elementImage.setVisible(true);
       System.out.println(elementImage.isVisible());
       e2.setEnabled(true);
at = 1;
     //  damage("Anc", "D");
        }


        if (e.getActionCommand().equals("Attack#2")) {
            //  Fight.fightAnimation(CuPower.Main_Element);
            elementImage.setBounds(5000,280,400,400);
     //spieler.Main_Element = "  " +"Cosmic"+ "  ";
            e1.setEnabled(false);
            elementImage.setVisible(true);
            System.out.println(elementImage.isVisible());
            at = 2;
            e1.setEnabled(true);

          //  damage("Anc", "D");
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
            uit++;
spieler.textSpeed = 0;
spieler.thread1 = 0;
spieler.thread2 = 0;
spieler.thread3 = 0;
spieler.thread1 = (Integer) null;

spieler.thread2 = (Integer) null;

spieler.thread3 = (Integer) null;


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

        for (v = 0; v < Elemente.elements.length; v++) {
            if (e.getActionCommand().equals(Elemente.elements[v])) {

                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);

                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[v] + ".png")
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText("  " + Elemente.elements[v] + "  ");
                chosen_Main_Element_Name.setForeground(Elemente.elemetColors[v]);
                chosen_Main_Element_Description.setText("           " + Elemente.elements[v]
                        + " effective agains                      | " + Elemente.elementsPowers[v] + " |");
                commbox.setText(Elemente.elements[v] + " " + Elemente.elementsWeaks[v]);

            }
        }

    }
    // Ren();


  //  public void damage(String element, String enemyMainElement){

   //     if (element == "Anc"){

        //    for(int d = 0;d<spieler.Power;d++){
//option1.setText(""+d+"");
//Fight fight = new Fight();
//fight.fight("Anc", elementImage);
    //        }
     //   }
  //  }
//
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


    public void animateElement(String main_element, String second_element, byte n) throws InterruptedException {


        // Ancient //

/*
        for (int xi = 0; xi<= 14; xi++){
            fighting_options.setBounds(38, 480 - xi*5, 1200, 300);
            Thread.sleep(2);
                }

                Thread.sleep(40);

                
*/


elementImage.setVisible(false);
    
        if (main_element!= null && main_element.charAt(2) == 'A' && main_element.charAt(3) == 'n' && main_element.charAt(4) == 'c' && n== 1 || second_element != null && spieler.Second_Element.charAt(2) == 'A' && spieler.Second_Element.charAt(3) == 'n' && spieler.Second_Element.charAt(4) == 'c' && n== 2){
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(4);
                    }
    
                    
                    Thread.sleep(200);
    
            elementImage.setBounds(500,280,400,400);
            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));


            elementImage.setVisible(false);

            System.out.println("Ancient=Main");
            for (int t = 1; t<4; t++){
                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                //   enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                   for (int a = 1; a<18; a++){
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Ancient\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                   Thread.sleep(0);
                   if (a >= 17){
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                }
                            }
               
                            for (int a = 1; a<18; a++){
                                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Ancient\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                                Thread.sleep(0);
                                if (a >= 17){
                                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                                }
                                            }
                  
                                            elementImage.setVisible(true);
                  
                          }

                          elementImage.setVisible(false);
                          for (int xi = 0; xi<= 120; xi++){
                            fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                            Thread.sleep(4);
                                }


               }


               // Ancient //
        System.out.println("animateElement");


        if (main_element!= null && main_element.charAt(2) == 'C' && main_element.charAt(3) == 'o' && main_element.charAt(4) == 's' && main_element.charAt(5) == 'm' && main_element.charAt(6) == 'i' && main_element.charAt(7) == 'c' || second_element != null && second_element.charAt(4) == 's' && second_element.charAt(5) == 'm' && second_element.charAt(6) == 'i' && second_element.charAt(7) == 'c' && n==2){
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(4);
                    }
    
                    Thread.sleep(200);
    
            elementImage.setBounds(700,80,400,400);
            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Cosmic.png").getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));


            elementImage.setVisible(true);

            System.out.println("Cosmic=Main");
           
        //    elementImage.setBounds(elementImage.getBounds().x + 200, elementImage.getBounds().y - 200, 400, 400);

            elementImage.setEnabled(true);
            for (int t = 0; t<100; t++){
                elementImage.setBounds(elementImage.getBounds().x - 1, elementImage.getBounds().y + 1, 400, 400);
Thread.sleep(15);
            }

            elementImage.setEnabled(true);
            for (int t = 1; t<30; t++){
                elementImage.setBounds(elementImage.getBounds().x - t, elementImage.getBounds().y + t, 400, 400);
Thread.sleep(9);
            }

            elementImage.setVisible(false);
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                Thread.sleep(4);
                    }
          }


          if (main_element != null && main_element.charAt(2) == 'C' && main_element.charAt(3) == 'r' && main_element.charAt(4) == 'y' && main_element.charAt(5) == 's' && main_element.charAt(6) == 't' && main_element.charAt(7) == 'a' && main_element.charAt(8) == 'l' || second_element != null && second_element.charAt(2) == 'C' && second_element.charAt(3) == 'r' && second_element.charAt(4) == 'y' && second_element.charAt(5) == 's' && second_element.charAt(6) == 't' && second_element.charAt(7) == 'a' && second_element.charAt(8) == 'l' && n==2){
         elementsMenu.setVisible(false);
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(4);
                    }
    

                    Thread.sleep(200);
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                    elementImage.setBounds(elementImage.getBounds().x, elementImage.getBounds().y, 100, 100);

            elementImage.setVisible(true);

            System.out.println("Crystal=Main");
           
          for (int t = 0; t<2; t++){
            elementImage.setBounds(500,280,0,0);

            elementImage.setBounds(elementImage.getBounds().x - 50, elementImage.getBounds().y,200,200);
            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(160, 155, Image.SCALE_AREA_AVERAGING)));

Thread.sleep(40);
elementImage.setBounds(elementImage.getBounds().x + 100, elementImage.getBounds().y, 120, 120);
elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(120, 115, Image.SCALE_AREA_AVERAGING)));

Thread.sleep(40);
elementImage.setBounds(elementImage.getBounds().x, elementImage.getBounds().y+100, 110, 110);
elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(110, 105, Image.SCALE_AREA_AVERAGING)));

Thread.sleep(40);
elementImage.setBounds(elementImage.getBounds().x - 50, elementImage.getBounds().y, 140, 140);
elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));

Thread.sleep(40);

          }

          Thread.sleep(80);

          for (int xi = 0; xi<= 120; xi++){
            fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
            Thread.sleep(4);
                }

          elementImage.setVisible(false);

          }



          if (main_element != null && main_element.charAt(2) == 'E' && main_element.charAt(3) == 'r' && main_element.charAt(4) == 'd' && main_element.charAt(5) == 'e' || second_element != null && second_element.charAt(2) == 'E' && second_element.charAt(3) == 'r' && second_element.charAt(4) == 'd' && second_element.charAt(5) == 'e'){
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(4);
                    }
    
                    Thread.sleep(200);
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Erde.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

    
            elementImage.setBounds(500,-100,400,400);

            elementImage.setVisible(true);
            elementsMenu.setVisible(false);

            System.out.println("Earth=Main");
           

                //   enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                   for (int a = 1; a<95; a++){
                    elementImage.setBounds(500,-100 + a*4,400,400);

                   Thread.sleep(5);
                
                            }
               
                            Thread.sleep(300);
                  

                          elementImage.setVisible(false);
                          for (int xi = 0; xi<= 120; xi++){
                            fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                            Thread.sleep(4);
                                }


               }



               if (main_element != null && main_element.charAt(2) == 'F' && main_element.charAt(3) == 'e' && main_element.charAt(4) == 'u' && main_element.charAt(5) == 'e' && main_element.charAt(6) == 'r' || second_element != null && second_element.charAt(2) == 'F' && second_element.charAt(3) == 'e' && second_element.charAt(4) == 'u' && second_element.charAt(5) == 'e' && second_element.charAt(6) == 'r'){
                for (int xi = 0; xi<= 120; xi++){
                    fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                    Thread.sleep(4);
                        }
        
                        Thread.sleep(200);
        
                elementImage.setBounds(500,50,400,400);
    
                elementImage.setVisible(true);
                elementsMenu.setVisible(false);
    
                System.out.println("Feuer=Main");
               
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Feuer.png").getImage().getScaledInstance(300, 295, Image.SCALE_AREA_AVERAGING)));
    
                    //   enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                       for (int a = 1; a<100; a++){
                        elementImage.setBounds(500,100 + a*2,400,400);
    
                       Thread.sleep(8);
                    
                                }
                   
                                Thread.sleep(50);
                      
    
                              elementImage.setVisible(false);
                              for (int xi = 0; xi<= 120; xi++){
                                fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                                Thread.sleep(4);
                                    }
    
    
                   }
    



                   if (main_element != null && main_element.charAt(2) == 'G' && main_element.charAt(3) == 'r' && main_element.charAt(4) == 'a' || second_element != null && second_element.charAt(2) == 'G' && second_element.charAt(3) == 'r' && second_element.charAt(4) == 'a'){
                    for (int xi = 0; xi<= 120; xi++){
                        fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                        Thread.sleep(4);
                            }
            
                            Thread.sleep(200);
            
                            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Gravity.png").getImage().getScaledInstance(370, 50, Image.SCALE_AREA_AVERAGING)));

                    elementImage.setBounds(500,480,400,400);
        
                    elementsMenu.setVisible(false);
        
                    System.out.println("Gravity=Main");

                 //   for (int a = 1; a<37; a++){
                        elementImage.setVisible(true);

                    //    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Gravity\\" + a + ".png").getImage().getScaledInstance(370, 50, Image.SCALE_AREA_AVERAGING)));
    
                   //    Thread.sleep(0);

                   //             }

                    for (int t = 1; t<5; t++){
                    //    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Gravity.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
        
                        //   enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                           for (int a = 1; a<37; a++){
                            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Gravity\\" + a + ".png").getImage().getScaledInstance(370, 50, Image.SCALE_AREA_AVERAGING)));
        
                           Thread.sleep(0);

                                    }



                                   
                       
                          
                                                    elementImage.setVisible(true);
                          
                                  }
        
                                  elementImage.setVisible(false);
                                  for (int xi = 0; xi<= 120; xi++){
                                    fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                                    Thread.sleep(4);
                                        }
        


        
                       }



                       if (main_element != null && main_element.charAt(2) == 'L' && main_element.charAt(3) == 'i' && main_element.charAt(4) == 'c' || second_element != null && second_element.charAt(2) == 'L' && second_element.charAt(3) == 'i' && second_element.charAt(4) == 'c'){
                        for (int xi = 0; xi<= 120; xi++){
                            fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                            Thread.sleep(4);
                                }
                
                                Thread.sleep(200);
                
                                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Licht.png").getImage().getScaledInstance(370, 50, Image.SCALE_AREA_AVERAGING)));
    
                        elementImage.setBounds(500,280,400,400);
            
                        elementsMenu.setVisible(false);
            
                        System.out.println("Gravity=Main");
    
                     //   for (int a = 1; a<37; a++){
                            elementImage.setVisible(true);


                            for (int a = 1; a<13; a++){
                                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Licht\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
            
                               Thread.sleep(20);
    
                                        }

                                   
                                                    elementImage.setVisible(false);
                                                    for (int xi = 0; xi<= 120; xi++){
                                                      fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                                                      Thread.sleep(4);
                                                          }
                       }
                    
                 


          Thread.sleep(40);


/*
          elementImage.setVisible(false);
          for (int xi = 0; xi<= 14; xi++){
            fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
            Thread.sleep(2);
                }
*/

    
    }

    String animateTextphases[] = {
        "Welcome to The Day.",
        " Looks like you are new here",
        " We are going to learn about this game with the tutorial",
        " ....",
        " So let's begin with the basics",
        " The first thing you need to know is to never trust anyone in this world. ",
        " During your adventure you are going to be meeting many enemies. ",
        "        Their main goal is to protect their bosses as long as they can. ",
        "               every enemy has different stats such as Speed, HP, Power,etc...",
    };





    String animateTextphasesdef[] = {
        null,
        "Welcome to The Day.",
        "Welcome to The Day. Looks like you are new here.",
        "Welcome to The Day. Looks like you are new here. We are going to learn about this game with the tutorial.",
        "Welcome to The Day. Looks like you are new here. We are going to learn about this game with the tutorial. ....",
        null,
        " The first thing you need to know is to never trust anyone in this world. ",
        " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.",
        " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.        Their main goal is to protect their bosses as long as they can.  ",
    }; 





    int uit;

    public void animateText(String message, JLabel tex, JTextArea a, int w, String standardText)
            throws InterruptedException {

        // System.out.println(message.toCharArray());
        // System.out.println(message.length());
        Thread.sleep(1000);
        if (tex != null) {
            tex.setText("");
            if (standardText != null) {
                tex.setText(standardText);
            }
            for (Byte m1 = 0; m1 < message.length(); m1++) {
                // System.out.print(message.charAt(m1));
                // Option1.setText(message.charAt(m1));
                tex.setText(tex.getText() + message.charAt(m1));
                Thread.sleep(w);
            }

            // commbox.setText(l.getText() + message.charAt(m1));
        }

        if (a != null) {
            a.setText("");
            if (standardText != null) {
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

        Thread.sleep(spieler.thread1);

        System.out.println("D");
        commbox.setText(
                "                                                                                                                                                                                                                            ");
        commbox.setVisible(true);
if (uit == 0){
        animateText(animateTextphases[0], null, commbox, spieler.textSpeed, animateTextphasesdef[0]); // Text in String ist die Nachricht, zweites Wort
                                                                     // ist die JLabel, die deren Text geändert sein
                                                                     // muss, die Zahl am Ende ist die Geschwindigkeit;
                                                                     // je weniger desto schneller
                                                                     spieler.textSpeed = 14;
                                                                     uit++;
}
if (uit == 1){

        animateText(animateTextphases[1], l, null, spieler.textSpeed, animateTextphasesdef[1]); // Text in String ist die
                                                                                         // Nachricht, zweites Wort ist
                                                                                         // die JLabel, die deren Text
                                                                                         // geändert sein muss, die Zahl
                                                                                         // am Ende ist die
                                                                                         // Geschwindigkeit; je weniger
                                                                                         // desto schneller
                                                                                         uit++;
                                                                                         Thread.sleep(spieler.thread2);
                                                                                         spieler.thread2 = 2000;
                                                                                         
}

if (uit == 2){
    uit++;

        animateText(" We are going to learn about this game with the tutorial", null, commbox, spieler.textSpeed,
                "Welcome to The Day. Looks like you are new here."); // Text in String ist die Nachricht, zweites Wort
                                                                     // ist die JLabel, die deren Text geändert sein
                                                                     // muss, die Zahl am Ende ist die Geschwindigkeit;
                                                                     // je weniger desto schneller
}
if (uit == 3){
    uit++;

        animateText(" ....", null, commbox, spieler.textSpeed *20,
                "Welcome to The Day. Looks like you are new here. We are going to learn about this game with the tutorial."); // Text
                                 spieler.textSpeed = 14;
                                                                                                     // in
                                                                                           }                                                                                           // String
                                                                                                                              // ist
                                                                                                                              // die
                                                                                                                              // Nachricht,
                                                                                                                              // zweites
                                                                                                                              // Wort
                                                                                                                              // ist
                                                                                                                              // die
                                                                                                                              // JLabel,
                                                                                                                              // die
                                                                                                                              // deren
                                                                                                                              // Text
                                                                                                                              // geändert
                                                                                                                              // sein
                                                                                                                              // muss,
                                                                                                                              // die
                                                                                                                              // Zahl
                                                                                                                              // am
                                                                                                                              // Ende
                                                                                                                              // ist
                                                                                                                              // die
                                                                                                                              // Geschwindigkeit;
                                                                                                                              // je
                                                                                                                              // weniger
                                                                                                                              // desto
                                                                                                                              // schneller
if (uit == 4){
    uit++;

        animateText(" So let's begin with the basics", null, commbox, spieler.textSpeed,
                "Welcome to The Day. Looks like you are new here. We are going to learn about this game with the tutorial. ....");
                spieler.textSpeed = 14;

Thread.sleep(spieler.thread2);
spieler.thread2 = 2000;
}



        // panel3.add(commbox);

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

        Thread.sleep(spieler.thread1);
        commbox.setText("");
        commbox.setVisible(true);
        commbox.setBackground(Color.black);
        commbox.setForeground(Color.white);
        commbox.setBorder(new LineBorder(Color.white));
        if (uit == 5){
            uit++;

        animateText(" The first thing you need to know is to never trust anyone in this world. ", null, commbox, spieler.textSpeed,
                null);
                spieler.textSpeed = 14;
        

        Thread.sleep(spieler.thread3);
        spieler.thread3 = 3000;
        }


        if (uit == 6){
            uit++;

        animateText(" During your adventure you are going to be meeting many enemies. ", null, commbox, spieler.textSpeed,
                " The first thing you need to know is to never trust anyone in this world. ");
                spieler.textSpeed = 14;

        Thread.sleep(spieler.thread2);
        spieler.thread2 = 2000;
        }

        
        if (uit == 7){

        animateText("        Their main goal is to protect their bosses as long as they can. ", null, commbox, spieler.textSpeed,
           
        " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.");
        spieler.textSpeed = 14;

        Thread.sleep(spieler.thread2);
        spieler.thread2 = 2000;
        }

        if (uit == 8){
uit++;

        animateText("               every enemy has different stats such as Speed, HP, Power,etc...", null, commbox, spieler.textSpeed,
                " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.        Their main goal is to protect their bosses as long as they can.  ");

                spieler.textSpeed = 14;
        }

             //   Thread.sleep(3000);
                animateText(" First, enter your name.", null, commbox, spieler.textSpeed, null);
                elementImage.setVisible(true);

                spieler.textSpeed = 14;


        texarea.setVisible(true);
        confirmName.setVisible(true);
        Thread.sleep(spieler.thread3);
        spieler.thread3 = 3000;
/*
        if (uit == 14){


        animateText(" Now choose your main element. Your main element is strongest             element you will get.", null, commbox, spieler.textSpeed, null);

        Thread.sleep(spieler.thread1);
        spieler.thread1 = 1000;


        elementsMenu.setVisible(true);

        chosen_Main_Element.setVisible(true);
        choose_Element.setActionCommand("Main_Choose");
        Thread.sleep(spieler.thread1 / 2);
        animateText(
                " Each element has positive and negative things.     For example Crystal is weak against 'Fire' but strong against 'Earth' ",
                null, commbox, spieler.textSpeed,
                " Now choose your main element. Your main element is strongest             element you will get.");
        }
        */
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

    public void commbox2() throws InterruptedException {
        Thread.sleep(spieler.thread2);
        animateText(" The first thing you need to know is to never trust anyone in this world. ", null, commbox, spieler.textSpeed,
                null);

        Thread.sleep(spieler.thread3);
        spieler.thread3 = 3000;

        animateText(" During your adventure you are going to be meeting many enemies. ", null, commbox, spieler.textSpeed,
                " The first thing you need to know is to never trust anyone in this world. ");
        Thread.sleep(spieler.thread2);
        spieler.thread2 = 2000;

        animateText("        Their main goal is to protect their bosses as long as they can. ", null, commbox, spieler.textSpeed,
                " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.");
        Thread.sleep(spieler.thread2);
        spieler.thread2 = 2000;

        animateText("               every enemy has different stats such as Speed, HP, Power,etc...", null, commbox, spieler.textSpeed,
                " The first thing you need to know is to never trust anyone in this world.  During your adventure you are going to be meeting many enemies.        Their main goal is to protect their bosses as long as they can.  ");

        Thread.sleep(spieler.thread3);
        spieler.thread3 = 3000;

        animateText(" Now choose your main element. Your main element is strongest             element you will get.",
                null, commbox, spieler.textSpeed, null);

        Thread.sleep(spieler.thread1);
        spieler.thread1 = 1000;

        elementsMenu.setVisible(true);
        chosen_Main_Element.setVisible(true);
        choose_Element.setActionCommand("Main_Choose");
        Thread.sleep(spieler.thread1/2);
        animateText(
                " Each element has positive and negative things.     For example Crystal is weak against 'Fire' but strong against 'Earth' ",
                null, commbox, spieler.textSpeed,
                " Now choose your main element. Your main element is strongest             element you will get.");
    }


    



    public void spawnEnemy(String File, int Index, int HP, int Power) {

        
        if (File == "Enemies"){
            enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Enemies\\" + en.enemies[Index] + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
            enemyInfoImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Enemies\\" + en.enemies[Index] + ".png").getImage().getScaledInstance(140, 120, Image.SCALE_AREA_AVERAGING)));
HP = en.enemiesHP[Index];
Power = en.enemiesPower[Index];
enemyInfoName.setText("  "+en.enemies[Index]+"  ");
enemyInfoHP.setText("          " +en.enemiesHP[Index]);
enemyInfoName.setBorder(new LineBorder(en.enemyColors[Index]));
enemyInfoName.setForeground(en.enemyColors[Index]);
enemyInfoImage.setBorder(new LineBorder(en.enemyColors[Index]));
enemyInfoMainElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Main_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
if (en.enemy_Second_Materias[Index]!= null){
    enemyInfoSecondElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Second_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

}


enemyImage.setBounds(500,280,400,400);

enemyImage.setForeground(en.enemyColors[0]);

enemyImage.setVisible(true);

        }

        if (File == "Bosses"){
            enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\" + en.bosses[Index] + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
            enemyInfoImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\" + en.bosses[Index] + ".png").getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING)));
            HP = en.bossesHP[Index];
Power = en.bossesPower[Index];
enemyInfoName.setBorder(new LineBorder(en.bossesColors[Index]));
enemyInfoName.setForeground(en.bossesColors[Index]);
enemyInfoImage.setBorder(new LineBorder(en.bossesColors[Index]));
enemyInfoDifficulty.setForeground(en.bossdifficultyColors[Index]);
enemyInfoDifficulty.setText(en.bossDifficulty[Index]);
enemyInfoMainElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Main_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
if (en.boss_Second_Materias[Index]!= null){
    enemyInfoSecondElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Second_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

}

if (en.boss_Third_Materias[Index]!= null){
    enemyInfoThirdElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Third_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

}

if (en.boss_Last_Materias[Index]!= null){
    enemyInfoLastElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Last_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

}

enemyImage.setBounds(500,280,400,400);

enemyImage.setForeground(en.enemyColors[0]);

enemyImage.setVisible(true);

enemyInfoName.setText("  "+en.bosses[Index]+"  ");

enemyInfoHP.setText("          " +en.bossesHP[Index]);

        }


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

    public static void add(JLabel tutorialEnemy) {
    }

    // @Override

}