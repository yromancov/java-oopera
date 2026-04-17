public class Balet extends MusicalShow {

    private Person choreographer;

    public Balet(MusicalShow musicalShow, Person choreographer) {
        super(musicalShow.getMusicAuthor(), musicalShow.getLibrettoText());
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
