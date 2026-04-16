public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String musicAuthor, String librettoText, int choirSize) {
        super(musicAuthor, librettoText);
        this.choirSize = choirSize;
    }



    @Override
    public void printLibretto() {
        super.printLibretto();
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}
