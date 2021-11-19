import java.awt.Color;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
   
JLabel titelname;  
JFrame Fenster;
JPanel titelbildschirm,Startbuttonhintergrund;
Font titelgröße= new Font("Times new Roman", Font.PLAIN,80);
Font Startschrift= new Font("Times new Roman", Font.PLAIN,30); 
JButton startname; 
    public static void main(String[] args) {

        new App();
        };
        public App(){

        Fenster = new JFrame(); 
        Fenster.setSize(1920, 1080);
        Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fenster.getContentPane().setBackground(Color.green);
        Fenster.setLayout(null);
        Fenster.getContentPane();
       
         
        titelbildschirm = new JPanel(); 
        titelbildschirm.setBounds(800, 100, 350, 100); 
        titelbildschirm.setBackground(Color.black);
        titelname= new JLabel("The Day");
        titelname.setForeground(Color.white);
        titelname.setFont(titelgröße);

        Startbuttonhintergrund = new JPanel(); 
        Startbuttonhintergrund.setBounds(800, 350, 350, 100); 
        Startbuttonhintergrund.setBackground(Color.BLACK);
        Startbuttonhintergrund.setForeground(Color.black);
        startname = new JButton("Spielen");
        startname.setFont(Startschrift);
        startname.setBorderPainted(true);
        startname.setBackground(Color.BLACK);
        startname.setForeground(Color.white);
        Startbuttonhintergrund.add(startname);



     
        Fenster.add(Startbuttonhintergrund); 
        titelbildschirm.add(titelname);
        Fenster.add(titelbildschirm);
        Fenster.setVisible(true);
    
        




        
        }
    }
      
    
