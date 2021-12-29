import java.awt.Color;

import javax.swing.JPanel;

public class CuPower {
      int Gold = 0;
      int Power = 100;
      int Points = 50;
      int Health = 100;
      int damg;

    public  int playerHealthResult = 10;
     int MaxHealth;
      float GoldEarn = 1F;
     String Main_Element = "  Ancient  ";
     String Second_Element = "  Cosmic  ";
     String Support_Element = "  Luck  ";
     String playerName;
     float powerBoost = 1.5f;
     float hpBoost = 1.5f;

     // Enemy //
     String currentEnemy;
     int CurrentEnemyPower = 200;
     int currentEnemyHP = 2600;
     String enemyMain_Element = "Erde";
     String enemySecond_Element;
     String enemyThird_Element;
     String enemyLast_Element;

     // Enemy //

     // Wait //
     byte textSpeed = 14;
     int thread1 = 1000;
     int thread2 = 1000;
     int thread3 = 1000;
// Wait //

// FightWait //

int t1 = 4;
int t2 = 200;
int t3 = 300;
int ancientAnimation = 2;
int cosmicAnimation1 = 15;
int cosmicAnimation2 = 9;
int damageTextAnimation = 6;
int boostDamageTextAnimation = 8;

int divide = 20;

// FightWait //


// Elemente //
Boolean healUpgrade1 = true;
Boolean luckUpgrade1 = false;


// Elemente //


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