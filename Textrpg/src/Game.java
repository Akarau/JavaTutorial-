public class Game {
    Menu menu;


 Enemy enemy = new Enemy();

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
