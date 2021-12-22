import java.awt.Color;

import javax.swing.JPanel;

public class CuPower {
<<<<<<< HEAD
      int Gold = 0;
      int Power = 50;
      int Points = 50;
      int Health = 100;
    public  int playerHealthResult = 10;
     int MaxHealth;
      float GoldEarn = 1F;
     String Main_Element;
     String Second_Element;
     String playerName;
     String currentEnemy;
=======
    static  int Gold = 0;
    static  int Power = 50;
    static  int Points = 50;
    static  int Health = 100;
    public static int playerHealthResult = 10;
    static int MaxHealth;
    static  float GoldEarn = 1F;
    static String Main_Element;
    static String Second_Element;
    static String playerName;
>>>>>>> 45aac735882bfc5cc0e73af88aebb371d62e2213
    public CuPower() {



    }

    public void playerhealdamageanimation(JPanel pPanel) throws InterruptedException{

        playerhealdamageanimation(pPanel);
        pPanel.setBounds(200,200,200,150);
    
        pPanel.setVisible(true);
        while(Health!=playerHealthResult){ 
            if(Health > playerHealthResult ){
            for(int i = Health;i > playerHealthResult;i--){
                Thread.sleep(10);
                pPanel.setBackground(Color.red);
                pPanel.setBounds(0,0,i*2,150);
            }
            
        }else if(Health < playerHealthResult){
            for(int i = Health;i < playerHealthResult;i++){
                Thread.sleep(10);
                pPanel.setBounds(0,0,i*2,150);
                pPanel.setBackground(Color.red);
            }
            
            
        }
        pPanel.setBackground(Color.red);
<<<<<<< HEAD
        Story.frame.add(pPanel);
=======
        Menu.frame.add(pPanel);
>>>>>>> 45aac735882bfc5cc0e73af88aebb371d62e2213
        
    }
    }

}