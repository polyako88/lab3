package Place;
import Base.Character;
import Exception.*;
import Base.*;
public class Place  {
    protected int x;
    protected int y;
    protected int z;
    protected String name;
    public Place(String name, int x, int y, int z ) {
        setName(name);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
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

    public int distanceTo(Place other) {
        return (int)Math.sqrt(Math.pow(this.getX() - other.getX(), 2) +
                Math.pow(this.getY() - other.getY(), 2) +
                Math.pow(this.getZ() - other.getZ(), 2));
    }
    // Метод для изменения координат по окружности и уменьшения z на 1
    public int moveInCircle(double radius, double angleIncrement) {
        // Вычисляем новые координаты
        double newX = x + radius * Math.cos(angleIncrement);
        double newY = y + radius * Math.sin(angleIncrement);

        // Уменьшаем координату z на 1
        this.z -= 1;

        // Возвращаем расстояние от начальной точки до новой точки
        return (int) Math.sqrt(Math.pow(newX - x, 2) + Math.pow(newY - y, 2));
    }
}