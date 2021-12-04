import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Enemy {


    String elements[] = {
        "Dark",
        "Fire",
        "Light",
        "Earth",
        "Health",
        "Water",
        "Wind",
        "Magic",
        "Blitz",
    };

   static String enemies[] = {
        "Darkour",
        "Balrog",
    };

    int enemiesHP[] = {
        100,
        200,
    };

    String enemy_Main_Materias[] = {
        "Dark",
        "Fire",
    };


    String enemy_Second_Materias[] = {
        "Dark",
        "Earth",
    };

        public Enemy() {

            System.out.println("D326");


            for (int v32= 0;v32 == elements.length;v32++){
                System.out.println(elements[v32]);

            }

        System.out.println(enemies[1]);
        System.out.print(" " + enemiesHP[1]);

      //  Menu.l.setText(enemies[0]);

      System.out.println(enemies[0]);
      System.out.print(" " + enemiesHP[0]);

      JTextArea inf;
      
      inf = new JTextArea("    Enemyname: " + enemies[1]);
      inf.setForeground( new Color(180,180,180));
      inf.setFont(new Font("Times new Roman", Font.PLAIN, 25));
      inf.setBounds(1600, 300, 255, 255);
      inf.setSize(255, 255);
      inf.setBackground( new Color(0,0,0));
      inf.setLineWrap(true);
      inf.setVisible(true);
      inf.setFocusable(false);
      inf.setBorder(new LineBorder(Color.white));
      inf.setText(
        " Enemyname: " + enemies[1] + "       Health: " + enemiesHP[1] + "                       Materia: " + enemy_Main_Materias[1] + "                    Second Materia: " + enemy_Second_Materias[1]
      );

      Menu.frame.add(inf);

    }


    public void SpawnRandomE() {

       
    System.out.println(enemies[0]);
    System.out.print(" " + enemiesHP[0]);

  //  Menu.l.setText(enemies[0]);
}


}
