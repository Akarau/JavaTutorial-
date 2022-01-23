import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Story implements ActionListener {

    CuPower spieler = new CuPower();
    Shop scl = new Shop();
    Achievements rew = new Achievements();

    String text,nextPosition1,nextPosition2,nextPosition3,nextPosition4;

    JPanel specialEnemyP;
    JPanel specialEnemyP2;
    JLabel specialEnemyI;
    JLabel specialEnemyI2;
    JLabel specialEnemyT;



    private static final Component JButton = null;
    static ImageIcon imageW = new ImageIcon("Textrpg\\Images\\Crystal.png");
    JLabel tn;
    JTextArea commbox;
    JLabel commboxtex;
    JLabel inf;
    JPanel shop_options;
    JPanel inventarPanel;
    JPanel achievementsPanel;
   JButton eshop_weapons;
   JButton eshop_shields;
   JButton eshop_boosts;
   JLabel reflectedDamgeImage;
   JLabel achievementI;
   JLabel achievementN;
   JTextArea achievementD;
   JLabel achievementDif;

   JPanel mainTextPanel;
   JTextArea mainTextArea;
   JButton option1button;
   JButton option2button;
   JButton option3button;
   JButton option4button;
   JPanel optionsPanel;

    static JLabel l;
    static JLabel i1;
    static JLabel i2;
    static JLabel i3;
    static JLabel i4;
    static JLabel iAchievements;
    static JLabel ifightPlayButton;
    static JLabel iShop;
    static JLabel iInventar;
    static JLabel ishop_weapons;
    static JLabel ishop_shields;
    static JButton option1;
    static JButton option2;
    static JButton option3;
    static JButton options_c;
    static JButton options_ts;
    static JButton commboxnext;
    JLabel moon_Artemis;
    JButton tex;
    JButton b;
    JPanel b1;
    JPanel b2;
    JPanel b3;
    JPanel b4;
    JPanel achievementsButton;
    JPanel shopButton;
    JPanel inventarButton;
    JPanel fightPlayButton;
    JPanel shop_weapons;
    JPanel shop_shields;
    JPanel shop_boosts;

    JButton e1;
    JButton e2;
    JButton ePlayButton;
    // upgrades //

    JPanel upgradeMenu;
    JPanel shop;
    JPanel achievements;
    JLabel iPanel;
    JPanel weaponsMenu;

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


    // Spieler //

    JPanel playerInfo;
JLabel playerInfoName;
JLabel playerInfoHP;
JLabel playerInfoPower;
JPanel playerInfoHPProgress;
JLabel playerInfoHPShield;
JLabel playerInfoMainElement;
JLabel playerInfoSecondElement;
JLabel playerInfoAttack;
JLabel playerInfoSupportElement;

    // Spieler //

    // EnemyStats //

     JLabel enemyImage;

    // EnemyStats //

    // element //

     JLabel elementImage;

    // element //

    byte at;
    int damg;



// EnemyInfo //
JPanel enemyInfo;
JLabel enemyInfoName;
JLabel enemyInfoDifficulty;
JLabel enemyInfoMainElement;
JLabel enemyInfoImage;
JLabel enemyInfoSecondElement;
JLabel enemyInfoHP;
JLabel enemyInfoThirdElement;
JLabel enemyInfoLastElement;

// EnemyInfo //


// Fight // 

JLabel damageText;
JLabel boostDamageText;
JLabel reducedDamgeText;
JLabel reducedDamgeText2;
JLabel reflectedDamgeText;
JLabel self_HealText;
JLabel specialEffectText;
JLabel specialEffectText2;


// Fight //


    Enemy en;

    int extradamg;




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


            HashMap <String, Integer> inventory = new HashMap <>();





    public Story(Game game) throws InterruptedException {

        


        frame = new JFrame();

        // Setzt das Fenster immer auf Fullscreen
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Entfernt den oberen Rahmen
        frame.setUndecorated(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        startname.setBackground(Color.BLACK);
        startname.setSize(400, 400);
        startname.setFont(startschrift);
        startname.setForeground(Color.WHITE);
        startname.setVisible(false);
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

        optionsPanel = new JPanel();

        optionsPanel.setBounds(300,560,600,100);

        optionsPanel.setLayout(new GridLayout(2,2));

        optionsPanel.setVisible(false);

        frame.add(optionsPanel);
       

        mainTextPanel = new JPanel();

        mainTextPanel.setBounds(200,135,850,400);

        mainTextPanel.setBackground(Color.black);
        mainTextPanel.setBorder(new LineBorder(Color.white));

        mainTextPanel.setVisible(false);

frame.add(mainTextPanel);       
       

        mainTextArea= new JTextArea();

        mainTextArea.setBounds(200,185,825,400);

        mainTextArea.setForeground(Color.white);

        mainTextArea.setFont(new Font("Times new Roman", Font.PLAIN, 35));

        mainTextArea.setWrapStyleWord(true);

        mainTextArea.setLineWrap(true);

        mainTextArea.setBackground(Color.black);
mainTextArea.setOpaque(false);

        mainTextArea.setEditable(false);
        mainTextArea.setVisible(true);

      



        mainTextPanel.add(mainTextArea);
        
        option1button =new JButton("choice1");

        option1button.setBackground(Color.black);

        option1button.setForeground(Color.white);

        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));


        option1button.setFocusPainted(false);

        option1button.addActionListener(this);

        option1button.setActionCommand("o1");

        optionsPanel.add(option1button);

       

        option2button =new JButton("choice2");

        option2button.setBackground(Color.black);

        option2button.setForeground(Color.white);

        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

        option2button.setFocusPainted(false);

        option2button.addActionListener(this);

        option2button.setActionCommand("o2");

        optionsPanel.add(option2button);


        option3button=new JButton("choice3");

        option3button.setBackground(Color.black);

        option3button.setForeground(Color.white);

        option3button.setFont(new Font("Times new Roman", Font.PLAIN, 40));


        option3button.setFocusPainted(false);

        option3button.addActionListener(this);

        option3button.setActionCommand("o3");

        optionsPanel.add(option3button);

       

        option4button=new JButton("choice4");

        option4button.setBackground(Color.black);

        option4button.setForeground(Color.white);

        option4button.setFont(new Font("Times new Roman", Font.PLAIN, 40));


        option4button.setFocusPainted(false);

        option4button.addActionListener(this);

        option4button.setActionCommand("o4");


        optionsPanel.add(option4button);

        moon_Artemis = new JLabel();
        moon_Artemis.setForeground(new Color(255, 0, 160));
        moon_Artemis.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        moon_Artemis.setSize(600, 600);
        moon_Artemis.setBounds(250, -200, 600, 600);
        moon_Artemis.setBackground(Color.WHITE);
        moon_Artemis.setVisible(false);
        moon_Artemis.setFocusable(false);
        moon_Artemis.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Moon.png").getImage()
                .getScaledInstance(500, 500, Image.SCALE_AREA_AVERAGING)));
    
                frame.add(moon_Artemis);

        i1 = new JLabel();
        i1.setForeground(new Color(255, 0, 160));
        i1.setFont(new Font("Times new Roman", Font.PLAIN, 60));
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
        i3.setSize(20, 20);
        i3.setBackground(Color.WHITE);
        i3.setVisible(true);
        i3.setFocusable(false);
        i3.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Damage.png").getImage().getScaledInstance(60,
                60, Image.SCALE_AREA_AVERAGING)));
        i3.setText("                       Angriff                                  ");

        i4 = new JLabel();
        i4.setForeground(new Color(0, 220, 255));
        i4.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        i4.setSize(20, 20);
        i4.setBackground(Color.WHITE);
        i4.setVisible(true);
        i4.setFocusable(false);
        i4.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal2.png").getImage()
                .getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
        i4.setText("        Crystal         ");

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



        optionsmenu_options = new JPanel();
        optionsmenu_options.setVisible(false);
        optionsmenu_options.setBackground(Color.BLACK);
        optionsmenu_options.setFocusable(false);
        optionsmenu_options.setBounds(830, 300, 70, 160);
        optionsmenu_options.setBorder(new LineBorder(Color.white));

        shop_options = new JPanel();
        shop_options.setVisible(false);
        shop_options.setBackground(Color.BLACK);
        shop_options.setFocusable(false);
        shop_options.setBounds(350, 280, 90, 240);
        shop_options.setBorder(new LineBorder(null));


        specialEnemyP = new JPanel();
        specialEnemyP.setBounds(400, 40, 500, 40);
        specialEnemyP.setVisible(false);
        specialEnemyP.setBackground(new Color(0,255,0));
        specialEnemyP.setFocusable(false);

        specialEnemyT = new JLabel();
        specialEnemyT.setBounds(850, 100, 250, 40);
        specialEnemyT.setVisible(false);
        specialEnemyT.setFont(new Font("Times new Roman", Font.PLAIN, 25));
        specialEnemyT.setBackground(new Color(0,255,0));
        specialEnemyT.setText("1500");
        specialEnemyT.setBackground(new Color(0,0,0));

        specialEnemyP2 = new JPanel();
        specialEnemyP2.setBounds(400, 40, 500, 40);
        specialEnemyP2.setVisible(false);
        specialEnemyP2.setBackground(new Color(60,60,60));
        specialEnemyP2.setFocusable(false);

        specialEnemyI = new JLabel();
        specialEnemyI.setBounds(850, 0, 265, 120);
        specialEnemyI.setVisible(false);
        specialEnemyI.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\Zeus_Normal.png").getImage()
                .getScaledInstance(85, 75, Image.SCALE_AREA_AVERAGING)));
                frame.add(specialEnemyI);

                specialEnemyI2 = new JLabel();
                specialEnemyI2.setBounds(350, 0, 265, 120);
                specialEnemyI2.setVisible(true);
                specialEnemyI2.setEnabled(false);
                specialEnemyI2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\Zeus_Rage.png").getImage()
                        .getScaledInstance(75, 65, Image.SCALE_AREA_AVERAGING)));
                        frame.add(specialEnemyI);
                        frame.add(specialEnemyI2);

        frame.add(specialEnemyP);
        frame.add(specialEnemyP2);
        frame.add(specialEnemyT);


        optionsmenu_colorsoutlines = new JPanel();
        optionsmenu_colorsoutlines.setVisible(false);
        optionsmenu_colorsoutlines.setBackground(Color.BLACK);
        optionsmenu_colorsoutlines.setFocusable(false);
        optionsmenu_colorsoutlines.setBounds(900, 300, 500, 570);
        optionsmenu_colorsoutlines.setBorder(new LineBorder(Color.white));

        frame.add(shop_options);

        fighting_options = new JPanel();
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

        b2 = new JPanel();
        b2.setForeground(new Color(200, 255, 80));
        b2.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b2.setBounds(150, 150, 240, 2540);
        b2.setBackground(Color.black);
        b2.setVisible(true);
        b2.setFocusable(false);

        b3 = new JPanel();
        b3.setForeground(new Color(255, 0, 150));
        b3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b3.setBounds(150, 150, 240, 2540);
        b3.setBackground(Color.black);
        b3.setVisible(true);
        b3.setFocusable(false);

        b4 = new JPanel();
        b4.setForeground(new Color(255, 255, 255));
        b4.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        b4.setBounds(150, 150, 240, 2540);
        b4.setBackground(Color.black);
        b4.setVisible(false);
        b4.setFocusable(false);


        achievementsButton = new JPanel();
        achievementsButton.setForeground(new Color(255, 0, 150));
        achievementsButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        achievementsButton.setBounds(150, 150, 240, 2540);
        achievementsButton.setBackground(Color.black);
        achievementsButton.setVisible(true);
        achievementsButton.setFocusable(false);

        shopButton = new JPanel();
        shopButton.setForeground(new Color(255, 0, 150));
        shopButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        shopButton.setBounds(150, 150, 240, 2540);
        shopButton.setBackground(Color.black);
        shopButton.setVisible(true);
        shopButton.setFocusable(false);

        inventarButton = new JPanel();
        inventarButton.setForeground(new Color(255, 0, 150));
        inventarButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        inventarButton.setBounds(150, 150, 240, 2540);
        inventarButton.setBackground(Color.black);
        inventarButton.setVisible(true);
        inventarButton.setFocusable(false);

        shop_weapons = new JPanel();
        shop_weapons.setForeground(new Color(255, 0, 150));
        shop_weapons.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        shop_weapons.setBounds(150, 150, 80, 150);
        shop_weapons.setBackground(Color.black);
        shop_weapons.setVisible(true);
        shop_weapons.setFocusable(false);
        shop_weapons.setOpaque(false);

        inventarPanel = new JPanel();
        inventarPanel.setForeground(new Color(255, 0, 150));
        inventarPanel.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        inventarPanel.setBounds(440, 130, 500, 400);
        inventarPanel.setVisible(false);
        inventarPanel.setFocusable(false);
        inventarPanel.setOpaque(false);
        inventarPanel.setBorder(new LineBorder(Color.white));

        frame.add(inventarPanel);

        
        achievementsPanel = new JPanel();
        achievementsPanel.setForeground(new Color(255, 0, 150));
        achievementsPanel.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        achievementsPanel.setBounds(1007, 280, 265, 120);
        achievementsPanel.setVisible(false);
        achievementsPanel.setFocusable(false);
        achievementsPanel.setOpaque(false);
        achievementsPanel.setBorder(new LineBorder(Color.white));

        achievementI = new JLabel();
        achievementI.setForeground(new Color(255, 255, 255));
        achievementI.setFont(new Font("Times new Roman", Font.PLAIN, 15));
        achievementI.setBounds(1010, 280, 265, 120);
        achievementI.setBackground(Color.WHITE);
        achievementI.setVisible(false);
        achievementI.setFocusable(false);
        achievementI.setOpaque(false);
        achievementI.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Achievements\\Tutorial.png").getImage()
                .getScaledInstance(105, 100, Image.SCALE_AREA_AVERAGING)));

                achievementN = new JLabel();
                achievementN.setForeground(new Color(180, 180, 180));
                achievementN.setFont(new Font("Times new Roman", Font.PLAIN, 22));
                achievementN.setBounds(1120, 250, 265, 120);
                achievementN.setBackground(Color.WHITE);
                achievementN.setVisible(false);
                achievementI.setFocusable(false);
                achievementN.setOpaque(false);
                achievementN.setText("Starter");

                achievementD = new JTextArea();
                achievementD.setForeground(new Color(100, 100, 100));
                achievementD.setFont(new Font("Times new Roman", Font.PLAIN, 15));
                achievementD.setBounds(1120, 340, 120, 120);
                achievementD.setBackground(Color.WHITE);
                achievementD.setVisible(false);
                achievementD.setFocusable(false);
                achievementD.setOpaque(false);
                achievementD.setLineWrap(true);
                achievementD.setText("Mach das Tutorial zu Ende");

                achievementDif = new JLabel();
                achievementDif.setForeground(new Color(0, 255, 25));
                achievementDif.setFont(new Font("Times new Roman", Font.PLAIN, 14));
                achievementDif.setBounds(1220, 325, 265, 120);
                achievementDif.setBackground(Color.WHITE);
                achievementDif.setVisible(false);
                achievementDif.setFocusable(false);
                achievementDif.setOpaque(false);
                achievementDif.setText("Leicht");

        frame.add(achievementsPanel);

        frame.add(achievementI);
        frame.add(achievementN);
        frame.add(achievementD);
        frame.add(achievementDif);

        shop_shields = new JPanel();
        shop_shields.setForeground(new Color(255, 0, 150));
        shop_shields.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        shop_shields.setBounds(150, 150, 80, 150);
        shop_shields.setBackground(Color.black);
        shop_shields.setVisible(true);
        shop_shields.setFocusable(false);
        shop_shields.setOpaque(false);

        shop_boosts = new JPanel();
        shop_boosts.setForeground(new Color(255, 0, 150));
        shop_boosts.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        shop_boosts.setBounds(150, 150, 80, 150);
        shop_boosts.setBackground(Color.black);
        shop_boosts.setVisible(true);
        shop_boosts.setFocusable(false);
        shop_boosts.setOpaque(false);

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

        javax.swing.JButton e3 = new JButton();
        e3.setForeground(new Color(255, 255, 255));
        e3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e3.setBounds(0, 0, 0, 0);
        e3.setBackground(Color.black);
        e3.setVisible(true);
        e3.setFocusable(false);
        e3.addActionListener(this);
        e3.setActionCommand("Attack#3");

        javax.swing.JButton e4 = new JButton();
        e4.setForeground(new Color(255, 255, 255));
        e4.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        e4.setBounds(0, 0, 0, 0);
        e4.setBackground(Color.black);
        e4.setVisible(true);
        e4.setFocusable(false);
        e4.addActionListener(this);
        e4.setActionCommand("E");

        javax.swing.JButton eAchievements = new JButton();
        eAchievements.setForeground(new Color(255, 255, 255));
        eAchievements.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        eAchievements.setBounds(0, 0, 0, 0);
        eAchievements.setBackground(Color.black);
        eAchievements.setVisible(true);
        eAchievements.setFocusable(false);
        eAchievements.addActionListener(this);
        eAchievements.setActionCommand("eAchievements");

        javax.swing.JButton eShop = new JButton();
        eShop.setForeground(new Color(255, 255, 255));
        eShop.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        eShop.setBounds(0, 0, 0, 0);
        eShop.setBackground(Color.black);
        eShop.setVisible(true);
        eShop.setFocusable(false);
        eShop.addActionListener(this);
        eShop.setActionCommand("eShop");
        eShop.setOpaque(false);


         eshop_weapons = new JButton();
        eshop_weapons.setForeground(new Color(255, 255, 255));
        eshop_weapons.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        eshop_weapons.setBounds(0, 0, 0, 0);
        eshop_weapons.setBackground(Color.black);
        eshop_weapons.setVisible(true);
        eshop_weapons.setFocusable(false);
        eshop_weapons.addActionListener(this);
        eshop_weapons.setActionCommand("eShop_weapons");
        eshop_weapons.setText("  ");
        eshop_weapons.setBorder(new LineBorder(Color.black));

         eshop_shields = new JButton();
        eshop_shields.setForeground(new Color(255, 255, 255));
        eshop_shields.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        eshop_shields.setBounds(0, 0, 0, 0);
        eshop_shields.setBackground(Color.black);
        eshop_shields.setVisible(true);
        eshop_shields.setFocusable(false);
        eshop_shields.addActionListener(this);
        eshop_shields.setActionCommand("eShop_Shields");
        eshop_shields.setText("  ");
        eshop_shields.setBorder(new LineBorder(Color.black));


         eshop_boosts = new JButton();
        eshop_boosts.setForeground(new Color(255, 255, 255));
        eshop_boosts.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        eshop_boosts.setBounds(0, 0, 0, 0);
        eshop_boosts.setBackground(Color.black);
        eshop_boosts.setVisible(true);
        eshop_boosts.setFocusable(false);
        eshop_boosts.addActionListener(this);
        eshop_boosts.setActionCommand("eShop_Boosts");
        eshop_boosts.setText("  ");
        eshop_boosts.setBorder(new LineBorder(Color.black));



        javax.swing.JButton einventar = new JButton();
        einventar.setForeground(new Color(255, 255, 255));
        einventar.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        einventar.setBounds(0, 0, 0, 0);
        einventar.setBackground(Color.black);
        einventar.setVisible(true);
        einventar.setFocusable(false);
        einventar.addActionListener(this);
        einventar.setActionCommand("eInventar");
        einventar.setOpaque(false);


        ePlayButton = new JButton();
        ePlayButton.setForeground(new Color(255, 255, 255));
        ePlayButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
        ePlayButton.setBounds(0, 0, 0, 0);
        ePlayButton.setBackground(Color.black);
        ePlayButton.setVisible(true);
        ePlayButton.setFocusable(false);
        ePlayButton.addActionListener(this);
        ePlayButton.setActionCommand("ePlayButton2");
        ePlayButton.setOpaque(false);
       // optionsmenu_options.setBorder(new LineBorder(Color.white));

       fightPlayButton = new JPanel();
       fightPlayButton.setForeground(new Color(255, 0, 150));
       fightPlayButton.setFont(new Font("Times new Roman", Font.PLAIN, 60));
       fightPlayButton.setBounds(150, 250, 240, 160);
       fightPlayButton.setBackground(Color.black);
       fightPlayButton.setVisible(false);
       fightPlayButton.setOpaque(false);
       fightPlayButton.setFocusable(false);


       ifightPlayButton = new JLabel();
       ifightPlayButton.setForeground(new Color(255, 255, 255));
       ifightPlayButton.setFont(new Font("Times new Roman", Font.PLAIN, 35));
       ifightPlayButton.setSize(20, 20);
       ifightPlayButton.setBackground(Color.WHITE);
       ifightPlayButton.setVisible(true);
       ifightPlayButton.setFocusable(false);
       ifightPlayButton.setOpaque(false);
       ifightPlayButton.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Play.png").getImage()
               .getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
               ifightPlayButton.setText("   1x");

               ishop_weapons = new JLabel();
               ishop_weapons.setForeground(new Color(255, 255, 255));
               ishop_weapons.setFont(new Font("Times new Roman", Font.PLAIN, 35));
               ishop_weapons.setSize(20, 20);
               ishop_weapons.setBackground(Color.WHITE);
               ishop_weapons.setVisible(true);
               ishop_weapons.setFocusable(false);
               ishop_weapons.setOpaque(false);
               ishop_weapons.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\weapons\\The Warrior.png").getImage()
                       .getScaledInstance(65, 60, Image.SCALE_AREA_AVERAGING)));

                       ishop_shields = new JLabel();
                       ishop_shields.setForeground(new Color(255, 255, 255));
                       ishop_shields.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                       ishop_shields.setSize(20, 20);
                       ishop_shields.setBackground(Color.WHITE);
                       ishop_shields.setVisible(true);
                       ishop_shields.setFocusable(false);
                       ishop_shields.setOpaque(false);
                       ishop_shields.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Shields\\Aqua shield.png").getImage()
                               .getScaledInstance(65, 60, Image.SCALE_AREA_AVERAGING)));


                              JLabel ishop_boosts = new JLabel();
                              ishop_boosts.setForeground(new Color(255, 255, 255));
                              ishop_boosts.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                               ishop_boosts.setSize(20, 20);
                               ishop_boosts.setBackground(Color.WHITE);
                               ishop_boosts.setVisible(true);
                               ishop_boosts.setFocusable(false);
                               ishop_boosts.setOpaque(false);
                               ishop_boosts.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Boosts\\elixirI.png").getImage()
                                       .getScaledInstance(65, 60, Image.SCALE_AREA_AVERAGING)));


                                       iInventar = new JLabel();
                                       iInventar.setForeground(new Color(255, 255, 255));
                                       iInventar.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                        iInventar.setSize(20, 20);
                                        iInventar.setBackground(Color.WHITE);
                                        iInventar.setVisible(true);
                                        iInventar.setFocusable(false);
                                        iInventar.setOpaque(false);
                                        iInventar.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Inventory.png").getImage()
                                                .getScaledInstance(55, 50, Image.SCALE_AREA_AVERAGING)));

                                                        frame.add(fighting_options);

                                                        reflectedDamgeImage = new JLabel();
                                                        reflectedDamgeImage.setForeground(new Color(255, 255, 255));
                                                        reflectedDamgeImage.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                                          reflectedDamgeImage.setBounds(1238, 100, 300, 300);
                                                         
                                                         reflectedDamgeImage.setBackground(Color.WHITE);
                                                         reflectedDamgeImage.setVisible(false);
                                                         reflectedDamgeImage.setFocusable(false);
                                                         reflectedDamgeImage.setOpaque(false);
                                                         reflectedDamgeImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Boosts\\Reflection.png").getImage()
                                                                 .getScaledInstance(45, 40, Image.SCALE_AREA_AVERAGING)));
                                                                 frame.add(reflectedDamgeImage);
                 
                                                                         frame.add(fighting_options);


       ePlayButton.add(ifightPlayButton);
       frame.add(fightPlayButton);
       fightPlayButton.add(ePlayButton);
        frame.add(fighting_options);
        fighting_options.add(b1);
        fighting_options.add(b2);
        fighting_options.add(b3);
        fighting_options.add(b4);
        fighting_options.add(achievementsButton);
        fighting_options.add(shopButton);
        fighting_options.add(inventarButton);
        inventarButton.add(einventar);
        einventar.add(iInventar);
        shop_options.add(shop_weapons);
        shop_options.add(shop_shields);
        shop_options.add(shop_boosts);
        shop_weapons.add(eshop_weapons);
        shop_shields.add(eshop_shields);
        eshop_shields.add(ishop_shields);
        eshop_weapons.add(ishop_weapons);
        shop_boosts.add(eshop_boosts);
        eshop_boosts.add(ishop_boosts);
        b1.add(e1);
        b2.add(e2);
        b3.add(e3);
        b4.add(e4);
        achievementsButton.add(eAchievements);
        shopButton.add(eShop);

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

        optionsmenu_options.add(tex);
        optionsmenu_options.add(b);

        optionsmenu_colors = new JPanel();
        optionsmenu_colors.setVisible(false);
        optionsmenu_colors.setBackground(Color.BLACK);
        optionsmenu_colors.setFocusable(false);
        optionsmenu_colors.setBounds(900, 300, 500, 570);
        optionsmenu_colors.setBorder(new LineBorder(Color.white));

        optionsmenu_colorsoutlines = new JPanel();
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
        i5.setSize(80, 80);
        i5.setVisible(true);
        i5.setFocusable(false);
        i5.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Damage.png").getImage().getScaledInstance(55,
                50, Image.SCALE_AREA_AVERAGING)));
        i5.setText("    Power: " + spieler.Power + " ");
        powerUpgradeButton.add(i5);

        i6 = new JLabel();
        i6.setForeground(Color.white);
        i6.setFont(new Font("Times new Roman", Font.PLAIN, 50));
        i6.setSize(80, 80);
        i6.setVisible(true);
        i6.setFocusable(false);
        i6.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\HealI.png").getImage().getScaledInstance(55,
                50, Image.SCALE_AREA_AVERAGING)));
        i6.setText("  Health: " + spieler.Health + " ");

        i7 = new JLabel();
        i7.setForeground(Color.white);
        i7.setFont(new Font("Times new Roman", Font.PLAIN, 50));
        i7.setSize(80, 80);
        i7.setVisible(true);
        i7.setFocusable(false);
        i7.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Coin.png").getImage().getScaledInstance(55, 50,
                Image.SCALE_AREA_AVERAGING)));
        i7.setText("   Gold: " + spieler.GoldEarn + "x  ");

        iAchievements = new JLabel();
        iAchievements.setForeground(Color.white);
        iAchievements.setFont(new Font("Times new Roman", Font.PLAIN, 50));
        iAchievements.setSize(80, 80);
        iAchievements.setVisible(true);
        iAchievements.setFocusable(false);
        iAchievements.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Badge.png").getImage().getScaledInstance(55, 50,
                Image.SCALE_AREA_AVERAGING)));

        iShop = new JLabel();
        iShop.setForeground(Color.white);
        iShop.setFont(new Font("Times new Roman", Font.PLAIN, 50));
        iShop.setSize(80, 80);
        iShop.setVisible(true);
        iShop.setFocusable(false);
        iShop.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Shop.png").getImage().getScaledInstance(55, 50,
                Image.SCALE_AREA_AVERAGING)));

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
        chosen_Main_Element_Picture.setBorder(new LineBorder(Color.white));

        chosen_Main_Element_Name = new JLabel("Ancient");
        chosen_Main_Element_Name.setForeground(new Color(255, 255, 255));
        chosen_Main_Element_Name.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        chosen_Main_Element_Name.setBounds(280, 0, 140, 80);
        chosen_Main_Element_Name.setBackground(Color.black);
        chosen_Main_Element_Name.setVisible(true);
        chosen_Main_Element_Name.setFocusable(false);
        chosen_Main_Element_Name.setAlignmentX(80);
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


        choose_Element = new JButton(" Wählen ");
        choose_Element.setForeground(new Color(0, 255, 80));
        choose_Element.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        choose_Element.setBounds(50, 50, 350, 350);
        choose_Element.setSize(80, 50);
        choose_Element.setBackground(Color.black);
        choose_Element.setVisible(true);
        choose_Element.setFocusable(false);
        choose_Element.addActionListener(this);
        choose_Element.setBorder(new LineBorder(Color.white));

        chosen_Main_Element_Description.setBorder(new LineBorder(Color.white));

        chosen_Main_Element.add(chosen_Main_Element_Picture);
        chosen_Main_Element.add(chosen_Main_Element_Name);
        chosen_Main_Element.add(chosen_Main_Element_Description);
        chosen_Main_Element.add(choose_Element);

        frame.add(chosen_Main_Element);


texarea = new JTextField(10);
texarea.setBounds(520,400,200,60);
texarea.setVisible(false);
texarea.setBackground(Color.BLACK);
texarea.setForeground(Color.WHITE);
texarea.setFont(new Font("Arial",Font.BOLD,20));
texarea.setBorder(new LineBorder(Color.white));

for (int s = 0; s < scl.schwerte.length; s++) {


    javax.swing.JButton swordB = new JButton();
    swordB.setForeground(new Color(80, 0, 255));
    swordB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
    swordB.setBounds(0, 0, 100, 100);
    swordB.setBackground(Color.black);
    swordB.setVisible(true);
    swordB.setFocusable(false);
    swordB.addActionListener(this);
    swordB.setActionCommand(scl.schwerte[s] + "I");
    choose_Element.setActionCommand("Sword_Equip");
    swordB.setBorder(new LineBorder(Color.white));
    swordB.setName(scl.schwerte[s]);

    if (s >= 5){
        swordB.setName("Special_Sword");
    }

    JLabel si = new JLabel();
    si.setForeground(colors2[c]);
    si.setFont(new Font("Times new Roman", Font.PLAIN, 30));
    si.setIcon(new ImageIcon(new ImageIcon(scl.i[s])
            .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
            si.setSize(800, 800);
            si.setBackground(Color.white);
            si.setVisible(true);
            si.setFocusable(false);

    si.setBorder(new LineBorder(Color.white));


    this.inventarPanel.add(swordB);
    swordB.add(si);

}


for (int s = 0; s < scl.schilder.length; s++) {


    javax.swing.JButton shieldB = new JButton();
    shieldB.setForeground(new Color(80, 0, 255));
    shieldB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
    shieldB.setBounds(0, 0, 100, 100);
    shieldB.setBackground(Color.black);
    shieldB.setVisible(true);
    shieldB.setFocusable(false);
    shieldB.addActionListener(this);
    shieldB.setActionCommand(scl.schilder[s] + "I");
    choose_Element.setActionCommand("Shield_Equip");
    shieldB.setBorder(new LineBorder(Color.white));
    shieldB.setName("Shield");

    if (s > 1){
        shieldB.setName("Special_Shield");
    }


    JLabel si = new JLabel();
    si.setForeground(colors2[c]);
    si.setFont(new Font("Times new Roman", Font.PLAIN, 30));
    si.setIcon(new ImageIcon(new ImageIcon(scl.i2[s])
            .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
            si.setSize(800, 800);
            si.setBackground(Color.white);
            si.setVisible(true);
            si.setFocusable(false);

    si.setBorder(new LineBorder(Color.white));


    this.inventarPanel.add(shieldB);
    shieldB.add(si);

}


for (int s = 0; s < scl.boosts.length; s++) {


    javax.swing.JButton boostB = new JButton();
    boostB.setForeground(new Color(80, 0, 255));
    boostB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
    boostB.setBounds(0, 0, 100, 100);
    boostB.setBackground(Color.black);
    boostB.setVisible(false);
    boostB.setFocusable(false);
    boostB.addActionListener(this);
    boostB.setActionCommand(scl.boosts[s] + "I");
    choose_Element.setActionCommand("Boost_Equip");
    boostB.setBorder(new LineBorder(Color.white));
    boostB.setName(scl.boosts[s]);


    JLabel si = new JLabel();
    si.setForeground(colors2[c]);
    si.setFont(new Font("Times new Roman", Font.PLAIN, 30));
    si.setIcon(new ImageIcon(new ImageIcon(scl.i3[s])
            .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
            si.setSize(800, 800);
            si.setBackground(Color.white);
            si.setVisible(true);
            si.setFocusable(false);

    si.setBorder(new LineBorder(Color.white));


    this.inventarPanel.add(boostB);
    boostB.add(si);

}


en = new Enemy(null);


enemyInfo = new JPanel();
enemyInfo.setVisible(true);
enemyInfo.setOpaque(false);
enemyInfo.setFocusable(false);
enemyInfo.setBounds(800, 110, 470, 150);
enemyInfo.setBorder(new LineBorder(Color.white));
 
enemyInfoImage = new JLabel();
enemyInfoImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Enemies\\DunkleFlamme.png").getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
enemyInfoImage.setBounds(820,120,140,120);
enemyInfoImage.setForeground(en.enemyColors[0]);
enemyInfoImage.setFont(new Font("Times new Roman", Font.PLAIN, 30));
enemyInfoImage.setBorder(new LineBorder(en.enemyColors[1]));

enemyInfoName = new JLabel("  DunkleFlamme  ");
enemyInfoName.setBounds(995,120,250,40);
enemyInfoName.setForeground(en.enemyColors[0]);
enemyInfoName.setFont(new Font("Times new Roman", Font.PLAIN, 30));
enemyInfoName.setBorder(new LineBorder(en.enemyColors[1]));

enemyInfoHP = new JLabel("          " +en.enemiesHP[1]);
enemyInfoHP.setBounds(995,170,220,40);
enemyInfoHP.setForeground(Color.red);
enemyInfoHP.setFont(new Font("Times new Roman", Font.PLAIN, 30));
enemyInfoHP.setBorder(new LineBorder(Color.red));

enemyInfoMainElement = new JLabel();
enemyInfoMainElement.setBounds(995,215,40,40);
enemyInfoMainElement.setForeground(Color.red);
enemyInfoMainElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));
enemyInfoMainElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Main_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

enemyInfoSecondElement = new JLabel();
enemyInfoSecondElement.setBounds(1040,215,40,40);
enemyInfoSecondElement.setForeground(Color.red);
enemyInfoSecondElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));

enemyInfoSecondElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Second_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
enemyInfoThirdElement = new JLabel();
enemyInfoThirdElement.setBounds(1085,215,40,40);
enemyInfoThirdElement.setForeground(Color.red);
enemyInfoThirdElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));
enemyInfoThirdElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Third_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

enemyInfoLastElement = new JLabel();
enemyInfoLastElement.setBounds(1130,215,40,40);
enemyInfoLastElement.setForeground(Color.red);
enemyInfoLastElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));
enemyInfoLastElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Last_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

enemyInfoDifficulty = new JLabel(en.enemyDifficulty[0]);
enemyInfoDifficulty.setBounds(1180,220,80,40);
enemyInfoDifficulty.setForeground(en.difficultyColors[0]);
enemyInfoDifficulty.setFont(new Font("Times new Roman", Font.PLAIN, 20));



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
confirmName.setVisible(false);
confirmName.setFocusable(false);
confirmName.addActionListener(this);
confirmName.setActionCommand("ConfirmName");
confirmName.setBorder(new LineBorder(Color.white));

elementImage = new JLabel();
elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Cosmic.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
elementImage.setBounds(500,280,400,400);
elementImage.setVisible(false);
frame.add(elementImage);


enemyImage = new JLabel();
enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Enemies\\DunkleFlamme.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
enemyImage.setBounds(500,280,400,400);
enemyImage.setVisible(false);


playerInfo = new JPanel();
playerInfo.setVisible(false);
playerInfo.setOpaque(false);
playerInfo.setFocusable(false);
playerInfo.setBounds(0, 110, 500, 150);
playerInfo.setBorder(new LineBorder(Color.white));

playerInfoName = new JLabel("");
playerInfoName.setBounds(75,120,300,40);
playerInfoName.setForeground(Color.white);
playerInfoName.setFont(new Font("Times new Roman", Font.PLAIN, 30));
playerInfoName.setVisible(false);

playerInfoHP = new JLabel("           " + spieler.Health);
playerInfoHP.setBounds(75,170,220,40);
playerInfoHP.setForeground(new Color(120,120,120));
playerInfoHP.setFont(new Font("Times new Roman", Font.PLAIN, 30));
playerInfoHP.setBorder(new LineBorder(Color.white));
playerInfoHP.setVisible(false);

playerInfoPower = new JLabel("1x");
playerInfoPower.setBounds(75,210,220,40);
playerInfoPower.setForeground(new Color(120,120,120));
playerInfoPower.setFont(new Font("Times new Roman", Font.PLAIN, 30));
playerInfoPower.setVisible(false);


playerInfoHPShield = new JLabel();
playerInfoHPShield.setBounds(80,170,80,40);
playerInfoHPShield.setForeground(new Color(255,150,0));
playerInfoHPShield.setBackground(new Color(255,150,0));
playerInfoHPShield.setFont(new Font("Times new Roman", Font.PLAIN, 30));
playerInfoHPShield.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Shields\\Standard shield.png").getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING)));
playerInfoHPShield.setVisible(false);


playerInfoMainElement = new JLabel();
playerInfoMainElement.setBounds(300,215,40,40);
playerInfoMainElement.setForeground(Color.red);
playerInfoMainElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));
playerInfoMainElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + spieler.Main_Element +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
playerInfoMainElement.setVisible(false);
 

playerInfoSecondElement = new JLabel();
playerInfoSecondElement.setBounds(345,215,40,40);
playerInfoSecondElement.setForeground(Color.red);
playerInfoSecondElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));
playerInfoSecondElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + spieler.Second_Element +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
playerInfoSecondElement.setVisible(false);

playerInfoAttack = new JLabel();
playerInfoAttack.setBounds(390,215,40,40);
playerInfoAttack.setForeground(Color.red);
playerInfoAttack.setFont(new Font("Times new Roman", Font.PLAIN, 30));
playerInfoAttack.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Damage.png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
playerInfoAttack.setVisible(false);

playerInfoSupportElement = new JLabel();
playerInfoSupportElement.setBounds(435,215,40,40);
playerInfoSupportElement.setForeground(Color.red);
playerInfoSupportElement.setFont(new Font("Times new Roman", Font.PLAIN, 30));
playerInfoSupportElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Last_Materias[0] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

frame.add(playerInfo);
frame.add(playerInfoName);
frame.add(playerInfoHP);
frame.add(playerInfoPower);
frame.add(playerInfoHPShield);
frame.add(playerInfoMainElement);
frame.add(playerInfoSecondElement);
frame.add(playerInfoAttack);
frame.add(playerInfoSupportElement);




damageText = new JLabel("DamageText");
damageText.setFont(new Font("Times new Roman", Font.PLAIN, 35));
damageText.setOpaque(false);
damageText.setForeground(new Color(250,150,0));
damageText.setBounds(900, 280, 600, 80);
damageText.setVisible(false);

reducedDamgeText = new JLabel("DamageText");
reducedDamgeText.setFont(new Font("Times new Roman", Font.PLAIN, 35));
reducedDamgeText.setOpaque(false);
reducedDamgeText.setForeground(new Color(250,150,0));
reducedDamgeText.setBounds(200, 280, 480, 80);
reducedDamgeText.setVisible(false);

frame.add(reducedDamgeText);

boostDamageText = new JLabel("BoostDamageText");
boostDamageText.setFont(new Font("Times new Roman", Font.PLAIN, 40));
boostDamageText.setOpaque(false);
boostDamageText.setForeground(new Color(25,255,255));
boostDamageText.setBounds(900, 380, 600, 80);
boostDamageText.setVisible(false);

self_HealText = new JLabel();
self_HealText.setFont(new Font("Times new Roman", Font.PLAIN, 30));
self_HealText.setOpaque(false);
self_HealText.setForeground(new Color(255,255,255));
self_HealText.setBounds(250, 280, 100, 80);
self_HealText.setVisible(false);

reducedDamgeText2 = new JLabel();
reducedDamgeText2.setFont(new Font("Times new Roman", Font.PLAIN, 30));
reducedDamgeText2.setOpaque(false);
reducedDamgeText2.setForeground(new Color(255,180,0));
reducedDamgeText2.setBounds(250, 340, 100, 80);
reducedDamgeText2.setVisible(false);

reflectedDamgeText = new JLabel("ReflectedDamage");
reflectedDamgeText.setFont(new Font("Times new Roman", Font.PLAIN, 35));
reflectedDamgeText.setOpaque(false);
reflectedDamgeText.setForeground(new Color(250,150,0));
reflectedDamgeText.setBounds(900, 280, 600, 80);
reflectedDamgeText.setVisible(false);

specialEffectText = new JLabel("ReflectedDamage");
specialEffectText.setFont(new Font("Times new Roman", Font.PLAIN, 35));
specialEffectText.setOpaque(false);
specialEffectText.setForeground(new Color(250,150,0));
specialEffectText.setBounds(900, 280, 600, 80);
specialEffectText.setVisible(false);

specialEffectText2 = new JLabel("ReflectedDamage");
specialEffectText2.setFont(new Font("Times new Roman", Font.PLAIN, 35));
specialEffectText2.setOpaque(false);
specialEffectText2.setForeground(new Color(250,150,0));
specialEffectText2.setBounds(900, 340, 600, 80);
specialEffectText2.setVisible(false);

frame.add(specialEffectText);
frame.add(specialEffectText2);

shop = new JPanel();
shop.setForeground(new Color(255, 0, 150));
shop.setFont(new Font("Times new Roman", Font.PLAIN, 60));
shop.setBounds(440, 130, 500, 400);
shop.setBackground(Color.black);
shop.setVisible(false);
shop.setFocusable(false);
shop.setBorder(new LineBorder(Color.white));

achievements = new JPanel();
achievements.setForeground(new Color(255, 0, 150));
achievements.setFont(new Font("Times new Roman", Font.PLAIN, 60));
achievements.setBounds(440, 130, 500, 400);
achievements.setBackground(Color.black);
achievements.setVisible(false);
achievements.setFocusable(false);
achievements.setBorder(new LineBorder(Color.white));

frame.add(achievements);




for (int a = 0; a < rew.achievements.length; a++) {


    javax.swing.JButton swordB = new JButton();
    swordB.setForeground(new Color(80, 0, 255));
    swordB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
    swordB.setBounds(0, 0, 100, 100);
    swordB.setBackground(Color.black);
    swordB.setVisible(true);
    swordB.setFocusable(false);
    swordB.addActionListener(this);
    swordB.setActionCommand(rew.achievements[a]);
    swordB.setBorder(new LineBorder(Color.white));
    swordB.setName("Achievement");

    JLabel si = new JLabel();
    si.setForeground(colors2[c]);
    si.setFont(new Font("Times new Roman", Font.PLAIN, 55));
    // color.setBounds(500, 500, 350, 350);
    si.setIcon(new ImageIcon(new ImageIcon(rew.achievementsImage[a])
            .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
            si.setSize(800, 800);
            si.setBackground(Color.white);
            si.setVisible(true);
            si.setFocusable(false);

    si.setBorder(new LineBorder(Color.white));
si.setText("      " + rew.achievements[a] + "    ");


achievements.add(swordB);
swordB.add(si);

}




for (int s2 = 0; s2 < scl.schilder.length; s2++) {


    javax.swing.JButton shieldB = new JButton();
    shieldB.setForeground(new Color(80, 0, 255));
    shieldB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
    shieldB.setBounds(0, 0, 100, 100);
    shieldB.setBackground(Color.black);
    shieldB.setVisible(true);
    shieldB.setFocusable(false);
    shieldB.addActionListener(this);
    shieldB.setActionCommand(scl.schilder[s2] + "B");
    shieldB.setBorder(new LineBorder(Color.white));
    shieldB.setName("Shield");

    if (s2 > 1){
        shieldB.setName("Special_Shield");
        shieldB.setVisible(false);
    }

    JLabel si = new JLabel();
    si.setForeground(colors2[c]);
    si.setFont(new Font("Times new Roman", Font.PLAIN, 30));
    // color.setBounds(500, 500, 350, 350);
    si.setIcon(new ImageIcon(new ImageIcon(scl.i2[s2])
            .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
            si.setSize(800, 800);
            si.setBackground(Color.white);
            si.setVisible(true);
            si.setFocusable(false);

    si.setBorder(new LineBorder(Color.white));

    this.shop.add(shieldB);
    shieldB.add(si);

}



iPanel = new JLabel("            Shop          ");
iPanel.setForeground(new Color(255, 255, 255));
iPanel.setFont(new Font("Times new Roman", Font.PLAIN, 60));
iPanel.setBounds(440, 30, 500, 92);
iPanel.setBackground(Color.black);
iPanel.setVisible(false);
iPanel.setFocusable(false);
iPanel.setBorder(new LineBorder(Color.white));





chosen_Main_Element.setVisible(false);
fighting_options.setVisible(false);
enemyInfo.setVisible(false);
enemyInfoDifficulty.setVisible(false);
enemyInfoHP.setVisible(false);
enemyImage.setVisible(false);
enemyInfoImage.setVisible(false);
enemyImage.setVisible(false);
enemyInfoName.setVisible(false);
enemyInfoMainElement.setVisible(false);
enemyInfoSecondElement.setVisible(false);

weaponsMenu = new JPanel();
weaponsMenu.setForeground(new Color(255, 0, 150));
weaponsMenu.setFont(new Font("Times new Roman", Font.PLAIN, 60));
weaponsMenu.setBounds(0, 0, 500, 400);
weaponsMenu.setBackground(Color.black);
weaponsMenu.setVisible(true);
weaponsMenu.setFocusable(false);
weaponsMenu.setOpaque(false);
weaponsMenu.setBorder(new LineBorder(Color.white));

frame.add(damageText);
frame.add(boostDamageText);
frame.add(self_HealText);
frame.add(reducedDamgeText);
frame.add(reducedDamgeText2);
frame.add(reflectedDamgeText);

frame.add(enemyImage);

frame.add(texarea);
frame.add(confirmName);
frame.add(shop);
frame.add(iPanel);
        JLabel ei;

        for (int e = 0; e < Elemente.elements.length; e++) {

            javax.swing.JButton elemB = new JButton();
            elemB.setForeground(new Color(80, 0, 255));
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
            ei.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[e] + ".png")
                    .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
            ei.setSize(800, 800);
            ei.setBackground(Color.white);
            ei.setVisible(true);
            ei.setFocusable(false);
            ei.setBorder(new LineBorder(Color.white));


            elementsMenu.add(elemB);
            elemB.add(ei);


        }

        for (int s = 0; s < scl.schwerte.length; s++) {


            javax.swing.JButton swordB = new JButton();
            swordB.setForeground(new Color(80, 0, 255));
            swordB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
            swordB.setBounds(0, 0, 100, 100);
            swordB.setBackground(Color.black);
            swordB.setVisible(false);
            swordB.setFocusable(false);
            swordB.addActionListener(this);
            swordB.setActionCommand(scl.schwerte[s] + "B");
            swordB.setBorder(new LineBorder(Color.white));
            swordB.setName("Sword");

            if (s > 4){
                swordB.setName("Special_Sword");
            }

            JLabel si = new JLabel();
            si.setForeground(colors2[c]);
            si.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            // color.setBounds(500, 500, 350, 350);
            si.setIcon(new ImageIcon(new ImageIcon(scl.i[s])
                    .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
                    si.setSize(800, 800);
                    si.setBackground(Color.white);
                    si.setVisible(true);
                    si.setFocusable(false);

            si.setBorder(new LineBorder(Color.white));


            this.shop.add(swordB);
            swordB.add(si);

        }


/*
        for (int s2 = 0; s2 < scl.schilder.length; s2++) {


            javax.swing.JButton shieldB = new JButton();
            shieldB.setForeground(new Color(80, 0, 255));
            shieldB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
            shieldB.setBounds(0, 0, 100, 100);
            shieldB.setBackground(Color.black);
            shieldB.setVisible(true);
            shieldB.setFocusable(false);
            shieldB.addActionListener(this);
            shieldB.setActionCommand(scl.schilder[s2] + "B");
            shieldB.setBorder(new LineBorder(Color.white));
            shieldB.setName("Shield");

            JLabel si = new JLabel();
            si.setForeground(colors2[c]);
            si.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            // color.setBounds(500, 500, 350, 350);
            si.setIcon(new ImageIcon(new ImageIcon(scl.i2[s2])
                    .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
                    si.setSize(800, 800);
                    si.setBackground(Color.white);
                    si.setVisible(true);
                    si.setFocusable(false);

            si.setBorder(new LineBorder(Color.white));

            this.shop.add(shieldB);
            shieldB.add(si);

        }
*/


        for (int s = 0; s < scl.boosts.length; s++) {

            javax.swing.JButton boostB = new JButton();
            boostB.setForeground(new Color(80, 0, 255));
            boostB.setFont(new Font("Times new Roman", Font.PLAIN, 60));
            boostB.setBounds(0, 0, 100, 100);
            boostB.setBackground(Color.black);
            boostB.setVisible(false);
            boostB.setFocusable(false);
            boostB.addActionListener(this);
            boostB.setActionCommand(scl.boosts[s] + "B");
            boostB.setBorder(new LineBorder(Color.white));
            boostB.setName("Boost");

            JLabel si = new JLabel();
            si.setForeground(colors2[c]);
            si.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            si.setIcon(new ImageIcon(new ImageIcon(scl.i3[s])
                    .getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
                    si.setSize(800, 800);
                    si.setBackground(Color.white);
                    si.setVisible(true);
                    si.setFocusable(false);

            si.setBorder(new LineBorder(Color.white));


            shop.add(boostB);
boostB.add(si);


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

        frame.add(commboxnext);

        for (int c = 0; c < colors.length; c++) {

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

            optionsmenu_colors.add(color);

        }

        frame.add(commbox);
        frame.add(upgradeMenuButton);
        frame.add(upgradeMenu);

        for (int c = 0; c < colors.length; c++) {

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
        eAchievements.add(iAchievements);
        eShop.add(iShop);
        frame.add(optionsmenu);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(panel1);
        optionsmenu.add(options_c);
        optionsmenu.add(options_ts);
        frame.setVisible(true);

       // artemisCombat();




        while (startname.isVisible() == false) {
            Loading();
            Thread TH = new Thread();
            TH.sleep(1000);
            if (l.isVisible() == true) {
                Loading();
                l.setVisible(false);
            }
            if (elementImage.isVisible()==true){
                if (at == 1){
                    animateElement(spieler.Main_Element,null,(byte) 1);
                }
                if (at == 2){
                    System.out.println("at = 2");;
                    animateElement(null,spieler.Second_Element,(byte) 2);
                }
                if (at == 3){
                    System.out.println("at = 2");;
                    animateElement(null,null,(byte) 3);
                }
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
                   

    }

    

    int i;
    int n1;
    char c;
    String t = "loading:";
    

    java.awt.event.ActionEvent e;


    public void openInv(){

      
        chosen_Main_Element_Name.setBorder(null);

        eshop_weapons.setActionCommand("eInventar_weapons");
        eshop_shields.setActionCommand("eInventar_Shields");
        eshop_boosts.setActionCommand("eInventar_Boosts");
        chosen_Main_Element.setVisible(false);

        for (int o = 0; o < scl.items.length; o++){
           inventarPanel.getComponent(o).setVisible(false);
            }

            for (int o = 0; o < scl.schwerte.length; o++){
                if (inventory.containsKey(scl.items[o])){
                    inventarPanel.getComponent(o).setVisible(true);
                }
                
            }

        inventarPanel.setVisible(!inventarPanel.isVisible());
        shop_options.setVisible(!shop_options.isVisible());
        iPanel.setVisible(inventarPanel.isVisible());
        achievements.setVisible(!achievements.isVisible());
iPanel.setText("          Inventar        ");


if (shop.isVisible()== true){
shop.setVisible(false);
inventarPanel.setVisible(true);
iPanel.setVisible(true);
shop_options.setVisible(true);
iPanel.setText("          Inventar        ");
commbox.setVisible(false);
}

if (achievements.isVisible()== true){
achievements.setVisible(false);
}
    }

    

    public void actionPerformed(java.awt.event.ActionEvent e) {

        if (e.getActionCommand() == "startname") {
            System.out.println("startname");
            l.setVisible(!l.isVisible());

        }


        if (e.getActionCommand() == "Sword_Equip") {

            System.out.println("D");
            for (int s = 0; s < scl.schwerte.length; s++){
if (scl.schwerte[s] == chosen_Main_Element_Name.getText() ){
    playerInfoPower.setForeground(scl.weaponsColor[s]);
    playerInfoPower.setText(scl.weaponsPower[s] + "x");
    spieler.powerBoostIcon = scl.i[s];
    spieler.powerBoost = scl.weaponsPower[s];
    boostDamageText.setForeground(scl.weaponsColor[s]);
                playerInfoPower.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\weapons\\" + chosen_Main_Element_Name.getText() +".png").getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING)));
                if (chosen_Main_Element_Name.getText() == "The Warrior"){
                    playerInfoPower.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\weapons\\" + chosen_Main_Element_Name.getText() +".png").getImage().getScaledInstance(30, 25, Image.SCALE_AREA_AVERAGING)));

                }
                
            }
            spieler.powerBoostName = chosen_Main_Element_Name.getText();
                choose_Element.setText(" Equipped ");

            
        }
        }

        if (e.getActionCommand() == "Shield_Equip") {



            for (int s = 0; s < scl.schilder.length; s++){
                if (scl.schilder[s] == chosen_Main_Element_Name.getText() ){
                spieler.hpBoost = scl.shieldsEffect[s];
                spieler.hpBoostName = scl.schilder[s];
                    playerInfoHPShield.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Shields\\" + chosen_Main_Element_Name.getText() +".png").getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING)));
                                    //playerInfoPower.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\weapons\\" + chosen_Main_Element_Name.getText() +".png").getImage().getScaledInstance(30, 25, Image.SCALE_AREA_AVERAGING)));                                
                            }

                            spieler.hpBoostName = chosen_Main_Element_Name.getText();
                                choose_Element.setText(" Equipped ");
                
                            
                        }

 
 
                    }



                    if (e.getActionCommand() == "Boost_Use") {

                        System.out.println("D");
                        for (int s = 0; s < scl.boosts.length; s++){
            if (scl.boosts[s] == chosen_Main_Element_Name.getText()){
                                        
                        }


             if (scl.boosts[s] == "Schnelle Rüstung" && chosen_Main_Element_Name.getText() == "Schnelle Rüstung"){
                        spieler.Health += 100;
                        playerInfoHP.setText("           " +spieler.Health);
                        inventory.remove(scl.boosts[s]);


            }

            if (scl.boosts[s] == "Heal Elixir" && chosen_Main_Element_Name.getText() == "Heal Elixir"){
                spieler.Health += 250;
                playerInfoHP.setText("           " +spieler.Health);
                inventory.remove(scl.boosts[s]);

    }

    if (scl.boosts[s] == "Heal Potion" && chosen_Main_Element_Name.getText() == "Heal Potion"){
        spieler.Health += 800;
        playerInfoHP.setText("           " +spieler.Health);
        inventory.remove(scl.boosts[s]);

}

if (scl.boosts[s] == "Reflection" && chosen_Main_Element_Name.getText() == "Reflection"){
    playerInfoHP.setText("           " +spieler.Health);
    inventory.remove(scl.boosts[s]);
    enemyInfo.setBorder(new LineBorder(new Color(250,150,150)));
    reflectedDamgeImage.setVisible(true);
    spieler.reflection = true;
    reflectedDamgeImage.setVisible(true);
}
                        
                    }
                    chosen_Main_Element.setVisible(false);

                    for (int o = 0; o < scl.items.length; o++){
                        inventarPanel.getComponent(o).setVisible(false);
                         }
        
                        for (int o = (scl.schwerte.length + scl.schilder.length); o < scl.items.length; o++){
                            if (inventory.containsKey(scl.items[o])){
                                inventarPanel.getComponent(o).setVisible(true);        
                            }
                            
                        }
                  



                    }

        if (e.getActionCommand() == "eInventar") {
           openInv();

    }


        if (e.getActionCommand().equals("eInventar_weapons")) {

            commbox.setVisible(false);
            chosen_Main_Element.setVisible(false);

            chosen_Main_Element_Name.setBorder(null);

            for (int o = 0; o < scl.items.length; o++){
               inventarPanel.getComponent(o).setVisible(false);
                }

                for (int o = 0; o < scl.schwerte.length; o++){
                    if (inventory.containsKey(scl.schwerte[o])){
                        inventarPanel.getComponent(o).setVisible(true);
                    }
                    
                }
          
          }

          if (e.getActionCommand().equals("eInventar_Shields")) {
            commbox.setVisible(false);
            chosen_Main_Element.setVisible(false);

            chosen_Main_Element_Name.setBorder(null);

            for (int o = 0; o < scl.items.length; o++){
                inventarPanel.getComponent(o).setVisible(false);
                 }

                for (int o = scl.schwerte.length; o < (scl.items.length - scl.boosts.length); o++){
                    if (inventory.containsKey(scl.items[o])){
                        System.out.println("SW");
                        inventarPanel.getComponent(o).setVisible(true);
                    }
                    
                }
          
          
          }


          if (e.getActionCommand().equals("eInventar_Boosts")) {
            commbox.setVisible(false);
            chosen_Main_Element.setVisible(false);

            chosen_Main_Element_Name.setBorder(null);

            for (int o = 0; o < scl.items.length; o++){
                inventarPanel.getComponent(o).setVisible(false);
                 }

                for (int o = (scl.schwerte.length + scl.schilder.length); o < scl.items.length; o++){
                    if (inventory.containsKey(scl.items[o])){
                        System.out.println("SW");
                        inventarPanel.getComponent(o).setVisible(true);
                        choose_Element.setText(" gekauft ");

                    }
                    
                }
          
          
          }


        if (e.getActionCommand() == "Sword_Buy") {

            for (int s = 0; s < scl.schwerte.length; s++){



                if (scl.schwerte[s] == chosen_Main_Element_Name.getText()){
                System.out.println(chosen_Main_Element_Name.getText());
                if (!inventory.containsKey(chosen_Main_Element_Name.getText())){

                    if (spieler.Gold >= scl.weaponsPreis[s]){
                        spieler.Gold -= scl.weaponsPreis[s];
                        inventory.putIfAbsent(scl.schwerte[s], 1);
                        choose_Element.setText(" gekauft ");
                    }
                }
            }
        }
        }

        if (e.getActionCommand() == "Shield_Buy") {

            for (int s = 0; s < scl.schilder.length; s++){

                if (scl.schilder[s] == chosen_Main_Element_Name.getText()){
                System.out.println(chosen_Main_Element_Name.getText());
                if (!inventory.containsKey(chosen_Main_Element_Name.getText())){

                    if (spieler.Gold >= scl.shieldsPreis[s]){
                        spieler.Gold -= scl.shieldsPreis[s];
                        inventory.putIfAbsent(scl.schilder[s], 1);
                        choose_Element.setText(" gekauft ");

                    }
                }
            }
        }
        }

        if (e.getActionCommand() == "Boost_Buy") {

            for (int s = 0; s < scl.boosts.length; s++){

                if (scl.boosts[s] == chosen_Main_Element_Name.getText()){
                System.out.println(chosen_Main_Element_Name.getText());

                    if (spieler.Gold >= scl.boostsPreis[s]){
                        spieler.Gold -= scl.boostsPreis[s];
                        inventory.put(scl.boosts[s], 1);
                        System.out.println(inventory.get(scl.boosts[s] + 1));
                   //     chosen_Main_Element_Name.setText(chosen_Main_Element_Name.getText() +"[" + inventory.get(scl.boosts[s]) + "]");
                        choose_Element.setText(" gekauft ");

                    }
            }
        }
        }




        

        if (e.getActionCommand() == "+") {
            upgradeMenu.setVisible(!upgradeMenu.isVisible());
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

        if (e.getActionCommand() == "eAchievements") {
            chosen_Main_Element.setVisible(false);
            achievements.setVisible(!achievements.isVisible());
            iPanel.setVisible(achievements.isVisible());
            iPanel.setText("   Auszeichnungen   ");
            shop_options.setVisible(false);

 
            if (inventarPanel.isVisible()== true){
                inventarPanel.setVisible(false);
 
            }
 
            if (shop.isVisible()== true){
             shop.setVisible(false);
         }
 
               
        }

        

        if (e.getActionCommand() == "HealthUpgrade") {
            if (spieler.Points >= 1) {
                spieler.Health = spieler.Health + 5;
                spieler.MaxHealth = spieler.MaxHealth + 5;
                i6.setText("  Health: " + spieler.Health + " ");
                spieler.Points--;
                pointsText.setText(" Points:  " + spieler.Points);
                playerInfoHP.setText("" + spieler.Health);
                playerInfoHPProgress.setBounds(75,170,0,40);
                for (int w = 0; w<spieler.Health;w++){
                    playerInfoHPProgress.setBounds(75,170,w,40);
                    if (playerInfoHPProgress.getBounds().width >= 220){
                        playerInfoHPProgress.setBounds(75,170,220,40);
                    }
                }
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

         //   l.setVisible(!l.isVisible());


       // optionsPanel.setVisible(true);

        //option1button.setVisible(true);

        texarea.setVisible(true);
confirmName.setVisible(true);
commbox.setVisible(false);
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

       if (e.getActionCommand() == "option3") {
            frame.setVisible(false);
        }


        if (e.getActionCommand() == "ConfirmName") {
           spieler.playerName = texarea.getText();
           playerInfoName.setText(spieler.playerName);
           elementsMenu.setVisible(true);
texarea.setVisible(false);
confirmName.setVisible(false);
texarea.setEditable(false);
commbox.setVisible(true);
option1.setVisible(false);
fighting_options.setVisible(false);
choose_Element.setActionCommand("Main_Choose");

commbox.setText("Willkommen " + spieler.playerName + ", wähle zuerst das Main Element");
//mainTextPanel.setVisible(true);
//mainTextArea.setVisible(true);
//DerAnfang();

        }

        if (e.getActionCommand().equals("options_c")) {

            frame.setVisible(false);

        }

        if (e.getActionCommand().equals("o1")) {

            selectposition(nextPosition1);
            

        }

        if (e.getActionCommand().equals("o2")) {

            selectposition(nextPosition2);
            

        }

        if (e.getActionCommand().equals("o3")) {

            selectposition(nextPosition3);
            

        }

        if (e.getActionCommand().equals("o4")) {

            selectposition(nextPosition4);
            

        }

        if (e.getActionCommand().equals("ePlayButton1")) {


ifightPlayButton.setText("   1x");
spieler.t1 = 4;

spieler.t2 = 200;
spieler.t3 = 300;
spieler.ancientAnimation = 0;
spieler.cosmicAnimation1 = 15;
spieler.cosmicAnimation2 = 9;
spieler.divide = 20;
spieler.damageTextAnimation = 6;
spieler.boostDamageTextAnimation = 5;
ePlayButton.setActionCommand("ePlayButton2");

        }


        if (e.getActionCommand().equals("ePlayButton2")) {
           

            ifightPlayButton.setText("   2x");
            spieler.t1 = 0;
            spieler.t1 = 3/2;
            spieler.t2 = 50;
            spieler.t3 = 100;
            spieler.ancientAnimation = 0;
            spieler.cosmicAnimation1 = 15/2;
            spieler.cosmicAnimation2 = 9/2;
            spieler.divide = 5;
            spieler.damageTextAnimation = 2;
            spieler.boostDamageTextAnimation = 1;
ePlayButton.setActionCommand("ePlayButton1");


        }


        if (e.getActionCommand().equals("eShop")) {
            eshop_weapons.setActionCommand("eShop_weapons");
            eshop_shields.setActionCommand("eShop_Shields");
            eshop_boosts.setActionCommand("eShop_Boosts");

            chosen_Main_Element.setVisible(false);

           shop.setVisible(!shop.isVisible());
           iPanel.setVisible(shop.isVisible());
           shop_options.setVisible(!shop_options.isVisible());
           iPanel.setText("            Shop          ");


           if (inventarPanel.isVisible()== true){
               inventarPanel.setVisible(false);
            shop.setVisible(true);
            iPanel.setVisible(true);
            shop_options.setVisible(true);
            iPanel.setText("            Shop          ");

           }

           if (achievements.isVisible()== true){
            achievements.setVisible(false);
        }


        }



        if (e.getActionCommand().equals("eShop_weapons")) {
            commbox.setVisible(false);
            chosen_Main_Element.setVisible(false);

            for (int s = 0; s < scl.items.length; s++){
            if (shop.getComponent(s).getName().equals("Shield")){
                shop.getComponent(s).setVisible(false);         
        }

        if (shop.getComponent(s).getName().equals("Special_Shield")){
            shop.getComponent(s).setVisible(false);         
    }

        if (shop.getComponent(s).getName().equals("Boost")){
            shop.getComponent(s).setVisible(false);         
    }

    if (shop.getComponent(s).getName().equals("Sword")){
        shop.getComponent(s).setVisible(true);              
}
        
if (shop.getComponent(s).getName().equals("Special_Sword")){
    shop.getComponent(s).setVisible(false);         
}

             }
         }

         if (e.getActionCommand().equals("eShop_Shields")) {
            commbox.setVisible(false);

            chosen_Main_Element.setVisible(false);
             for (int s = 0; s < scl.items.length; s++){

            if (shop.getComponent(s).getName().equals("Sword")){
                shop.getComponent(s).setVisible(false);         
        }

        if (shop.getComponent(s).getName().equals("Special_Sword")){
            shop.getComponent(s).setVisible(false);         
        }

        if (shop.getComponent(s).getName().equals("Special_Shield")){
            shop.getComponent(s).setVisible(false);         
    }

        if (shop.getComponent(s).getName().equals("Boost")){
            shop.getComponent(s).setVisible(false);         
    }

    if (shop.getComponent(s).getName().equals("Shield")){
        shop.getComponent(s).setVisible(true);              
}
        

             }

             
                     
             
          }


          if (e.getActionCommand().equals("eShop_Boosts")) {
            commbox.setVisible(false);
            chosen_Main_Element.setVisible(false);

             for (int s = 0; s < scl.items.length; s++){
                if (shop.getComponent(s).getName().equals("Shield")){
                    shop.getComponent(s).setVisible(false);              
            }

            if (shop.getComponent(s).getName().equals("Special_Shield")){
                shop.getComponent(s).setVisible(false);         
        }

            if (shop.getComponent(s).getName().equals("Sword")){
                shop.getComponent(s).setVisible(false);         
        }

        if (shop.getComponent(s).getName().equals("Special_Sword")){
            shop.getComponent(s).setVisible(false);         
        }

        if (shop.getComponent(s).getName().equals("Boost")){
            shop.getComponent(s).setVisible(true);         
    }

    
        

             }

             
                     
             
          }

        if (e.getActionCommand().equals("Main_Choose")) {

           // commbox.setText(" du hast" + "  '" + chosen_Main_Element_Name.getText() + "'  " + "als Haupt Element gewählt");
            spieler.Main_Element = chosen_Main_Element_Name.getText();
            choose_Element.setActionCommand("Second_Choose");
            commbox.setText(" Wähle jetzt dein Sekundär Element aus.");




            for (int t = 0; t < Elemente.elements.length; t++) {
                if (Elemente.elements[t].charAt(0) == spieler.Main_Element.charAt(2)
                        && Elemente.elements[t].charAt(1) == spieler.Main_Element.charAt(3)
                        && Elemente.elements[t].charAt(2) == spieler.Main_Element.charAt(4)
                        && Elemente.elements[t].charAt(3) == spieler.Main_Element.charAt(5)) {
                    chosen_Main_Element.setVisible(false);
                    i1.setIcon(
                            new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[t] + ".png")
                                    .getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                    i1.setText(Elemente.elementsName[t]);
                    i1.setForeground(Elemente.elemetColors[t]);
                    elementsMenu.getComponent(t).setEnabled(false);
                    playerInfoMainElement.setIcon(
                        new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[t] + ".png")
                                .getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));

                }
            }



        }


        if (e.getActionCommand().equals("Second_Choose")) {
            chosen_Main_Element.setVisible(false);
            elementsMenu.setVisible(false);

            commbox.setVisible(false);
            spieler.Second_Element = chosen_Main_Element_Name.getText();
            choose_Element.setActionCommand("/");

            for (int t = 0; t < Elemente.elements.length; t++) {
                if (Elemente.elements[t].charAt(0) == spieler.Second_Element.charAt(2)
                        && Elemente.elements[t].charAt(1) == spieler.Second_Element.charAt(3)
                        && Elemente.elements[t].charAt(2) == spieler.Second_Element.charAt(4)
                        && Elemente.elements[t].charAt(3) == spieler.Second_Element.charAt(5)) {
                    i2.setIcon(
                            new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[t] + ".png")
                                    .getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                    i2.setText(Elemente.elementsName[t]);
                    i2.setForeground(Elemente.elemetColors[t]);
                    chosen_Main_Element.setVisible(false);
                    elementsMenu.getComponent(t).setEnabled(false);

                    playerInfoSecondElement.setIcon(
                        new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[t] + ".png")
                                .getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
                                optionsPanel.setVisible(true);
                                mainTextPanel.setVisible(true);
mainTextArea.setVisible(true);
DerAnfang();

                }
            }

            
            commbox.setText("Du hast" + spieler.Main_Element + "als Hauptelement und" + spieler.Second_Element + "als Sekundärelement gewählt");


        }



        if (e.getActionCommand().equals("Attack#1")) {
       elementImage.setBounds(5000,280,400,400);
       e2.setEnabled(false);
       elementImage.setVisible(true);
       e2.setEnabled(true);
       commbox.setVisible(false);
       shop.setVisible(false);
       iPanel.setVisible(false);
       inventarPanel.setVisible(false);
       shop_options.setVisible(false);

at = 1;
        }


        if (e.getActionCommand().equals("Attack#2")) {
            elementImage.setBounds(5000,280,400,400);
            e1.setEnabled(false);
            elementImage.setVisible(true);
            at = 2;
            e1.setEnabled(true);
            commbox.setVisible(false);
            shop.setVisible(false);
            iPanel.setVisible(false);
            inventarPanel.setVisible(false);
            shop_options.setVisible(false);


             }

             if (e.getActionCommand().equals("Attack#3")) {
                elementImage.setBounds(5000,280,400,400);
                e1.setEnabled(false);
                elementImage.setVisible(true);
                at = 3;
                e1.setEnabled(true);
                commbox.setVisible(false);
                shop.setVisible(false);
                iPanel.setVisible(false);
                inventarPanel.setVisible(false);
                shop_options.setVisible(false);
    
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
                choose_Element.setEnabled(true);

                chosen_Main_Element.setVisible(true);
                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);
                choose_Element.setText(" Wählen ");


                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[v] + ".png")
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText("  " + Elemente.elements[v] + "  ");
                chosen_Main_Element_Name.setForeground(Elemente.elemetColors[v]);
                chosen_Main_Element_Description.setText("           " + Elemente.elements[v]
                        + " effective agains                      | " + Elemente.elementsPowers[v] + " |");
                        chosen_Main_Element_Description.setForeground(Color.white);

                commbox.setText(Elemente.elements[v] + " " + Elemente.elementsWeaks[v]);

            }
        }

        for (v = 0; v < scl.schwerte.length; v++) {
            if (e.getActionCommand().equals(scl.schwerte[v] + "B")) {
                choose_Element.setEnabled(true);

                chosen_Main_Element_Name.setBorder(null);
                commbox.setVisible(true);
                chosen_Main_Element.setVisible(true);
                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);
                choose_Element.setText(" Kaufen ");

                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon(scl.i[v])
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText(scl.schwerte[v]);
                chosen_Main_Element_Name.setForeground(scl.weaponsColor[v]);
                commbox.setForeground(scl.weaponsColor[v]);
                chosen_Main_Element_Description.setText("Kostet " +  scl.weaponsPreis[v] + " coins" );
                chosen_Main_Element_Description.setForeground(Color.white);

                commbox.setText(scl.inf[v]);
                choose_Element.setActionCommand("Sword_Buy");
                if (inventory.containsKey(chosen_Main_Element_Name.getText())){
                    choose_Element.setText(" gekauft ");

                }

            }
        }

        for (v = 0; v < scl.schilder.length; v++) {
            if (e.getActionCommand().equals(scl.schilder[v]  + "B")) {
                choose_Element.setEnabled(true);

                chosen_Main_Element_Name.setBorder(null);
                commbox.setVisible(true);
                chosen_Main_Element.setVisible(true);
                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);
                choose_Element.setText(" Kaufen ");

                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon(scl.i2[v])
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText(scl.schilder[v]);
                chosen_Main_Element_Name.setForeground(scl.shieldsColor[v]);
                commbox.setForeground(scl.shieldsColor[v]);
                chosen_Main_Element_Description.setText("Kostet " +  scl.shieldsPreis[v] + " coins" );
                chosen_Main_Element_Description.setForeground(Color.white);

                commbox.setText(scl.inf2[v]);
                choose_Element.setActionCommand("Shield_Buy");
                if (inventory.containsKey(chosen_Main_Element_Name.getText())){
                    choose_Element.setText(" gekauft ");

                }
            }
        }


        for (v = 0; v < scl.boosts.length; v++) {
            if (e.getActionCommand().equals(scl.boosts[v]  + "B")) {
                choose_Element.setEnabled(true);

                chosen_Main_Element_Name.setBorder(null);
                commbox.setVisible(true);
                chosen_Main_Element.setVisible(true);
                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);
                choose_Element.setText(" Kaufen ");

                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon(scl.i3[v])
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText(scl.boosts[v]);
                chosen_Main_Element_Name.setForeground(scl.boostsColor[v]);
                commbox.setForeground(scl.boostsColor[v]);
                chosen_Main_Element_Description.setText("Kostet " +  scl.boostsPreis[v] + " coins" );
                chosen_Main_Element_Description.setForeground(Color.white);

                commbox.setText(scl.inf3[v]);
                choose_Element.setActionCommand("Boost_Buy");
                if (inventory.containsKey(chosen_Main_Element_Name.getText())){
                    choose_Element.setText(" gekauft ");

                }
            }
        }


        for (v = 0; v < scl.schwerte.length; v++) {
            if (e.getActionCommand().equals(scl.schwerte[v] + "I")) {
                choose_Element.setEnabled(true);

                commbox.setVisible(true);
                chosen_Main_Element.setVisible(true);
                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);
                choose_Element.setText(" Equippen ");

                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon(scl.i[v])
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText(scl.schwerte[v]);
                chosen_Main_Element_Name.setForeground(scl.weaponsColor[v]);
                commbox.setForeground(scl.weaponsColor[v]);
                chosen_Main_Element_Description.setText(" " +  scl.weaponsPreis[v] + " coins" );
                chosen_Main_Element_Description.setForeground(Color.white);

                commbox.setText(scl.inf[v]);
                chosen_Main_Element_Name.setBorder(null);
                choose_Element.setActionCommand("Sword_Equip");
                if (spieler.powerBoostName.equals(chosen_Main_Element_Name.getText())){
                    choose_Element.setText(" Equipped ");

                }
            }
        }


        for (v = 0; v < scl.schilder.length; v++) {
            if (e.getActionCommand().equals(scl.schilder[v]  + "I")) {
                choose_Element.setEnabled(true);

                commbox.setVisible(true);
                chosen_Main_Element.setVisible(true);
                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);
                choose_Element.setText(" Equippen ");

                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon(scl.i2[v])
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText(scl.schilder[v]);
                chosen_Main_Element_Name.setForeground(scl.shieldsColor[v]);
                commbox.setForeground(scl.shieldsColor[v]);
                chosen_Main_Element_Description.setText(" " +  scl.shieldsPreis[v] + " coins" );
                chosen_Main_Element_Description.setForeground(Color.white);

                commbox.setText(scl.inf2[v]);
                choose_Element.setActionCommand("Shield_Equip");
                chosen_Main_Element_Name.setBorder(null);
                if (spieler.hpBoostName.equals(chosen_Main_Element_Name.getText())){
                    choose_Element.setText(" Equipped ");

                }
            }
        }


        for (v = 0; v < scl.boosts.length; v++) {
            if (e.getActionCommand().equals(scl.boosts[v]  + "I")) {

                choose_Element.setEnabled(true);
                commbox.setVisible(true);
                chosen_Main_Element.setVisible(true);
                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);
                choose_Element.setText(" Verwenden ");

                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon(scl.i3[v])
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText(scl.boosts[v]);
                chosen_Main_Element_Name.setForeground(scl.boostsColor[v]);
                commbox.setForeground(scl.boostsColor[v]);
                chosen_Main_Element_Description.setText(" " +  scl.boostsPreis[v] + " coins" );
                chosen_Main_Element_Description.setForeground(Color.white);

                commbox.setText(scl.inf3[v]);

                choose_Element.setActionCommand("Boost_Use");
                chosen_Main_Element_Name.setBorder(null);
                if (spieler.hpBoostName.equals(chosen_Main_Element_Name.getText())){
                    choose_Element.setText(" Equipped ");

                }
            }
        }
        


        for (v = 0; v < rew.achievements.length; v++) {
            if (e.getActionCommand().equals(rew.achievements[v])) {
                chosen_Main_Element_Name.setBorder(null);
                commbox.setVisible(true);
                chosen_Main_Element.setVisible(true);
                chosen_Main_Element_Name.setVisible(true);
                chosen_Main_Element_Description.setVisible(true);
                chosen_Main_Element_Picture.setVisible(true);
                choose_Element.setVisible(true);
                choose_Element.setText(" Einfordern ");

                chosen_Main_Element_Picture.setIcon(
                        new ImageIcon(new ImageIcon(rew.achievementsImage[v])
                                .getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                chosen_Main_Element_Name.setText(rew.achievements[v]);
                chosen_Main_Element_Name.setForeground(rew.achievementsColor[v]);
                commbox.setForeground(rew.achievementsColor[v]);
                chosen_Main_Element_Description.setText(rew.achievementsDifficulty[v]);
                chosen_Main_Element_Description.setForeground(rew.difficultyColors[v]);
                chosen_Main_Element_Description.setBorder(null);
                chosen_Main_Element_Description.setBorder(new LineBorder(Color.black));
                commbox.setText(" " + rew.achievementsDescription[v]);
             //   choose_Element.setActionCommand("Achievement_Claim");
                choose_Element.setEnabled(false);
                choose_Element.setText(rew.achievementsReward[v]);

               // if (inventory.containsKey(chosen_Main_Element_Name.getText())){
             //       choose_Element.setText(" gekauft ");

            //    }
               if(chosen_Main_Element_Name.getText().equals("Kämpfer")){

                if (spieler.damageMade > 2500){
                    commbox.setText(" Verursache 2.5k Schaden > " + "2.5k von 2.5k Schaden");
                }
                else {
                    commbox.setText(" Verursache 2.5k Schaden > " + spieler.damageMade + " von  2.5k Schaden");

                }
               
            }

            }
        }



    }
    

    public void Loading() throws InterruptedException {
        if (l.isVisible() == true) {
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

                    tn.setVisible(false);

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


                }

            }

            startb();

        }

    }

    public void endFight(){
        enemyInfo.setVisible(false);
        enemyImage.setVisible(false);
        enemyInfoDifficulty.setVisible(false);
        enemyInfoHP.setVisible(false);
        enemyInfoImage.setVisible(false);
        enemyInfoName.setVisible(false);
        enemyInfoMainElement.setVisible(false);
        enemyInfoSecondElement.setVisible(false);
        enemyInfoThirdElement.setVisible(false);
        enemyInfoLastElement.setVisible(false);
        reflectedDamgeImage.setVisible(false);
        
        playerInfo.setVisible(false);
        playerInfoAttack.setVisible(false);
        playerInfoHP.setVisible(false);
        playerInfoHPShield.setVisible(false);
        playerInfoMainElement.setVisible(false);
        playerInfoName.setVisible(false);
        playerInfoPower.setVisible(false);
        playerInfoSecondElement.setVisible(false);
        playerInfoSupportElement.setVisible(false);
        
        fighting_options.setVisible(false);
        fightPlayButton.setVisible(false);

        specialEnemyP.setVisible(false);
        specialEnemyP2.setVisible(false);
        specialEnemyI.setVisible(false);
        specialEnemyT.setVisible(false);
    }

    public void endEnemy() throws InterruptedException{

        standardE();

        

        if (nextPosition1 == "Vierter Gegner Kampf"){
            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[(Zorniger) Stier] wurde besiegt! \n \nDu hast 180 Münzen bekommen!");
option1button.setText("Belohnung fordern!");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "Anfangpart8";
nextPosition2 = "";

        }

        if (nextPosition1 == "Dritter Gegner Kampf"){
            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[(Wütender) Bär] wurde besiegt! \n \nDu hast 160 Münzen bekommen!");
option1button.setText("Letzter Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "Vierter Gegner Kampf";
nextPosition2 = "";

        }

        if (nextPosition1 == "Zweiter Gegner Kampf"){
            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[(Wilder) Eber] wurde besiegt! \n \nDu hast 140 Münzen bekommen!");
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "Dritter Gegner Kampf";
nextPosition2 = "";

        }
        
        if (nextPosition1 == "Erster Gegner Kampf"){
            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[(Wütender) Hirsch] wurde besiegt! \n \nDu hast 120 Münzen bekommen! \n \nJe stärker der Gegner ist, desto mehr Münzen bekommst du!");
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "Zweiter Gegner Kampf";
nextPosition2 = "";

        }

        if (nextPosition1 == "Story7L_5"){

            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[(Ghost) Stier] wurde besiegt! \n \nDu hast 120 Münzen bekommen!");
option1button.setText("weiter");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option2button.setText("");
nextPosition1 = "Story7L_6";
nextPosition2 = "";
        
        }

        if (nextPosition1 == "Story7L_4"){

            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[(Ghost) Bär] wurde besiegt! \n \nDu hast 120 Münzen bekommen!");
option1button.setText("Letzter Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "Story7L_5";
nextPosition2 = "";
        
        }

        if (nextPosition1 == "Story7L_3"){

            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[(Ghost) Eber] wurde besiegt! \n \nDu hast 120 Münzen bekommen!");
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "Story7L_4";
nextPosition2 = "";
        
        }


        if (nextPosition1 == "Story7L_2"){

            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[(Ghost) Hirsch] wurde besiegt! \n \nDu hast 120 Münzen bekommen!");
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "Story7L_3";
nextPosition2 = "";
        
        }


        if (nextPosition1 == "StoryR_6!!!!!!"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Amazone lvl 6] wurde besiegt! \n \nDu hast 320 Münzen bekommen!");
spieler.Gold+= 320;
option1button.setText("weiter");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option2button.setText("");
nextPosition1 = "StoryR_6+++++++";
}

        if (nextPosition1 == "StoryR_6!!!!!"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Amazone lvl 5] wurde besiegt! \n \nDu hast 300 Münzen bekommen!");
spieler.Gold+= 300;
option1button.setText("Letzte Amazone");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "StoryR_6!!!!!!";
        }

        if (nextPosition1 == "StoryR_6!!!!"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Amazone lvl 4] wurde besiegt! \n \nDu hast 280 Münzen bekommen!");
spieler.Gold+= 280;
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "StoryR_6!!!!!";
        }


        if (nextPosition1 == "StoryR_6!!!"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Amazone lvl 3] wurde besiegt! \n \nDu hast 260 Münzen bekommen!");
spieler.Gold+= 260;
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "StoryR_6!!!!";
        }

        if (nextPosition1 == "StoryR_6!!"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Amazone lvl 2] wurde besiegt! \n \nDu hast 240 Münzen bekommen!");
spieler.Gold+= 240;
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "StoryR_6!!!";
        }

        if (nextPosition1 == "StoryR_6!"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Amazone lvl 1] wurde besiegt! \n \nDu hast 220 Münzen bekommen!");
spieler.Gold+= 220;
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "StoryR_6!!";
        }


  if (nextPosition1 == "StoryR_6++"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gladiator lvl 1] wurde besiegt! \n \nDu hast 220 Münzen bekommen!");
spieler.Gold+= 220;
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
        }

        if (nextPosition1 == "StoryR_6+++"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gladiator lvl 2] wurde besiegt! \n \nDu hast 240 Münzen bekommen!");
spieler.Gold+= 240;
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
        }

        if (nextPosition1 == "StoryR_6++++"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gladiator lvl 3] wurde besiegt! \n \nDu hast 260 Münzen bekommen!");
spieler.Gold+= 260;
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
        }

        if (nextPosition1 == "StoryR_6+++++"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gladiator lvl 4] wurde besiegt! \n \nDu hast 280 Münzen bekommen!");
spieler.Gold+= 280;
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
        }

        if (nextPosition1 == "StoryR_6++++++"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gladiator lvl 5] wurde besiegt! \n \nDu hast 300 Münzen bekommen!");
spieler.Gold+= 300;
option1button.setText("Letzter Gladiator");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
        }
        

        if (nextPosition1 == "After Gladiators"){
            endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gladiator lvl 6] wurde besiegt! \n \nDu hast 320 Münzen bekommen!");
spieler.Gold+= 320;
option1button.setText("weiter");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option2button.setText("");
nextPosition2 = "";
        }

        if (nextPosition1 == "StoryR_6++++++++++"){
            endFight();

            optionsPanel.setVisible(true);
            mainTextPanel.setVisible(true);

            mainTextArea.setText(" Du hast also gewonnen. Mein Respekt.\n Dein nächster Gegner wartet auf den Berg Oite auf dich, er ist dein letzter vor Zeus");
        
        nextPosition1 = "StoryR_6+++++++++++";

        Font f = new Font("Times new Roman", Font.PLAIN, 40);
        
                    option1button.setText("weiter");
                    option3button.setText("");
                    option1button.setFont(f);        
                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        }

        if (nextPosition1 == "Artemis Kampf"){
            endFight();
            mainTextArea.setText("\"Du hast es also tatsächlich geschafft? Beeindruckend!\" Allerdings wirst du es gegen meinen Bruder nicht so leicht haben!  Gehe der Sonne nach sie wird dich zu ihm führen.\n \"Was für eine Schande, gegen einen niederen Menschen verloren…\"");
            inventory.putIfAbsent("Artemis Pfeil", 1);
            Award("W", 1, "Artemis Pfeil", "Artemis Waffe \nerhalten", "Textrpg\\Images\\weapons\\Artemis Pfeil.png");
            nextPosition1 = "Anfangpart11";
            nextPosition2 = "";
            option1button.setText("weiter");
            option2button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 45));
            optionsPanel.setVisible(true);
            mainTextPanel.setVisible(true);
           // mainTextArea.setText("[Artemis] wurde besiegt! \n \nDu hast 1024 Münzen bekommen!");
        }


        if (nextPosition1 == "Apollon Kampf"){
            endFight();

            if (spieler.karma <= -4){
                mainTextArea.setText("\"Du hast also gewonnen. Komm töte mich, sowie du meine Schwester getötet hast\" \n\nWillst du Apollon töten? \n > Apollon töten\n Apollon wird getötet [-4 karma] \n\n > Apollon verschonen\n Apollon wird verschont [+4 karma]");
            
            }
            
            if (spieler.karma >= 4){
                mainTextArea.setText("\"Du hast gewonnen. Komm töte mich \"\n\nWillst du Apollon töten? \n > Apollon töten\n Apollon wird getötet [-4 karma] \n\n > Apollon verschonen\n Apollon wird verschont [+4 karma]");
            }
            inventory.putIfAbsent("Lichtbogen", 1);
            Award("W", 1, "Lichtbogen", "Apollon Waffe \nerhalten", "Textrpg\\Images\\weapons\\Lichtbogen.png");
            mainTextPanel.setVisible(true);
            nextPosition1 = "StoryR_5";
            nextPosition2 = "StoryR_5;";
            option1button.setText("weiter");
            option2button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));

            option1button.setText("Apollon töten");
            option2button.setText("Apollon verschonen");
           
            optionsPanel.setVisible(true);
           // mainTextArea.setText("[Artemis] wurde besiegt! \n \nDu hast 1024 Münzen bekommen!");
        }

        if (nextPosition1 == "Gorgon1"){
            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gorgon1] wurde besiegt! \n \nDu hast 100 Münzen bekommen!");
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 32));
option2button.setText("");
nextPosition1 = "StoryR_6...";
nextPosition2 = "";

        }

        if (nextPosition1 == "Gorgon2"){
            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gorgon2] wurde besiegt! \n \nDu hast 150 Münzen bekommen!");
option1button.setText("Nächster Gegner");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 32));
option2button.setText("");
nextPosition1 = "StoryR_6....";
nextPosition2 = "";

        }

        if (nextPosition1 == "Gorgon3"){
            endFight();

mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("[Gorgon3] wurde besiegt! \n \nDu hast 200 Münzen bekommen!");
option1button.setText("Belohnung fordern!");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "StoryR_6.....";
nextPosition2 = "";

        }

        if (nextPosition1 == "Medusa Fight"){
endFight();
            mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("Du schlägst der Medusa den Kopf ab. Daraufhin gehst du zu Polydektes.\"Du hast die Medusa getötet? Na dann gib ihn mir doch.\" sagt Polydektes genervt.\nDu fragst ihn wo der nächste Tempel ist.\n\n\"Warum sollte ich dir das verraten? Nur weil du mir den Kopf der Medusa gegeben hast? Da musst du mir schon mehr geben!\"");



option1button.setText("weiter");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option2button.setText("");
nextPosition1 = "StoryR_6......";
nextPosition2 = "";

Award("W", 1, "Python Rüstug", "Python Rüstung \nerhalten", "Textrpg\\Images\\Shields\\Python Rüstung.png");
inventory.putIfAbsent("Python Rüstung", 1);

        }

        if (nextPosition1 == "Hades Kampf"){
            endFight();
                        mainTextPanel.setVisible(true);
            optionsPanel.setVisible(true);
            mainTextArea.setText("\"Herzlichen, herzlichen Glückwunsch! Du hast also gewonnen. Los komm töte mi…\"\n\nDu hast Hades den Kopf abgehackt, du bist wieder an der Oberfläche.");

            spieler.karma -= 4;
            option1button.setText("weiter");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setText("");
            nextPosition1 = "End";
            nextPosition2 = "";

                        
            Award("W", 1, "Hades Blades", "Hades Blades \nerhalten", "Textrpg\\Images\\weapons\\Hades Blades.png");
inventory.putIfAbsent("Hades Blades", 1);
            
                    }

                    if (nextPosition1 == "Heraktles Kampf"){
                        endFight();
                        optionsPanel.setVisible(true);
                        mainTextPanel.setVisible(true);


                        if (spieler.karma < 0){
                            mainTextArea.setText(" \"Du Mistkerl, du hast also gewonnen. Mein Vater wird mich rächen.\"\n\nDu hast Heraktles getötet. ");

                        }
                        else{
                            mainTextArea.setText(" \"Du hast also gewonnen. Nun gehe mein Vater wird dich bald empfangen.\"\n\nDu hast Heraktles verschont.");

                        }


                                                nextPosition1 = "End";
                                                option1button.setText("weiter");
                                                option2button.setText("");
                                                option3button.setText("");
                                                option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                        nextPosition2 = "";

                        Award("W", 1, "Fell des Löwen", "Fell des \nLöwen erhalten", "Textrpg\\Images\\Shields\\Fell des Löwen.png");
                        inventory.putIfAbsent("Fell des Löwen", 1);
                        
                                }


                    if (nextPosition1 == "Hydra Kampf"){
                        endFight();
                        optionsPanel.setVisible(true);
                        mainTextPanel.setVisible(true);

                        mainTextArea.setText(" \"Du hast die hydra also besiegt, allerdings bin ich den nächster Gegner, gegen mich wirst du es nicht so leicht haben\" ");
                                                option1button.setText("Kampf beginnen");
                                                option2button.setText("");
                                                option3button.setText("");
                                                option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                        nextPosition1 = "Heraktles Kampf";
                        nextPosition2 = "";
                        
                                }

                                if (nextPosition1 == "Story7R_6"){
                                    endFight();
                                    optionsPanel.setVisible(true);
                                    mainTextPanel.setVisible(true);
            
                                    mainTextArea.setText("[Delphin lvl 3] wurde besiegt! Du hast 240 Münzen bekommen!\n\nDu hast die Delphine besiegt und machst dich auf dem Weg zum nächsten Raum.\n Du öffnest die Tür vor die steht ein Meerjungmann, mit einer Krone auf dem Kopf.");
                                                            option1button.setText("weiter");
                                                            option2button.setText("");
                                                            option3button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                            nextPosition1 = "Story7R_7";
                                                            nextPosition2 = "";
                                    
                                            }

                                            if (nextPosition1 == "Story7R_5"){
                                                endFight();
                                                optionsPanel.setVisible(true);
                                                mainTextPanel.setVisible(true);
                        
                                                mainTextArea.setText("[Delphin lvl 2] wurde besiegt! \n \nDu hast 220 Münzen bekommen!");
                                                                        option1button.setText("Letzter Delphin");
                                                                        option2button.setText("");
                                                                        option3button.setText("");
                                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                        nextPosition1 = "Story7R_6";
                                                                        nextPosition2 = "";
                                                
                                                        }


                                if (nextPosition1 == "Story7R_4"){
                                    endFight();
                                    optionsPanel.setVisible(true);
                                    mainTextPanel.setVisible(true);
            
                                    mainTextArea.setText("[Delphin lvl 1] wurde besiegt! \n \nDu hast 200 Münzen bekommen!");
                                                            option1button.setText("Nächster Gegner");
                                                            option2button.setText("");
                                                            option3button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                            nextPosition1 = "Story7R_5";
                                                            nextPosition2 = "";
                                    
                                            }

                                            if (nextPosition1 == "Zweiter Bandit"){
                                                endFight();
                                                optionsPanel.setVisible(true);
                                                mainTextPanel.setVisible(true);
                        
                                                mainTextArea.setText("[Bandit lvl 2] wurde besiegt! \n \nDu hast 335 Münzen bekommen!");
                                                                        option1button.setText("weiter");
                                                                        option2button.setText("");
                                                                        option3button.setText("");
                                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                        nextPosition1= "Hermes davor";
                                                                        nextPosition2 = "";
                                                
                                                        }


                                            if (nextPosition1 == "Erster Bandit"){
                                                endFight();
                                                optionsPanel.setVisible(true);
                                                mainTextPanel.setVisible(true);
                        
                                                mainTextArea.setText("[Bandit lvl 1] wurde besiegt! \n \nDu hast 300 Münzen bekommen!");
                                                                        option1button.setText("Nächster Bandit");
                                                                        option2button.setText("");
                                                                        option3button.setText("");
                                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                        nextPosition1= "Zweiter Bandit";
                                                                        nextPosition2 = "";
                                                
                                                        }

                                                        if (nextPosition1 == "Hermes Kampf"){
                                                            endFight();
                                                            optionsPanel.setVisible(true);
                                                            mainTextPanel.setVisible(true);
                                    
                                                            
                                                            if(spieler.karma>=4){
                                                                mainTextArea.setText("Du hast also gewonnen. Und was willst du nun mit mir machen, mich töten?\n\nWillst du Hermes töten? \n > Hermes töten\n Hermes wird getötet [-4 karma] \n\n > Hermes verschonen\n Hermes wird verschont [+4 karma]");
                                                                }
                                                                else{
                                                                mainTextArea.setText("Du hast also gewonnen. Komm töte mich, sowie du Artemis getötet hast\n\nWillst du Hermes töten? \n > Hermes töten\n Hermes wird getötet [-4 karma] \n\n > Hermes verschonen\n Hermes wird verschont [+4 karma]");
                                                                }
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                                            option1button.setText("Hermes töten");
                                                            option2button.setText("Hermes verschonen");
                                                            option3button.setText("");
                                                            nextPosition1 = "Hermes töten";
                                                            nextPosition2 = "Hermes verschonen";
                                                            nextPosition3 = "";

                                                            
                                                                    }
            

                                                       
                                                                    if (nextPosition1 == "Poseidon Kampf"){
                                                                        endFight();
                                                                        optionsPanel.setVisible(true);
                                                                        mainTextPanel.setVisible(true);
                                                                        Award("W", 1, "Neptuns Rüstug", "Neptuns Rüstung \nerhalten", "Textrpg\\Images\\Shields\\Neptuns Rüstung.png");
                                                                        inventory.putIfAbsent("Neptuns Rüstung", 1);
                                                                        spieler.karma += 4;

                                                                            mainTextArea.setText("\" Wie ich es erwartet habe. Du bist wahrlich stark, mit dieser Stärke wirst du auch meinem Bruder gegenüber treten können\"\n\nDu verschonst deinen Gegner\nBeim Verlassen des Tempels bist du auf einmal wieder an der Oberfläsche vom Wasser. Du schwimmst an Land.");
                                                                            
                                                                            
                                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                                                        option1button.setText("weiter");
                                                                        option2button.setText("");
                                                                        option3button.setText("");
                                                                        nextPosition1 = "End";
                                                                        nextPosition2 = "";
                                                                        nextPosition3 = "";
            
                                                                        
                                                                                }


                                                                               
                                                                                
                                                                                


                                                                                                                                
                                                                    if (nextPosition1 == "Ares Kampf"){
                                                                        endFight();
                                                                        optionsPanel.setVisible(true);
                                                                        mainTextPanel.setVisible(true);
                                                
                                                                        
                                                                       mainTextArea.setText("Du Mistkerl! Verflucht seist du! Ares spuckt dir ins Gesicht. Du schlägst ihm ins Gesicht. Und forderst ihn auf dir zu sagen wo der nächste Tempel ist.\"Und was ist wenn nicht? Töten kannst du mich nicht\" Du schlägst Ares immer und immer wieder ins Gesicht. Bis er es dir verrät\n\"Ist ja gut, ist ja gut. Ich verrate es dir ja. Gehe auf den Berg Oite, dort wird dein letzter Gegner vor Zeus warten!\"");
                                                                            
                                                                            
                                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                                                        option1button.setText("weiter");
                                                                        option2button.setText("");
                                                                        option3button.setText("");
                                                                        nextPosition1 = "After Ares";
                                                                        nextPosition2 = "";
                                                                        nextPosition3 = "";
            
                                                                        
                                                                                }

                                                                                if (nextPosition1 == "Zeus Kampf"){
                                                                                    endFight();
                                                                                    optionsPanel.setVisible(true);
                                                                                    mainTextPanel.setVisible(true);
                                                            
                                                                                    if(spieler.karma == -4 || spieler.karma == 4){
                                                                                        mainTextArea.setText("\"Nun hast du es also geschafft, du hast den Olymp gestürzt. Was willst du als nächstes tun? \nIch frage mich dennoch, warum du das getan hast. Du hast den Auftrag dieses alten Mannes angenommen, obwohl du nicht weißt, ob er gut oder böse ist. Für ihn hast du getötet.\"");

                                                                                    }

                                                                                    if(spieler.karma == -12){
                                                                                        mainTextArea.setText("\"Du Mistkerl hast also tatsächlich gewonnen.\nBist zufrieden? War es das Wert?\nDu hast so viele von uns getötet, aber wofür?\n\nFür einen alten Mann, den du kaum kennst und von dem du nicht weißt, ob er gut oder böse ist.\"");

                                                                                    }

                                                                                    if(spieler.karma >= 8){
                                                                                        mainTextArea.setText("\"Du bist stark das muss ich dir lassen, ich hatte kaum eine Chance.\nUnd ich muss dir danken, dass du die Anderen verschont hast.\nJedoch verstehe ich nicht ganz. Du hast den Auftrag dieses alten Mannes angenommen ohne zu wissen, ob er gut oder böse ist.\"");

                                                                                    }
                                                                                        
                                                                                        
                                                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                                                                    option1button.setText("weiter");
                                                                                    option2button.setText("");
                                                                                    option3button.setText("");
                                                                                    nextPosition1 = "End5";
                                                                                    nextPosition2 = "";
                                                                                    nextPosition3 = "";
                        
                                                                                    
                                                                                            }

                                                                                            if (nextPosition1 == "Kronos Kampf"){
                                                                                                endFight();
                                                                                                optionsPanel.setVisible(true);
                                                                                                mainTextPanel.setVisible(true);
                                                                        
                                                                                                
                                                                                                    mainTextArea.setText("\"Wie ist das möglich? Ich habe verloren. Neeeeein!\"\n\nKronos bricht zusammen, er ist besiegt\n\n\nGeschichte von Jost geschrieben");
                                                                                                                
                                                                                                    
                                                                                               
                                    
                                                                                                if (spieler.badEnd == true){
                                                                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                                                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                                                                                    option1button.setText("Spiele beenden");
                                                                                                    option2button.setText("");
                                                                                                    option3button.setText("");
                                                                                                    
                                                                                                    nextPosition1 = "Beenden";
                                                                                                    nextPosition2 = "";
                                                                                                    nextPosition3 = "";
                                                                                                }
                                                                                                else{
                                                                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                                                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 25));
                                                                                                    option1button.setText("Spiel beenden");
                                                                                                    option2button.setText("Schlechtes Ending spielen");
                                                                                                    option3button.setText("");
                                                                                                    
                                                                                                    nextPosition1 = "Beenden";
                                                                                                    nextPosition2 = "Bad_End";
                                                                                                    nextPosition3 = "";
                                                                                                }
                                                                                                
                                                                                                        }
                                
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
                Thread.sleep(spieler.t1);
                    }
    
                    
                    Thread.sleep(spieler.t2);
    
            elementImage.setBounds(500,280,400,400);
            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));


            elementImage.setVisible(false);

            System.out.println("Ancient=Main");
            for (int t = 1; t<4; t++){
                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                   for (int a = 1; a<18; a++){
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Ancient\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                   Thread.sleep(spieler.ancientAnimation);
                   if (a >= 17){
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                }
                            }
               
                            for (int a = 1; a<18; a++){
                                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Ancient\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                                Thread.sleep(spieler.ancientAnimation);
                                if (a >= 17){
                                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                                }
                                            }
                  
                                            
                                            elementImage.setVisible(true);
                  
                          }


                          

                          elementImage.setVisible(false);

                          if (spieler.currentEnemyHP > 0){
                            Thread.sleep(spieler.t1 * 10);
                            damageText.setText("Element Schaden");
                            boostDamageText.setText("BoostDamage");
                            damageText.setBounds(900, 480, 600, 80);
                            damageText.setVisible(true);
        
                            damg = spieler.Power;
                            damageText.setForeground(new Color(255,255,255));
                            enemyImage.setEnabled(false);
                            damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient.png").getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));

                            

                            for (int z = 0; z<= 200;z++){
                                damageText.setBounds(900, 480 - z, 600, 80);
                                Thread.sleep(spieler.damageTextAnimation);
                            }

        chosen_Main_Element.setVisible(false);
int divide = spieler.divide;
for (int power = 1; power <= divide; power++){
    damageText.setText(""+ spieler.Power*power/divide + "");
    Thread.sleep(100/divide);
    if (100/divide <= 1000){
        Thread.sleep(spieler.divide + 15);
    }
}

enemyImage.setEnabled(true);




                Thread.sleep(spieler.t2);
                Thread.sleep(spieler.t2/2);

                spieler.currentEnemyHP -= damg;
                enemyInfoHP.setText("         "+spieler.currentEnemyHP);

                if (spieler.currentEnemyHP <= 0){
                    spieler.currentEnemyHP = 0;
                   enemyInfoHP.setText("             0");
                }
                
Thread.sleep(spieler.t2);

if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
    boostDamageText.setBounds(900,480,600,80);
    boostDamageText.setText("BoostDamage");
    boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
    boostDamageText.setVisible(true);
    enemyImage.setEnabled(false);
    for (int z = 0; z<= 200;z++){
        boostDamageText.setBounds(900, 480 - z/2, 600, 80);
        Thread.sleep(spieler.boostDamageTextAnimation);
    }
    for (int power = 0; power <=  (damg * spieler.powerBoost - damg); power++){
        if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
        boostDamageText.setText("+ "+ power);
        Thread.sleep((power * spieler.t1));
        extradamg++;
        spieler.currentEnemyHP -= extradamg;
extradamg = 0;

        }


    }
    spieler.currentEnemyHP++;
    spieler.damageMade += damg + (damg * spieler.powerBoost - damg);
    Thread.sleep(spieler.t3);
    enemyInfoHP.setText("         "+spieler.currentEnemyHP);
enemyImage.setEnabled(true);

if (spieler.currentEnemyHP <= 0){
    spieler.currentEnemyHP = 0;
   enemyInfoHP.setText("             0");
}



}

                          }
                          extradamg = 0;

                          damageText.setVisible(false);
                          boostDamageText.setVisible(false);

                          Thread.sleep(spieler.t3 * 2);
                          setSpecialWeapon("W");

                          specialCombat();
                          enemyAttack();

                          if (spieler.currentEnemyHP <= 0){
                            spieler.currentEnemyHP = 0;
                           enemyInfoHP.setText("             0");
                        endEnemy();
                        }

for (int xi = 0; xi<= 120; xi++){
    fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
    Thread.sleep(spieler.t1);
        }

Thread.sleep(spieler.t3);




               }


               // Ancient //

        if (main_element!= null && main_element.charAt(2) == 'C' && main_element.charAt(3) == 'o' && main_element.charAt(4) == 's' && main_element.charAt(5) == 'm' && main_element.charAt(6) == 'i' && main_element.charAt(7) == 'c' || second_element != null && second_element.charAt(4) == 's' && second_element.charAt(5) == 'm' && second_element.charAt(6) == 'i' && second_element.charAt(7) == 'c' && n==2){
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(spieler.t1);
                    }
    
                    Thread.sleep(spieler.t2);
    
            elementImage.setBounds(700,80,400,400);
            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Cosmic.png").getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));


            elementImage.setVisible(true);

           
            elementImage.setEnabled(true);
            for (int t = 0; t<100; t++){
                elementImage.setBounds(elementImage.getBounds().x - 1, elementImage.getBounds().y + 1, 400, 400);
Thread.sleep(spieler.cosmicAnimation1);
            }

            elementImage.setEnabled(true);
            for (int t = 1; t<30; t++){
                elementImage.setBounds(elementImage.getBounds().x - t, elementImage.getBounds().y + t, 400, 400);
Thread.sleep(spieler.cosmicAnimation2);
            }

            elementImage.setVisible(false);
            Thread.sleep(spieler.t1 * 10);

                if (spieler.currentEnemyHP > 0){
                    Thread.sleep(spieler.t1 * 10);

                    damg = spieler.Power;
                    damageText.setText("" + spieler.Power+ "");
                    damageText.setForeground(new Color(255,255,255));
                    enemyImage.setEnabled(false);
                    damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Cosmic.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));



                    if (spieler.enemyMain_Element == "Void" || spieler.enemyMain_Element == "Gravity" ){

                        damageText.setText("" + spieler.Power *2 + "");
                        damageText.setForeground(new Color(255,50,0));
                        damg = spieler.Power *2;
                        enemyImage.setEnabled(false);
                     damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Cosmic.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));


                    }

                    if (spieler.enemyMain_Element == "Cosmic"){
                        damageText.setText("" + spieler.Power /2 + "");
                        damageText.setForeground(new Color(255,200,30));
                        damg = spieler.Power /2;
                        enemyImage.setEnabled(false);
                     damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Cosmic.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));


                    }

                    Thread.sleep(spieler.t2);
                   
                    enemyImage.setEnabled(false);
                    damageText.setBounds(900, 480, 600, 80);
                    damageText.setVisible(true);

                    for (int z = 0; z<= 200;z++){
                        damageText.setBounds(900, 480 - z, 600, 80);
                        Thread.sleep(spieler.damageTextAnimation);
                    }


                    chosen_Main_Element.setVisible(false);
                    damageText.setText(damg + " Element Schaden");
                    enemyImage.setEnabled(true);

                    Thread.sleep(spieler.t2 * 5);


enemyImage.setEnabled(true);




                Thread.sleep(spieler.t2);

                Thread.sleep(spieler.t2/2);

                spieler.currentEnemyHP -= damg;
                enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                if (spieler.currentEnemyHP <= 0){
                    spieler.currentEnemyHP = 0;
                   enemyInfoHP.setText("             0");
                }

Thread.sleep(spieler.t2);
                if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                    boostDamageText.setBounds(900,480,600,80);
                    boostDamageText.setText("BoostDamage");
                    boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                    boostDamageText.setVisible(true);
                    enemyImage.setEnabled(false);
                    for (int z = 0; z<= 200;z++){
                        boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                        Thread.sleep(spieler.boostDamageTextAnimation);
                    }
                    for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                        if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                        boostDamageText.setText("+ "+ power);
                        Thread.sleep((power * spieler.t1));
                        extradamg++;
                        spieler.currentEnemyHP -= extradamg;
    extradamg = 0;

                        }

                        


                    }

                    spieler.currentEnemyHP++;

                    Thread.sleep(spieler.t3);
                    enemyInfoHP.setText("         "+spieler.currentEnemyHP);
enemyImage.setEnabled(true);




                    


                }
            }

/*
                if (spieler.powerBoost != 1){
                    for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                        boostDamageText.setText("+ "+ (damg * spieler.powerBoost - damg) *2);
                        Thread.sleep(25);
                    }
                    
                    
                }
*/
                
    
            

/*
            if (spieler.enemyMain_Element == "Cosmic"){
                damageText.setText("" + spieler.Power /2 + "");
                damageText.setForeground(new Color(255,200,30));


                if (spieler.powerBoost != 1){
                    for (int power = 0; power <=  spieler.Power * spieler.powerBoost - spieler.Power; power++){
                        boostDamageText.setText("+ "+ (spieler.Power * spieler.powerBoost - spieler.Power) /2);
                        Thread.sleep(25);
                    }
                    
                    
                }
    
            }

            */

            extradamg = 0;

            damageText.setVisible(false);
boostDamageText.setVisible(false);

Thread.sleep(spieler.t3 * 2);

setSpecialWeapon("W");
specialCombat();
enemyAttack();

if (spieler.currentEnemyHP <= 0){
    spieler.currentEnemyHP = 0;
   enemyInfoHP.setText("             0");
   endEnemy();
}

            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                Thread.sleep(spieler.t1);
                    }
          }


          if (main_element != null && main_element.charAt(2) == 'C' && main_element.charAt(3) == 'r' && main_element.charAt(4) == 'y' && main_element.charAt(5) == 's' && main_element.charAt(6) == 't' && main_element.charAt(7) == 'a' && main_element.charAt(8) == 'l' || second_element != null && second_element.charAt(2) == 'C' && second_element.charAt(3) == 'r' && second_element.charAt(4) == 'y' && second_element.charAt(5) == 's' && second_element.charAt(6) == 't' && second_element.charAt(7) == 'a' && second_element.charAt(8) == 'l' && n==2){
         elementsMenu.setVisible(false);
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(spieler.t1);
                    }
    

                    Thread.sleep(spieler.t2);
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                    elementImage.setBounds(elementImage.getBounds().x, elementImage.getBounds().y, 100, 100);

            

            int dm = 0;
            int dm2 = 0;

            if (spieler.currentEnemyHP > 0){
                elementImage.setVisible(true);

                Thread.sleep(spieler.t1 * 10);

                dm2 = 6;
                damg = spieler.Power;
                damageText.setForeground(new Color(255,255,255));
                damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));

                if (spieler.enemyMain_Element == "Erde"){

                    damageText.setForeground(new Color(255,50,0));
                    dm2 = 3;
                    damg = spieler.Power*2;
                 damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Crystal.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));


                }

                if (spieler.enemyMain_Element == "Crystal" || spieler.enemyMain_Element == "Feuer"){
                    damageText.setForeground(new Color(255,200,30));
                    dm2 = 12;

                 damg = spieler.Power/2;
                 damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Crystal.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));


                }

                damageText.setText("?");
                Thread.sleep(spieler.t2);
            
                damageText.setBounds(900, 480, 600, 80);
                damageText.setVisible(true);

                for (int z = 0; z<= 200;z++){
                    damageText.setBounds(900, 480 - z, 600, 80);
                    Thread.sleep(spieler.damageTextAnimation);
                }
            

          for (int t = 0; t<2; t++){
            enemyImage.setEnabled(false);

            elementImage.setBounds(500,280,0,0);

            elementImage.setBounds(elementImage.getBounds().x - 50, elementImage.getBounds().y,200,200);
            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(160, 155, Image.SCALE_AREA_AVERAGING)));

damageText.setText(""+ dm);
Thread.sleep(spieler.t1 * 10);
enemyImage.setEnabled(true);

elementImage.setBounds(elementImage.getBounds().x + 100, elementImage.getBounds().y, 120, 120);
elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(120, 115, Image.SCALE_AREA_AVERAGING)));

for (int d = 0; d<= 8; d++){
    damageText.setFont(new Font("Times new Roman", Font.PLAIN, d + 30));
    
    Thread.sleep(spieler.t1 * 2);
}
enemyImage.setEnabled(false);
damageText.setText(dm + spieler.Power/8 + "");
dm += spieler.Power/dm2;

Thread.sleep(spieler.t1 * 10);

elementImage.setBounds(elementImage.getBounds().x, elementImage.getBounds().y+100, 110, 110);
elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(110, 105, Image.SCALE_AREA_AVERAGING)));

for (int d = 0; d<= 8; d++){
    damageText.setFont(new Font("Times new Roman", Font.PLAIN, d + 30));
    Thread.sleep(spieler.t1 * 2);
}

enemyImage.setEnabled(false);
damageText.setText(dm + spieler.Power/8 + "");
dm += spieler.Power/dm2;



Thread.sleep(spieler.t1 * 10);

elementImage.setBounds(elementImage.getBounds().x - 50, elementImage.getBounds().y, 140, 140);
elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Crystal.png").getImage().getScaledInstance(140, 135, Image.SCALE_AREA_AVERAGING)));
                enemyImage.setEnabled(true);

for (int d = 0; d<= 8; d++){
    damageText.setFont(new Font("Times new Roman", Font.PLAIN, d + 30));
    Thread.sleep(spieler.t1 * 2);
}

enemyImage.setEnabled(false);
damageText.setText(dm + spieler.Power/8 + "");
dm += spieler.Power/dm2;


Thread.sleep(spieler.t1 * 10);
enemyImage.setEnabled(true);
          }

          damageText.setText(""+damg);

        Thread.sleep(spieler.t3);


        enemyImage.setEnabled(true);




                Thread.sleep(spieler.t2);
                Thread.sleep(spieler.t2/2);

                chosen_Main_Element.setVisible(false);

                spieler.currentEnemyHP -= damg;
                enemyInfoHP.setText("             "+spieler.currentEnemyHP);
                if (spieler.currentEnemyHP <= 0){
                    spieler.currentEnemyHP = 0;
                   enemyInfoHP.setText("             0");
                }


Thread.sleep(spieler.t2);
extradamg = -1;

                if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                    boostDamageText.setBounds(900,480,600,80);
                    boostDamageText.setText("BoostDamage");
                    boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                    boostDamageText.setVisible(true);
                    enemyImage.setEnabled(false);
                    for (int z = 0; z<= 200;z++){
                        boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                        Thread.sleep(spieler.boostDamageTextAnimation);
                    }
                    for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                        if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                        boostDamageText.setText("+ "+ power);
                        Thread.sleep((power * spieler.t1));
                        extradamg++;
                        spieler.currentEnemyHP -= extradamg;
    extradamg = 0;

                        }

                    }


                    }

                    elementImage.setVisible(false);

                    Thread.sleep(spieler.t3);

                    enemyInfoHP.setText("             "+spieler.currentEnemyHP);
                    enemyImage.setEnabled(true);

                    
                }
            

    
    

damageText.setVisible(false);
boostDamageText.setVisible(false);

Thread.sleep(spieler.t3 * 2);
setSpecialWeapon("W");
specialCombat();

enemyAttack();
if (spieler.currentEnemyHP <= 0){
    spieler.currentEnemyHP = 0;
   enemyInfoHP.setText("             0");

   endEnemy();

}

          for (int xi = 0; xi<= 120; xi++){
            fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
            Thread.sleep(spieler.t1);
                }


          }



          if (main_element != null && main_element.charAt(2) == 'E' && main_element.charAt(3) == 'r' && main_element.charAt(4) == 'd' && main_element.charAt(5) == 'e' || second_element != null && second_element.charAt(2) == 'E' && second_element.charAt(3) == 'r' && second_element.charAt(4) == 'd' && second_element.charAt(5) == 'e'){
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(spieler.t1);
                    }
    
                    Thread.sleep(spieler.t2);
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Erde.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

    
            elementImage.setBounds(500,-100,400,400);

            elementImage.setVisible(true);
         damageText.setText(null);


           


                            if (spieler.currentEnemyHP > 0){
                                damageText.setBounds(900, 480, 600, 80);
                                damageText.setVisible(true);
                                boostDamageText.setVisible(false);
                                boostDamageText.setBounds(900, 380, 600, 80);
                                Thread.sleep(spieler.t1 * 10);
            
                                damg = spieler.Power;

                                damageText.setText("" + spieler.Power+ "");
                                damageText.setForeground(new Color(255,255,255));
                                damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Erde.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
            
            
            
                                if (spieler.enemyMain_Element == "Feuer" || spieler.enemyMain_Element == "Crystal" ){
            
                                    damageText.setText("" + spieler.Power *2 + "");
                                    damageText.setForeground(new Color(255,50,0));
                                    damg = spieler.Power *2;
                                 damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Erde.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
            
            
                                }
            
                                if (spieler.enemyMain_Element == "Erde"){
                                    damageText.setText("" + spieler.Power /2 + "");
                                    damageText.setForeground(new Color(255,200,30));
                                    damg = spieler.Power /2;
                                    damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Erde.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
            
            
                                
                            }

                                Thread.sleep(spieler.t2);
                                for (int z = 0; z<= 200;z++){
                                    damageText.setBounds(900, 480 - z, 600, 80);
                                    Thread.sleep(spieler.damageTextAnimation);
                                }

                                damageText.setText(damg + " Element Schaden");

                                
                                for (int a = 1; a<95; a++){
                                    elementImage.setBounds(500,-100 + a*4,400,400);
                
                                   Thread.sleep(spieler.t1);
                                
                                            }
                        enemyImage.setEnabled(false);

        
                        Thread.sleep(spieler.t2);

                        
                               
                        enemyImage.setEnabled(true);


                            
               
                        Thread.sleep(spieler.t2);
         
                         Thread.sleep(spieler.t2/2);
         
                         spieler.currentEnemyHP -= damg;

                         enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                         if (spieler.currentEnemyHP <= 0){
                            spieler.currentEnemyHP = 0;
                           enemyInfoHP.setText("             0");
                           endEnemy();

                        }
         Thread.sleep(spieler.t2);
                         if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                             boostDamageText.setBounds(900,480,600,80);
                             boostDamageText.setText("BoostDamage");
                             boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                             boostDamageText.setVisible(true);
                             enemyImage.setEnabled(false);
                             for (int z = 0; z<= 200;z++){
                                 boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                                 Thread.sleep(spieler.boostDamageTextAnimation);
                             }
                             for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                                 if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                                 boostDamageText.setText("+ "+ power);
                                 Thread.sleep((power * spieler.t1));
                                 extradamg++;
                                 spieler.currentEnemyHP -= extradamg;
             extradamg = 0;         
                                 }
         
                                 
         
         
                             }
                             spieler.currentEnemyHP++;

                             Thread.sleep(spieler.t3);
                             enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                             
         enemyImage.setEnabled(true);

                  


                            }
                        }
                        extradamg = 0;

                            elementImage.setVisible(false);
                            damageText.setVisible(false);
                            damageText.setBounds(900, 480, 600, 80);
                            boostDamageText.setVisible(false);

                            Thread.sleep(spieler.t3 * 2);
                            setSpecialWeapon("W");
                            specialCombat();

enemyAttack();

if (spieler.currentEnemyHP <= 0){
    spieler.currentEnemyHP = 0;
   enemyInfoHP.setText("             0");
   endEnemy();

}

                            for (int xi = 0; xi<= 120; xi++){
                              fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                              Thread.sleep(spieler.t1);
                                  }


               }



               if (main_element != null && main_element.charAt(2) == 'F' && main_element.charAt(3) == 'e' && main_element.charAt(4) == 'u' && main_element.charAt(5) == 'e' && main_element.charAt(6) == 'r' || second_element != null && second_element.charAt(2) == 'F' && second_element.charAt(3) == 'e' && second_element.charAt(4) == 'u' && second_element.charAt(5) == 'e' && second_element.charAt(6) == 'r'){
                for (int xi = 0; xi<= 120; xi++){
                    fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                    Thread.sleep(spieler.t1);
                        }



                        damageText.setText("");

                        if (spieler.currentEnemyHP > 0){
                            
        
                            damg = spieler.Power;

                            damageText.setForeground(new Color(255,255,255));
                            damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Feuer.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        
        
        
                            if (spieler.enemyMain_Element == "Wind" || spieler.enemyMain_Element == "Crystal" ){
        
                                damageText.setForeground(new Color(255,50,0));
                                damg = spieler.Power *2;
                             damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Feuer.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        
        
                            }
        
                            if (spieler.enemyMain_Element == "Feuer" || spieler.enemyMain_Element == "Wasser" || spieler.enemyMain_Element == "Erde"){
                                damageText.setForeground(new Color(255,200,30));
                                damg = spieler.Power /2;
                                damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Feuer.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        
        
                            
                        }

                        
chosen_Main_Element.setVisible(false);
damageText.setBounds(900, 480, 600, 80);

                        damageText.setVisible(true);

                            Thread.sleep(spieler.t2);
                            for (int z = 0; z<= 200;z++){
                                damageText.setBounds(900, 480 - z, 600, 80);
                                Thread.sleep(spieler.damageTextAnimation);
                            }



                            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Feuer.png").getImage().getScaledInstance(300, 295, Image.SCALE_AREA_AVERAGING)));

                        elementImage.setBounds(500,100,400,400);
                        Thread.sleep(spieler.t2);
        

    
                elementImage.setVisible(true);
    
               
                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Feuer.png").getImage().getScaledInstance(300, 295, Image.SCALE_AREA_AVERAGING)));
    
                       for (int a = 1; a<100; a++){
                        elementImage.setBounds(500,100 + a*2,400,400);
    
                       Thread.sleep(spieler.t1);
                    
                                }

                                damageText.setText("" + damg/3 + "");
                   
                                Thread.sleep(spieler.t1);
                      
                                enemyImage.setEnabled(false);
                              elementImage.setVisible(false);

                              elementImage.setBounds(450,80,400,400);
                              elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Feuer.png").getImage().getScaledInstance(200, 195, Image.SCALE_AREA_AVERAGING)));
                              enemyImage.setEnabled(true);
                              elementImage.setVisible(true);

                              for (int a = 1; a<100; a++){
                                elementImage.setBounds(450,80 + a*2,400,400);
            
                               Thread.sleep(spieler.t1);
                            
                                        }

                                        damageText.setText("" + (damg/3 + damg/3) + "");

                                        Thread.sleep(spieler.t1);
                                        enemyImage.setEnabled(false);
    
                                        elementImage.setVisible(false);
          
                                        elementImage.setBounds(650,60,400,400);
                                        elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Feuer.png").getImage().getScaledInstance(150, 145, Image.SCALE_AREA_AVERAGING)));
                                        enemyImage.setEnabled(true);
                                        elementImage.setVisible(true);

                                        for (int a = 1; a<100; a++){
                                            elementImage.setBounds(650,60 + a*2,400,400);
                        
                                           Thread.sleep(spieler.t1);
                                        
                                                    }

                                                    damageText.setText("" + (damg) +  " Element Schaden");

                                                    Thread.sleep(spieler.t1);
                      

                            

                            
                    enemyImage.setEnabled(false);
    
                    Thread.sleep(spieler.t2);

                    
                           
                    enemyImage.setEnabled(true);


                        
           
                    Thread.sleep(spieler.t2);
     
                     Thread.sleep(spieler.t2/2);
     
                     spieler.currentEnemyHP -= damg;

                     enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                     if (spieler.currentEnemyHP <= 0){
                        spieler.currentEnemyHP = 0;
                       enemyInfoHP.setText("             0");

                    }
     Thread.sleep(spieler.t2);
                     if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                         boostDamageText.setBounds(900,480,600,80);
                         boostDamageText.setText("BoostDamage");
                         boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                         boostDamageText.setVisible(true);
                         enemyImage.setEnabled(false);
                         for (int z = 0; z<= 200;z++){
                             boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                             Thread.sleep(spieler.boostDamageTextAnimation);
                         }
                         for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                             if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                             boostDamageText.setText("+ "+ power);
                             Thread.sleep((power * spieler.t1));
                            extradamg++;
                            spieler.currentEnemyHP -= extradamg;
        extradamg = 0;
                             }
          
     
                         }
                         spieler.currentEnemyHP++;

                         Thread.sleep(spieler.t3);
                         enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                         
     enemyImage.setEnabled(true);

              


                        }
                    }
                    extradamg = 0;

                        elementImage.setVisible(false);
                        damageText.setVisible(false);
                        boostDamageText.setVisible(false);

                        Thread.sleep(spieler.t3 * 2);
                        setSpecialWeapon("W");
                        specialCombat();

                        enemyAttack();

                        if (spieler.currentEnemyHP <= 0){
                            spieler.currentEnemyHP = 0;
                           enemyInfoHP.setText("             0");
                           endEnemy();
                    
                        }
                        
                        for (int xi = 0; xi<= 120; xi++){
                          fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                          Thread.sleep(spieler.t1);
                              }


    
    
                   }
    



                   if (main_element != null && main_element.charAt(2) == 'G' && main_element.charAt(3) == 'r' && main_element.charAt(4) == 'a' || second_element != null && second_element.charAt(2) == 'G' && second_element.charAt(3) == 'r' && second_element.charAt(4) == 'a'){
                    for (int xi = 0; xi<= 120; xi++){
                        fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                        Thread.sleep(spieler.t1);
                            }
            
                            Thread.sleep(spieler.t2);
            
                            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Gravity.png").getImage().getScaledInstance(370, 50, Image.SCALE_AREA_AVERAGING)));

                    elementImage.setBounds(500,480,400,400);
        
                    elementsMenu.setVisible(false);
                    elementImage.setVisible(true);


                 

                                  if (spieler.currentEnemyHP > 0){



                                    for (int t = 1; t<2; t++){
                                       
                                               for (int a = 1; a<37; a++){
                                                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Gravity\\" + a + ".png").getImage().getScaledInstance(370, 50, Image.SCALE_AREA_AVERAGING)));
                            
                                               Thread.sleep(spieler.t1);
                    
                                                        }

                                                        elementImage.setVisible(true);
                    
                                                                                    
                                                      }
                    
                        
                   
                                       damg = spieler.Power;
           
                                       damageText.setText("" + spieler.Power+ "");
                                       damageText.setForeground(new Color(255,255,255));
                                       damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Gravity.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                   
                   
                   
                                       if (spieler.enemyMain_Element == "Void" || spieler.enemyMain_Element == "Cosmic" ){
                   
                                           damageText.setText("" + spieler.Power *2 + "");
                                           damageText.setForeground(new Color(255,50,0));
                                           damg = spieler.Power *2;
                                        damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Gravity.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                   
                   
                                       }
                   
                                       if (spieler.enemyMain_Element == "Feuer" || spieler.enemyMain_Element == "Gravity"){
                                           damageText.setText("" + spieler.Power /2 + "");
                                           damageText.setForeground(new Color(255,200,30));
                                           damg = spieler.Power /2;
                                           damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Gravity.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                   
                   
                                       
                                   }
           
           chosen_Main_Element.setVisible(false);
           damageText.setBounds(900, 480, 600, 80);
           
                                   damageText.setVisible(true);
                                   enemyImage.setEnabled(false);
elementImage.setVisible(false);
                                       Thread.sleep(spieler.t2);
                                       for (int z = 0; z<= 200;z++){
                                           damageText.setBounds(900, 480 - z, 600, 80);
                                           Thread.sleep(spieler.damageTextAnimation);
                                       }
           
           

           
                                   Thread.sleep(spieler.t2);
                   
           
               
                           enemyImage.setEnabled(true);

               
                           System.out.println("Feuer=Main");
                                                                         
                              
                                           Thread.sleep(spieler.t1);
                                 
                                           enemyImage.setEnabled(true);

                                           Thread.sleep(spieler.t1);


                                           enemyImage.setEnabled(false);
                                         elementImage.setVisible(false);

           
                                       
           
           
                                                   Thread.sleep(spieler.t1);
                                                   enemyImage.setEnabled(true);
               
           
                                                  
                                                               damageText.setText("" + damg +  " Element Schaden");
           
                                                               Thread.sleep(spieler.t1);
                                 
           
                                       
           
                                       
                              
           
           
                                   
                      
                               Thread.sleep(spieler.t2);
                
                                Thread.sleep(spieler.t2/2);
                
                                spieler.currentEnemyHP -= damg;
           
                                enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                                if (spieler.currentEnemyHP <= 0){
                                   spieler.currentEnemyHP = 0;
                                  enemyInfoHP.setText("             0");

                               }
                Thread.sleep(spieler.t2);
                                if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                                    boostDamageText.setBounds(900,480,600,80);
                                    boostDamageText.setText("BoostDamage");
                                    boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                                    boostDamageText.setVisible(true);
                                    enemyImage.setEnabled(false);
                                    for (int z = 0; z<= 200;z++){
                                        boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                                        Thread.sleep(spieler.boostDamageTextAnimation);
                                    }
                                    for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                                        if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                                        boostDamageText.setText("+ "+ power);
                                        Thread.sleep((power * spieler.t1));
                                        extradamg++;
                                        spieler.currentEnemyHP -= extradamg;
                    extradamg = 0;
                
                                        }
        
                                    }
                                    spieler.currentEnemyHP++;

                                    Thread.sleep(spieler.t3);
                                    enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                                    
                enemyImage.setEnabled(true);
           
                         
           
           
                                   }
                               }
                               extradamg = 0;

                                   elementImage.setVisible(false);
                                   damageText.setVisible(false);
                                   boostDamageText.setVisible(false);
                                   
                                   Thread.sleep(spieler.t3 * 2);
                                   setSpecialWeapon("W");
                                   specialCombat();

                                   enemyAttack();

                                   if (spieler.currentEnemyHP <= 0){
                                    spieler.currentEnemyHP = 0;
                                   enemyInfoHP.setText("             0");
                                   endEnemy();
                 
                                }

                                   for (int xi = 0; xi<= 120; xi++){
                                     fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                                     Thread.sleep(spieler.t1);
                                         }

        



        
                       }



                       if (main_element != null && main_element.charAt(2) == 'L' && main_element.charAt(3) == 'i' && main_element.charAt(4) == 'c' || second_element != null && second_element.charAt(2) == 'L' && second_element.charAt(3) == 'i' && second_element.charAt(4) == 'c'){
                        for (int xi = 0; xi<= 120; xi++){
                            fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                            Thread.sleep(spieler.t1);
                                }
                
                                elementsMenu.setVisible(false);

                                Thread.sleep(spieler.t2);
                
                                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Licht.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
    
                        elementImage.setBounds(500,280,400,400);
            
                
                            elementImage.setVisible(true);




                                        if (spieler.currentEnemyHP > 0){
                                                                      
                                                for (int a = 1; a<13; a++){
                                                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Licht\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
                                
                                                   Thread.sleep(spieler.t1 * 5);
                        
                                                            }

                                               damg = spieler.Power;
                   
                                               damageText.setText("" + spieler.Power+ "");
                                               damageText.setForeground(new Color(255,255,255));
                                               damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Licht.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                           
                           
                           
                                               if (spieler.enemyMain_Element == "Lunar" || spieler.enemyMain_Element == "Crystal" ){
                           
                                                   damageText.setText("" + spieler.Power *2 + "");
                                                   damageText.setForeground(new Color(255,50,0));
                                                   damg = spieler.Power *2;
                                                damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Licht.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                           
                           
                                               }
                           
                                               if (spieler.enemyMain_Element == "Feuer" || spieler.enemyMain_Element == "Licht"){
                                                   damageText.setText("" + spieler.Power /2 + "");
                                                   damageText.setForeground(new Color(255,200,30));
                                                   damg = spieler.Power /2;
                                                   damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Licht.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                           
                           
                                               
                                           }
                                           elementImage.setVisible(false);
                                           enemyImage.setEnabled(false);

                   chosen_Main_Element.setVisible(false);
                   damageText.setBounds(900, 480, 600, 80);
                   
                                           damageText.setVisible(true);
                   
                                               Thread.sleep(spieler.t2);
                                               for (int z = 0; z<= 200;z++){
                                                   damageText.setBounds(900, 480 - z, 600, 80);
                                                   Thread.sleep(spieler.damageTextAnimation);
                                               }
                   
                   
        
                   
                                           Thread.sleep(spieler.t2);
                           
                   
                       
                                   enemyImage.setEnabled(true);
                                    
                                                   Thread.sleep(spieler.t1);
                                         
                                                   enemyImage.setEnabled(true);
        
                                                   Thread.sleep(spieler.t1);
        
        
                                                   enemyImage.setEnabled(false);
                                                 elementImage.setVisible(false);

                                                           Thread.sleep(spieler.t1);
                                                           enemyImage.setEnabled(true);
                                          
                                                          
                                                                       damageText.setText("" + damg +  " Element Schaden");
                   
                                                                       Thread.sleep(spieler.t1);
                                         
                    
                                       Thread.sleep(spieler.t2);
                        
                                        Thread.sleep(spieler.t2/2);
                        
                                        spieler.currentEnemyHP -= damg;
                   
                                        enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                                        if (spieler.currentEnemyHP <= 0){
                                           spieler.currentEnemyHP = 0;
                                          enemyInfoHP.setText("             0");
                                       }

                        Thread.sleep(spieler.t2);
                                        if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                                            boostDamageText.setBounds(900,480,600,80);
                                            boostDamageText.setText("BoostDamage");
                                            boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                                            boostDamageText.setVisible(true);
                                            enemyImage.setEnabled(false);
                                            for (int z = 0; z<= 200;z++){
                                                boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                                                Thread.sleep(spieler.boostDamageTextAnimation);
                                            }
                                            for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                                                if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                                                boostDamageText.setText("+ "+ power);
                                                Thread.sleep((power * spieler.t1));
                                                extradamg++;
                                                spieler.currentEnemyHP -= extradamg;
                            extradamg = 0;                       
                                                }
                        
                                                                        
                        
                                            }
                                            spieler.currentEnemyHP++;

                                            Thread.sleep(spieler.t3);
                                            enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                                            
                        enemyImage.setEnabled(true);
                   
                                 
                   
                   
                                           }
                                       }
                                       extradamg = 0;
        
                                           elementImage.setVisible(false);
                                           damageText.setVisible(false);
                                           boostDamageText.setVisible(false);


                                           Thread.sleep(spieler.t3 * 2);
                                           setSpecialWeapon("W");
                                           specialCombat();

                                           enemyAttack();

                                           if (spieler.currentEnemyHP <= 0){
                                            spieler.currentEnemyHP = 0;
                                           enemyInfoHP.setText("             0");
                                           endEnemy();
                 
                                        }

                                           for (int xi = 0; xi<= 120; xi++){
                                             fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                                             Thread.sleep(spieler.t1);
                                                 }

                                




                                                          

                       }
                    
                 


          Thread.sleep(40);



          if (main_element != null && main_element.charAt(2) == 'L' && main_element.charAt(3) == 'u' && main_element.charAt(4) == 'n' || second_element != null && second_element.charAt(2) == 'L' && second_element.charAt(3) == 'u' && second_element.charAt(4) == 'n'){
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(spieler.t1);
                    }
    
                    Thread.sleep(spieler.t2);
    
                                     elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Lunar\\1.png").getImage().getScaledInstance(370, 50, Image.SCALE_AREA_AVERAGING)));


            elementImage.setBounds(500,280,400,400);

            elementsMenu.setVisible(false);

                

                            if (spieler.currentEnemyHP > 0){
               
                                   damg = (spieler.Power);
       
                                   damageText.setText("" + spieler.Power+ "");
                                   damageText.setForeground(new Color(255,255,255));
                                   damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Lunar.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
               
               
               
                                   if (spieler.enemyMain_Element == "Licht"){
               
                                       damageText.setText("" + spieler.Power *2 + "");
                                       damageText.setForeground(new Color(255,50,0));
                                       damg = (spieler.Power *2);
                                    damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Lunar.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
               
               
                                   }
               
                                   if (spieler.enemyMain_Element == "Lunar"){
                                       damageText.setText("" + spieler.Power /2 + "");
                                       damageText.setForeground(new Color(255,200,30));
                                       damg = (spieler.Power /2);
                                       damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Lunar.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
               
               
                                   
                               }

                               elementImage.setVisible(false);
                               damageText.setBounds(900, 480, 600, 80);

                               damageText.setText("");
                               damageText.setVisible(true);
       
                               Thread.sleep(spieler.t2);
                               for (int z = 0; z<= 200;z++){
                                   damageText.setBounds(900, 480 - z, 600, 80);
                                   Thread.sleep(spieler.damageTextAnimation);
                               }
   
       
       

       chosen_Main_Element.setVisible(false);
       
                               Thread.sleep(spieler.t2);
               
       
           
                       elementImage.setVisible(true);


                       for (int a = 1; a<16; a++){
                        elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Lunar\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
    
                       Thread.sleep(spieler.t1);
    
                                }
    
                                enemyImage.setEnabled(false);
                                elementImage.setVisible(false);
                                elementImage.setBounds(600,320,400,400);
                                damageText.setText("" + damg/3 + "");

    
                                Thread.sleep(spieler.t2 / 2);

                                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Lunar\\1.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                                       
                             
                                       enemyImage.setEnabled(true);
                                     elementImage.setVisible(true);

    
    
                                for (int a = 1; a<16; a++){
                                    elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Lunar\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
                
                                   Thread.sleep(spieler.t1);
                
                                            }
                                            damageText.setText("" + (damg + damg)/3 + "");

    
                                            enemyImage.setEnabled(false);
                                            elementImage.setVisible(false);
                                            elementImage.setBounds(400,240,400,400);
    
    
                                            Thread.sleep(spieler.t2 / 2);
                                            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Lunar\\1.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                                            elementImage.setVisible(true);
                                            
                                            enemyImage.setEnabled(true);

                
                
                                            for (int a = 1; a<16; a++){
                                                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Lunar\\" + a + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
                            
                                               Thread.sleep(spieler.t1);
                            
                                                        }

                                                        damageText.setText("" + (damg) +  " Element Schaden");
       
                                                           Thread.sleep(spieler.t1 / 2);
                                                           enemyImage.setEnabled(false);
elementImage.setVisible(false);
                                                           Thread.sleep(spieler.t2);
    

    
                                 
                                     enemyImage.setEnabled(true);
                                     elementImage.setVisible(false);
           
                               
                  
                           Thread.sleep(spieler.t2);
                        
                            spieler.currentEnemyHP -= (damg * 3);
       
                            enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                            if (spieler.currentEnemyHP <= 0){
                               spieler.currentEnemyHP = 0;
                              enemyInfoHP.setText("             0");

                           }
            Thread.sleep(spieler.t2);
                            if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                                boostDamageText.setBounds(900,480,600,80);
                                boostDamageText.setText("BoostDamage");
                                boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                                boostDamageText.setVisible(true);
                                enemyImage.setEnabled(false);
                                for (int z = 0; z<= 200;z++){
                                    boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                                    Thread.sleep(spieler.boostDamageTextAnimation);
                                }
                                for (int power = 0; power <=  (damg*3) * spieler.powerBoost - (damg*3); power++){
                                    if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                                    boostDamageText.setText("+ "+ power);
                                    Thread.sleep((power * spieler.t1));
                                    extradamg++;
                                    spieler.currentEnemyHP -= extradamg;
                extradamg = 0;
            
                                    }
            
            
            
                                }

                                spieler.currentEnemyHP++;

                                Thread.sleep(spieler.t3);
                                enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                                
            enemyImage.setEnabled(true);
       
                     
       
       
                               }
                           }
                           extradamg = 0;

                               elementImage.setVisible(false);
                               damageText.setVisible(false);
                               boostDamageText.setVisible(false);
                               elementImage.setBounds(400,240,400,400);

                               Thread.sleep(spieler.t3 * 2);
                               setSpecialWeapon("W");
                               specialCombat();

                               enemyAttack();

                               if (spieler.currentEnemyHP <= 0){
                                spieler.currentEnemyHP = 0;
                               enemyInfoHP.setText("             0");
                               endEnemy();
                 
                            }

                               for (int xi = 0; xi<= 120; xi++){
                                 fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
                                 Thread.sleep(spieler.t1);
                                     }
       


                            Thread.sleep(spieler.t2);



                                              

           }


           if (main_element != null && main_element.charAt(2) == 'V' && main_element.charAt(3) == 'o' && main_element.charAt(4) == 'i' || second_element != null && second_element.charAt(2) == 'V' && second_element.charAt(3) == 'o' && second_element.charAt(4) == 'i'){
            for (int xi = 0; xi<= 120; xi++){
                fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                Thread.sleep(spieler.t1);
                    }
    
                    Thread.sleep(spieler.t2);
    
                                     elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Void\\1.png").getImage().getScaledInstance(370, 50, Image.SCALE_AREA_AVERAGING)));


            elementImage.setBounds(500,280,400,400);

        elementImage.setVisible(true);

            System.out.println("Lunar=Main");

            for (int i = 0; i< 73; i++){
                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Void\\" + i + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
                Thread.sleep(spieler.t1);
            }

            Thread.sleep(spieler.t3);
            elementImage.setVisible(false);

            if (spieler.currentEnemyHP > 0){
                Thread.sleep(spieler.t1 * 10);

                damg = spieler.Power;
                damageText.setText("" + spieler.Power+ "");
                damageText.setForeground(new Color(255,255,255));
                enemyImage.setEnabled(false);
                damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Void.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));



                if (spieler.enemyMain_Element == "Cosmic" || spieler.enemyMain_Element == "Gravity" ){

                    damageText.setText("" + spieler.Power *2 + "");
                    damageText.setForeground(new Color(255,50,0));
                    damg = spieler.Power *2;
                    enemyImage.setEnabled(false);
                 damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Void.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));


                }

                if (spieler.enemyMain_Element == "Void"){
                    damageText.setText("" + spieler.Power /2 + "");
                    damageText.setForeground(new Color(255,200,30));
                    damg = spieler.Power /2;
                    enemyImage.setEnabled(false);
                 damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Void.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));


                }

                Thread.sleep(spieler.t2);
               
                enemyImage.setEnabled(false);
                damageText.setBounds(900, 480, 600, 80);
                damageText.setVisible(true);

                for (int z = 0; z<= 200;z++){
                    damageText.setBounds(900, 480 - z, 600, 80);
                    Thread.sleep(spieler.damageTextAnimation);
                }


                chosen_Main_Element.setVisible(false);
                damageText.setText(damg + " Element Schaden");
                enemyImage.setEnabled(true);

                Thread.sleep(spieler.t2 * 5);

enemyImage.setEnabled(true);



            Thread.sleep(spieler.t2);

            spieler.currentEnemyHP -= damg;
            enemyInfoHP.setText("         "+spieler.currentEnemyHP);
            if (spieler.currentEnemyHP <= 0){
                spieler.currentEnemyHP = 0;
               enemyInfoHP.setText("             0");
            }
Thread.sleep(spieler.t2);
            if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                boostDamageText.setBounds(900,480,600,80);
                boostDamageText.setText("BoostDamage");
                boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                boostDamageText.setVisible(true);
                enemyImage.setEnabled(false);
                for (int z = 0; z<= 200;z++){
                    boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                    Thread.sleep(spieler.boostDamageTextAnimation);
                }
                for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                    if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                    boostDamageText.setText("+ "+ power);
                    Thread.sleep((power * spieler.t1));
                    extradamg++;
                    spieler.currentEnemyHP -= extradamg;
extradamg = 0;
                    }

                    


                }



Thread.sleep(spieler.t3 * 4);
damageText.setVisible(false);

                boostDamageText.setVisible(false);
                elementImage.setBounds(400,240,400,400);
                spieler.currentEnemyHP++;

                Thread.sleep(spieler.t3);
                elementImage.setVisible(false);
                damageText.setVisible(false);
                enemyInfoHP.setText("         "+spieler.currentEnemyHP);
enemyImage.setEnabled(true);

            }
        }
        damageText.setVisible(false);
        Thread.sleep(spieler.t3 * 2);
        setSpecialWeapon("W");
        specialCombat();

        enemyAttack();

        if (spieler.currentEnemyHP <= 0){
            spieler.currentEnemyHP = 0;
            enemyInfoHP.setText("             0");
            endEnemy();
            
            }


for (int xi = 0; xi<= 120; xi++){
    fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
    Thread.sleep(spieler.t1);
        }
            }

            if (main_element != null && main_element.charAt(2) == 'W' && main_element.charAt(3) == 'a' && main_element.charAt(4) == 's' || second_element != null && second_element.charAt(2) == 'W' && second_element.charAt(3) == 'a' && second_element.charAt(4) == 's'){
                for (int xi = 0; xi<= 120; xi++){
                    fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                    Thread.sleep(spieler.t1);
                        }
        
                        Thread.sleep(spieler.t2);    
    
                        elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Wasser.png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));

                elementImage.setBounds(500,80,400,400);
    
            elementImage.setVisible(true);
    
    
                for (int i = 0; i< 200; i++){
                    elementImage.setBounds(500,80 + i,400,400);
                    Thread.sleep(spieler.t1);
                }
    
                enemyImage.setEnabled(false);
                elementImage.setVisible(false);
    
                if (spieler.currentEnemyHP > 0){
                    Thread.sleep(spieler.t1 * 10);
    
                    damg = spieler.Power;
                    damageText.setText("" + spieler.Power+ "");
                    damageText.setForeground(new Color(255,255,255));
                    enemyImage.setEnabled(false);
                    damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Wasser.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
    
    
    
                    if (spieler.enemyMain_Element == "Feuer" || spieler.enemyMain_Element == "Erde" ){
    
                        damageText.setText("" + spieler.Power *2 + "");
                        damageText.setForeground(new Color(255,50,0));
                        damg = spieler.Power *2;
                        enemyImage.setEnabled(false);
                     damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Wasser.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
    
    
                    }
    
                    if (spieler.enemyMain_Element == "Wasser"){
                        damageText.setText("" + spieler.Power /2 + "");
                        damageText.setForeground(new Color(255,200,30));
                        damg = spieler.Power /2;
                        enemyImage.setEnabled(false);
                     damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wasser.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
    
    
                    }
    
                    Thread.sleep(spieler.t2);
                   
                    damageText.setBounds(900, 480, 600, 80);
                    damageText.setVisible(true);
    
                    for (int z = 0; z<= 200;z++){
                        damageText.setBounds(900, 480 - z, 600, 80);
                        Thread.sleep(spieler.damageTextAnimation);
                    }
    
    
                    chosen_Main_Element.setVisible(false);
                    damageText.setText(damg + " Element Schaden");
                    enemyImage.setEnabled(true);
    
                    Thread.sleep(spieler.t2 * 5);
    
    enemyImage.setEnabled(true);
    
    
                Thread.sleep(spieler.t2);
    
                spieler.currentEnemyHP -= damg;
                enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                if (spieler.currentEnemyHP <= 0){
                    spieler.currentEnemyHP = 0;
                   enemyInfoHP.setText("             0");
                }
    Thread.sleep(spieler.t2);
                if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                    boostDamageText.setBounds(900,480,600,80);
                    boostDamageText.setText("BoostDamage");
                    boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                    boostDamageText.setVisible(true);
                    enemyImage.setEnabled(false);
                    for (int z = 0; z<= 200;z++){
                        boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                        Thread.sleep(spieler.boostDamageTextAnimation);
                    }
                    for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                        if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                        boostDamageText.setText("+ "+ power);
                        Thread.sleep((power * spieler.t1));
                        extradamg++;
                        spieler.currentEnemyHP -= extradamg;
    extradamg = 0;
                        }
    
                        
    
    
                    }
    
    
    
    Thread.sleep(spieler.t3 * 4);
    damageText.setVisible(false);
    
                    boostDamageText.setVisible(false);
                    elementImage.setBounds(400,240,400,400);
                    spieler.currentEnemyHP++;
    
                    Thread.sleep(spieler.t3);
                    elementImage.setVisible(false);
                    damageText.setVisible(false);
                    enemyInfoHP.setText("         "+spieler.currentEnemyHP);
    enemyImage.setEnabled(true);
    
                }
            }
            damageText.setVisible(false);
            Thread.sleep(spieler.t3 * 2);
            setSpecialWeapon("W");
            specialCombat();
    
            enemyAttack();
    
            if (spieler.currentEnemyHP <= 0){
                spieler.currentEnemyHP = 0;
                enemyInfoHP.setText("             0");
                endEnemy();
                
                }
    
    
    for (int xi = 0; xi<= 120; xi++){
        fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
        Thread.sleep(spieler.t1);
            }
                }


                if (main_element != null && main_element.charAt(2) == 'W' && main_element.charAt(3) == 'i' && main_element.charAt(4) == 'n' || second_element != null && second_element.charAt(2) == 'W' && second_element.charAt(3) == 'i' && second_element.charAt(4) == 'n'){
                    for (int xi = 0; xi<= 120; xi++){
                        fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                        Thread.sleep(spieler.t1);
                            }
            
                            Thread.sleep(spieler.t2);    
        
                            elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Wind.png").getImage().getScaledInstance(200, 200, Image.SCALE_AREA_AVERAGING)));
    
                    elementImage.setBounds(200,280,400,400);
        
                elementImage.setVisible(true);
        
        
                    for (int i = 0; i< 400; i++){
                        elementImage.setBounds(200 + (i/2),280,400,400);
                        Thread.sleep(spieler.t1 * 2);
                    }

                    for (int i = 0; i< 70; i++){
                        elementImage.setBounds(400 + (i*4),280,400,400);
                        Thread.sleep(spieler.t1);
                    }
        
                    enemyImage.setEnabled(false);
                    elementImage.setVisible(false);
        
                    if (spieler.currentEnemyHP > 0){
                        Thread.sleep(spieler.t1 * 10);
        
                        damg = spieler.Power;
                        damageText.setText("" + spieler.Power+ "");
                        damageText.setForeground(new Color(255,255,255));
                        enemyImage.setEnabled(false);
                        damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Wind.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        
        
        
                        if (spieler.enemyMain_Element == "Feuer" || spieler.enemyMain_Element == "Crystal" ){
        
                            damageText.setText("" + spieler.Power *2 + "");
                            damageText.setForeground(new Color(255,50,0));
                            damg = spieler.Power *2;
                            enemyImage.setEnabled(false);
                         damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Wind.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        
        
                        }
        
                        if (spieler.enemyMain_Element == "Licht" || spieler.enemyMain_Element == "Wind" ){
                            damageText.setText("" + spieler.Power /2 + "");
                            damageText.setForeground(new Color(255,200,30));
                            damg = spieler.Power /2;
                            enemyImage.setEnabled(false);
                         damageText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wind.png").getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
        
        
                        }
        
                        Thread.sleep(spieler.t2);
                       
                        damageText.setBounds(900, 480, 600, 80);
                        damageText.setVisible(true);
        
                        for (int z = 0; z<= 200;z++){
                            damageText.setBounds(900, 480 - z, 600, 80);
                            Thread.sleep(spieler.damageTextAnimation);
                        }
        
        
                        chosen_Main_Element.setVisible(false);
                        damageText.setText(damg + " Element Schaden");
                        enemyImage.setEnabled(true);
        
                        Thread.sleep(spieler.t2 * 5);
        
        enemyImage.setEnabled(true);
        
        
                    Thread.sleep(spieler.t2);
        
                    spieler.currentEnemyHP -= damg;
                    enemyInfoHP.setText("         "+spieler.currentEnemyHP);
                    if (spieler.currentEnemyHP <= 0){
                        spieler.currentEnemyHP = 0;
                       enemyInfoHP.setText("             0");
                    }
        Thread.sleep(spieler.t2);
                    if (spieler.powerBoost != 1 && spieler.currentEnemyHP > 0 ){
                        boostDamageText.setBounds(900,480,600,80);
                        boostDamageText.setText("BoostDamage");
                        boostDamageText.setIcon(new ImageIcon(new ImageIcon(spieler.powerBoostIcon).getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING)));
                        boostDamageText.setVisible(true);
                        enemyImage.setEnabled(false);
                        for (int z = 0; z<= 200;z++){
                            boostDamageText.setBounds(900, 480 - z/2, 600, 80);
                            Thread.sleep(spieler.boostDamageTextAnimation);
                        }
                        for (int power = 0; power <=  damg * spieler.powerBoost - damg; power++){
                            if (spieler.powerBoost != 1 && spieler.currentEnemyHP >= 0 ){
                            boostDamageText.setText("+ "+ power);
                            Thread.sleep((power * spieler.t1));
                            extradamg++;
                            spieler.currentEnemyHP -= extradamg;
        extradamg = 0;
                            }
        
                            
        
        
                        }
        
        
        
        Thread.sleep(spieler.t3 * 4);
        damageText.setVisible(false);
        
                        boostDamageText.setVisible(false);
                        elementImage.setBounds(400,240,400,400);
                        spieler.currentEnemyHP++;
        
                        Thread.sleep(spieler.t3);
                        elementImage.setVisible(false);
                        damageText.setVisible(false);
                        enemyInfoHP.setText("         "+spieler.currentEnemyHP);
        enemyImage.setEnabled(true);
        
                    }
                }
                damageText.setVisible(false);
                Thread.sleep(spieler.t3 * 2);
                setSpecialWeapon("W");
                specialCombat();
        
                enemyAttack();
        
                if (spieler.currentEnemyHP <= 0){
                    spieler.currentEnemyHP = 0;
                    enemyInfoHP.setText("             0");
                    endEnemy();
                    
                    }
        
        
        for (int xi = 0; xi<= 120; xi++){
            fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
            Thread.sleep(spieler.t1);
                }
                    }
    

            spieler.damageMade += damg + (damg * spieler.powerBoost - damg);
            if (spieler.damageMade >= 2500 && spieler.kämpfer == false){
                Award("A",1,null,null,null);
                spieler.kämpfer = true;

            }

            if (at == 3){

                for (int xi = 0; xi<= 120; xi++){
                            fighting_options.setBounds(38, 480 + xi*5, 1200, 300);
                            Thread.sleep(spieler.t1);
                                }

                elementImage.setBounds(600,280,200,200);
                elementImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Damage.png").getImage().getScaledInstance(180, 180, Image.SCALE_AREA_AVERAGING)));
    
    
                elementImage.setVisible(true);
                enemyImage.setEnabled(false);

    Thread.sleep(spieler.t2);
    enemyImage.setEnabled(true);
    elementImage.setVisible(false);

                Thread.sleep(spieler.t3);
                elementImage.setBounds(650,280,200,200);
                elementImage.setVisible(true);
                enemyImage.setEnabled(false);
                Thread.sleep(spieler.t2);

                elementImage.setVisible(false);
                enemyImage.setEnabled(true);

                Thread.sleep(spieler.t3);
                elementImage.setBounds(560,340,200,200);
                elementImage.setVisible(true);
                enemyImage.setEnabled(false);

                Thread.sleep(spieler.t2);

                elementImage.setVisible(false);
                enemyImage.setEnabled(true);

                Thread.sleep(spieler.t3);
                elementImage.setBounds(720,380,200,200);
                elementImage.setVisible(true);
                enemyImage.setEnabled(false);

                Thread.sleep(spieler.t2);

                elementImage.setVisible(false);
                enemyImage.setEnabled(true);


                Thread.sleep(spieler.t3);
                elementImage.setBounds(520,230,200,200);
                elementImage.setVisible(true);
                enemyImage.setEnabled(false);
                Thread.sleep(spieler.t2);
                enemyImage.setEnabled(true);

                spieler.currentEnemyHP-= spieler.Power;
                enemyInfoHP.setText("         " + spieler.currentEnemyHP + "");

                
                elementImage.setVisible(false);
                setSpecialWeapon("W");
                specialCombat();

                enemyAttack();

                if (spieler.currentEnemyHP <= 0){
                    spieler.currentEnemyHP = 0;
                    enemyInfoHP.setText("             0");
                    endEnemy();
                    
                    }
                for (int xi = 0; xi<= 120; xi++){
    fighting_options.setBounds(38, 1080 - xi*5, 1200, 300);
    Thread.sleep(spieler.t1);
        }
            }

    }



    public void enemyAttack() throws InterruptedException{

        String element;
        

            element = spieler.enemyMain_Element;
            spieler.enemyAtacked = true;

            Attack(element);

        
    }
    

    public void protection(int d) throws InterruptedException{
if (spieler.hpBoost > 0){
    reducedDamgeText.setText("");
    reducedDamgeText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Shields\\" + spieler.hpBoostName +".png").getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));
    reducedDamgeText.setVisible(true);

    for (int z = 0; z<= 200;z++){
        reducedDamgeText.setBounds(200, 480 - z, 600, 80);
        Thread.sleep(spieler.damageTextAnimation);
    }
reducedDamgeText.setText("" + (int) d * spieler.hpBoost);
spieler.Health+= (int) d * spieler.hpBoost;
playerInfoHP.setText("          " + (int) spieler.Health);
Thread.sleep(spieler.t3 * 5);
reducedDamgeText.setVisible(false);

}
    }

    public void animateEnemyAttack(String ci, int damg2) throws InterruptedException{


        if (spieler.reflection.equals(false) && spieler.currentEnemyHP > 0){

            damageText.setIcon(new ImageIcon(new ImageIcon(ci).getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));
    
    
            damageText.setBounds(900,480,600,80);
                damageText.setVisible(true);
                damageText.setText(null);
                for (int z = 0; z<= 200;z++){
                    damageText.setBounds(900, 480 - z, 600, 80);
                    Thread.sleep(spieler.damageTextAnimation);
                }
    
                damageText.setText("" + damg2 + " Gegner Schaden");
                Thread.sleep(spieler.t3);
                spieler.enemyAtacked = false;
                spieler.Health -= damg2;
                playerInfoHP.setText("          " +spieler.Health);
    
                

                Thread.sleep(spieler.t3);
                damageText.setVisible(false);

                protection(damg2);

                if (spieler.Health <= 0){
                    spieler.Health = spieler.HealthB;
                    playerInfoHP.setText("          " +spieler.Health);
                    mainTextPanel.setVisible(true);
                    fighting_options.setVisible(false);
                    mainTextArea.setText("Du hast verloren.\n\nKampf wird wieder gestellt");
                    endFight();
                    Thread.sleep(2000);
                    spawnEnemy(spieler.file, spieler.index);
                    setSpecialWeapon("W");
                    mainTextPanel.setVisible(false);
                    fighting_options.setVisible(true);
                }
            }
    

        if (spieler.reflection.equals(true) && spieler.currentEnemyHP > 0){
            spieler.reflection = false;
            reflectedDamgeText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Boosts\\Reflection.png").getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));

            reflectedDamgeText.setBounds(900,480,600,80);
            reflectedDamgeText.setVisible(true);
            reflectedDamgeText.setText("" + damg2 + "");
            for (int z = 0; z<= 200;z++){
                reflectedDamgeText.setBounds(900, 480 - z, 600, 80);
                Thread.sleep(spieler.damageTextAnimation);
            }

            reflectedDamgeText.setText("" + damg2 + " Reflektierte Schaden");
            spieler.currentEnemyHP -= damg2;
            enemyInfoHP.setText("         " + spieler.currentEnemyHP + "");
            if (spieler.currentEnemyHP <= 0){
                enemyInfoHP.setText("             0");
                endEnemy();

            }
            Thread.sleep(spieler.t3 + 200);
            reflectedDamgeText.setVisible(false);
            enemyInfo.setBorder(new LineBorder(Color.white));
            reflectedDamgeImage.setVisible(false);

            setSpecialWeapon("W");
        }

    
            

    }

    public void Attack(String element) throws InterruptedException {
        int damg2;
        String ci;
        System.out.println(element + " @");

        if (element == "Ancient") {

            damg2 = spieler.CurrentEnemyPower;
            ci = "Textrpg\\Images\\Elemente\\Ancient.png";
            animateEnemyAttack(ci,damg2);
        }

        if (element == "Cosmic") {
            Thread.sleep(spieler.t1 * 10);

            damg2 = spieler.CurrentEnemyPower;
            damageText.setForeground(new Color(255,255,255));
            ci = "Textrpg\\Images\\Elemente\\Cosmic.png";

            if (spieler.Main_Element.charAt(2) == 'G' && spieler.Main_Element.charAt(3) == 'r'|| spieler.Main_Element.charAt(2) == 'V' && spieler.Main_Element.charAt(3) == 'o'){

                damageText.setForeground(new Color(255,50,0));
                damg2 = spieler.CurrentEnemyPower *2;

             ci = "Textrpg\\Images\\Elemente_Strong\\Cosmic.png";


            }

            if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'o'){
                damageText.setForeground(new Color(255,200,30));
                damg2 = spieler.CurrentEnemyPower /2;

             ci = "Textrpg\\Images\\Elemente_Weak\\Cosmic.png";


            }

        animateEnemyAttack(ci,damg2);
        }


        if (element == "Crystal") {
            Thread.sleep(spieler.t1 * 10);

            damg2 = spieler.CurrentEnemyPower;
            damageText.setForeground(new Color(255,255,255));
            ci = "Textrpg\\Images\\Elemente\\Crystal.png";

            if (spieler.Main_Element.charAt(2) == 'E' && spieler.Main_Element.charAt(3) == 'r'){

                damageText.setForeground(new Color(255,50,0));
                damg2 = spieler.CurrentEnemyPower *2;

             ci = "Textrpg\\Images\\Elemente_Strong\\Crystal.png";


            }

            if (spieler.Main_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'|| spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'r'){
                damageText.setForeground(new Color(255,200,30));
                damg2 = spieler.CurrentEnemyPower /2;

             ci = "Textrpg\\Images\\Elemente_Weak\\Crystal.png";


            }

        animateEnemyAttack(ci,damg2);
        }

        if (element == "Erde") {
            Thread.sleep(spieler.t1 * 10);
            System.out.println("Erdeg");

            damg2 = spieler.CurrentEnemyPower;
            damageText.setForeground(new Color(255,255,255));
            ci = "Textrpg\\Images\\Elemente\\Erde.png";

            if (spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'a'|| spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'i'){

                damageText.setForeground(new Color(255,50,0));
                damg2 = spieler.CurrentEnemyPower *2;

             ci = "Textrpg\\Images\\Elemente_Strong\\Erde.png";


            }

            if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'r'|| spieler.Main_Element.charAt(2) == 'E' && spieler.Main_Element.charAt(3) == 'r'){
                damageText.setForeground(new Color(255,200,30));
                damg2 = spieler.CurrentEnemyPower /2;

             ci = "Textrpg\\Images\\Elemente_Weak\\Erde.png";


            }

        animateEnemyAttack(ci,damg2);
        }


        if (element == "Feuer") {
            Thread.sleep(spieler.t1 * 10);

            damg2 = spieler.CurrentEnemyPower;
            damageText.setForeground(new Color(255,255,255));
            ci = "Textrpg\\Images\\Elemente\\Feuer.png";

            if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'i'|| spieler.Main_Element.charAt(2) == 'C'&& spieler.Main_Element.charAt(3) == 'r'){

                damageText.setForeground(new Color(255,50,0));
                damg2 = spieler.CurrentEnemyPower *2;

             ci = "Textrpg\\Images\\Elemente_Strong\\Feuer.png";


            }

            if (spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'a'|| spieler.Main_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'){
                damageText.setForeground(new Color(255,200,30));
                damg2 = spieler.CurrentEnemyPower /2;

             ci = "Textrpg\\Images\\Elemente_Weak\\Feuer.png";


            }

        animateEnemyAttack(ci,damg2);
        }



        if (element == "Gravity") {
           
                Thread.sleep(spieler.t1 * 10);

                damg2 = spieler.CurrentEnemyPower;
                damageText.setForeground(new Color(255,255,255));
                ci = "Textrpg\\Images\\Elemente\\Gravity.png";

                if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'o'|| spieler.Main_Element.charAt(2) == 'V' && spieler.Main_Element.charAt(3) == 'o'){

                    damageText.setForeground(new Color(255,50,0));
                    damg2 = spieler.CurrentEnemyPower *2;

                 ci = "Textrpg\\Images\\Elemente_Strong\\Gravity.png";


                }

                if (spieler.Main_Element.charAt(2) == 'G' && spieler.Main_Element.charAt(3) == 'r'){
                    damageText.setForeground(new Color(255,200,30));
                    damg2 = spieler.CurrentEnemyPower /2;

                 ci = "Textrpg\\Images\\Elemente_Weak\\Gravity.png";


                }
            System.out.println("Enemy used Gravity");
            System.out.println("You lost " + spieler.CurrentEnemyPower + " HP");

            animateEnemyAttack(ci,damg2);
        }

        if (element == "Licht") {
            Thread.sleep(spieler.t1 * 10);

            damg2 = spieler.CurrentEnemyPower;
            damageText.setForeground(new Color(255,255,255));
            ci = "Textrpg\\Images\\Elemente\\Licht.png";

            if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'u'|| spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'r'){

                damageText.setForeground(new Color(255,50,0));
                damg2 = spieler.CurrentEnemyPower *2;

             ci = "Textrpg\\Images\\Elemente_Strong\\Licht.png";


            }

            if (spieler.Main_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'|| spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'i'){
                damageText.setForeground(new Color(255,200,30));
                damg2 = spieler.CurrentEnemyPower /2;

             ci = "Textrpg\\Images\\Elemente_Weak\\Licht.png";


            }

        animateEnemyAttack(ci,damg2);
        }

        if (element == "Lunar") {
            Thread.sleep(spieler.t1 * 10);

            damg2 = spieler.CurrentEnemyPower;
            damageText.setForeground(new Color(255,255,255));
            ci = "Textrpg\\Images\\Elemente\\Lunar.png";

            if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'i'){

                damageText.setForeground(new Color(255,50,0));
                damg2 = spieler.CurrentEnemyPower *2;

             ci = "Textrpg\\Images\\Elemente_Strong\\Lunar.png";


            }

            if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'u'){
                damageText.setForeground(new Color(255,200,30));
                damg2 = spieler.CurrentEnemyPower /2;

             ci = "Textrpg\\Images\\Elemente_Weak\\Lunar.png";


            }

        animateEnemyAttack(ci,damg2);
        }
        

        if (element == "Void") {
           
            Thread.sleep(spieler.t1 * 10);

            damg2 = spieler.CurrentEnemyPower;
            damageText.setForeground(new Color(255,255,255));
            ci = "Textrpg\\Images\\Elemente\\Void.png";

            if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'o'|| spieler.Main_Element.charAt(2) == 'G' && spieler.Main_Element.charAt(3) == 'r'){

                damageText.setForeground(new Color(255,50,0));
                damg2 = spieler.CurrentEnemyPower *2;

             ci = "Textrpg\\Images\\Elemente_Strong\\Void.png";


            }

            if (spieler.Main_Element.charAt(2) == 'V' && spieler.Main_Element.charAt(3) == 'o'){
                damageText.setForeground(new Color(255,200,30));
                damg2 = spieler.CurrentEnemyPower /2;

             ci = "Textrpg\\Images\\Elemente_Weak\\Void.png";


            }
        System.out.println("Enemy used Gravity");
        System.out.println("You lost " + spieler.CurrentEnemyPower + " HP");

        animateEnemyAttack(ci,damg2);
    }

    if (element == "Wasser") {
           
        Thread.sleep(spieler.t1 * 10);

        damg2 = spieler.CurrentEnemyPower;
        damageText.setForeground(new Color(255,255,255));
        ci = "Textrpg\\Images\\Elemente\\Wasser.png";

        if (spieler.Main_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'|| spieler.Main_Element.charAt(2) == 'E' && spieler.Main_Element.charAt(3) == 'r'){

            damageText.setForeground(new Color(255,50,0));
            damg2 = spieler.CurrentEnemyPower *2;

         ci = "Textrpg\\Images\\Elemente_Strong\\Wasser.png";


        }

        if (spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'a'){
            damageText.setForeground(new Color(255,200,30));
            damg2 = spieler.CurrentEnemyPower /2;

         ci = "Textrpg\\Images\\Elemente_Weak\\Wasser.png";


        }
    System.out.println("Enemy used Gravity");
    System.out.println("You lost " + spieler.CurrentEnemyPower + " HP");

    animateEnemyAttack(ci,damg2);
}

if (element == "Wind") {
           
    Thread.sleep(spieler.t1 * 10);

    damg2 = spieler.CurrentEnemyPower;
    damageText.setForeground(new Color(255,255,255));
    ci = "Textrpg\\Images\\Elemente\\Wind.png";

    if (spieler.Main_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'|| spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'r'){

        damageText.setForeground(new Color(255,50,0));
        damg2 = spieler.CurrentEnemyPower *2;

     ci = "Textrpg\\Images\\Elemente_Strong\\Wind.png";


    }

    if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'i' || spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'i'){
        damageText.setForeground(new Color(255,200,30));
        damg2 = spieler.CurrentEnemyPower /2;

     ci = "Textrpg\\Images\\Elemente_Weak\\Wind.png";


    }
System.out.println("Enemy used Gravity");
System.out.println("You lost " + spieler.CurrentEnemyPower + " HP");

animateEnemyAttack(ci,damg2);
}

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

        Thread.sleep(1000);
        if (tex != null) {
            tex.setText("");
            if (standardText != null) {
                tex.setText(standardText);
                System.out.print(standardText);
            }
            for (Byte m1 = 0; m1 < message.length(); m1++) {
                tex.setText(tex.getText() + message.charAt(m1));
                System.out.print(message.charAt(m1));
                Thread.sleep(w);
            }

        }

        if (a != null) {
            a.setText("");
            if (standardText != null) {
                a.setText(standardText);
            }
            for (Byte m1 = 0; m1 < message.length(); m1++) {
                System.out.print(message.charAt(m1));
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

        for (i = 1; i < 235; i++) {
            Thread.sleep(i / i * 1, 3);
            panel3.setBackground(new Color(255 - i, 255 - i, 255 - i));
            System.out.println("i: " + i);

        }

        frame.setBackground(new Color(20, 20, 20));
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

                animateText(" First, enter your name.", null, commbox, spieler.textSpeed, null);

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


    

    


public void standardE(){
    for (int t = 0; t < Elemente.elements.length; t++) {
        if (Elemente.elements[t].charAt(0) == spieler.Main_Element.charAt(2)
                && Elemente.elements[t].charAt(1) == spieler.Main_Element.charAt(3)
                && Elemente.elements[t].charAt(2) == spieler.Main_Element.charAt(4)
                && Elemente.elements[t].charAt(3) == spieler.Main_Element.charAt(5)) {
            i1.setIcon(
                    new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[t] + ".png")
                            .getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
            i1.setText(Elemente.elementsName[t]);
            i1.setForeground(Elemente.elemetColors[t]);

        }
    }



    for (int t = 0; t < Elemente.elements.length; t++) {
        if (Elemente.elements[t].charAt(0) == spieler.Second_Element.charAt(2)
                && Elemente.elements[t].charAt(1) == spieler.Second_Element.charAt(3)
                && Elemente.elements[t].charAt(2) == spieler.Second_Element.charAt(4)
                && Elemente.elements[t].charAt(3) == spieler.Second_Element.charAt(5)) {
            i2.setIcon(
                    new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + Elemente.elements[t] + ".png")
                            .getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
            i2.setText(Elemente.elementsName[t]);
            i2.setForeground(Elemente.elemetColors[t]);


        }
    }
}


public void setSpecialWeapon(String File){


    if (File == "W"){


        if (nextPosition1 == "Artemis Kampf"){
            specialEnemyP.setVisible(true);
            specialEnemyP2.setVisible(true);
            specialEnemyI.setVisible(true);
            specialEnemyT.setVisible(true);

            specialEnemyP.setBounds(400, 40, (int) (2.1 * spieler.currentEnemyHP), 40);
            specialEnemyP.setBackground(en.bossesColors[1]);
            specialEnemyI.setBounds(385 +(2 * spieler.currentEnemyHP), 0, 265, 120);
            specialEnemyT.setBounds(350 +(2 * spieler.currentEnemyHP), 100, 250, 40);
            specialEnemyI.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\weapons\\Artemis Pfeil.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));       
            specialEnemyT.setForeground(new Color(255,180,0));
            specialEnemyT.setText("Artemis Pfeil");
moon_Artemis.setVisible(false);
        }

        if (nextPosition1 == "Apollon Kampf"){
            specialEnemyP.setVisible(true);
            specialEnemyP2.setVisible(true);
            specialEnemyI.setVisible(true);
            specialEnemyT.setVisible(true);

            specialEnemyP.setBounds(400, 40, (int) (1.7 * spieler.currentEnemyHP), 40);
            specialEnemyP.setBackground(en.bossesColors[2]);
            specialEnemyI.setBounds((int) (385 +(1.65 * spieler.currentEnemyHP)), 0, 265, 120);
            specialEnemyT.setBounds((int) (385 +(1.65 * spieler.currentEnemyHP)), 100, 250, 40);
            specialEnemyI.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\weapons\\Lichtbogen.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));       
            specialEnemyT.setForeground(new Color(255,205,40));
            specialEnemyT.setText("Lichtbogen");
moon_Artemis.setVisible(false);
        }
       

        if (nextPosition1 == "Medusa Fight"){
            specialEnemyP.setVisible(true);
            specialEnemyP2.setVisible(true);
            specialEnemyI.setVisible(true);
            specialEnemyT.setVisible(true);

            specialEnemyP.setBounds(400, 40, (int) (1.25 * spieler.currentEnemyHP), 40);
            specialEnemyP.setBackground(en.bossesColors[2]);
            specialEnemyI.setBounds((int) (385 +(1.2 * spieler.currentEnemyHP)), 0, 265, 120);
            specialEnemyT.setBounds((int) (385 +(1.2 * spieler.currentEnemyHP)), 100, 250, 40);
            specialEnemyI.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Shields\\Python Rüstung.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));       
            specialEnemyT.setForeground(new Color(255,205,40));
            specialEnemyT.setText("Python Rüstung");
moon_Artemis.setVisible(false);
        }

        if (nextPosition1 == "Poseidon Kampf"){
            specialEnemyP.setVisible(true);
            specialEnemyP2.setVisible(true);
            specialEnemyI.setVisible(true);
            specialEnemyT.setVisible(true);

            specialEnemyP.setBounds(400, 40, (int) (1.25 * spieler.currentEnemyHP), 40);
            specialEnemyP.setBackground(en.bossesColors[2]);
            specialEnemyI.setBounds((int) (385 +(1.2 * spieler.currentEnemyHP)), 0, 265, 120);
            specialEnemyT.setBounds((int) (385 +(1.2 * spieler.currentEnemyHP)), 100, 250, 40);
            specialEnemyI.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Shields\\Neptuns Rüstung.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));       
            specialEnemyT.setForeground(new Color(255,205,40));
            specialEnemyT.setText("Python Rüstung");
moon_Artemis.setVisible(false);
        }

        if (nextPosition1 == "Hades Kampf"){
            specialEnemyP.setVisible(true);
            specialEnemyP2.setVisible(true);
            specialEnemyI.setVisible(true);
            specialEnemyT.setVisible(true);

            //specialEnemyP2.setBounds(400, 40, 500, 40);

            specialEnemyP.setBounds(400, 40, (int) (spieler.currentEnemyHP/3), 40);
            specialEnemyP.setBackground(en.bossesColors[2]);
            specialEnemyI.setBounds((int) (360 +(spieler.currentEnemyHP/3)), 0, 265, 120);
            specialEnemyT.setBounds((int) (328 +(spieler.currentEnemyHP/3)), 100, 250, 40);
            specialEnemyI.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\weapons\\Hades Blades.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));       
            specialEnemyT.setForeground(new Color(255,205,40));
            specialEnemyT.setText("Hades Blades");
moon_Artemis.setVisible(false);
        }


        if (nextPosition1 == "Heraktles Kampf"){
            specialEnemyP.setVisible(true);
            specialEnemyP2.setVisible(true);
            specialEnemyI.setVisible(true);
            specialEnemyT.setVisible(true);
    
    
            specialEnemyP.setBounds(400, 40, (int) (spieler.currentEnemyHP/1.6), 40);
            specialEnemyP.setBackground(en.bossesColors[2]);
            specialEnemyI.setBounds((int) (360 +(spieler.currentEnemyHP/1.55)), 0, 265, 120);
            specialEnemyT.setBounds((int) (360 + (spieler.currentEnemyHP/1.55)), 100, 250, 40);
            specialEnemyI.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Shields\\Fell des Löwen.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));       
            specialEnemyT.setForeground(new Color(255,205,40));
            specialEnemyT.setText("Fell des löwen");
    moon_Artemis.setVisible(false);
        }

    }







}

public void specialCombat() throws InterruptedException{
    if (nextPosition1 == "Hades Kampf" && spieler.reflection == false && spieler.currentEnemyHP > 400){
        if (spieler.currentEnemyHP > 1000){
            specialEffectText.setEnabled(false);
            specialEffectText.setVisible(true);
            specialEffectText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\Artemis.png")
                    .getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));
                    specialEffectText.setText("-"+ damg/10 +" Schaden - Artemis Effect");
                    spieler.currentEnemyHP += damg/10;
                    Thread.sleep(spieler.t3);
                    enemyInfoHP.setText("          " +spieler.currentEnemyHP);                   
        }

        if (spieler.currentEnemyHP > 400){
            specialEffectText2.setEnabled(false);
            specialEffectText2.setVisible(true);
            specialEffectText2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\Apollon.png")
                    .getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));
                    specialEffectText2.setText("+"+ damg/20 + " Hades HP - Apollon Effect");
                    spieler.currentEnemyHP += damg/20;
                    enemyInfoHP.setText("          " +spieler.currentEnemyHP);    
                    Thread.sleep(spieler.t3);               
        }
        Thread.sleep(spieler.t3 * 15);
        specialEffectText.setVisible(false);
        specialEffectText2.setVisible(false);

    }

    if (nextPosition1 == "Hermes Kampf" && spieler.reflection == false && spieler.currentEnemyHP > 0){

        Random r = new Random();
        if (Math.random() > 0.5){

            specialEffectText.setEnabled(true);
            specialEffectText.setVisible(true);
            specialEffectText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\Hermes.png")
                    .getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));
                    specialEffectText.setText("Angriff ausgewichen");
                    spieler.currentEnemyHP += damg;
                    enemyInfoHP.setText("          " +spieler.currentEnemyHP);     
                    Thread.sleep(spieler.t3 * 15);
        specialEffectText.setVisible(false);
        specialEffectText2.setVisible(false);
              
        }

    }

    if (nextPosition1 == "Apollon Kampf" && spieler.reflection == false && spieler.currentEnemyHP > 0){
        if (Math.random() > 0.4){
            specialEffectText.setEnabled(true);
            specialEffectText.setVisible(true);
            specialEffectText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\Apollon.png")
                    .getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));
                    specialEffectText.setText("Weniger Schaden");
                    spieler.currentEnemyHP -= (Math.random() * damg);
                    enemyInfoHP.setText("          " +spieler.currentEnemyHP);     
                    Thread.sleep(spieler.t3 * 15);
        specialEffectText.setVisible(false);
        specialEffectText2.setVisible(false);
        }
    }

    if (nextPosition1 == "Ares Kampf" && spieler.reflection == false && spieler.currentEnemyHP > 0){

       spieler.CurrentEnemyPower = (int) (45 + (45 * (Math.random())));

    }
    

    if (nextPosition1 == "Zeus Kampf" && spieler.reflection == false && spieler.currentEnemyHP > 0){
        if (Math.random() > 0.3){
            specialEffectText.setEnabled(true);
            specialEffectText.setVisible(true);
            specialEffectText.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\BossesI\\Zeus_Rage.png")
                    .getImage().getScaledInstance(40, 35, Image.SCALE_AREA_AVERAGING)));
                    specialEffectText.setText("25% mehr Schaden");
                    spieler.Health -= (0.25 * spieler.CurrentEnemyPower);
                    enemyInfoHP.setText("          " +spieler.currentEnemyHP);     
                    Thread.sleep(spieler.t3 * 15);
        specialEffectText.setVisible(false);
        specialEffectText2.setVisible(false);
        }
     }

     setSpecialWeapon("W");


}



    public void spawnEnemy(String File, int Index) {

        if (spieler.reflection == true){
            reflectedDamgeImage.setVisible(true);
        }
        if (File == "Enemies"){
            standardE();

            spieler.file = "Enemies";
            spieler.index = Index;
            enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Enemies\\" + en.enemies[Index] + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
            enemyInfoImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Enemies\\" + en.enemies[Index] + ".png").getImage().getScaledInstance(140, 120, Image.SCALE_AREA_AVERAGING)));
//HP = en.enemiesHP[Index];
spieler.currentEnemyHP = en.enemiesHP[Index];
spieler.CurrentEnemyPower = en.enemiesPower[Index];
spieler.enemyMain_Element = en.enemy_Main_Materias[Index];
//Power = en.enemiesPower[Index];
enemyInfoName.setText("  "+en.enemies[Index]+"  ");
enemyInfoHP.setText("          " +en.enemiesHP[Index]);
enemyInfoName.setBorder(new LineBorder(en.enemyColors[Index]));
enemyInfoName.setForeground(en.enemyColors[Index]);
enemyInfoImage.setBorder(new LineBorder(en.enemyColors[Index]));
enemyInfoMainElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Main_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
if (en.enemy_Second_Materias[Index]!= null){
    enemyInfoSecondElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Second_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
spieler.enemySecond_Element = en.enemy_Second_Materias[Index];
}

if (en.enemy_Third_Materias[Index]!= null){
    enemyInfoThirdElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.enemy_Third_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
    spieler.enemyThird_Element = en.enemy_Third_Materias[Index];

}

System.out.println(spieler.enemyMain_Element);


elementImage.setBounds(500,280,400,400);

enemyImage.setBounds(500,280,400,400);

enemyImage.setForeground(en.enemyColors[0]);


enemyInfo.setVisible(true);
enemyImage.setVisible(true);
enemyInfoDifficulty.setVisible(true);
enemyInfoHP.setVisible(true);
enemyInfoImage.setVisible(true);
enemyInfoName.setVisible(true);
enemyInfoMainElement.setVisible(true);
enemyInfoSecondElement.setVisible(true);
enemyInfoThirdElement.setVisible(true);
enemyInfoLastElement.setVisible(true);

playerInfo.setVisible(true);
playerInfoAttack.setVisible(true);
playerInfoHP.setVisible(true);
//playerInfoHPProgress.setVisible(true);
playerInfoHPShield.setVisible(true);
playerInfoMainElement.setVisible(true);
playerInfoName.setVisible(true);
playerInfoPower.setVisible(true);
playerInfoSecondElement.setVisible(true);
playerInfoSupportElement.setVisible(true);

fighting_options.setVisible(true);
fightPlayButton.setVisible(true);




        }

        if (File == "Bosses"){
            standardE();

            spieler.file = "Bosses";
            spieler.index = Index;

            enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\" + en.bosses[Index] + ".png").getImage().getScaledInstance(370, 365, Image.SCALE_AREA_AVERAGING)));
            enemyInfoImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\" + en.bosses[Index] + ".png").getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING)));
        //    HP = en.bossesHP[Index];
            spieler.currentEnemyHP = en.bossesHP[Index];
            spieler.CurrentEnemyPower = en.bossesPower[Index];
//Power = en.bossesPower[Index];
enemyInfoName.setBorder(new LineBorder(en.bossesColors[Index]));
enemyInfoName.setForeground(en.bossesColors[Index]);
enemyInfoImage.setBorder(new LineBorder(en.bossesColors[Index]));
enemyInfoDifficulty.setForeground(en.bossdifficultyColors[Index]);
enemyInfoDifficulty.setText(en.bossDifficulty[Index]);
spieler.enemyMain_Element = en.boss_Main_Materias[Index];

enemyInfoMainElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Main_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
if (en.boss_Second_Materias[Index]!= null){
    enemyInfoSecondElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Second_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
    spieler.enemySecond_Element = en.boss_Second_Materias[Index];

}

if (en.boss_Third_Materias[Index]!= null){
    enemyInfoThirdElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Third_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
    spieler.enemyThird_Element = en.boss_Third_Materias[Index];

}

if (en.boss_Last_Materias[Index]!= null){
    enemyInfoLastElement.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\" + en.boss_Last_Materias[Index] +".png").getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING)));
    spieler.enemyThird_Element = en.boss_Last_Materias[Index];

}

if (en.bosses[Index] == "Athene"){
    enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Bosses\\" + en.bosses[Index] + ".png").getImage().getScaledInstance(250, 365, Image.SCALE_AREA_AVERAGING)));
    enemyImage.setBounds(400,280,400,400);
    elementImage.setBounds(400,280,400,400);

}

enemyImage.setBounds(500,280,400,400);

enemyImage.setForeground(en.enemyColors[0]);

enemyInfoName.setText("  "+en.bosses[Index]+"  ");

enemyInfoHP.setText("          " +en.bossesHP[Index]);

enemyInfo.setVisible(true);
enemyImage.setVisible(true);
enemyInfoDifficulty.setVisible(true);
enemyInfoHP.setVisible(true);
enemyInfoImage.setVisible(true);
enemyInfoName.setVisible(true);
enemyInfoMainElement.setVisible(true);
enemyInfoSecondElement.setVisible(true);
enemyInfoThirdElement.setVisible(true);
enemyInfoLastElement.setVisible(true);

playerInfo.setVisible(true);
playerInfoAttack.setVisible(true);
playerInfoHP.setVisible(true);
//playerInfoHPProgress.setVisible(true);
playerInfoHPShield.setVisible(true);
playerInfoMainElement.setVisible(true);
playerInfoName.setVisible(true);
playerInfoPower.setVisible(true);
playerInfoSecondElement.setVisible(true);
playerInfoSupportElement.setVisible(true);

fighting_options.setVisible(true);
fightPlayButton.setVisible(true);


        }



        if (spieler.enemyMain_Element == "Cosmic") {

            // Strong //

            if (spieler.Main_Element.charAt(2) == 'G' && spieler.Main_Element.charAt(3) == 'r'){
                i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Gravity.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                i1.setText("        Gravity         ");
                i1.setForeground(new Color(155,25,0));
             }
        
        
             if (spieler.Second_Element.charAt(2) == 'G' && spieler.Second_Element.charAt(3) == 'r'){
                i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Gravity.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                i2.setText("        Gravity         ");
                i2.setForeground(new Color(155,25,0));
             }
        
             if (spieler.Main_Element.charAt(2) == 'V' && spieler.Main_Element.charAt(3) == 'o'){
                i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Void.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
                        i1.setText("        Void         ");
                        i1.setForeground(new Color(155,25,0));
                            }
        
        
        
                            if (spieler.Second_Element.charAt(2) == 'V' && spieler.Second_Element.charAt(3) == 'o'){
                                i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Void.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
                                i2.setText("        Void         ");
                                i2.setForeground(new Color(155,25,0));
                                    }
        


            // Strong //



            // Weak //


                
                    if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'o'){
                        i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Cosmic.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                        i1.setText("        Cosmic         ");
                        i1.setForeground(new Color(255,215,0));
                     }
                
                
                     if (spieler.Second_Element.charAt(2) == 'C' && spieler.Second_Element.charAt(3) == 'o'){
                        i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Cosmic.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                        i2.setText("        Cosmic         ");
                        i2.setForeground(new Color(255,215,0));
                     }

                                                 // Weak //


}


if (spieler.enemyMain_Element == "Crystal"){






            // Strong //

            if (spieler.Main_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'){
                i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Feuer.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                i1.setText("        Feuer         ");
                i1.setForeground(new Color(155,25,0));
             }
        
        
             if (spieler.Second_Element.charAt(2) == 'F' && spieler.Second_Element.charAt(3) == 'e'){
                i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Feuer.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                i2.setText("        Feuer         ");
                i2.setForeground(new Color(155,25,0));
             }
        
             if (spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'a'){
                i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Wasser.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
                        i1.setText("        Wasser         ");
                        i1.setForeground(new Color(155,25,0));
                            }
        
        
        
                            if (spieler.Second_Element.charAt(2) == 'C' && spieler.Second_Element.charAt(3) == 'o'){
                                i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Wasser.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
                                i2.setText("        Void         ");
                                i2.setForeground(new Color(155,25,0));
                                    }
        


            // Strong //



            // Weak //


            if (spieler.Main_Element.charAt(2) == 'E' && spieler.Main_Element.charAt(3) == 'r'){
                i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                i1.setText("        Erde         ");
                i1.setForeground(new Color(255,215,0));
                    }
                
                    if (spieler.Second_Element.charAt(2) == 'E' && spieler.Second_Element.charAt(3) == 'r'){
                        i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                i2.setText("        Erde         ");
                i2.setForeground(new Color(255,215,0));
                    }
                
                    if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'r'){
                        i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Crystal.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                        i1.setText("        Crystal         ");
                        i1.setForeground(new Color(255,215,0));
                     }
                
                
                     if (spieler.Second_Element.charAt(2) == 'C' && spieler.Second_Element.charAt(3) == 'r'){
                        i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Crystal.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                        i2.setText("        Crystal         ");
                        i2.setForeground(new Color(255,215,0));
                     }

}


if (spieler.enemyMain_Element == "Erde"){






// Strong //

if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'r'){
i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Crystal.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Crystal         ");
i1.setForeground(new Color(155,25,0));
}


if (spieler.Second_Element.charAt(2) == 'C' && spieler.Second_Element.charAt(3) == 'r'){
i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Crystal.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Crystal         ");
i2.setForeground(new Color(155,25,0));
}




// Strong //



// Weak //


if (spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'i'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wind.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Wind         ");
i1.setForeground(new Color(255,215,0));
}

if (spieler.Second_Element.charAt(2) == 'W' && spieler.Second_Element.charAt(3) == 'i'){
i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wind.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Wind         ");
i2.setForeground(new Color(255,215,0));
}

if (spieler.Main_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Feuer.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Feuer         ");
i1.setForeground(new Color(255,215,0));
}


if (spieler.Second_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Feuer.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Feuer         ");
i2.setForeground(new Color(255,215,0));
}



if (spieler.Main_Element.charAt(2) == 'E' && spieler.Main_Element.charAt(3) == 'r'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Erde         ");
i1.setForeground(new Color(255,215,0));
}


if (spieler.Second_Element.charAt(2) == 'E' && spieler.Second_Element.charAt(3) == 'r'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Erde         ");
i2.setForeground(new Color(255,215,0));
}

}





if (spieler.enemyMain_Element == "Feuer"){






// Strong //

if (spieler.Main_Element.charAt(2) == 'E' && spieler.Main_Element.charAt(3) == 'r'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Erde         ");
i1.setForeground(new Color(155,25,0));
}


if (spieler.Second_Element.charAt(2) == 'E' && spieler.Second_Element.charAt(3) == 'r'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Erde         ");
i2.setForeground(new Color(155,25,0));
}

if (spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'a'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Wasser.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Wasser         ");
i1.setForeground(new Color(155,25,0));
    }



    if (spieler.Second_Element.charAt(2) == 'W' && spieler.Second_Element.charAt(3) == 'a'){
        i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Wasser.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
        i2.setText("        Wasser         ");
        i2.setForeground(new Color(155,25,0));
            }



// Strong //



// Weak //


if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'r'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Crystal.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Crystal         ");
i1.setForeground(new Color(255,215,0));
}

if (spieler.Second_Element.charAt(2) == 'C' && spieler.Second_Element.charAt(3) == 'r'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Crystal.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Crystal         ");
i2.setForeground(new Color(255,215,0));
}

if (spieler.Main_Element.charAt(2) == 'F' && spieler.Main_Element.charAt(3) == 'e'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Feuer.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Feuer         ");
i1.setForeground(new Color(255,215,0));
}


if (spieler.Second_Element.charAt(2) == 'F' && spieler.Second_Element.charAt(3) == 'e'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Feuer.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Feuer         ");
i2.setForeground(new Color(255,215,0));
}

if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'i'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Licht.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Licht         ");
i1.setForeground(new Color(255,215,0));
}


if (spieler.Second_Element.charAt(2) == 'L' && spieler.Second_Element.charAt(3) == 'i'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Licht.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Licht         ");
i2.setForeground(new Color(255,215,0));
}

}





if (spieler.enemyMain_Element == "Gravity"){






// Strong //

if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'o'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Cosmic.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Cosmic         ");
i1.setForeground(new Color(155,25,0));
}


if (spieler.Second_Element.charAt(2) == 'C' && spieler.Second_Element.charAt(3) == 'o'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Cosmic.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Cosmic         ");
i2.setForeground(new Color(155,25,0));
}

if (spieler.Main_Element.charAt(2) == 'V' && spieler.Main_Element.charAt(3) == 'o'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Void.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Void         ");
i1.setForeground(new Color(155,25,0));
    }



    if (spieler.Main_Element.charAt(2) == 'V' && spieler.Main_Element.charAt(3) == 'o'){
        i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Void.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
        i2.setText("        Void         ");
        i2.setForeground(new Color(155,25,0));
            }



// Strong //



// Weak //


if (spieler.Main_Element.charAt(2) == 'W' && spieler.Main_Element.charAt(3) == 'i'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wind.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Wind         ");
i1.setForeground(new Color(255,215,0));
}

if (spieler.Second_Element.charAt(2) == 'W' && spieler.Second_Element.charAt(3) == 'i'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wind.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Wind         ");
i2.setForeground(new Color(255,215,0));
}

if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'r'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Crystal.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Crystal         ");
i1.setForeground(new Color(255,215,0));
}


if (spieler.Second_Element.charAt(2) == 'C' && spieler.Second_Element.charAt(3) == 'r'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Crystal.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Crystal         ");
i2.setForeground(new Color(255,215,0));
}

}




if (spieler.enemyMain_Element == "Licht"){






// Strong //

if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'u'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Lunar.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Lunar         ");
i1.setForeground(new Color(155,25,0));
}


if (spieler.Second_Element.charAt(2) == 'L' && spieler.Second_Element.charAt(3) == 'u'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Lunar.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Lunar         ");
i2.setForeground(new Color(155,25,0));
}





// Strong //



// Weak //


if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'i'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Licht.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Licht         ");
i1.setForeground(new Color(255,215,0));
}

if (spieler.Second_Element.charAt(2) == 'G' && spieler.Second_Element.charAt(3) == 'r'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Licht.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Licht         ");
i2.setForeground(new Color(255,215,0));
}


}




if (spieler.enemyMain_Element == "Lunar"){






// Strong //

if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'i'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Licht.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Licht         ");
i1.setForeground(new Color(155,25,0));
}


if (spieler.Second_Element.charAt(2) == 'L' && spieler.Second_Element.charAt(3) == 'i'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Licht.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Licht         ");
i2.setForeground(new Color(155,25,0));
}


// Strong //



// Weak //


if (spieler.Main_Element.charAt(2) == 'L' && spieler.Main_Element.charAt(3) == 'u'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Lunar.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Lunar         ");
i1.setForeground(new Color(255,215,0));
}

if (spieler.Second_Element.charAt(2) == 'L' && spieler.Second_Element.charAt(3) == 'u'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Lunar.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Lunar         ");
i2.setForeground(new Color(255,215,0));
}




}




if (spieler.enemyMain_Element == "Void"){






// Strong //

if (spieler.Main_Element.charAt(2) == 'C' && spieler.Main_Element.charAt(3) == 'o'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Cosmic.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Cosmic         ");
i1.setForeground(new Color(155,25,0));
}

if (spieler.Second_Element.charAt(2) == 'C' && spieler.Second_Element.charAt(3) == 'o'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Cosmic.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Cosmic         ");
i2.setForeground(new Color(155,25,0));
}

if (spieler.Main_Element.charAt(2) == 'G' && spieler.Main_Element.charAt(3) == 'r'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Gravity.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Gravity         ");
i1.setForeground(new Color(155,25,0));
}

if (spieler.Second_Element.charAt(2) == 'G' && spieler.Second_Element.charAt(3) == 'r'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Gravity.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Gravity         ");
i2.setForeground(new Color(155,25,0));
}


// Strong //



// Weak //




if (spieler.Main_Element.charAt(2) == 'V' && spieler.Main_Element.charAt(3) == 'o'){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Void.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Void         ");
i1.setForeground(new Color(255,215,0));
}

if (spieler.Second_Element.charAt(2) == 'V' && spieler.Second_Element.charAt(3) == 'o'){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Void.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Void         ");
i2.setForeground(new Color(255,215,0));
}

}







if (spieler.enemyMain_Element == "Wasser"){






// Strong //

if (spieler.Main_Element == "  Erde  "){
i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Erde         ");
i1.setForeground(new Color(155,25,0));
}


if (spieler.Second_Element == "  Erde  "){
i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Erde         ");
i2.setForeground(new Color(155,25,0));
}




// Strong //



// Weak //


if (spieler.Main_Element == "  Wasser  "){
i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wasser.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Wasser         ");
i1.setForeground(new Color(255,215,0));
}


if (spieler.Second_Element == "  Wasser  "){
i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wasser.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Wasser         ");
i2.setForeground(new Color(255,215,0));
}

if (spieler.Main_Element == "  Feuer  "){
    i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Feuer.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
    i1.setText("        Feuer         ");
    i1.setForeground(new Color(155,25,0));
    }
    
    
    
    if (spieler.Second_Element == "  Feuer  "){
    i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Feuer.png").getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)));
    i2.setText("        Feuer         ");
    i2.setForeground(new Color(155,25,0));
        }

}




if (spieler.enemyMain_Element == "Wind"){






// Strong //

if (spieler.Main_Element == "  Erde  "){
i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Erde         ");
i1.setForeground(new Color(155,25,0));
}


if (spieler.Second_Element == "  Erde  "){
i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Strong\\Erde.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Erde         ");
i2.setForeground(new Color(155,25,0));
}


// Strong //



// Weak //



if (spieler.Main_Element == "  Wind  "){
i1.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wind.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i1.setText("        Wind         ");
i1.setForeground(new Color(255,215,0));
}

if (spieler.Second_Element == "  Wind  "){
i2.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente_Weak\\Wind.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
i2.setText("        Wind         ");
i2.setForeground(new Color(255,215,0));

}




}



    }

    

   public void artemisCombat() throws InterruptedException{

    moon_Artemis.setVisible(true);

    Thread.sleep(2000);

    panel3.setVisible(true);
    System.out.println("Startb");
    int i;

    for (i = 1; i < 200; i++) {
        Thread.sleep(4);
        panel3.setBackground(new Color(i /8, i /8, i/8));
        System.out.println("i: " + i);

    
}

Thread.sleep(200);

for (i = 1; i < 230; i++) {
    Thread.sleep(0);
    panel3.setBackground(new Color(i+ 25, i+ 25, i+ 25));
    System.out.println("i: " + i);


}

Thread.sleep(200);


/*
for (i = 1; i < 230; i++) {
Thread.sleep(0);
panel3.setBackground(new Color(i+ 25, i+ 25, i+ 25));
System.out.println("i: " + i);


}

Thread.sleep(200);



for (i = 1; i < 230; i++) {
Thread.sleep(0);
panel3.setBackground(new Color(i+ 25, i+ 25, i+ 25));
System.out.println("i: " + i);


}

*/

for (i = 1; i < 255; i++) {
    Thread.sleep(4);
    panel3.setBackground(new Color(255 - (i), 255 -(i), 255 - (i)));
    System.out.println("i: " + i);

}

Thread.sleep(300);
panel3.setVisible(false);
    /*
    for (int t = 0; t<3; t++){
        panel3.setVisible(true);
        panel3.setBackground(new Color(0, 0, 0));

    for (i = 1; i < 51; i++) {
        Thread.sleep(4);
        panel3.setBackground(new Color(i * 5, i * 5, i * 5));
        System.out.println("i: " + i);

    }
}

    panel3.setVisible(true);
    for (i = 1; i < 60; i++) {
        Thread.sleep(8);
        panel3.setBackground(new Color(255 - (i+195), 255 -(i+195), 255 - (i+195)));
        System.out.println("i: " + i);

   }

   Thread.sleep(200);

   panel3.setVisible(false);
*/


    }



    void Award(String File, int a, String N, String D, String I) throws InterruptedException{

if (File == "A"){
    achievementI.setIcon(new ImageIcon(new ImageIcon(rew.achievementsImage[a]).getImage()
    .getScaledInstance(105, 100, Image.SCALE_AREA_AVERAGING)));

    achievementN.setText(rew.achievements[a]);
    achievementN.setForeground(rew.achievementsColor[a]);
    achievementD.setText(rew.rewardDescription[a]);
    achievementDif.setText(rew.achievementsDifficulty[a]);
    achievementDif.setForeground(rew.difficultyColors[a]);

achievementsPanel.setBounds(1307, 280, 265, 120);
achievementI.setBounds(1310, 280, 265, 120);
achievementN.setBounds(1420, 250, 265, 120);
achievementD.setBounds(1420, 340, 120, 120);
achievementDif.setBounds(1520, 325, 265, 120);

Thread.sleep(80);

achievementsPanel.setVisible(true);
achievementI.setVisible(true);
achievementN.setVisible(true);
achievementD.setVisible(true);
achievementDif.setVisible(true);

for (int v = 0; v< 300; v++){
Thread.sleep(1);
achievementsPanel.setBounds(1307-v, 280, 265, 120);
achievementI.setBounds(1310-v, 280, 265, 120);
achievementN.setBounds(1420-v, 250, 265, 120);
achievementD.setBounds(1420-v, 340, 120, 120);
achievementDif.setBounds(1520-v, 325, 265, 120);

}

Thread.sleep(5000);

for (int v = 0; v< 300; v++){
Thread.sleep(1);
achievementsPanel.setBounds(1007+v, 280, 265, 120);
achievementI.setBounds(1010+v, 280, 265, 120);
achievementN.setBounds(1120+v, 250, 265, 120);
achievementD.setBounds(1120+v, 340, 120, 120);
achievementDif.setBounds(1220+v, 325, 265, 120);

}

Thread.sleep(80);

achievementsPanel.setVisible(false);
achievementI.setVisible(false);
achievementN.setVisible(false);
achievementD.setVisible(false);
achievementDif.setVisible(false);
}

if (File == "W"){
    achievementI.setIcon(new ImageIcon(new ImageIcon(I).getImage()
    .getScaledInstance(105, 100, Image.SCALE_AREA_AVERAGING)));

    achievementN.setText(N);
    achievementN.setForeground(specialEnemyT.getForeground());
    achievementD.setText(D);

achievementsPanel.setBounds(1307, 280, 265, 120);
achievementI.setBounds(1310, 280, 265, 120);
achievementN.setBounds(1420, 250, 265, 120);
achievementD.setBounds(1420, 340, 120, 120);
achievementDif.setBounds(1520, 325, 265, 120);

Thread.sleep(spieler.t2);

achievementsPanel.setVisible(true);
achievementI.setVisible(true);
achievementN.setVisible(true);
achievementD.setVisible(true);
achievementDif.setVisible(false);

for (int v = 0; v< 300; v++){
Thread.sleep(1);
achievementsPanel.setBounds(1307-v, 280, 265, 120);
achievementI.setBounds(1310-v, 280, 265, 120);
achievementN.setBounds(1420-v, 250, 265, 120);
achievementD.setBounds(1420-v, 340, 120, 120);

}

Thread.sleep(spieler.t3 * 16);

for (int v = 0; v< 300; v++){
Thread.sleep(1);
achievementsPanel.setBounds(1007+v, 280, 265, 120);
achievementI.setBounds(1010+v, 280, 265, 120);
achievementN.setBounds(1120+v, 250, 265, 120);
achievementD.setBounds(1120+v, 340, 120, 120);

}

Thread.sleep(spieler.t2);

achievementsPanel.setVisible(false);
achievementI.setVisible(false);
achievementN.setVisible(false);
achievementD.setVisible(false);
achievementDif.setVisible(false);
}
       

    }






    public void DerAnfang(){



        mainTextArea.setText("Nun "+spieler.playerName+" sind sie bereit für ihr erstes Abenteuer.\n\n\nDu bist ein einfacher Tourist der die Stadt Athen besucht\n\nMöge deine Geschichte beginnen...");
         option1button.setText("weiter");
         option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

         option2button.setText("");
     
         option3button.setText("");
     
         option4button.setText("");
     
        
     
     nextPosition1="Heraktles Kampf";
     
     nextPosition2="";
     nextPosition3="";
     nextPosition4="";
     
     }

     public void DerAnfangpart2(){

          mainTextArea.setText("Seelenruhig läufst du durch die Straßen von Athen, die Kopfhörer im Ohr und den Blick aufs Meer gerichtet.Du bleibst stehen, beobachtest wie die Wellen den Sandstrand hochwandern, bis sie wieder zurückwandern, immer so weiter. \n\nDie Idylle wird von einem alten gebrechlichen Mann unterbrochen, der möchte dass du für ihn einen Auftrag erledigst.");
      
      nextPosition1="Anfangpart3";
      
      
      
      }


      public void DerAnfangpart3(){
    
          mainTextArea.setText(" Er möchte, dass… du für ihn den Olymp stürzt.Versuche Zeus seine Aufmerksamkeit zu erregen, indem du Götter oder Bestien besiegst, er wird dich dann in seinen Tempel einladen. Ob du sie nach dem Kampf tötest oder am Leben lässt entscheidest du selber *Huste *Huste Uaah. Verwirrt schaust du den alten Mann an.\n\n Willst du den Auftrag annehmen?");
      
          option1button.setText("Ja");
      
          option2button.setText("Nein");
      
      
      
          nextPosition1="Auftragangenommen";
      
          nextPosition2="AuftragannehmenNein";
      
      
      
      }

      public void DerAnfangende(){

        mainTextArea.setText("Enttäuscht schaut dich der alte Mann an. Stöhnend und hustend geht er weg.\n\nDein Urlaub geht ganz normal weiter");
    
        option1button.setText("Spiel beenden");
        option2button.setText("Meinung ändern");

        
       
    
     nextPosition1="Beenden";
    
    nextPosition2="Meinung ändern";
    
    }
    

    public void Auftragangenommen(){
        mainTextArea.setText("(Du bemerkst dass die Götter dich ab jetzt beobachten.) \n \"Wirklich? Uah Uah Endlich! *Huste *Huste. Suche in den antiken Tempeln der Griechen. Dort befinden sich Götter. Falls du sie besiegst, sagen sie dir vielleicht wo Zeus ist. *Huste *Huste\" ");
    
        option1button.setText("weiter");
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

        option2button.setText("");
    
        option3button.setText("");
    
        option4button.setText("");
    
       
    
    nextPosition1="Anfangpart4";
    
    nextPosition2="";
    nextPosition3="";
    nextPosition4="";

    }

    public void Anfangpart5(){
        mainTextArea.setText("(Du willst dich gerade auf dem Weg zu dem Tempel machen; da unterbricht dich der alte Mann.) \n \n \"Warte! * schau bevor du gehst, nimm das hier, es wird dir helfen. *Huste *Huste\" ");
    
        option1button.setText("Hilfe nehmen");
     
        option2button.setText("zurück");
    
        option3button.setText("");
    
        option4button.setText("");
    
       
    
    nextPosition1="Anfangpart6";
    
    nextPosition2="Anfangpart4";
    nextPosition3="Auftragangenommen";
    nextPosition4="";

    }


    public void selectposition(String nextPosition){



        switch(nextPosition){
    
            case "Auftragannehmen":break;
    
            case "Anfangpart2":DerAnfangpart2();break;
    
            case "Anfangpart3":DerAnfangpart3();break;

            case "Anfangpart4":
            mainTextArea.setText("(Du fragst den alten Mann, wo du den Tempel findest.) \n \n \"Nicht weit von hier, *Huste *Huste ca. 3 Kilometer östlich ist ein Tempel, den du besuchen kannst. *Huste *Huste Mann diese verdammte *Huste *Huste. WRRRYYYY!\"");
            option2button.setText("zurück");
            nextPosition1 = "Anfangpart5";
            nextPosition2 = "Auftragangenommen";
          //  Anfangpart5();
            ;break;

            case "Anfangpart5":Anfangpart5();break;

            case "Anfangpart6":
            mainTextArea.setText(spieler.playerName + " erhält Standard Schwert\n" + spieler.playerName + " erhält Standard Schild\n" + spieler.playerName + " erhält Heal elixir \n \"Das wird dir helfen. *Huste. Dein Schild bestimmt deine HP und dein Schwert bestimmt deine Schaden. *Huste. \nViel Erfolg\"");
            option1button.setText("weiter");
            option2button.setText("Inventar öffnen");
            option3button.setText("Sachen equippen");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option3button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            inventory.putIfAbsent(scl.schwerte[0], 1);
            inventory.putIfAbsent(scl.schilder[0], 1);
            inventory.putIfAbsent(scl.boosts[1], 1);

            nextPosition1 = "Anfangpart7";
            nextPosition2 = "InventarÖffnen";
            nextPosition3 = "Sachen Equippen"
            
            ;break;

            case "Anfangpart7":
            mainTextArea.setText("Ihe verabschiedet euch und du machs dich auf dem Weg zu dem Tempel. Es dauert nicht lange, bis du ankommst. \nVor dir steht er also, der Tempel von deinem ersten Geger");
            option1button.setText("Tempel betreten");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 38));
            option2button.setText("zurück");
            option3button.setText("");
            nextPosition1 = "Tempel betreten";
            nextPosition2 = "Anfangpart6";
            nextPosition3 = "";
            ;break;

            case "Anfangpart8":
            mainTextArea.setText("Erneut versuchst du die Tür zu öffnen, es funktioniert. \n\nVor dir steht also eine Frau mit weißen Gewändern, und einem silbernen Bogen");
            option1button.setText("Tempel betreten");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 38));
            option2button.setText("zurück");
            option3button.setText("");
            nextPosition1 = "Anfangpart9";
            nextPosition2 = "Laste_1";
            nextPosition3 = "";
            ;break;

            case "Anfangpart9":
            mainTextArea.setText("Du wagst es also, mich herauszufordern? Ich bin Artemis, Ich bin die .. der Jagd, Tochter von Zeus und zwillingsschwester von Apollon. Und du, du bist nur ein Niemand. Du wirst es bereuen, den Auftrag angenommen zu haben");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option1button.setText("Kampf beginnen");
            option2button.setText("zurück");
            option3button.setText("");
            nextPosition1 = "Artemis Kampf";
            nextPosition2 = "Anfangpart8";
            nextPosition3 = "";

            moon_Artemis.setVisible(true);


            ;break;

            case "Anfangpart11":
           mainTextArea.setText(" Willst du Artemis töten? \n > Artemis töten\n Artemis wird getötet [-4 karma] \n\n > Artemis verschonen\n Artemis wird verschont [+4 karma]");
          option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
          option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            option1button.setText("Artemis töten");
            option2button.setText("Artemis verschonen");
            option3button.setText("");
            nextPosition1 = "Artemis töten";
            nextPosition2 = "Artemis verschonen";
            nextPosition3 = "";

            moon_Artemis.setVisible(true);


            ;break;


            case "Laste_1":

            mainTextPanel.setVisible(true);
            optionsPanel.setVisible(true);
            mainTextArea.setText("[(Zorniger) Stier] wurde besiegt! \n \nDu hast 180 Münzen bekommen!");
            option1button.setText("weiter");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setText("");
            nextPosition1 = "Anfangpart8";
            nextPosition2 = "";


            ;break;            

            case "Artemis Kampf":

            moon_Artemis.setVisible(true);

            mainTextPanel.setVisible(false);
            optionsPanel.setVisible(false);
            spawnEnemy("Bosses", 1);

            spieler.HealthB = spieler.Health;
            setSpecialWeapon("W");


            ;break;            

            case "Last1":; 
            mainTextArea.setText("[(Wütender) Hirsch] wurde besiegt! \n \nDu hast 100 Münzen bekommen! \n \nJe stärker der Gegner ist, desto mehr Münzen bekommst du!");
            option1button.setText("Belohnung fordern!");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
option2button.setText("");
nextPosition1 = "Anfangpart8";
nextPosition2 = "";            
break;  


case "Apollon verschonen":; 
spieler.ApollonK = false;
nextPosition1 = "AfterApollon";
nextPosition2 = "StoryR_5;";
mainTextArea.setText("Du verschonst Apollon");
option1button.setText("weiter");
option2button.setText("zurück");
option3button.setText("");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

/*
if (spieler.karma == 4){
    spieler.karma = 8;
}

if (spieler.karma == -4){
    spieler.karma = 0;
}

*/
break;

case "Apollon töten":; 
spieler.ApollonK = true;
nextPosition1 = "Apollon töten1";
nextPosition2 = "StoryR_5";
mainTextArea.setText("Nun gut vielleicht Habe ich das verdient, aber warte noch, bevor du mich tötest will ich dir eine Sache sagen.\"Töte Medusa und bring Polydektes ihren Kopf.\"");


option1button.setText("Apollon töten");
option2button.setText("zurück");
option3button.setText("");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

/*
if (spieler.karma == 8){
    spieler.karma = 4;
}

if (spieler.karma == 0){
    spieler.karma = -4;
}
*/

break;

case "Apollon töten1":; 
nextPosition1 = "AfterApollon";
nextPosition2 = "Apollon töten";
mainTextArea.setText("Du tötest Apollon");


option1button.setText("weiter");
option2button.setText("zurück");
option3button.setText("");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
/*
if (spieler.karma == 8){
    spieler.karma = 4;
}

if (spieler.karma == 0){
    spieler.karma = -4;
}
*/

break;


            case "InventarÖffnen": openInv(); 
            if (inventarPanel.isVisible() == true){
                mainTextPanel.setVisible(false);
            }
            else{
                mainTextPanel.setVisible(true);
            }
            break;

            case "Artemis töten":; 
            spieler.karma = -4;
            nextPosition1 = "AfterArtemis";
            nextPosition2 = "Anfangpart11";
            mainTextArea.setText("Du versetzt Artemis den letzten Gnadenstoß \n\n Du verlässt den Tempel \n\n Dein Gefühl sagt dir, dass die Götter nun wütender sind");
            option1button.setText("weiter");
            option2button.setText("zurück");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option3button.setText("");

            break;

            case "Artemis verschonen":; 
            spieler.karma = 4;
            nextPosition1 = "AfterArtemis";
            nextPosition2 = "Anfangpart11";
            mainTextArea.setText("Du lässt Artemis und verlässt den Tempel \n\n Du hast das Gefühl, dass die Götter nachsichtiger sind");
            option1button.setText("weiter");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

            break;

            case "AfterArtemis":; 
            nextPosition1 = "Linkerteil1";
            nextPosition2 = "StoryR_1";
            nextPosition3 = "Anfangpart11";

            if (spieler.karma == -4){
                nextPosition3 = "Artemis töten";
            }

            if (spieler.karma == +4){
                nextPosition3 = "Artemis verschonen";

            }

            mainTextArea.setText(" Du bist noch ganz erschöpft von dem Kampf gegen Artemis. \n \n Die Besucher von vorhin sind bereits weg und die Sonne geht bereits unter. \n \n Was willst du als nächstes tun?");


            option1button.setText("Rast suchen");
            option2button.setText("Den Tempel suchen, den Artemis beschrieben hat");
            option3button.setText("zurück");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 12));
            option3button.setFont(new Font("Times new Roman", Font.PLAIN, 40));


            break;

            case "AfterApollon":; 
            nextPosition1 = "StoryR_6";
            nextPosition2 = "";
            nextPosition3 = "";

            if (spieler.ApollonK == true && spieler.karma == -4){
                spieler.karma = -8;
            }
            if (spieler.ApollonK == true && spieler.karma == 4){
                spieler.karma = 0;
            }

            if (spieler.ApollonK == false && spieler.karma == -4){
                spieler.karma = 0;
            }

            if (spieler.ApollonK == false && spieler.karma == 4){
                spieler.karma = 8;
            }
            /*
            if (spieler.karma <= -4 && spieler.ApollonK == true){
                nextPosition2 = "Apollon töten1";
                
            }

            if (spieler.karma >= 4 && spieler.ApollonK == false){
                nextPosition2 = "Apollon verschonen";


               }

               */

            mainTextArea.setText(" Du begibst dich in eine Herberge. \n\n Dort ruhst du dich bis zum nächsten Tag aus");


            option1button.setText("weiter");
            option2button.setText("");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

            break;



            case "Linkerteil1":
            mainTextArea.setText("Du gehst in eine Herberge und übernachtest. \nAm nächsten Morgen beim Frühstück setzt sich ein Händler neben dich.\nHändler: Ich habe gehört sie sind an antiken Tempeln interessiert.");
            
            nextPosition1="sprechen mit Händler";
            nextPosition2 = "AfterArtemis";
            nextPosition3 = "";

            option1button.setText("Antworten");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            
            
            ;break;
            
            case "sprechen mit Händler":
            
            nextPosition1 = "Banditen suche";
            nextPosition2 = "Linkerteil1";
            nextPosition3 = "";

            
            if(spieler.karma < 0){
            mainTextArea.setText("Was halten sie davon, wenn ich ihnen gegen eine kleine Bezahlung einen zeige? Du nimmst das Angebot an Der Händler bringt dich zu einem Tempel, doch dann, klaut er dein Portmarney und rennt in den Tempel hinein.\n Als Mörder kannst du sowas nicht gebrauchen!");
            }
            else{
            mainTextArea.setText("Was halten sie davon, wenn ich ihnen gegen eine kleine Bezahlung einen zeige? Du nimmst das Angebot an Der Händler bringt dich zu einem Tempel, doch dann, klaut er dein Portmarney und rennt in den Tempel hinein.");
            }
            
            
            option1button.setText("Tempel betreten");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 38));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            
            ;break;
            
            case "Banditen suche":
            
            nextPosition1 = "Banditen gefunden";
            nextPosition2 = "sprechen mit Händler";
            nextPosition3 = "";

            mainTextArea.setText("Du suchst nach dem Bandit aber keine Spur von ihm.\n Am Ende des Raumes ist eine Tür,allerdings erscheint eine Gruppe von Banditen bevor du ankommst.");

            option1button.setText("Suchen");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            
            ;break;
            
            case "Banditen gefunden":
            
            nextPosition1 = "Erster Bandit";
            nextPosition2 = "Banditen suche";
            nextPosition3 = "";

            mainTextArea.setText("Der Bandit, den du suchst ist nicht unter ihnen");
            
            option1button.setText("Kampf beginnen");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

            ;break;
            
            case "Erster Bandit":;
            
            // Bandit einfügen 
            spawnEnemy("Enemies", 19);
            spieler.HealthB = spieler.Health;
            optionsPanel.setVisible(false);
            mainTextPanel.setVisible(false);
                        
            mainTextArea.setText("Der zweite schleicht sich an dir heran.");
            
            
            
            ;break;
            
            case "Zweiter Bandit":
            
            //Bandit einfügen

            spawnEnemy("Enemies", 20);
            spieler.HealthB = spieler.Health;
            optionsPanel.setVisible(false);
            mainTextPanel.setVisible(false);
                        
            ;break;
            
            case "Hermes davor":
            
            mainTextArea.setText("Du öffnest die Tür zum nächsten Raum. Der Bandit steht in der Mitte. Er trägt seltsame Flügel Schuhe und eine Flügelkappe");
            
            option1button.setText("weiter");
            option2button.setText("");
            option3button.setText("");
            option4button.setText("");

            nextPosition1="Hermes davor P2";
            nextPosition2="";
            nextPosition3="";
            nextPosition4="";

            ;break;
            
            case "Hermes davor P2":

            option1button.setText("Kampf beginnen");
            option2button.setText("zurück");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

            
            if(spieler.karma <0){
            mainTextArea.setText("\"Willst du mich jetzt töten? Sowie du Artemis getötet hast\"\n\nEr geht einen Schritt auf dich zu. \n\"Ich bin Hermes, Sohn des Zeus, Gott der Händer, der Banditen und der Götterbote. \nIch werde deinem Spielchen ein Ende setzen.\"");
            }
            else{
            mainTextArea.setText("Da bist also tatsächlich drauf reingefallen. Ich bin Hermes, Sohn des Zeus, Gott der Händler, der banditen und der Götterbote. Ich werde dir zeigen, dass du es gegen mich nicht so leicht hast wie gegen Artemis");
            }
            
            nextPosition1 = "Hermes Kampf";
            nextPosition2 = "Hermes davor";
            ;break;
            
            

            case "Sequel" :

            nextPosition1 = "StoryR_6";
            nextPosition2 = "";
            nextPosition3 = "";

            
            if (spieler.HermesK == true && spieler.karma == -4){
                spieler.karma = -8;
            }
            if (spieler.HermesK == true && spieler.karma == 4){
                spieler.karma = 0;
            }

            if (spieler.HermesK == false && spieler.karma == -4){
                spieler.karma = 0;
            }

            if (spieler.HermesK == false && spieler.karma == 4){
                spieler.karma = 8;
            }
            

            mainTextArea.setText(" Du begibst dich in eine Herberge. \n\n Dort ruhst du dich bis zum nächsten Tag aus");

            option1button.setText("weiter");
            option2button.setText("");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

            break;

            case "Hermes Kampf": 
            
            spawnEnemy("Bosses", 6);
            optionsPanel.setVisible(false);
            mainTextPanel.setVisible(false);            
            ;break;

            case "After Hermes":
            if(spieler.karma>=4){
                mainTextArea.setText("Du hast also gewonnen. Und was willst du nun mit mir machen, mich töten?\n\nWillst du Hermes töten? \n > Hermes töten\n Hermes wird getötet [-4 karma] \n\n > Hermes verschonen\n Hermes wird verschont [+4 karma]");
                }
                else{
                mainTextArea.setText("Du hast also gewonnen. Komm töte mich, sowie du Artemis getötet hast\n\nWillst du Hermes töten? \n > Hermes töten\n Hermes wird getötet [-4 karma] \n\n > Hermes verschonen\n Hermes wird verschont [+4 karma]");
                }
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            option1button.setText("Hermes töten");
            option2button.setText("Hermes verschonen");
            option3button.setText("");
            nextPosition1 = "Hermes töten";
            nextPosition2 = "Hermes verschonen";
            nextPosition3 = "";

            moon_Artemis.setVisible(true);


            ;break;
            
            case "Hermes töten":
            nextPosition1 = "Sequel";
            nextPosition2 = "After Hermes";
            spieler.HermesK = true;
            option1button.setText("weiter");
            option2button.setText("zurück");
            if(spieler.karma<=0){
            mainTextArea.setText("Warte, ich will dir noch eine Sache sagen!\n Mars wird dein Untergang, er wird dich vernichten");
            }
            else{
            mainTextArea.setText("Nun gut vlt. Habe ich das verdient,aber warte noch bevor du mich tötest will ich dir eine Sache sagen. \n Töte Medusa und bring Polydektes ihren Kopf");
            


            }

            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

            ;break;
            
            case "Hermes verschonen":
            nextPosition1 = "Sequel";
            nextPosition2 = "After Hermes";

            spieler.HermesK = false;

            option1button.setText("weiter");
            option2button.setText("zurück");

            if(spieler.karma==-4){
            mainTextArea.setText("Du verschonst mich also,obwohl ich dir dein Portmarney geklaut habe und dich reingelegt habe?\n Nun gut zur Belohnung ein Tipp. Besiege die Medusa und bring ihren Kopf zu Polydektes");
            }

            else if (spieler.karma == 4){
            mainTextArea.setText("Du verschonst mich also. Leider kann ich dir nicht sagen wer dein nächster Gegner ist,aber mein Gefühl sagt mir dass du ihn garnicht suchen musst");
            }

            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            
            ;break;
            
            //Jetzt karma funktion anwenden
            case "Mars anfang 2":
            mainTextArea.setText("Ihr kommt an einem Tempel an. Mars betritt den Tempel dann du. Du bist erneut in einem Raum.Du siehst dich um");
             nextPosition1="Mars mini Kampf 1";
            ;break;
            
            
            case "Mars mini Kampf 2":
            mainTextArea.setText("(Ein Gladiator erscheint)");
            option1button.setText("Kämpfen");
            
            case "Mars Gladiator1":
            //Gladiator einfügen
            nextPosition1="nach Mars Gladiator";  
            ;break;
            
            case "nach Mars Gladiator":
            nextPosition1="nach Mars Gladiator P2";
            mainTextArea.setText("Gut du hast es geschafft.\n Du öffnest die Tür zum nächsten Raum.");
            option1button.setText("weiter");
            ;break;
            
            case "nach Mars Gladiator P2":
            nextPosition1="nach Mars Gladiator P3";
            mainTextArea.setText("Vor dir steht er also:Mars. Da bist du ja. Ich bin Ares,der Gott des Krieges und Sohn des Zeus.Ich bin dafür bekannt der blutrünstigste ,grausamste und unbarmherzigste Gott zu sein.Aber das ist belanglos");
            ;break;
            
            case "nach Mars Gladiator P3":
            nextPosition1="Mars kampf";
            mainTextArea.setText("Die information wird dir aber nichts bringen ,du wirst jetzt sterben!!!");
            option1button.setText("Kämpfen");
            ;break;
            
            case "Mars kampf":
            //Mars/Ares Einfügen
            
            nextPosition1="Ares todestext"
            ;break;
            
            case "Ares todestext":
            mainTextArea.setText("Du mistkerl! verflucht seist du!! (Ares spuckt auf dein Gesicht) Du schlägst ihm gegen sein Schädel.Und forderst ihn auf dir zu sagen wo der nächste Tempel ist. Ares:Und was wenn nicht? Töten kannst du mich nicht");
            nextPosition1="Ares todestext P2"
            ;break;
            
            case "Ares todestext P2":
            mainTextArea.setText("Du prügelts auf Ares ein bis er nachgibt.\n  ist ja gut,ist ja gut. Ich verrate es dir ja. Gehe auf dem Berg Oite dort wird dein letzter Gegner warten\n\n Willst du Ares töten");
            
            nextPosition1="Ares verschonen";
            nextPosition2="Ares töten";
            
            option1button.setText("verschonen");
            option2button.setText("töten")
            
            ;break;
            //hier next position setten   
            case "Ares töten":
            mainTextArea.setText("Du Mistkerl ich habe es dir verrat... \n\n Ares sein Kopf rollt zu Boden. Du verlässt den Tempel und suchst Rast");
            option1button.setText("weiter");
            nextPosition1="Story7xtr2";
            nextPosition2 = "After Ares";
           spieler.AresK = true;
           option1button.setText("weiter");
           option2button.setText("zurück");
           option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
           option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                                

            ;break;
            // hier auch
            
            case "Ares verschonen":
            mainTextArea.setText("Du verlässt den Tempel, um Rast zu suchen");
            nextPosition1="Story7xtr2";
            nextPosition2 = "After Ares";
            spieler.AresK = false;
            option1button.setText("weiter");
            option2button.setText("zurück");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            ;break;
            
            //nextposition setten für teil 9 dass das abgespielt werden soll


            case "StoryR_1":; 
            nextPosition1 = "StoryR_2";
            nextPosition2 = "AfterArtemis";
            nextPosition3 = "";

            if (spieler.karma == -4){
                mainTextArea.setText(" Du läufst der untergehende Sonne entgegen, und stellst dir vor, dass dein Gegner genau so untergehen wird!");
         //       nextPosition3 = "Artemis töten";
            }

            if (spieler.karma == +4){
                mainTextArea.setText(" Du läufst der untergehende Sonne entgegen.");
             //   nextPosition3 = "Artemis verschonen";

            }

            option1button.setText("weiter");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

            break;

            case "StoryR_2":; 
            nextPosition1 = "StoryR_3";
            nextPosition2 = "StoryR_1";
            nextPosition3 = "";

                mainTextArea.setText(" Nach einer Zeit hörst du den Klang nach Kithara, du folgst die Melodie, bis du auf einer großen Wiese ankommst.");

            option1button.setText("weiter");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));


            break;

            case "StoryR_3":; 

    mainTextArea.setText(" \"Schön hier nicht wahr? \n \n Ich finde die wundervolle Landschaft perfekt, von der Musik, die Kithara untermalt \n \n Jedoch... Macht deine Anwesenheit diese Idylle kaputt!\"");


nextPosition1 = "StoryR_4";
nextPosition2 = "StoryR_2";
nextPosition3 = "";


            option1button.setText("weiter");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));


            break;

            case "StoryR_4":; 

if (spieler.karma == -4){
    mainTextArea.setText(" Du bleibst stehen.. \n\n \"Ich bin Apollon, der Zwillingsbruder von der Göttin, die du eben getötet hast und die Wiese hier ist dein Grab\"");

}

if (spieler.karma == 4){
    mainTextArea.setText("\"Ich bin Apollon, der Zwillingsbruder von Athene, ich bin der Gott der Poesie, des Lichtes, der Pest und der Prophetie.\" \n\n Du bleibst stehen.. \n\n \"Und ich bin ebenfalls dein nächster Gegner\" ");

}


nextPosition1 = "Apollon Kampf";
nextPosition2 = "StoryR_3";
nextPosition3 = "";


            option1button.setText("Kampf beginnen");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));



            break;


            case "StoryR_5":; 

            
            if (spieler.karma == 4){
             //   spieler.karma = 0;
               // mainTextArea.setText(" \" Du verschonst mich also. Leider kann ich dir nicht sagen, wer dein nächster Gegner ist, aber mein Gefühl sagt mir, dass du ihn darnicht suchen musst\"");
            
            }
            
            if (spieler.karma == -4){
             //   spieler.karma = -8;
            }

    mainTextArea.setText(" \" Warte, ich will dir noch eine Sache sagen! \n\n Merkur wird dein Untergang, er wird dich vernichten!\"");


nextPosition1 = "Apollon töten";
nextPosition2 = "Last_2e";
nextPosition3 = "";

            option1button.setText("weiter");
            option2button.setText("zurück");
            option3button.setText("");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));



            break;

            case "StoryR_5;":; 
            System.out.println(spieler.karma);

            if (spieler.karma == 4){
             //   spieler.karma = 8;
               // mainTextArea.setText(" \" Du verschonst mich also. Leider kann ich dir nicht sagen, wer dein nächster Gegner ist, aber mein Gefühl sagt mir, dass du ihn darnicht suchen musst\"");
            
            }
            
            if (spieler.karma == -4){
               // spieler.karma = 0;
            }

            if (spieler.karma >= 4){
              //  spieler.karma = 8;
                mainTextArea.setText(" \" Du verschonst mich also. Leider kann ich dir nicht sagen, wer dein nächster Gegner ist, aber mein Gefühl sagt mir, dass du ihn garnicht suchen musst\"");

            }

            if (spieler.karma <= -4){
             //   spieler.karma = 0;
                mainTextArea.setText(" \" Du willst mich also verschonen. Jedoch kann ich dir dennoch nicht verziehen, was du meiner Schwester angetan hast. Allerdings kann ich dir verraten, wo du Medusa findest. Östlich von her ist ein Tempel, dort befindet sie sich. Wenn du besiegst, dannbringe ihren Kopf zu Polydektes\"");

            }

        
        
        nextPosition1 = "Apollon verschonen";
        nextPosition2 = "Last_2e";
        
        
                    option1button.setText("weiter");
                    option2button.setText("zurück");
                    option3button.setText("");
                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        
        
        
                    break;


                    case "StoryR_6":; 

                    if (spieler.karma <= -4){
                        mainTextArea.setText(" Beim Frühstück am nächsten Morgen setzt sich ein seltsamer Mann zu dir, er stellt sich dir mit Mars vor. Er fordert dich auf mit zu kommen. Du willigst ein. Ihr kommt an einem Tempel an. Mars betritt den Tempel dann du. \n\nDu bist erneut in einem Raum. Du siehst dich um.");
                        nextPosition1 = "StoryR_6+";
                        nextPosition2 = "Sequel";
                        option1button.setText("Kampf beginnen");
                        option2button.setText("");
                        option3button.setText("");
                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));     
                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 35));     

                    }

                    if (spieler.karma == 0){
                        mainTextArea.setText(" Nach dem du gefrühstückt hast, machst du dich auf dem Weg zu Medusa in Richtung osten.\n\n Irgendwann triffst du auf ein Tempel, sein Eingang ist ein riesiges, steinernes Schlangenmaul.\n Du setzt eine Augenbinde auf, um dich vor den Blicken der Medusa zu Schützen, dann gehst du hinein.");

                        nextPosition1 = "StoryR_6.";
                        nextPosition2 = "AfterApollon";
                    }

                    if (spieler.karma >= 4){
                        mainTextArea.setText(" Nach dem du gefrühstückt, gehst du nach draußen. Dort siehst du eine weiße Taube sie schaut dich seltsam an und fliegt dann los. Dein Gefühl sagt dir du solltest der Taube folgen. Du folgst ihr. Nach einiger Zeit kommt ihr an einem Tempel an die Taube fliegt hinein, du gehst ihr nach. \n\nWieder ein Raum, du wartest auf die Gegner, damit du die Tür öffnen kannst.");
                        nextPosition1 = "StoryR_6!";
                        nextPosition2 = "AfterApollon";
                        option1button.setText("Kampf beginnen");
                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        

                    }
                
                
                
                            option1button.setText("weiter");
                            option2button.setText("zurück");
                            option3button.setText("");
                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                
                
                
                            break;


                            case "StoryR_6!":; 

                            optionsPanel.setVisible(false);
                            mainTextPanel.setVisible(false);
                            spawnEnemy("Enemies", 24);
                            spieler.HealthB = spieler.Health;

                                                
                                    option1button.setText("Kampf beginnen");
                                    option2button.setText("zurück");
                                    option3button.setText("");
                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                        
                        
                        
                                    break;

                                    case "StoryR_6!!":; 

                                    optionsPanel.setVisible(false);
                                    mainTextPanel.setVisible(false);
                                    spawnEnemy("Enemies", 25);
                                    spieler.HealthB = spieler.Health;
          
                                                        
                                            option1button.setText("Kampf beginnen");
                                            option2button.setText("zurück");
                                            option3button.setText("");
                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                
                                
                                
                                            break;

                                            case "StoryR_6!!!":; 

                                            optionsPanel.setVisible(false);
                                            mainTextPanel.setVisible(false);
                                            spawnEnemy("Enemies", 26);
                                            spieler.HealthB = spieler.Health;
             
                                                                
                                                    option1button.setText("Kampf beginnen");
                                                    option2button.setText("zurück");
                                                    option3button.setText("");
                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                        
                                        
                                        
                                                    break;

                                                    case "StoryR_6!!!!":; 

                                                    optionsPanel.setVisible(false);
                                                    mainTextPanel.setVisible(false);
                                                    spawnEnemy("Enemies", 27);
                                                    spieler.HealthB = spieler.Health;
                   
                                                                        
                                                            option1button.setText("Kampf beginnen");
                                                            option2button.setText("zurück");
                                                            option3button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                
                                                
                                                
                                                            break;

                                                            case "StoryR_6!!!!!":; 

                                                            optionsPanel.setVisible(false);
                                                            mainTextPanel.setVisible(false);
                                                            spawnEnemy("Enemies", 28);
                                                            spieler.HealthB = spieler.Health;
                  
                                                                                
                                                                    option1button.setText("Kampf beginnen");
                                                                    option2button.setText("zurück");
                                                                    option3button.setText("");
                                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                        
                                                        
                                                        
                                                                    break;

                                                                    case "StoryR_6!!!!!!":; 

                                                                    optionsPanel.setVisible(false);
                                                                    mainTextPanel.setVisible(false);
                                                                    spawnEnemy("Enemies", 29);
                                                                    spieler.HealthB = spieler.Health;
               
                                                                                        
                                                                            option1button.setText("Kampf beginnen");
                                                                            option2button.setText("zurück");
                                                                            option3button.setText("");
                                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                
                                                                
                                                                
                                                                            break;

                            case "StoryR_6+":; 

                            optionsPanel.setVisible(false);
                            mainTextPanel.setVisible(false);
                            spawnEnemy("Enemies", 9);
                            spieler.HealthB = spieler.Health;
           
                        
                        nextPosition1 = "StoryR_6++";
                        nextPosition2 = "StoryR_6";
                        
                                    option1button.setText("Kampf beginnen");
                                    option2button.setText("zurück");
                                    option3button.setText("");
                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                        
                        
                        
                                    break;

                                    case "StoryR_6++":; 

                                    optionsPanel.setVisible(false);
                                    mainTextPanel.setVisible(false);
                                    spawnEnemy("Enemies", 10);
                                    spieler.HealthB = spieler.Health;
                     
                                
                                nextPosition1 = "StoryR_6+++";
                                
                                            option1button.setText("Nächster Gegner");
                                            option2button.setText("");
                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                
                                
                                
                                            break;

                                            case "StoryR_6+++":; 

                                            optionsPanel.setVisible(false);
                                            mainTextPanel.setVisible(false);
                                            spawnEnemy("Enemies", 11);
                                            spieler.HealthB = spieler.Health;
                  
                                        
                                        nextPosition1 = "StoryR_6++++";
                                        
                                                    option1button.setText("Nächster Gegner");
                                                    option2button.setText("");
                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                        
                                        
                                        
                                                    break;

                                                    case "StoryR_6++++":; 

                                                    optionsPanel.setVisible(false);
                                                    mainTextPanel.setVisible(false);
                                                    spawnEnemy("Enemies", 12);
                                                    spieler.HealthB = spieler.Health;
                       
                                                
                                                nextPosition1 = "StoryR_6+++++";
                                                
                                                            option1button.setText("Nächster Gegner");
                                                            option2button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                
                                                
                                                
                                                            break;

                                                            case "StoryR_6+++++":; 

                                                    optionsPanel.setVisible(false);
                                                    mainTextPanel.setVisible(false);
                                                    spawnEnemy("Enemies", 13);
                                                    spieler.HealthB = spieler.Health;
                      
                                                
                                                nextPosition1 = "StoryR_6++++++";
                                                
                                                            option1button.setText("letzter Gladiator");
                                                            option2button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                
                                                
                                                
                                                            break;

                                                            case "StoryR_6++++++":; 

                                                    optionsPanel.setVisible(false);
                                                    mainTextPanel.setVisible(false);
                                                    spawnEnemy("Enemies", 14);
                                                    spieler.HealthB = spieler.Health;
                       
                                                
                                                nextPosition1 = "StoryR_6+++++++";
                                                
                                                            option1button.setText("weiter");
                                                            option2button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                
                                                
                                                
                                                            break;

                                                            case "After Gladiators":; 

                                                    optionsPanel.setVisible(true);
                                                    mainTextPanel.setVisible(true);
                                                                                   
                                                    mainTextArea.setText(" Gut du hast es geschafft. Du öffnest die Tür zum nächsten Raum. \n \nVor dir steht er also: Mars.");

                                                nextPosition1 = "After Gladiators2";
                                                
                                                            option1button.setText("weiter");
                                                            option2button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                
                                                
                                                
                                                            break;


                                                            case "After Gladiators2":; 

                                                            optionsPanel.setVisible(true);
                                                            mainTextPanel.setVisible(true);
                                                                                           
                                                            mainTextArea.setText("\"Da bist du ja. Ich bin Ares, der Gott des blutrünstigen Krieges und Sohn des Zeus.  Ich bin dafür bekannt der blutrünstigste, grausamste und unbarmherzigste Gott zu sein. Aber das ist belanglos, denn die Information bringt einem Toten nichts! Also sag mir, wie willst du sterben? Muhahaha\"");
        
                                                        nextPosition1 = "Ares Kampf";
                                                        
                                                                    option1button.setText("Kampf beginnen");
                                                                    option2button.setText("");
                                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 38));        
                                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                        
                                                        
                                                        
                                                                    break;


                                                                    case "Ares Kampf":; 

                                                                    optionsPanel.setVisible(false);
                                                                    mainTextPanel.setVisible(false);
                                                                                                   
                                                                                
                                                                    spawnEnemy("Bosses", 8);
                                                                    spieler.HealthB = spieler.Health;

                                                                            option1button.setText("weiter");
                                                                            option2button.setText("");
                                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                
                                                                
                                                                
                                                                            break;


                                                                            case "After Ares":; 

                                                                            optionsPanel.setVisible(true);
                                                                            mainTextPanel.setVisible(true);

                                                                            nextPosition1 = "Ares töten";
                                                                            nextPosition2 = "Ares verschonen";

                                                                                                           
                                                                            mainTextArea.setText(" Willst du Ares töten? \n > Ares töten\n Ares wird getötet [-4 karma] \n\n > Ares verschonen\n Ares wird verschont [+4 karma]");

                                                                                    option1button.setText("Ares töten");
                                                                                    option2button.setText("Ares verschonen");
                                                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 38));        
                                                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
                                                                        
                                                                        
                                                                        
                                                                                    break;



                                                            case "StoryR_6+++++++":; 

                                                    optionsPanel.setVisible(true);
                                                    mainTextPanel.setVisible(true);
                                                    mainTextArea.setText(" Du gehst in den nächsten Raum, dort siehst du eine Frau in Gladiator Rüstung.\n\n \"Ich bin Athene, die Göttin des taktischen und friedlichen Krieg und eine Schwester des Zeus.\"");
                                                                                   
                                                
                                                nextPosition1 = "StoryR_6++++++++";

                                                            option1button.setText("weiter");
                                                            option2button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                
                                                
                                                
                                                            break;

                                                            case "StoryR_6++++++++":; 

                                                            optionsPanel.setVisible(true);
                                                            mainTextPanel.setVisible(true);
                                                            mainTextArea.setText(" Du gehst ein paar Schritte auf Athene zu. \n\n \"Ich werde dafür sorgen, dass die Gerechtigkeit siegt\"");
                                                                                           
                                                        
                                                        nextPosition1 = "StoryR_6+++++++++";
                                                        nextPosition2 = "StoryR_6+++++++";

                                                                    option1button.setText("weiter");
                                                                    option2button.setText("zurück");
                                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                        
                                                        
                                                        
                                                                    break;

                                                                    case "StoryR_6+++++++++":; 

                                                                    optionsPanel.setVisible(false);
                                                                    mainTextPanel.setVisible(false);
spawnEnemy("Bosses", 3);                                                                                                   
spieler.HealthB = spieler.Health;
                                              
                                                                nextPosition1 = "StoryR_6++++++++++";
                                                                
                                                                            option1button.setText("weiter");
                                                                            option3button.setText("");
                                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                
                                                                
                                                                
                                                                            break;

                                                                            case "StoryR_6++++++++++":; 

                                                                            optionsPanel.setVisible(true);
                                                                            mainTextPanel.setVisible(true);

                                                                            mainTextArea.setText(" Du hast also gewonnen. Mein Respekt.\n Dein nächster Gegner wartet auf den Berg Oite auf dich, er ist dein letzter vor Zeus");
                                                                        
                                                                        nextPosition1 = "StoryR_6+++++++++++";

                                                                        Font f = new Font("Times new Roman", Font.PLAIN, 40);
                                                                        
                                                                                    option1button.setText("weiter");
                                                                                    option3button.setText("");
                                                                                    option1button.setFont(f);        
                                                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                        
                                                                        
                                                                        
                                                                                    break;

                                                        

                                                                                    case "StoryR_6+++++++++++":; 

                                                                                    optionsPanel.setVisible(true);
                                                                                    mainTextPanel.setVisible(true);
        
                                                                                    mainTextArea.setText(" Willst du Athene töten? \n > Athene töten\n Athene wird getötet [-4 karma] \n\n > Athene verschonen\n Athene wird verschont [+4 karma]");
                                                                                
                                                                                nextPosition1 = "Athene töten";
                                                                                nextPosition2 = "Athene verschonen";

                                                                                
                                                                                            option1button.setText("Athene töten");
                                                                                            option2button.setText("Athene verschonen");
                                                                                            option3button.setText("");
                                                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                                                                
                                                                                
                                                                                
                                                                                            break;

                                                                                            case "Athene töten":; 

                                                                                    optionsPanel.setVisible(true);
                                                                                    mainTextPanel.setVisible(true);
        
                                                                                    mainTextArea.setText(" \"Wenn du mich töten willst dann sei es so.\" \nAthenes Kopf rollt zu Boden\n\n Du verlässt den Tempel und suchst Rast");
                                                                                
                                                                                    nextPosition1 = "Story7xtr";
                                                                                    nextPosition2 = "StoryR_6+++++++++++";
                                                                                    
                                                                                
                                                                                            option1button.setText("weiter");
                                                                                            option2button.setText("zurück");
                                                                                            option3button.setText("");
                                                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                                
                                                                                
                                                                                
                                                                                            break;

                                                                                            case "Athene verschonen":; 

                                                                                    optionsPanel.setVisible(true);
                                                                                    mainTextPanel.setVisible(true);

                                                                                    nextPosition1 = "Story7xtr";
                                                                                    nextPosition2 = "StoryR_6+++++++++++";
        
                                                                                    mainTextArea.setText(" \"Ich habe es ja gesagt.\" \n\nDie Gerechtigkeit wird gewinnen");
                                                                                
                                                                                    
                                                                                
                                                                                    option1button.setText("weiter");
                                                                                    option2button.setText("zurück");
                                                                                            option3button.setText("");
                                                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                                                
                                                                                
                                                                                
                                                                                            break;



                            case "StoryR_6.":; 

                           
                                mainTextArea.setText(" Auf dem Boden sind überall Schlangen auf einmal. \n\nEs kommen aus allen Ecken Gorgonen!");
                        
                        
                        nextPosition1 = "StoryR_6..";
                        nextPosition2 = "StoryR_6";
                        
                                    option1button.setText("Kampf beginnen");
                                    option2button.setText("zurück");
                                    option3button.setText("");
                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                        
                        
                        
                                    break;

                                    case "StoryR_6..":; 

                                    optionsPanel.setVisible(false);
                                    mainTextPanel.setVisible(false);
                           spawnEnemy("Enemies", 21);
                           spieler.HealthB = spieler.Health;

                                    mainTextArea.setText(" Auf dem Boden sind überall Schlangen auf einmal. \n\nEs kommen aus allen Ecken Gorgonen!");
                            
                            
                            nextPosition1 = "Gorgon1";
                            nextPosition2 = "StoryR_6";
                            
                                        option1button.setText("weiter");
                                        option2button.setText("zurück");
                                        option3button.setText("");
                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                            
                            
                            
                                        break;

                                        
                                    case "StoryR_6...":; 

                                    optionsPanel.setVisible(false);
                                    mainTextPanel.setVisible(false);
                           spawnEnemy("Enemies", 22);
                           spieler.HealthB = spieler.Health;

                                    mainTextArea.setText(" Auf dem Boden sind überall Schlangen auf einmal. \n\nEs kommen aus allen Ecken Gorgonen!");
                            
                            
                            nextPosition1 = "Gorgon2";
                            nextPosition2 = "StoryR_6";
                            
                                        option1button.setText("weiter");
                                        option2button.setText("zurück");
                                        option3button.setText("");
                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                            
                            
                            
                                        break;

                                        case "StoryR_6....":; 

                                        optionsPanel.setVisible(false);
                                        mainTextPanel.setVisible(false);
                               spawnEnemy("Enemies", 23);
                               spieler.HealthB = spieler.Health;

                                        mainTextArea.setText(" Auf dem Boden sind überall Schlangen auf einmal. \n\nEs kommen aus allen Ecken Gorgonen!");
                                
                                
                                nextPosition1 = "Gorgon3";
                                nextPosition2 = "StoryR_6";
                                
                                            option1button.setText("weiter");
                                            option2button.setText("zurück");
                                            option3button.setText("");
                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                
                                
                                
                                            break;

                                            case "StoryR_6.....":; 

                                            mainTextArea.setText(" Du hast die Gorgonen besiegst.\nJetzt hörst du plötzlich eine weibliche Stimme.\n\"Weißt du, dass ich so aussehe ist alleine Poseidons Schuld! Er vergewaltigte mich, dieser Mistkerl. Als Athene dass sah war sie so erzürnt, dass sie mich in dieses Etwas verwandelte. Seitdem tauchen hier ständig Leute auf die mich töten wollen.\" \n Sie bricht in tränen aus. \n\"Stirb!\"");



                                    
                                    
                                    nextPosition1 = "Medusa Fight";
                                    nextPosition2 = "";
                                    
                                                option1button.setText("Kampf beginnen");
                                                option2button.setText("zurück");
                                                option3button.setText("");
                                                option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                    
                                    
                                    
                                                break;


                                                case "StoryR_6......":; 

                                                mainTextArea.setText(" Du ziehst dein Schwert rennst auf Polydektes zu, er zieht den Kopf der Medusa und will ihn auf dich richten, allerdings schlägst du ihm vorher die Hand ab.\"Aaaaaah, du Mistker!\".Du forderst ihm auf dir zu sagen wo der nächste Tempel ist.\"Ist ja gut ich errate es dir ja. Geh zum Berg Oite, dort wartet der letzte Gegner dem du vor Zeus bekämpfen musst. Er ist auf dem Berg Oite\"");
    
    
    
                                        
                                        
                                        nextPosition1 = "StoryR_6.......";
                                        nextPosition2 = "Last_3e";
                                        
                                                    option1button.setText("weiter");
                                                    option2button.setText("zurück");
                                                    option3button.setText("");
                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                        
                                        
                                        
                                                    break;

                                                    case "StoryR_6.......":; 
                                                    spieler.PolydektesK = null;

                                                    mainTextArea.setText(" Willst du Polydektes töten? \n > Polydektes töten\n Polydektes wird getötet [-4 karma] \n\n > Polydektes verschonen\n Polydektes wird verschont [+4 karma]");
        
        
        
                                            
                                            
                                            nextPosition1 = "Polydektes töten";
                                            nextPosition2 = "Polydektes verschonen";
                                            
                                                        option1button.setText("Polydektes töten");
                                                        option2button.setText("Polydektes verschonen");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 25));
                                            
                                            
                                            
                                                        break;

                                                        

                                                            case "Polydektes töten":; 
                                                            spieler.PolydektesK = true;

                                                        mainTextArea.setText(" Du hebst den Kopf der Medusa vom Boden auf und richtet ihn auf Polydektes \n\nMit einem letzten Schrei wird er zu Stein. Du suchst vor Erschöpfung Rast.");
            
            
            
                                                
                                                
                                                nextPosition1 = "Story7";
                                                nextPosition2 = "StoryR_6........";
                                                
                                                            option1button.setText("weiter");
                                                            option2button.setText("zurück");
                                                            option3button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                
                                                
                                                
                                                            break;

                                                            case "Polydektes verschonen":; 
spieler.PolydektesK = false;
                                                        mainTextArea.setText(" Du verschwindest vom Ort und suchst Rast");
            
            
                                                
                                                
                                                nextPosition1 = "Story7";
                                                nextPosition2 = "StoryR_6........";
                                                
                                                            option1button.setText("weiter");
                                                            option2button.setText("zurück");
                                                            option3button.setText("");
                                                            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                                
                                                
                                                
                                                            break;

                                                            case "Story7":; 



                                                            if (spieler.PolydektesK == true){
                                                                spieler.karma-=4;
                                                            }

                                                            if (spieler.PolydektesK == false){
                                                                spieler.karma+=4;
                                                            }

                                                           


                
                
                                                    if (spieler.karma <0){
                                                        mainTextArea.setText(" Du wachst am Morgen auf.\n\n Albträume haben dich die ganze Nacht über geplagt. Du hast das Gefühl, dass die Seelen derer die du getötet hast auf deinen Schultern lasten.\n\nWillst du ihnen nachgehen oder zum Berg Oite?");
                                                        nextPosition1 = "Story7L";
                                                        nextPosition2 = "Story7M";

                                                        option1button.setText("Seelen nachgehen");
                                                        option2button.setText("Zum Berg Oite");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                                    }

                                                    if (spieler.karma >0){
                                                        mainTextArea.setText(" Du wachst am Morgen auf, frühstückst in Ruhe und machst dich dann auf den Weg zum Berg Oite.\n\nUnterwegs kommst du am Strand vorbei, du fühlst wie das Meer nach dir ruft\n\n Willst du näher zum Meer oder zum Berg Oite?");
                                                        nextPosition1 = "Story7R";
                                                        nextPosition2 = "Story7M";

                                                        option1button.setText("Zu Wasser");
                                                        option2button.setText("Zum Berg Oite");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                                    }

                                                    break;
                                                    

                                                    case "Story7xtr":; 

                                                    if (spieler.ApollonK == true){
                                                        spieler.karma-=4;
                                                    }

                                                    if (spieler.ApollonK == false){
                                                        spieler.karma+=4;
                                                    }

        
        
        
                                            if (spieler.karma <0){
                                                mainTextArea.setText(" Du wachst am Morgen auf.\n\n Albträume haben dich die ganze Nacht über geplagt. Du hast das Gefühl, dass die Seelen derer die du getötet hast auf deinen Schultern lasten.\n\nWillst du ihnen nachgehen oder zum Berg Oite?");
                                                nextPosition1 = "Story7L";
                                                nextPosition2 = "Story7M";

                                                option1button.setText("Seelen nachgehen");
                                                option2button.setText("Zum Berg Oite");
                                                option3button.setText("");
                                                option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));        
                                                option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                            }

                                            if (spieler.karma >0){
                                                mainTextArea.setText(" Du wachst am Morgen auf, frühstückst in Ruhe und machst dich dann auf den Weg zum Berg Oite.\n\nUnterwegs kommst du am Strand vorbei, du fühlst wie das Meer nach dir ruft\n\n Willst du näher zum Meer oder zum Berg Oite?");
                                                nextPosition1 = "Story7R";
                                                nextPosition2 = "Story7M";
                                            
                                                option1button.setText("zu Wasser");
                                                option2button.setText("Zum Berg Oite");
                                                option3button.setText("");
                                                option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));        
                                                option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                            }
                                           
                                            
                                            

                                            break;


                                            case "Story7xtr2":; 

                                            if (spieler.AresK == true){
                                                spieler.karma-=4;
                                            }


                                            if (spieler.AresK == false){
                                                spieler.karma+=4;
                                            }




                                    if (spieler.karma <0){
                                        mainTextArea.setText(" Du wachst am Morgen auf.\n\n Albträume haben dich die ganze Nacht über geplagt. Du hast das Gefühl, dass die Seelen derer die du getötet hast auf deinen Schultern lasten.\n\nWillst du ihnen nachgehen oder zum Berg Oite?");
                                        nextPosition1 = "Story7L";
                                        nextPosition2 = "Story7M";

                                        option1button.setText("Seelen nachgehen");
                                        option2button.setText("Zum Berg Oite");
                                        option3button.setText("");
                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));        
                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                    }

                                    if (spieler.karma >0){
                                        mainTextArea.setText(" Du wachst am Morgen auf, frühstückst in Ruhe und machst dich dann auf den Weg zum Berg Oite.\n\nUnterwegs kommst du am Strand vorbei, du fühlst wie das Meer nach dir ruft\n\n Willst du näher zum Meer oder zum Berg Oite?");
                                        nextPosition1 = "Story7R";
                                        nextPosition2 = "Story7M";
                                    
                                        option1button.setText("zu Wasser");
                                        option2button.setText("Zum Berg Oite");
                                        option3button.setText("");
                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));        
                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                                    }
                                   
                                    
                                    

                                    break;


                                        

                                                    case "Story7R":; 


                                                        mainTextArea.setText(" Du wirst ins Wasser gerissen\n\n Du versuchst nach oben zu schwimmen, aber Irgendwas zieht dich nach unten.\n Du denkst , dass du Bald ertrinken wirst. Dann plötzlich bekommst du wieder Luft.\n Du bist in einer gigantischen Luftblase unter Wasser, vor dir steht dein letzter Tempel");
                                                        nextPosition1 = "Story7R_2";
                                                        nextPosition2 = "Story7xtr";
                                                    
                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7R_2":; 


                                                        nextPosition1 = "Story7R_3";
                                                        nextPosition2 = "Story7R";

                                                        if (spieler.karma <= -12){
                                                            mainTextArea.setText(" Du gehst auf den Tempel zu und betriffst ihn.");

                                                        }

                                                        if (spieler.karma > -12){
                                                            mainTextArea.setText(" Entschlossen gehst du auf den Tempel zu und betrittst ihn.                                                            ");


                                                        }
                                                    
                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7R_3":; 


                                                        nextPosition1 = "Story7R_4";
                                                        nextPosition2 = "Story7R_2";

                                                            mainTextArea.setText("Der Tempel ist von innen mit Korallen bewachsen. Du siehst Delphine durch die Luft schwimmen, sie greifen an!.");
                                                    
                                                        option1button.setText("Kampf beginnen");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7R_4":; 


                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);
                                                        spawnEnemy("Enemies", 16);
                                                        spieler.HealthB = spieler.Health;

                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7R_5":; 

                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);
                                                        spawnEnemy("Enemies", 17);
                                                        spieler.HealthB = spieler.Health;

                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        
                                                        case "Story7R_6":; 

                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);
                                                        spawnEnemy("Enemies", 18);
                                                        spieler.HealthB = spieler.Health;

                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7R_7":; 

                                                        nextPosition1 = "Poseidon Kampf";
                                                        optionsPanel.setVisible(true);
                                                        mainTextPanel.setVisible(true);
                                                        mainTextArea.setText(" \"Hahaha, ich bin Poseidon, der Gott des meeres und Bruder des zeus. Du scheinst ja kein schlechter Kerl zu sein, sowie ich es erwartet habe. Hahaha.\n\nAber ich habe nun einmal die Aufgabe meinen Bruder zu beschützen. Also komm kämpfen wir!\"");

                                                        option1button.setText("Kampf beginnen");
                                                        option2button.setText("");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Poseidon Kampf":; 

                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);

                                                        spawnEnemy("Bosses", 7);
                                                        setSpecialWeapon("W");
                                                        spieler.HealthB = spieler.Health;

                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7L":; 


                                                        mainTextArea.setText(" Innerhalb von wenigen Sekunden befindest du dich auf einmal in einem dunklen Gebiet, überall fliegen die Seelen der verstorbenen herum.\n\n Einige erscheinen vor dir.\n\n Es sind die, die du getötet hast.");
                                                        nextPosition1 = "Story7L_2";
                                                        nextPosition2 = "Story7xtr";

                                                        option1button.setText("Kampf beginnen");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7L_2":; 


                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);
                                                        spawnEnemy("Enemies", 5);
                                                        spieler.HealthB = spieler.Health;

                                                        mainTextArea.setText(" Innerhalb von wenigen Sekunden befindest du dich auf einmal in einem dunklen Gebiet, überall fliegen die Seelen der verstorbenen herum.\n\n Einige erscheinen vor dir.\n\n Es sind die, die du getötet hast.");
                                                        nextPosition2 = "Story7L";

                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7L_3":; 


                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);
                                                        spawnEnemy("Enemies", 6);
                                                        spieler.HealthB = spieler.Health;

                                                        mainTextArea.setText(" Innerhalb von wenigen Sekunden befindest du dich auf einmal in einem dunklen Gebiet, überall fliegen die Seelen der verstorbenen herum.\n\n Einige erscheinen vor dir.\n\n Es sind die, die du getötet hast.");

                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7L_4":; 

                                                        spawnEnemy("Enemies", 7);
                                                        spieler.HealthB = spieler.Health;

                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);
                                                      //  mainTextArea.setText(" \"Applaus, Applaus. Sehr gut wie du die die du bereits getötet, nochmal tötest.\"\"Ich bin Hades, der Gott der Unterwelt, und ein Bruder von Zeus. Du fragst dich vielleicht was du hier macht, nun gut das war ich! Ich wollte dass du nochmal gegen die Leute die du getötet hast kämpfst und dein nächster Gegner bin ich.\"");



                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        
                                                        case "Story7L_5":; 
                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);
                                                        spawnEnemy("Enemies", 8);
                                                        spieler.HealthB = spieler.Health;

                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7L_6":; 

                                                        optionsPanel.setVisible(true);
                                                        mainTextPanel.setVisible(true);
                                                        mainTextArea.setText(" \"Applaus, Applaus. Sehr gut wie du die die du bereits getötet, nochmal tötest.\"Ich bin Hades, der Gott der Unterwelt, und ein Bruder von Zeus. Du fragst dich vielleicht was du hier macht, nun gut das war ich! Ich wollte dass du nochmal gegen die Leute die du getötet hast kämpfst und dein nächster Gegner bin ich.\"");


                                                        nextPosition1 = "Hades Kampf";
                                                        nextPosition2 = "";

                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Hades Kampf":; 

                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false);
                                                        spawnEnemy("Bosses", 4);
                                                        setSpecialWeapon("W");
                                                        spieler.HealthB = spieler.Health;

                                                        mainTextArea.setText("\"Herzlichen, herzlichen Glückwunsch! Du hast also gewonnen. Los komm töte mi…\"\n\nDu hast Hades den Kopf abgehackt, du bist wieder an der Oberfläche.");
                                                        mainTextArea.setText(" \"Applaus, Applaus. Sehr gut wie du die die du bereits getötet, nochmal tötest.\"Ich bin Hades, der Gott der Unterwelt, und ein Bruder von Zeus. Du fragst dich vielleicht was du hier macht, nun gut das war ich! Ich wollte dass du nochmal gegen die Leute die du getötet hast kämpfst und dein nächster Gegner bin ich.\"");


                                                      //  nextPosition1 = "Story7L_4";
                                                        nextPosition2 = "";

                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7M":; 

                                                        
                
                                                   

                                                        mainTextArea.setText(" Du gehst zum Berg Oite. Du Reist schon mehrere Tage.\nBis du an einem Schild ankommst. \" Berg Oite\". \n Du blickst hinauf und fängst dann an den Pfad hochzulaufen");
                                                        nextPosition1 = "Story7M_2";
                                                        nextPosition2 = "Story7xtr";
                                                    
                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7M_2":; 

                                                        
                
                                                   

                                                        mainTextArea.setText(" Nach einem sehr anstrengenden Weg kommst du oben an.\nAuch hier ist ein Tempel.\nDu betriffst den Tempel\nDu bist in einem gigantischen Raum, viel größer alle, in denen du zuvor warst. \n\nDu siehst den Gott durch den Raum laufen. Er trägt ein riesigen Löwenpelz");


                                                        nextPosition1 = "Story7M_3";
                                                        nextPosition2 = "Story7M";

                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7M_3":; 

                                                        
                
                                                   

                                                        mainTextArea.setText(" Du überlegst inh anzugreifen allerdings fängt zuvor an zu reden.\n\n\"Mein Name ist Herkules, ich bin ein Halb Gott und ein Sohn von Zeus. Ich habe 12 unlösbare Aufgaben erledigt, darunter den nemischen Löwen besiegen oder eine Hydra zu vernichten. Unde wo wir gerade bei Hydra sind, bevor du mich besiegen kannst musst du gegen ihn hier kämpfen\"");


                                                        nextPosition1 = "Story7M_4";
                                                    nextPosition2 = "Story7M_2";
                                                        option1button.setText("weiter");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        
                                                        case "Story7M_4":; 

                                                        
                
                                                   

                                                        mainTextArea.setText(" Eine Hydra erscheint wie aus dem nichts");


                                                        nextPosition1 = "Story7M_5";
                                                    nextPosition2 = "Story7M_3";
                                                        option1button.setText("Kampf beginnen");
                                                        option2button.setText("zurück");
                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Story7M_5":;
                                                        
                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false); 
                                                        nextPosition1 = "Hydra Kampf";

                                                        spawnEnemy("Enemies", 15);
                                                        spieler.HealthB = spieler.Health;

                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;

                                                        case "Heraktles Kampf":;
                                                        
                                                        optionsPanel.setVisible(false);
                                                        mainTextPanel.setVisible(false); 

                                                        spawnEnemy("Bosses", 5);
                                                        setSpecialWeapon("W");
                                                        spieler.HealthB = spieler.Health;

                                                        option3button.setText("");
                                                        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));        
                                                        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                            
                                            
                                                        break;
                                                   
                                                    
                                                    case "Last_3e":; 

                                                    mainTextPanel.setVisible(true);
optionsPanel.setVisible(true);
mainTextArea.setText("Du schlägst der Medusa den Kopf ab. Daraufhin gehst du zu Polydektes.\"Du hast die Medusa getötet? Na dann gib ihn mir doch.\" sagt Polydektes genervt.\nDu fragst ihn wo der nächste Tempel ist.\n\n\"Warum sollte ich dir das verraten? Nur weil du mir den Kopf der Medusa gegeben hast? Da musst du mir schon mehr geben!\"");


option1button.setText("weiter");
option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
option2button.setText("");
nextPosition1 = "StoryR_6......";
nextPosition2 = "";

                                            
                                                        break;
                                                    
                                                case "Medusa Fight":;    
                                        
                                                optionsPanel.setVisible(false);
                                                mainTextPanel.setVisible(false);
                                        
spawnEnemy("Bosses", 0);
setSpecialWeapon("W");
spieler.HealthB = spieler.Health;

                                                nextPosition2 = "";
                                        
                                                    option1button.setText("weiter");
                                                    option2button.setText("zurück");
                                                    option3button.setText("");
                                                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));        
                                                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                                        
                                        
                                        
                                                    break;
    


                    case "Last_2e":


                    if (spieler.karma == 8){
                     //   spieler.karma = 4;
                       // mainTextArea.setText(" \" Du verschonst mich also. Leider kann ich dir nicht sagen, wer dein nächster Gegner ist, aber mein Gefühl sagt mir, dass du ihn darnicht suchen musst\"");
                    
                    }
                    
                    if (spieler.karma == 0){
                     //   spieler.karma = -4;
                    }
                   
                    
                    mainTextPanel.setVisible(true);
                    nextPosition1 = "StoryR_5";
                    nextPosition2 = "StoryR_5;";
                    option1button.setText("Apollon töten");
                    option2button.setText("Apollon verschonen");
                    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
                    
                    if (spieler.karma <= -4){
                        mainTextArea.setText("\"Du hast also gewonnen. Komm töte mich, sowie du meine Schwester getötet hast\" \n\nWillst du Apollon töten? \n > Apollon töten\n Apollon wird getötet [-4 karma] \n\n > Apollon verschonen\n Apollon wird verschont [+4 karma]");
                    
                    }
                    
                    if (spieler.karma >= 4){
                        mainTextArea.setText("\"Du hast gewonnen. Komm töte mich \"\n\nWillst du Apollon töten? \n > Apollon töten\n Apollon wird getötet [-4 karma] \n\n > Apollon verschonen\n Apollon wird verschont [+4 karma]");
                    }
                    
                    
                    optionsPanel.setVisible(true);
                    
        
                    ;break;            
        

            case "Apollon Kampf":

            moon_Artemis.setVisible(true);

            mainTextPanel.setVisible(false);
            optionsPanel.setVisible(false);

            spawnEnemy("Bosses", 2);
            spieler.HealthB = spieler.Health;

            setSpecialWeapon("W");


            ;break;            



            case "Sachen Equippen":; 

           
            playerInfoPower.setForeground(scl.weaponsColor[0]);
                    playerInfoPower.setText(scl.weaponsPower[0] + "x");
                    spieler.powerBoostIcon = scl.i[0];
                    spieler.powerBoost = scl.weaponsPower[0];
                    boostDamageText.setForeground(scl.weaponsColor[0]);
                    playerInfoPower.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\weapons\\Standard Schwert.png").getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING)));
                    spieler.powerBoostName = "Standard Schwert";
                    choose_Element.setText(" Equipped ");

                        
                            playerInfoHPShield.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Shields\\Standard shield.png").getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING)));
                            spieler.hpBoostName = "Standard Shield";
                            spieler.hpBoost = 1.05f;
                                        choose_Element.setText(" Equipped ");
                                        mainTextArea.setText(" Sachen wurden erfolgreich ausgerüstet");
            break;


            case "Tempel betreten":
            mainTextArea.setText("Du gehst in den Tempel, die ganzen Besucher, die eben noch überall waren sind wie vom Erdboden verschluckt. \n \n Du siehst eine Tür am Ende des Raumes, du läufst auf sie zu, aber sie geht nicht auf. An der Tür steht eingraviert; \"Besiege die Gegner, damit sich die Tür öffnet\" \n \n Du drehst dich wieder um");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option1button.setText("weiter");
            option2button.setText("zurück");
            option3button.setText("");
            nextPosition1 = "Erster Gegner";
            nextPosition2 = "Anfangpart7";

            ;break;

            case "Erster Gegner":
            mainTextArea.setText("[(Wütender) Hirsch] ist erschienen!");
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            option1button.setText("Kampf beginnen");
            option2button.setText("");
            option3button.setText("");
            nextPosition1 = "Erster Gegner Kampf";
            nextPosition2 = "";

            ;break;

            case "Erster Gegner Kampf":
            mainTextPanel.setVisible(false);
            optionsPanel.setVisible(false);

            spawnEnemy("Enemies", 1);
            spieler.HealthB = spieler.Health;

           // nextPosition1 = "Zweiter Gegner Kampf";
            ;break;

            case "Zweiter Gegner Kampf":
            mainTextPanel.setVisible(false);
            optionsPanel.setVisible(false);

            spawnEnemy("Enemies", 2);
            spieler.HealthB = spieler.Health;

         //   nextPosition1 = "Dritter Gegner Kampf";
            ;break;

            case "Dritter Gegner Kampf":
            mainTextPanel.setVisible(false);
            optionsPanel.setVisible(false);

            spawnEnemy("Enemies", 3);
            spieler.HealthB = spieler.Health;

         //   nextPosition1 = "Vierter Gegner Kampf";
            ;break;

            case "Vierter Gegner Kampf":
            mainTextPanel.setVisible(false);
            optionsPanel.setVisible(false);

            spawnEnemy("Enemies", 4);
            spieler.HealthB = spieler.Health;

          //  nextPosition1 = "Anfangpart8";
            ;break;


           
            case "Hermes davor P3":
            
            mainTextArea.setText("Ich bin Hermes, Sohn des Zeus, Gott der Händler und der Banditen und der Götterbote. Ich werde dir zeigen ,dass du es gegen mich nicht so leicht hast wie gegen Artemis");
            
            option1button.setText("Kämpfen");
            
            ;break; 
            

            
           
            //Jetzt karma funktion anwenden
           
            
            //nextposition setten für teil 9 dass das abgespielt werden soll
            
            
            case "End":
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            mainTextArea.setText("Nach ein paar Tagen geschieht es, Zeus lädt dich Zeus in den Olymp ein. Du nimmst die Einladung an.\n\nPlötzlich bist du in einem Palast, aus Wolken. Vor dir ist eine Tür. Du öffnest sie \n\nDu läufst zwischen verschiedenen Göttern her.");
            
            option1button.setText("weiter");
            option2button.setText("");
            nextPosition1 = "End2";
nextPosition2 = "";
            ;break; 

            case "End2":
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            if (spieler.karma <0){
                mainTextArea.setText("Hasserfüllt und ängstlich schauen sie dich an\n\nDu gehst an ihnen vorbei auf die nächste Tür zu.\nDu öffnest sie");

            }
            else{
                mainTextArea.setText("Lächelnd schauen sie dich an\n\nDu gehst an ihnen vorbei auf die nächste Tür zu.\nDu öffnest sie");
            }
            
            option1button.setText("weiter");
            option2button.setText("zurück");
            nextPosition1 = "End3";
            nextPosition2 = "End";

            ;break; 

            case "End3":
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            if (spieler.karma <0){
                mainTextArea.setText("\"Du kleiner Mistkerl, wie kannst du es wagen, meine Kinder getötet zu haben?\"");

            }
            else{
                mainTextArea.setText("Nun wird sich zeigen, ob du es Wert bist, gegen mich zu kämpfen");
            }
            
            option1button.setText("weiter");
            option2button.setText("zurück");
            nextPosition1 = "End4";
            nextPosition2 = "End2";

            ;break; 


            case "End4":
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
                mainTextArea.setText("\"Jetzt stehen wir uns endlich Angesicht zu Angesicht gegenüber. Gott oder Mensch wer wied gewinnen?\"");

            
            option1button.setText("Kampf beginnen");
            option2button.setText("zurück");
            nextPosition1 = "Zeus Kampf";
            nextPosition2 = "End3";

            ;break; 

            case "Zeus Kampf":
            
            optionsPanel.setVisible(false);
            mainTextPanel.setVisible(false);
            nextPosition1 = "Zeus Kampf";
            spawnEnemy("Bosses", 9);
            spieler.HealthB = spieler.Health;

            option1button.setText("weiter");
            option2button.setText("zurück");

            ;break; 

            case "End5":
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            mainTextArea.setText("\"Genug geredet!\"\n\nDu schaust dich um. Wer hat da geredet? Ihr wart doch alleine.\n\nDa bemerkst du den alten Mann, der dir den Auftrag aufgegeben hat");

        
        option1button.setText("weiter");
        option2button.setText("");
        nextPosition1 = "End6";
        nextPosition2 = "";

        ;break;

        case "End6":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
            mainTextArea.setText("\"Ich muss mich bei dir bedanken, du hast tatsächlich den Auftrag von mir ausgeführt, ohne ihn hinterzufragen.\n\nDu bist ein Narr, als wenn irgendein darhergelaufener alter Mann von dir möcht, dass du den Olymp stürzt.\"");

        
        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End7";
        nextPosition2 = "End5";

        ;break;

        case "End7":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        mainTextArea.setText("\"Wer bist du?\"\n\nFragt Zeus.");

        
        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End8";
        nextPosition2 = "End6";

        ;break;


        case "End8":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        mainTextArea.setText("\"Nah, nah, nah. Ich bin echt enttäuscht von dir, dass du mich nicht wiedererkennst.\nDabei bin ich doch dein Vater\"\n\nZeus schaut erschrocken auf.\n\n\"Kronos?! Wie ist das möglich? Ich habe dich doch weggesperrt?\"");

        
        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End9";
        nextPosition2 = "End7";

        ;break;

        case "End9":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        mainTextArea.setText("\"Tja scheinbar wohl nicht gut genug, ich konnte fliehen. Allerdings bin ich deswegen geschwächt\"");

        
        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End10";
        nextPosition2 = "End8";

        ;break;

        case "End10":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        mainTextArea.setText("Kronos geht auf Zeus zu.\n\"Deswegen musste ich jemand anderen finden, der das für mich tut.\nUnd das Schicksal war auf meiner Seite. Ich konnte einen Idioten finden, der das wirklich tut.\"\nEr blickt kurz zu dir rüber und richtet seine Hand auf Zeus");

        
        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End11";
        nextPosition2 = "End9";

        ;break;

        
        case "End11":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        if (spieler.karma > 0){
            mainTextArea.setText("\"Schnell töte ihn!\" ruft Zeus.");

        }
        else{
            mainTextArea.setText("Du bekommst ein unangenehmes Gefühl.\n\nDu stürmst mit gezogener Waffe auf Kronos zu.");

        }

        
        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End12";
        nextPosition2 = "End10";

        ;break;

        case "End12":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        mainTextArea.setText("\"Zu spät!\" \nKronos erzieht Zeus seine gesamte kraft und tötet ihn dann.\nKronos wird auf einmal zu einem gigantischen Titanen, tief schwarz und mit einem vulkanischen Muster überzogen.\n\nDu bricht vor Verzweiflung zusammen");

        
        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End13";
        nextPosition2 = "End11";

        ;break;

        case "End13":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));

        if(spieler.karma <= -8){
            mainTextArea.setText("Vernichtet den gesamten Tempel und tötet übrig gebliebenen Götter.\nDann greift er nach dir, du versuchst zu fliehen allerdings scheiterst du.");

        }
        else{
            mainTextArea.setText("Jedoch erscheinen die restlichen Gottheiten.\n\n\"Legen wir unsere Konflikte mal bei Seiten umd machen dieses Monster fertig!\"");

        }

        
        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End14";
        nextPosition2 = "End12";

        ;break;

        case "End14":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));

        if(spieler.karma <= -8){
mainTextArea.setText("\"Dich brauche ich nicht mehr\"\nDer Druck um deinen Körper wird stärker.\nKronos zerquetscht dich.\n\nEnde.\n\n\nGeschichte von Jost geschrieben");
if (spieler.goodEnd == true){
    option1button.setText("Spiel beenden");
    option2button.setText("");
    nextPosition1 = "Beenden";
    nextPosition2 = "";
    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
}

if (spieler.goodEnd == false){
    option1button.setText("Spiel beenden");
    option2button.setText("Gutes Ending spielen");
    nextPosition1 = "Beenden";
    nextPosition2 = "Good_End";
    option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
    option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
}

spieler.badEnd = true;
        }

        else{
        mainTextArea.setText("Deine Entschlossenheit kommt zurück. Du stehst wieder auf, da hörst du.\n\"Hey, wir wollen auch noch helfen\"nWieder siehst du dich um, eine Armee aus Zyklopen hat das Schlacht Feld betreten.\nEiner der Zyklopen wirft dir deinen Schwert und deine Rüstung rüber.\"Die wirst du brauchen\"\nIhr macht euch bereit für den Kampf und stürmt auf Kronos zu.");
            option1button.setText("weiter");
            option2button.setText("");
            nextPosition1 = "End15";
            nextPosition2 = "Good_End";
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));
            spieler.goodEnd = true;

        }

        


        ;break;

        case "End15":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));

        

        
        mainTextArea.setText("\"Egal wie viele ihr seid, ich werde euch dennoch töten.\"");
            option1button.setText("weiter");
            option2button.setText("");
            nextPosition1 = "Kronos Kampf";
            nextPosition2 = "End14";
            option1button.setFont(new Font("Times new Roman", Font.PLAIN, 35));
            option2button.setFont(new Font("Times new Roman", Font.PLAIN, 30));


        ;break;

        case "Kronos Kampf":
        optionsPanel.setVisible(false);
        mainTextPanel.setVisible(false);
        nextPosition1 = "Kronos Kampf";
        spawnEnemy("Bosses", 10);
        spieler.HealthB = spieler.Health;

        option1button.setText("weiter");
        option2button.setText("zurück");

        ;break;

        
        case "Good_End":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        spieler.karma = 12;

        mainTextArea.setText("\"Zu spät!\" \nKronos erzieht Zeus seine gesamte kraft und tötet ihn dann.\nKronos wird auf einmal zu einem gigantischen Titanen, tief schwarz und mit einem vulkanischen Muster überzogen.\n\nDu bricht vor Verzweiflung zusammen");

        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End13";
        nextPosition2 = "End11";

        ;break;

        case "Bad_End":
        option1button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        option2button.setFont(new Font("Times new Roman", Font.PLAIN, 40));
        spieler.karma = -12;

        mainTextArea.setText("\"Zu spät!\" \nKronos erzieht Zeus seine gesamte kraft und tötet ihn dann.\nKronos wird auf einmal zu einem gigantischen Titanen, tief schwarz und mit einem vulkanischen Muster überzogen.\n\nDu bricht vor Verzweiflung zusammen");

        option1button.setText("weiter");
        option2button.setText("zurück");
        nextPosition1 = "End13";
        nextPosition2 = "End11";

        ;break;
            
    
            case "AuftragannehmenNein":DerAnfangende();break;

            case "Meinung ändern": DerAnfangpart3(); break;
    
            case "Beenden":frame.setVisible(false);break;
            
            case "Auftragangenommen": Auftragangenommen(); break;



    
        }




  
    }




}
