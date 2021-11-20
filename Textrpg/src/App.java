import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
   
JLabel titelname;  
JFrame fenster;
JPanel titelbildschirm,startbuttonhintergrund;
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
       
         
        titelbildschirm = new JPanel(); 
        titelbildschirm.setBounds(800, 100, 350, 100); 
        titelbildschirm.setBackground(Color.black);
        titelname= new JLabel("The Day");
        titelname.setForeground(Color.white);
        titelname.setFont(titelgröße);

        startbuttonhintergrund = new JPanel(); 
        startbuttonhintergrund.setBounds(800, 350, 350, 100); 
        startbuttonhintergrund.setBackground(Color.BLACK);
        startbuttonhintergrund.setForeground(Color.black);
        startname = new JButton("     Spielen     ");
        startname.setFont(startschrift);
        startname.setBorderPainted(false);
        startname.setBackground(Color.BLACK);
        //startname.setForeground(Color.white);
        startbuttonhintergrund.add(startname);



     
        fenster.add(startbuttonhintergrund); 
        titelbildschirm.add(titelname);
        fenster.add(titelbildschirm);
        fenster.setVisible(true);
    
        


            

        
        }
        

        public void GUI(){
            JPanel F = new JPanel();
            F.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
            
        }
    }
      
    
