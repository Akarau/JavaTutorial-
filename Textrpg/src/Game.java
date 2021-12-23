public class Game {
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
}