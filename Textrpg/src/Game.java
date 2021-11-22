public class Game {
    Menu menu;
 
    Game (){
        try {
            menu = new Menu();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
