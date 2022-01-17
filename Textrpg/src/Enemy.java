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




public class Enemy {


    Elemente elements;

    String enemies[] = {
        "DunkleFlamme",
        "(Wütender) Hirsch",
        "(Wilder) Eber",
        "(Wütender) Bär",
        "(Zorniger) Stier",
        "Gladiator lvl 1",
        "Gladiator lvl 2",
        "Gladiator lvl 3",
        "Gladiator lvl 4",
        "Gladiator lvl 5",
        "Gladiator lvl 6",


    };

    int enemiesHP[] = {
        100,
        120,
        140,
        160,
        180,
        220,
        240,
        260,
        280,
        300,
        320,
    };


    int enemiesPower[] = {
        5,
        12,
        14,
        16,
        18,
        22,
        24,
        26,
        28,
        30,
        32,

    };

    String enemy_Main_Materias[] = {
        "Erde",
        "Erde",
        "Erde",
        "Feuer",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",

    };


    String enemy_Second_Materias[] = {
        "Lunar",
        "Fire",
        "Crystal",
        "Crystal",
        "Crystal",
        "",
        "",
        "Feuer",
        "Feuer",
        "Feuer",
        "Feuer",

    };

    String enemy_Third_Materias[] = {
        "D",
        "Fire",
        "Crystal",
        "Crystal",
        "Crystal",
        "",
        "",
        "",
        "",
        "Ancient",
        "Ancient",

    };


    String enemy_Last_Materias[] = {
        "C",
        "Fire",
        "Crystal",
        "Crystal",
        "Crystal",
        "",
        "",
        "",
        "",
        "",
        "",

    };


    String enemyDifficulty[] = {
        "Leicht",
        "Fire",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",

    };




     Color[] enemyColors = {
        new Color(160,0,255),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(60,0,53),
        new Color(255,100,0),
        new Color(255,125,34),
        new Color(255,105,28),
        new Color(255,85,22),
        new Color(255,65,16),
        new Color(255,55,8),
        new Color(255,35,0),
        new Color(0,150,255),
    };


    Color[] difficultyColors = {
        new Color(0,255,60),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),

    };


    String bosses[] = {
        "Medusa",
        "Artemis",
        "Apollon",
        "Athene",
        "",
    };


    int bossesHP[] = {
        14,
        240,
        300,
        400,
    };

    int bossesPower[] = {
        40,
        22,
        200,
        200,
    };

    Color[] bossesColors = {
        new Color(0,255,80),
        new Color(0,255,80),
        new Color(0,255,80),
        new Color(0,255,80),

    };


    String boss_Main_Materias[] = {
        "Cosmic",
        "Fire",
        "Fire",
        "Licht",

    };


    String boss_Second_Materias[] = {
        "Void",
        "Fire",
        "Fire",
        "Fire",

    };

    String boss_Third_Materias[] = {
        "Ancient",
        "Fire",
        "Fire",
        "Fire",

    };

    String boss_Last_Materias[] = {
        "Luck",
        "Fire",
        "Fire",
        "Fire",

    };

    String bossDifficulty[] = {
        "Hard",
        "Fire",
        "Fire",
        "Fire",

    };

    Color[] bossdifficultyColors = {
        new Color(255,140,0),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(25,255,255),

    };


        // Enemy gegner = new Enemy(Elements.HEALTH);
        public Enemy(Elemente pElement) {
            
       //     System.out.println("D326");


            

          //  System.out.println("Fight2");
       // System.out.println(enemies[1]);
      //  System.out.print(" " + enemiesHP[1]);

      //  Menu.l.setText(enemies[0]);
    }


}
