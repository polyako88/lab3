import Place.*;
import Base.*;
import Nature.*;
import Exception.*;
import Heroes.*;
public class Main {
    public static void main(String[] args) {
        // Создаем места
        Place street = new Place("Street", 1, 2, 3);
        Place studio = new Place("Studio", 1, 0, 0);
        Place branch = new Place("Branch", 2, 0, 0);
        Place flower = new Place("Flower", 1, 2, 0);
        Place hand = new Place("Hand", 1, 2, 3);

        // Создаем персонажей
        Artist artist = new Artist(street,"Vincent", 45); // Художник на улице
        DorianGray dorian = new DorianGray(studio,"Dorian", 17); // Дориан
        Bee bee = new Bee(branch, "HoneyBee"); // Пчела на ветке
        Branch branch = new Branch(hand, "Branch");

        // Действие
        dorian.react();
        branch.fallToSand(Sand);
        artist.enter(studio);
        System.out.println(artist.getName() + " has entered the " + studio.getName() + ".");

        // Дориан думает о пчеле
        try {
            System.out.println(dorian.think(bee));
        } catch (BeeFlyPast e) {
            System.out.println(e.getMessage()); // Пчела пролетела мимо
        }

        // Художник вызывает Дориана
        artist.callDorian(dorian);
    }
}
