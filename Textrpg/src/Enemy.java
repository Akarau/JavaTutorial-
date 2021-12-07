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
        "Fire",
    };

        public Enemy() {

       //     System.out.println("D326");


            for (int v32= 0;v32 == elements.length;v32++){
                System.out.println(elements[v32]);

            }

       // System.out.println(enemies[1]);
      //  System.out.print(" " + enemiesHP[1]);

      //  Menu.l.setText(enemies[0]);
    }


}
