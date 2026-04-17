import java.util.ArrayList;
import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Петр", "Зайцев", Gender.MALE, 175);
        Actor actor2 = new Actor("Алеся", "Лапаухая", Gender.FEMALE, 167);
        Actor actor3 = new Actor("Олег", "Щербаков", Gender.MALE, 185);
        Director director1 = new Director("Кристофер", "Нолан", Gender.MALE,192, 11);
        Director director2 = new Director("Квентин", "Торантино", Gender.MALE,181, 8);
        Person musicauthor = new Person("Hans", "Zimmer", Gender.MALE, 170);
        Person choreographer = new Person("Анастасия", "Волочкова", Gender.FEMALE, 184);
        ArrayList <Actor> listOfActors= new ArrayList<>();
        Show show = new Show(Actor actor);
        Scanner scanner = new Scanner(System.in);
        Show show = new Show();
        while (true) {
            printmenu();

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    System.out.println("Режиссер пока не реализован");
                    break;

                case 2:
                    show.printActorsShow();
                    break;

                case 3:
                    addActor(scanner, show);
                    break;

                case 4:

                    break;

                case 0:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неизвестная команда");
            }
        }


    }

    public static void printmenu() {
        System.out.println("\nВыберите номер команды:");
        System.out.println("1. Информация о режиссере");
        System.out.println("2. Список актеров");
        System.out.println("3. Добавить актера");
        System.out.println("4. Заменить актера");
        System.out.println("0. Выход");
    }

    public static void addActor(Scanner scanner, Show show) {
        System.out.println("Введите имя актера:");
        String name = scanner.nextLine();

        System.out.println("Введите фамилию актера:");
        String surname = scanner.nextLine();

        Gender gender = null;
        System.out.println("Введите пол актера (MALE/FEMALE):");
        String input = scanner.nextLine();
        gender = Gender.valueOf(input.toUpperCase());

        System.out.println("Введите рост актера:");
        int height = scanner.nextInt();
        scanner.nextLine();

        show.addActors(new Actor(name, surname, gender, height));
    }

    public void changeActor(Scanner scanner, Show show) {
        System.out.println("Введите фамилия актера которого нужно заменить");
        String surname = scanner.nextLine();
        System.out.println("На кого меняем?");

        System.out.println("Введите имя нового актера:");
        String name = scanner.nextLine();

        System.out.println("Введите фамилию нового актера:");
        String surname2 = scanner.nextLine();

        Gender gender = null;
        System.out.println("Введите пол нового актера (MALE/FEMALE):");
        String input = scanner.nextLine();
        gender = Gender.valueOf(input.toUpperCase());

        System.out.println("Введите рост нового актера:");
        int height = scanner.nextInt();
        scanner.nextLine();

    }
}
