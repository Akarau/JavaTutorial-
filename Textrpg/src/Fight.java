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

public class Fight {
    
    JLabel inf2 = new JLabel();





public Fight(){
    JLabel inf2 = new JLabel();
    inf2.setText(null);
    inf2.setForeground( new Color(180,180,180));
    inf2.setFont(new Font("Times new Roman", Font.PLAIN, 25));
    inf2.setBounds(1600, 700, 255, 255);
    inf2.setSize(255, 255);
    inf2.setBackground( new Color(255,255,255));
    inf2.setVisible(true);
    inf2.setFocusable(true);
  //  inf2.setBorder(new LineBorder(Color.white));
    //Menu.frame.add(inf2);
    //Menu.frame.setVisible(false);
}
}
