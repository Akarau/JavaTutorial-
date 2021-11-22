import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import org.w3c.dom.css.RGBColor;

public class App {
   
JLabel titelname;  
JFrame fenster;
static JProgressBar B1;

JPanel titelbildschirm,startbuttonhintergrund;
JFrame Loading;
Font titelgröße= new Font("Times new Roman", Font.PLAIN,80);
Font startschrift= new Font("Times new Roman", Font.PLAIN,30); 
JButton startname; 
    public static void main(String[] args) {

        new App();
        };
        public App(){

        fenster = new JFrame(); 
        //fenster.setSize(1920, 1080);

        // Setzt das Fenster immer auf Fullscreen
        fenster.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Entfernt den oberen Rahmen
        fenster.setUndecorated(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       // fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // fenster.getContentPane().setBackground(Color.green);
       // fenster.setLayout(null);
       // fenster.getContentPane();
       
         byte RG = 127;
        titelbildschirm = new JPanel(); 
        titelbildschirm.setBounds(800, 200, 350, 100); 
        titelbildschirm.setBackground(Color.black);
        titelname= new JLabel("The Day");
        titelname.setForeground(Color.white);
        titelname.setFont(titelgröße);
        titelname.setBackground(Color.WHITE);


        startbuttonhintergrund = new JPanel(); 
        startbuttonhintergrund.setBounds(460, 300, 350, 100); 
        startbuttonhintergrund.setBackground(Color.BLACK);
        startbuttonhintergrund.setForeground(Color.black);
        startname = new JButton("     Spielen     ");
        startname.setFont(startschrift);
        startname.setBorderPainted(false);
        startname.setBackground(Color.BLACK);
        startname.setSize(400, 400);
        //startname.setForeground(Color.white);
        startbuttonhintergrund.add(startname);



     
        fenster.add(startbuttonhintergrund); 
        titelbildschirm.add(titelname);
        fenster.add(titelbildschirm);
        fenster.setVisible(true);
    
        


            
         //   Ren();

            
        
        }
        

        private Color RGBColor(int i, int j, int k) {
            return null;
        }

        public static void Ren(){
            B1.setValue(10);
    }
    
        public void GUI(){
            JPanel F = new JPanel();
            F.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
            
        }

        

    }
      
    
