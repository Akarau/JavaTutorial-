public class Game {
    Menu menu;

 Enemy enemy = new Enemy(null);
Elemente elemente = new Elemente();
Fight fight = new Fight();
//Fight fight = new Fight();

 
    Game (){
        try {
            menu = new Menu();
          //  Enemy e = new Enemy();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}