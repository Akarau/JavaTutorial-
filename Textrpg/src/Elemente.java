import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.Color;


public class Elemente {


  static String elements[] = {
        "Ancient",
        "Cosmic",
        "Crystal",
        "Erde",
        "Feuer",
        "Gravity",
      //  "Heal",
        "Licht",
    //    "Luck",
        "Lunar",
        "Void",
        "Wasser",
        "Wind",
    };


   static Color[] elemetColors = {
        new Color(255,0,160),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(60,0,53),
        new Color(255,100,0),
        new Color(255,125,34),
    //    new Color(255,255,255),
        new Color(255,255,0),
     //   new Color(0,255,80),
        new Color(40,40,40),
        new Color(100,0,255),
        new Color(0,150,255),
        new Color(150,0,255),
    };


   static String elementsPowers[] = {
        "Cosmic + Lunar", // Ancient stark dagegen
        "Erde + Gravity + Void", // Cosmic sehr stark dagegen
        "Erde + Ancient", // Crystal stark dagegen
        "Feuer + Luck + ''", // Erde sehr stark dagegen
        "Heal + Crystal", // Feuer stark dagegen
        "Cosmic + Erde", // Gravity stark dagegen
    //    "", // Heal stark dagegen
        "Lunar + Void", // Licht stark dagegen
     //   "", // Luck stark dagegen
        "Licht + Wasser + ''", // Lunar sehr stark dagegen
        "Cosmic + Gravity", // Void stark dagegen
        "Feuer + Crystal", // Wasser stark dagegen
        "Feuer + Crystal", // Wasser stark dagegen


    };

    static String elementsPowers2[] = {
        "-Affective against Cosmic + Lunar                                   -No element is affective against ", // Ancient stark dagegen
        "Erde + Gravity + Void", // Cosmic sehr stark dagegen
        "Erde + Ancient", // Crystal stark dagegen
        "Feuer + Luck + ''", // Erde sehr stark dagegen
        "Heal + Crystal", // Feuer stark dagegen
        "Cosmic + Erde", // Gravity stark dagegen
   //     "", // Heal stark dagegen
        "Lunar + Void", // Licht stark dagegen
    //    "", // Luck stark dagegen
        "Licht + Wasser + ''", // Lunar sehr stark dagegen
        "Cosmic + Gravity", // Void stark dagegen
        "Feuer + Crystal", // Wasser stark dagegen
        "Feuer + Crystal", // Wasser stark dagegen


    };


    static String elementsWeaks[] = {
        "is weak against Crystal", // Ancient Weak dagegen
        "is weak against Ancient + Gravity + Void", // Cosmic Weak dagegen
        "is weak against Feuer + Wasser", // Crystal Weak dagegen
        "is weak against Cosmic + Crystal + Gravity", // Erde Weak dagegen
        "is weak against Erde + Wasser", // Feuer Weak dagegen
        "is weak against Cosmic + Void", // Gravity Weak dagegen
     //   "is a support Element. It heals you and it has an upgrade", // Heal Weak dagegen
        "is effective against Lunar, but Lunar is very effective against it, because only Lunar can damage Light much", // Licht Weak dagegen
     //   "is a support Element, it gives you more Gold and less damage", // Luck Weak dagegen
        "is weak against Ancient and very affective against Light. Licht is also affective against Lunar", // Lunar Weak dagegen
        "is weak against Cosmic + Licht", // Void Weak dagegen
        "is very weak against Lunar", // Wasser sehr Weak dagegen
        "is very weak against Erde", // Wasser sehr Weak dagegen


    };


    static String[] elementsName = {
        "        Ancient        ",
        "        Cosmic         ",
        "        Crystal        ",
        "        Erde           ",
        "        Feuer          ",
        "        Gravity        ",
   //     "        Heal           ",
        "        Licht          ",
      //  "        Luck           ",
        "        Lunar          ",
        "        Void           ",
        "        Wasser         ",
        "        Wind         ",

        
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

         //   System.out.println(elementsPowers[1].length);


            for (int v32= 0;v32 == elements.length;v32++){
                System.out.println(elements[v32]);

            }

        System.out.println(enemies[1]);
        System.out.print(" " + enemiesHP[1]);

      //  Menu.l.setText(enemies[0]);
    }


}
