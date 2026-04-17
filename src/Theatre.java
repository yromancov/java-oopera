import java.util.ArrayList;
import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Петр", "Зайцев", Gender.MALE, 175);
        Actor actor2 = new Actor("Алеся", "Лапаухая", Gender.FEMALE, 167);
        Actor actor3 = new Actor("Олег", "Щербаков", Gender.MALE, 185);
        Director director1 = new Director("Кристофер", "Нолан", Gender.MALE, 7);
        Director director2 = new Director("Квентин", "Торантино", Gender.MALE, 8);
        Person musicauthor = new Person("Hans", "Zimmer", Gender.MALE);
        Person choreographer = new Person("Анастасия", "Волочкова", Gender.FEMALE);
        Show show = new Show("Мастер и Маргарита", 100, director1, new ArrayList<>());
        Opera opera = new Opera("Кармен", 120, director2, new ArrayList<>(), musicauthor,
                "Сценарий", 12);
        Balet balet = new Balet("Лебединое озеро", 132, director1, new ArrayList<>(), musicauthor,
                "Сценарий", choreographer);
        show.addActors(actor1);
        show.addActors(actor1);
        show.addActors(actor2);
        opera.addActors(actor3);
        balet.addActors(actor2);
//        show.printActorsShow();
//        opera.printActorsShow();
//        balet.printActorsShow();
        show.changeActors("Зайцев",actor3);
        opera.printLibretto();
        balet.printLibretto();


    }
}
