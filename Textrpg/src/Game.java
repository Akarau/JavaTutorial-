public class Game {
   private Menu menu;

 Enemy enemy = new Enemy(null);
Elemente elemente = new Elemente();
Fight fight = new Fight();
CuPower cuPower = new CuPower();
Story story = new Story();
//Fight fight = new Fight();

 
    Game (){
        try {
            menu = new Menu(this);
          //  Enemy e = new Enemy();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}