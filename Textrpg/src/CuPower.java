import java.awt.Color;

import javax.swing.JPanel;

public class CuPower {
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
        Menu.frame.add(pPanel);
        
    }
    }

}