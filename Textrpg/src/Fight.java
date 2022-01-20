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


public class Fight {

  JLabel inf2 = new JLabel();

  public void WAtimation() {
    javax.swing.JButton e2 = new JButton();
    e2.setForeground(new Color(80, 0, 255));
    e2.setFont(new Font("Times new Roman", Font.PLAIN, 60));
    e2.setBounds(0, 0, 0, 0);
    e2.setBackground(Color.black);
    e2.setVisible(true);
    e2.setFocusable(false);
  //  optionsmenu_options.setBorder(new LineBorder(Color.white));

  javax.swing.JLabel i3 = new JLabel();
  i3.setForeground(new Color(255, 255, 255));
  i3.setFont(new Font("Times new Roman", Font.PLAIN, 60));
  // i3.setBounds(200, 400, 400, 0);
  i3.setSize(20, 20);
  i3.setBackground(Color.WHITE);
  i3.setVisible(true);
  i3.setFocusable(false);
  i3.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Wasser.png").getImage().getScaledInstance(60,
          60, Image.SCALE_AREA_AVERAGING)));


          Story.frame.add(e2);
          Story.frame.add(i3);
  }
 static String elements[];

 

  public static void fight(String element, JLabel elementImage) {


   

    do
    {
    System.out.println(elementImage.getIcon());
    elementImage.setVisible(false);
    }
    while (elementImage.isVisible()==true);

    System.out.println(element);

  //  int power = CuPower.Power;

  String elements[] = {
    "Ancient",
    "Cosmic",
    "Crystal",
    "Erde",
    "Feuer",
    "Gravity",
    "Heal",
    "Licht",
    "Luck",
    "Lunar",
    "Void",
    "Wasser",


    
    };


  JLabel i23;
 i23 = new JLabel();
i23.setForeground(Color.white);
i23.setFont(new Font("Times new Roman", Font.PLAIN, 30));
i23.setBounds(540, 30, 400, 0);
i23.setSize(500, 500);
i23.setBackground(Color.black);
i23.setVisible(true);
i23.setFocusable(false);


    String currentenemy = null;

    currentenemy = "FuerFlamme";

    /*
     * for (int n = 0 ;; n++){
     * if (Enemy.enemies[n] != null){
     * // System.out.println(Enemy.enemies[n]);
     * if (Enemy.enemy_Main_Materias[n] != null){
     * 
     * }
     * }
     * }
     * 
     * }
     */

  }


  


  public static void fightAnimation(String element, JLabel ei) throws InterruptedException {
    
    Thread th = new Thread();
    ei.setVisible(true);

    while (ei.isVisible() == true){
      for (int anc = 1; anc<2; anc++){
        //   enemyImage.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Ancient2.png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
           for (int a = 1; a<1; a++){
     ei.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Ancient\\" + anc + ".png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
  
           th.sleep(3);
                    }
       
                    for (int a = 1; a<1; a++){
                      ei.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Animation_Ancient\\" + anc + ".png").getImage().getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
                      th.sleep(3);
                                    }
    }

 }
 ei.setVisible(false);
  }
/*
javax.swing.JLabel i24 = new JLabel();
i24.setForeground(Color.white);
i24.setFont(new Font("Times new Roman", Font.PLAIN, 30));
i24.setBounds(540, 30, 400, 0);
i24.setSize(500, 500);
i24.setBackground(Color.black);
i24.setVisible(true);
i24.setFocusable(false);
i24.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Elemente\\Wasser.png").getImage()
                .getScaledInstance(72, 60, Image.SCALE_AREA_AVERAGING)));
Story.choose_Element.setVisible(false);
Story.elementsMenu.setVisible(false);
Story.chosen_Main_Element.setVisible(false);
       // i23.add(i24);
  }
  }
  */
}