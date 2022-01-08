import java.sql.Array;
import java.awt.Color;
public class Achievements {
    

    String[] achievements = {
        "Starter",
        "Kämpfer",
    };

    String[] achievementsDescription = {
        "Mach das Tutorial zu Ende",
        "Verursache 2.5k Schaden",
    };


    

    String[] rewardDescription = {
        "Mach das Tutorial zu Ende",
        "Verursache 2.5k    Schaden",
    };


    String[] achievementsReward = {
        " +250 Münzen ",
        " +750 Münzen ",
    };

    String[] achievementsImage = {
        "Textrpg\\Images\\Achievements\\Tutorial.png",
        "Textrpg\\Images\\Others\\Damage.png",
    };

    String[] achievementsDifficulty = {
        "Leicht",
        "Normal"
    };


    Color[] achievementsColor = {
        new Color(255,0,160),
        new Color(160,0,255),
        new Color(25,255,255),
        new Color(255,120,0),
        new Color(120,0,150),
    };

    Color[] difficultyColors = {
        new Color(0,255,60),
        new Color(160,0,255),
        new Color(25,255,255),
    };

    public Achievements(){

       

    }
}
