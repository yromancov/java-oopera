import java.util.ArrayList;

public class Show {
    ArrayList<Actor> actors = new ArrayList<>();

    public void addActors(){

    }
    public void printActorsShow(){
        for (Actor actor : actors){
            System.out.println(actor.getName()+" "+actor.getSurname()+" ("+actor.getHeight()+")");
        }
    }
}
