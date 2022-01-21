import java.awt.Color;




public class Enemy {


    Elemente elements;

    String enemies[] = {
        "DunkleFlamme",
        "(Wütender) Hirsch",
        "(Wilder) Eber",
        "(Wütender) Bär",
        "(Zorniger) Stier",
        "(Ghost) Hirsch",
        "(Ghost) Eber",
        "(Ghost) Bär",
        "(Ghost) Stier",
        "Gladiator lvl 1",
        "Gladiator lvl 2",
        "Gladiator lvl 3",
        "Gladiator lvl 4",
        "Gladiator lvl 5",
        "Gladiator lvl 6",
        "Hydra",
        "Delphin lvl 1",
        "Delphin lvl 2",
        "Delphin lvl 3",

    };

    int enemiesHP[] = {
        100,
        120,
        140,
        160,
        180,
        220,
        240,
        260,
        280,
        300,
        320,
        400,
        400,
        400,
        400,
        400,
        200,
        220,
        240,


    };


    int enemiesPower[] = {
        5,
        12,
        14,
        16,
        18,
        22,
        24,
        26,
        28,
        30,
        32,
        40,
        40,
        40,
        40,
        40,
        10,
        12,
        14,


    };

    String enemy_Main_Materias[] = {
        "Erde",
        "Erde",
        "Erde",
        "Feuer",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "",
        "Wasser",
        "Wasser",
        "Wasser",
        "Wasser",


    };


    String enemy_Second_Materias[] = {
        "Lunar",
        "Fire",
        "Crystal",
        "Crystal",
        "Crystal",
        "",
        "",
        "Feuer",
        "Feuer",
        "Feuer",
        "Feuer",
        "Wasser",
        "Wasser",
        "Wasser",
        "Wasser",
        "Wind",
        "",
        "",
        "",
        "",


    };

    String enemy_Third_Materias[] = {
        "D",
        "Fire",
        "Crystal",
        "Crystal",
        "Crystal",
        "",
        "",
        "",
        "",
        "Ancient",
        "Ancient",
"",
"",
"",
"",
"",
"",
"",
"",
"",
"",
"",
"",
"",


    };


    String enemy_Last_Materias[] = {
        "C",
        "Fire",
        "Crystal",
        "Crystal",
        "Crystal",
        "",
        "",
        "",
        "",
        "",
        "",
"",
"",
"",
"",
"",
"",
"",
"",
"",
"",
"",
"",
"",


    };


    String enemyDifficulty[] = {
        "Leicht",
        "Fire",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Crystal",
        "Hydra",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",

    };




     Color[] enemyColors = {
        new Color(160,0,255),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(60,0,53),
        new Color(255,100,0),
        new Color(255,125,34),
        new Color(255,105,28),
        new Color(255,85,22),
        new Color(255,65,16),
        new Color(255,55,8),
        new Color(255,35,0),
        new Color(0,150,255),
        new Color(0,150,255),
        new Color(0,150,255),
        new Color(0,150,255),
        new Color(0,150,255),
        new Color(0,150,255),
        new Color(0,150,255),
        new Color(0,150,255),
        new Color(0,150,255),
        new Color(0,150,255),

    };


    Color[] difficultyColors = {
        new Color(0,255,60),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(25,255,255),

    };


    String bosses[] = {
        "Medusa",
        "Artemis",
        "Apollon",
        "Athene",
        "Hades",
        "Heraktles",
    };


    int bossesHP[] = {
        14,
        240,
        300,
        400,
        1500,
        800,

    };

    int bossesPower[] = {
        40,
        22,
        22,
        22,
        10,
        14,

    };

    Color[] bossesColors = {
        new Color(0,255,80),
        new Color(225,225,225),
        new Color(255,205,40),
        new Color(0,255,80),
        new Color(255,135,0),
        new Color(255,135,0),

    };


    String boss_Main_Materias[] = {
        "Cosmic",
        "Fire",
        "Fire",
        "Licht",
        "Feuer",
        "Ancient",

    };


    String boss_Second_Materias[] = {
        "Void",
        "Fire",
        "Fire",
        "Fire",
        "Erde",
        "Cosmic",


    };

    String boss_Third_Materias[] = {
        "Ancient",
        "Fire",
        "Fire",
        "Fire",
        "Licht",
        "Crystal",

    };

    String boss_Last_Materias[] = {
        "Luck",
        "Fire",
        "Fire",
        "Fire",
        "",
        "Erde",


    };

    String bossDifficulty[] = {
        "Hard",
        "Fire",
        "Fire",
        "Fire",
        "Hard++",
        "Hard++",

    };

    Color[] bossdifficultyColors = {
        new Color(255,140,0),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(255,135,0),
        new Color(255,135,0),

    };


        // Enemy gegner = new Enemy(Elements.HEALTH);
        public Enemy(Elemente pElement) {
            
       //     System.out.println("D326");


            

          //  System.out.println("Fight2");
       // System.out.println(enemies[1]);
      //  System.out.print(" " + enemiesHP[1]);

      //  Menu.l.setText(enemies[0]);
    }


}
