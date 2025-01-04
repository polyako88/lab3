package Place;
import Base.*;
import Heroes.*;

public class Studio extends Place{
    public Studio( String name, int x, int y, int z) {
        super(name, x, y, z);
    }
    public void interactWithDorian(Artist artist, DorianGray dorian) {
        System.out.println(artist.getName() + " calls out to " + dorian.getName() + "...");
        dorian.turn(); // Дориан поворачивается
        System.out.println(artist.getName() + " and " + dorian.getName() + " smile at each other.");
    }
}
