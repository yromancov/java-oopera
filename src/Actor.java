import java.util.Objects;

public class Actor extends Person{


    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);

    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return getHeight() == actor.getHeight() && Objects.equals(getName(), actor.getName()) && Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }
}
