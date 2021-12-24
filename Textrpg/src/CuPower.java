import java.awt.Color;

import javax.swing.JPanel;

public class CuPower {
      int Gold = 0;
      int Power = 50;
      int Points = 50;
      int Health = 100;
    public  int playerHealthResult = 10;
     int MaxHealth;
      float GoldEarn = 1F;
     String Main_Element = "  Ancient  ";
     String Second_Element;
     String playerName;
     // Enemy //
     String currentEnemy;
     int enemyPower;
     String enemyMain_Element;
     String enemySecond_Element;
     String enemyThird_Element;
     String enemyLast_Element;
     // Enemy //
     byte textSpeed = 14;
     int thread1 = 1000;
     int thread2 = 1000;
     int thread3 = 1000;

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
     //   Story.frame.add(pPanel);
        
    }
    }

}