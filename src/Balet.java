public class Balet extends MusicalShow {

    private String choreographer;

    public Balet(String musicAuthor, String librettoText, String choreographer) {
        super(musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    @Override
    public void printLibretto() {
        super.printLibretto();
    }
}
