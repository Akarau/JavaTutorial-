public class Game {
<<<<<<< HEAD
  private Story menu;

Enemy enemy = new Enemy(null);
Elemente elemente = new Elemente();
Fight fight = new Fight();
CuPower cuPower = new CuPower();
//Story story = new Story();
//Fight fight = new Fight();


   Game (){
       try {
           menu = new Story(this);
         //  Enemy e = new Enemy();
       } catch (InterruptedException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
   }
=======
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
>>>>>>> 45aac735882bfc5cc0e73af88aebb371d62e2213
}