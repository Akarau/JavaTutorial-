import java.awt.Color;




public class Enemy {


    Elemente elements;

    String enemies[] = {
        "DunkleFlamme",
        "(Wütender) Hirsch",
        "(Wilder) Eber",
        "(Wütender) Bär",
        "(Zorniger) Stier",
        "(Geist) Hirsch",
        "(Geist) Eber",
        "(Geist) Bär",
        "(Geist) Stier",
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
        "Bandit lvl 1",
        "Bandit lvl 2",
        "Gorgon lvl 1",
        "Gorgon lvl 2",
        "Gorgon lvl 3",
        "Amazone lvl 1",
        "Amazone lvl 2",
        "Amazone lvl 3",
        "Amazone lvl 4",
        "Amazone lvl 5",
        "Amazone lvl 6",

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
        400,
        450,
        500,
        300,
        335,
        335,
        335,
        335,
        335,
        220,
        240,
        260,
        280,
        300,
        320,


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
        40,
        45,
        50,
        15,
        18,
        18,
        18,
        18,
        18,
        22,
        24,
        26,
        28,
        30,
        32,


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
        "Erde",
        "Wasser",
        "Wasser",
        "Wasser",
        "Wasser",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Erde",
        "Cosmic",
        "Cosmic",
        "Cosmic",
        "Cosmic",
        "Cosmic",
        "Cosmic",


    };


    String enemy_Second_Materias[] = {
        "Lunar",
        "Fire",
        "",
        "",
        "",
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
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Lunar",
        "Lunar",
        "Lunar",
        "Lunar",


    };

    String enemy_Third_Materias[] = {
        "",
        "",
        "",
        "",
        "",
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
"Crystal",
"Crystal",


    };


    String enemy_Last_Materias[] = {
        "C",
        "Fire",
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
        "Leicht",
        "Leicht",
        "Leicht",
        "Leicht",
        "Normal",
        "Normal",
        "Normal",
        "Normal",
        "Normal",
        "Normal",
        "Normal",
        "Normal++",
        "Normal++",
        "Hard",
        "Hard",
        "Hard",
        "Hard",
        "Hard",
        "Normal++",
        "Normal++",
        "Normal++",
        "Normal++",
        "Normal++",
        "Normal",
        "Normal",
        "Normal++",
        "Normal++",
        "Hard",
        "Hard",

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
        new Color(0,150,255),
        new Color(120,120,120),
        new Color(0,0,120),
        new Color(120,0,0),
        new Color(255,0,100),
        new Color(255,0,95),
        new Color(255,0,90),
        new Color(255,0,85),
        new Color(255,0,80),
        new Color(255,0,75),
        new Color(255,0,70),

    };


    Color[] difficultyColors = {
        new Color(0,255,100),
        new Color(0,255,100),
        new Color(0,255,100),
        new Color(0,255,100),
        new Color(0,255,100),
        new Color(255,125,34),
        new Color(255,125,34),
        new Color(255,125,34),
        new Color(255,125,34),
        new Color(255,125,34),
        new Color(255,125,34),
        new Color(255,125,34),
        new Color(255,115,0),
        new Color(255,115,0),
        new Color(255,40,0),
        new Color(255,40,0),
        new Color(255,40,0),
        new Color(255,40,0),
        new Color(255,40,0),
        new Color(255,115,0),
        new Color(255,115,0),
        new Color(255,115,0),
        new Color(255,115,0),
        new Color(255,115,0),
        new Color(255,125,34),
        new Color(255,125,34),
        new Color(255,115,0),
        new Color(255,115,0),
        new Color(255,40,0),
        new Color(255,40,0),


    };


    String bosses[] = {
        "Medusa",
        "Artemis",
        "Apollon",
        "Athene",
        "Hades",
        "Heraktles",
        "Hermes",
        "Poseidon",
        "Ares",
        "Zeus",
        "Kronos",
    };


    int bossesHP[] = {
        400,
        240, // Artemis
        360,
        400,
        1500,
        800,
        150,
        400,
        400,
        1250,
        1500,

    };

    int bossesPower[] = {
        70,
        22, // Artemis
        40,
        22,
        10,
        14,
        25,
        24,
        (int) (Math.random()* 10 * Math.random() * 9),
        100,
        125,

    };

    Color[] bossesColors = {
        new Color(0,255,80),
        new Color(20,0,100),
        new Color(80,0,0),
        new Color(0,80,40),
        new Color(255,40,0),
        new Color(255,135,0),
        new Color(0,185,255),
        new Color(0,50,255),
        new Color(200,145,0),
        new Color(255,255,255),
        new Color(255,45,0),

    };


    String boss_Main_Materias[] = {
        "Erde",
        "Lunar",
        "Licht",
        "Licht",
        "Feuer",
        "Ancient",
        "Licht",
        "Wasser",
        "Erde",
        "Licht",
        "Lunar",

    };


    String boss_Second_Materias[] = {
        "Void",
        "Licht",
        "Feuer",
        "Erde",
        "Erde",
        "Cosmic",
        "Ancient",
        "Licht",
        "",
        "Wind",
        "Feuer",


    };
    

    String boss_Third_Materias[] = {
        "Ancient",
        "",
        "",
        "Ancient",
        "Licht",
        "Crystal",
        "",
        "Wind",
        "",
        "Erde",
        "Ancient",


    };

    String boss_Last_Materias[] = {
        "",
        "",
        "",
        "",
        "Lunar",
        "Erde",
        "",
        "Crystal",
        "",
        "Gravity",
        "Void",


    };

    String bossDifficulty[] = {
        "Hard",
        "Normal",
        "Normal",
        "Hard",
        "Hard++",
        "Hard++",
        "Normal",
        "Hard++",
        "Hard",
        "Extrem",
        "Extrem",

    };

    Color[] bossdifficultyColors = {
        new Color(255,140,0),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(25,255,255),
        new Color(255,135,0),
        new Color(255,135,0),
        new Color(255,135,0),
        new Color(255,135,0),
        new Color(255,135,0),
        new Color(255,255,255),
        new Color(255,45,0),

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
