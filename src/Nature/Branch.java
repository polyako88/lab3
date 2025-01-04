package Nature;
import Place.*;
import Exception.*;
import Base.*;
import java.util.Random;

public class Branch extends Place {
    private int HP;
    public Branch( Hand hand, String name, int HP) {
        super(name, hand.getX(), hand.getY(), hand.getZ());
        Random rand = new Random();
        this.HP = rand.nextInt(9); // Генерация HP от 0 до 8
    }
    public void fallToSand(Sand sand) {
        // Обновляем координаты ветки, используя параметры песка
        this.x = sand.getX(); // Прямое изменение координаты x
        this.y = sand.getY(); // Прямое изменение координаты y
        this.z = sand.getZ(); // Прямое изменение координаты z
        System.out.println("Branch has fallen to the sand at coordinates: (" + this.x + ", " + this.y + ", " + this.z + ")");
    }
    public void landOnBranch(Bee bee) {
        // Уменьшаем HP на 50%
        HP = HP / 2;
        System.out.println(bee.getName()+"landed on " + getName() + ". HP reduced to: " + HP);
    }

    public int getX() {
        return super.getX();
    }

    public int getY() {
        return super.getY();
    }

    public int getZ() {
        return super.getZ();
    }
}