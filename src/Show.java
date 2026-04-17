import javax.naming.NamingEnumeration;
import java.util.ArrayList;
import java.util.HashMap;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;
//    ArrayList<Actor> actors = new ArrayList<>();

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;

    }
//    HashMap<Show, ArrayList<Actor>> actorShow = new HashMap<>();


    public void addActors(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть в команде");
            return;
        }

        listOfActors.add(actor);
        System.out.println("Добавлен новый актер!");
    }


    public void printActorsShow() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void changeActors(String surname, Actor actor) {

        for (Actor actorForRemove : listOfActors) {
            if (actorForRemove.getSurname().equals(surname)) {
                listOfActors.remove(actorForRemove);
                listOfActors.add(actor);
                System.out.println("Актер успешно заменен");
                return;
            }

        }
        System.out.println("Данного актера не существует!");
    }
}
