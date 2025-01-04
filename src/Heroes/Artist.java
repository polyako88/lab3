package Heroes;
import Base.*;
import Place.*;
public class Artist extends Human {
    public Artist(Place location, String name, int age){
        super(location, name, age);
    }
    public void turn(DorianGray dorian){
        System.out.println( getName() +"повернулся к " + dorian.getName());
    }

    public void callDorian(DorianGray dorian) {
        System.out.println(name + " is in the studio.");
        // Вызов метода взаимодействия в студии
        ((Studio) location).interactWithDorian(this, dorian);
    }

    public void setLocation(Place location) {
        this.location = location; // Устанавливаем новое местоположение
    }
    public void enter(Place newLocation) {
        this.location = newLocation; // Устанавливаем новое местоположение
        System.out.println(name + " has entered the " + newLocation.getName() + ".");
    }
}
