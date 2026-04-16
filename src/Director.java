public class Director extends  Person{
    private final String name;
    private final String surname;
    private final Gender gender;
    private final int height;
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int height, String name1, String surname1, Gender gender1, int height1, int numberOfShows) {
        super(name, surname, gender, height);
        this.name = name1;
        this.surname = surname1;
        this.gender = gender1;
        this.height = height1;
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                ", numberOfShows=" + numberOfShows +
                '}';
    }
}
