import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.EventObject;
import java.awt.*;
import java.awt.event.*;

import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import org.w3c.dom.css.RGBColor;

public class Menu implements ActionListener {
   
JLabel TN;  
static JLabel L;
JFrame F;
static JProgressBar B1;

JPanel F1,F2;

JFrame Loading;
Font titelgröße= new Font("Times new Roman", Font.PLAIN,80);
Font startschrift= new Font("Times new Roman", Font.PLAIN,60); 
JButton startname; 
    public static void main(String[] args) throws InterruptedException{

       // public Menu() throws InterruptedException{
        new Menu();
        };
        public Menu() throws InterruptedException {

        F = new JFrame(); 
        //fenster.setSize(1920, 1080);

        // Setzt das Fenster immer auf Fullscreen
        F.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Entfernt den oberen Rahmen
        F.setUndecorated(false);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       // fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // fenster.getContentPane().setBackground(Color.green);
       // fenster.setLayout(null);
       // fenster.getContentPane();
       
         byte RG = 127;
        F1 = new JPanel(); 
        F1.setBounds(800, 200, 350, 100); 
        F1.setBackground(Color.black);
        TN = new JLabel("The Day");
        TN.setForeground(Color.white);
        TN.setFont(titelgröße);
        TN.setBackground(Color.WHITE);


        F2 = new JPanel(); 
        F2.setBounds(460, 600, 350, 800); 
        F2.setBackground(Color.BLACK);
        F2.setForeground(Color.black);
        startname = new JButton("     Spielen     ");
        //startname.setFont(startschrift);
        startname.setBorderPainted(false);
        startname.setBackground(Color.BLACK);
        startname.setSize(400, 400);
        startname.setFont(startschrift);
        startname.setForeground(Color.WHITE);
       // startname.setFocusable(false);
       startname.addActionListener(this);

        B1 = new JProgressBar();
        B1.setBorderPainted(false);
B1.setBackground(Color.black);
B1.setForeground(Color.white);
B1.setBounds(460,300,350,500);
B1.setVisible(true);
        F2.add(startname);
F2.add(B1);




L = new JLabel("Loading: ");
L.setForeground(Color.white);
L.setFont(new Font("Times new Roman", Font.PLAIN,30));
L.setBounds(540, 30, 400, 0);
L.setSize(500, 500);
L.setBackground(Color.WHITE);
L.setVisible(false);
L.setFocusable(false);
     
        F.add(F2);
        F1.add(TN);
        F.add(L);
        F.add(F1);
        F.setVisible(true);


        
while (L.isVisible() == false){
    Loading();
    Thread TH = new Thread();
    TH.sleep(1000);
    System.out.println("x");
     if(L.isVisible() == true){
         Loading();
     }
}


       // addActionListener((ActionListener) new ActionListiner());{
            
        }

        int i;
        public void actionPerformed(java.awt.event.ActionEvent e) {
            L.setVisible(!L.isVisible());
  }
        
        


            
         //   Ren();

            
        
           
    
    public void Loading() throws InterruptedException {
        System.out.println("not Vis");
        if (L.isVisible()==true){
            System.out.println("Visible");
Thread.sleep(2000);
                L.setVisible(true);
            L.setText("LoadingC");
            int i;
            for(i=1;;i++) {
                L.setText("Loading: " + i + "%");
                Thread.sleep(i + 24);
    
                   if (i >= 100 && i <= 100){
                       Thread.sleep(2000);
                    L.setText("Loading completed");
                    break;
                }
                }
    }
    }


        private void notify(int i) {
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

        public <ActionEvent> void CL(ActionEvent e) throws InterruptedException{
               // if(((EventObject) e).getSource()==startname){
                if (((EventObject) e).getSource()==this.startname){
                    Loading();
System.out.print("D");
                }
        }
       // @Override
        

        
        

    }
      
    
