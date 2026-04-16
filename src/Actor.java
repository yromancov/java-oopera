import java.util.Objects;

public class Actor extends Person{
    private final String name;
    private final String surname;
    private final Gender gender;
    private final int height;

    public Actor(String name, String surname, Gender gender, int height, String name1, String surname1, Gender gender1, int height1) {
        super(name, surname, gender, height);
        this.name = name1;
        this.surname = surname1;
        this.gender = gender1;
        this.height = height1;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return getHeight() == actor.getHeight() && Objects.equals(getName(), actor.getName()) && Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getGender(), getHeight());
    }
}
