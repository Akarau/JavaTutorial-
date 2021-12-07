import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Elemente {


    String elements[] = {
        "Ancient",
        "Cosmic",
        "Crystal",
        "Erde",
        "Feuer",
        "Gravity",
        "Heal",
        "Licht",
        "Luck",
        "Lunar",
        "Void",
        "Wasser",
    };


    String[] elementsPowers[] = {
        {"Cosmic", "Lunar"} , // Ancient stark dagegen
        {"Erde","Gravity","Void"}, // Cosmic sehr stark dagegen
        {"Erde","Ancient"}, // Crystal stark dagegen
        {"Feuer","Luck",""}, // Erde sehr stark dagegen
        {"Heal","Crystal"}, // Feuer stark dagegen
        {"Cosmic","Erde"}, // Gravity stark dagegen
        {"",""}, // Heal stark dagegen
        {"Lunar","Void"}, // Licht stark dagegen
        {"",""}, // Luck stark dagegen
        {"Licht","Wasser", ""}, // Lunar sehr stark dagegen
        {"Cosmic","Gravity"}, // Void stark dagegen
        {"Feuer","Crystal"}, // Wasser stark dagegen


    };

    
    String[] CosmicSkills = {
        "    Meteor attack     ",
        "    Meteor Fall    ",
    };


   static String enemies[] = {
        "DunkleFlamme",
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
        "Feuer",
        "Fire",
    };

        public Elemente() {

            System.out.println("D326");

            System.out.println(elementsPowers[1].length);


            for (int v32= 0;v32 == elements.length;v32++){
                System.out.println(elements[v32]);

            }

        System.out.println(enemies[1]);
        System.out.print(" " + enemiesHP[1]);

      //  Menu.l.setText(enemies[0]);
    }


}
