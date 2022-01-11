/*public class Controller {
    


    String text,nextPosition1,nextPosition2,nextPosition3,nextPosition4;

    private Story menu;


    CuPower spieler = new CuPower();

public void controller(){
    


    

    public void DerAnfangende(){

        menu.mainTextArea.setText("Enttäuscht schaut dich der alte Mann an. Stöhnend und hustend geht er weg.\n\nDein Urlaub geht ganz normal weiter");
    
        menu.option1button.setText("Spiel beenden");
    
       
    
     nextPosition1="Beenden";
    
    nextPosition2="Meinung ändern";
    
    }

    public void selectposition(String nextPosition){

        switch(nextPosition){
    
            case "Auftragannehmen":break;
    
            case "Anfangpart2":DerAnfangpart2();break;
    
            case "Anfangpart3":DerAnfangpart3();break;
    
            case "AuftragannehmenNein":DerAnfangende();break;
    
            case "Beenden":menu.frame.setVisible(false);break;
    
        }
    }


    public void actionPerformed(java.awt.event.ActionEvent d) {

        String yourChoice = d.getActionCommand();
    
        switch(yourChoice){  
    
            case "start":
            Story.texarea.setVisible(true);
            Story.confirmName.setVisible(true);
            ;break;    
     
            case "o1":
            selectposition(nextPosition1);
            System.out.println("Fbes");
            ;break;
    
            case "o2":selectposition(nextPosition2);break;
    
            case "o3":selectposition(nextPosition3);break;
    
            case "o4":selectposition(nextPosition4);break;
    
       }          
    
    
    }

    try {
        menu = new Story(null, this);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
}
*/