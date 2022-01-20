import java.awt.Color;
import java.util.HashMap;

import javax.swing.JPanel;

public class CuPower {


      int Gold = 50000;
      int Power = 50;
      int Points = 50;
      int Health = 100;
      int karma = 0;
      int MaxHealth;
      int damageMade;
      int damg;

      

    public  int playerHealthResult = 10;
      float GoldEarn = 1F;
     String Main_Element = "  Gravity  ";
     String Second_Element = "  Cosmic  ";
     String Support_Element = "  Luck  ";
     String playerName;
     float powerBoost = 1;
     String powerBoostIcon = "Textrpg\\Images\\Swords\\Double swords.png";
     String powerBoostName = "";
     String hpBoostName = "";
     float hpBoost = 1.5f;

     // Enemy //
     String currentEnemy;
     int CurrentEnemyPower = 200;
     int currentEnemyHP = 2600;
     String enemyMain_Element = "Erde";
     String enemySecond_Element;
     String enemyThird_Element;
     String enemyLast_Element;
     Boolean enemyAtacked = false;
     Boolean reflection = false;

     Boolean ApollonK;
     Boolean PolydektesK;
     Boolean AtheneK;

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
int boostDamageTextAnimation = 5;

int divide = 20;

// FightWait //


// Elemente //
Boolean healUpgrade1 = true;
Boolean luckUpgrade1 = false;


// Elemente //


// Inventory //



// Inventory //


// Achievements //

Boolean starter = true;
Boolean kämpfer = false;


// Achievements //


    public CuPower() {

        HashMap <String, Integer> inventory = new HashMap <>();
inventory.put("Helixir", 1);

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