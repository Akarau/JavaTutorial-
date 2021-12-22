import javax.swing.JLabel;

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


public class Story {
    String tutorialEnemy = "DarkFlame";
     String enemies[] = {
        "FeuerFlamme", // 1
        "Balrog", // 2
    };

    int enemiesHP[] = {
        100, // 1
        200, // 2
    };
    


    public Story(){
        System.out.println("1");
        System.out.println("2");

        JLabel tutorialEnemy= new JLabel();
        tutorialEnemy.setIcon(new ImageIcon(new ImageIcon("Textrpg\\Images\\Others\\Damage.png").getImage().getScaledInstance(60,72,Image.SCALE_AREA_AVERAGING)));
        tutorialEnemy.setVisible(true);
tutorialEnemy.setBackground(Color.black);
tutorialEnemy.setBorder(new LineBorder(Color.white));
tutorialEnemy.setBounds(200, 200, 400, 200);


        JLabel tutorialEnemyHealth = new JLabel();
        tutorialEnemyHealth.setText("100");
        tutorialEnemyHealth.setVisible(true);
        tutorialEnemyHealth.setBackground(Color.black);
        tutorialEnemyHealth.setBorder(new LineBorder(Color.white));


   //     Menu.frame.add(tutorialEnemy);
       // Menu.frame.add(tutorialEnemyHealth);

        
    }
}