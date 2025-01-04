package Base;
import Place.*;
import Exception.*;

public abstract class Character {
    protected Place location;
    protected String name;

    public Character(Place location, String name) {
        this.location = location;
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidName {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidName("Имя персонажа/название не может быть пустым или null.");
        }
        this.name = name;
    }
    public Place getLocation () {
            return location;
    }
}
