public class Game {
    Menu menu;
 //RandomEnemy r = new RandomEnemy();

 
    Game (){

        try {
            menu = new Menu();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
