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
        "FeuerFlamme",
        "Balrog",
    };

    int enemiesHP[] = {
        100,
        200,
    };

    String enemiesHPString[] = {
        "100",
        "200",
    };

    int enemiesPower[] = {
        5,
        200,
    };

    static String enemy_Main_Materias[] = {
        "Feuer",
        "Fire",
    };


    String enemy_Second_Materias[] = {
        "Lunar",
        "Fire",
    };

    static String enemy_Third_Materias[] = {
        "D",
        "Fire",
    };


    String enemy_Last_Materias[] = {
        "C",
        "Fire",
    };


    String enemyDifficulty[] = {
        "Easy",
        "Fire",
    };




     Color[] enemyColors = {
        new Color(160,0,255),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(60,0,53),
        new Color(255,100,0),
        new Color(255,125,34),
        new Color(255,255,255),
        new Color(255,255,0),
        new Color(0,255,80),
        new Color(40,40,40),
        new Color(100,0,255),
        new Color(0,150,255),
    };


    Color[] difficultyColors = {
        new Color(0,255,60),
        new Color(160,0,255),
        new Color(25,255,255),
    };


    String bosses[] = {
        "Medusa",
        "Balrog",
    };


    int bossesHP[] = {
        1024,
        200,
    };

    int bossesPower[] = {
        40,
        200,
    };

    Color[] bossesColors = {
        new Color(0,255,80),

    };


    String boss_Main_Materias[] = {
        "Cosmic",
        "Fire",
    };


    String boss_Second_Materias[] = {
        "Void",
        "Fire",
    };

    String boss_Third_Materias[] = {
        "Ancient",
        "Fire",
    };

    String boss_Last_Materias[] = {
        "Luck",
        "Fire",
    };

    String bossDifficulty[] = {
        "Hard",
        "Fire",
    };

    Color[] bossdifficultyColors = {
        new Color(255,140,0),
        new Color(160,0,255),
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
