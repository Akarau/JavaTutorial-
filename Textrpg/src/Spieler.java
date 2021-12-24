import java.awt.Color;

import javax.swing.JPanel;

public class Spieler {
 public int playerMaxhealth=100;
 public int playerHealth=100;
 public int playerHealthresult;

public void playerhealdamageanimation(JPanel pPanel) throws InterruptedException{

    playerhealdamageanimation(pPanel);
    pPanel.setBounds(200,200,200,150);

    pPanel.setVisible(true);
    while(playerHealth!=playerHealthresult){ 
        if(playerHealth > playerHealthresult ){
        for(int i = playerHealth;i > playerHealthresult;i--){
            Thread.sleep(10);
            pPanel.setBackground(Color.red);
            pPanel.setBounds(0,0,i*2,150);
        }
        
    }else if(playerHealth < playerHealthresult){
        for(int i = playerHealth;i < playerHealthresult;i++){
            Thread.sleep(10);
            pPanel.setBounds(0,0,i*2,150);
            pPanel.setBackground(Color.green);
        }
        
        
    }
    pPanel.setBackground(Color.red);
  //  Menu.frame.add(pPanel);
    
}
}
}
