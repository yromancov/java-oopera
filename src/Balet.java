import java.util.ArrayList;

public class Balet extends MusicalShow {

    private Person choreographer;

    public Balet(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                 String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }


    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }

    @Override
    public void printLibretto() {
        super.printLibretto();
    }


}
