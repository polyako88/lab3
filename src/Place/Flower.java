package Place;
import Nature.*;

import java.util.Random;

public class Flower extends Place {
    private int HP;

    public Flower( int x, int y, int z, int HP, String name) {
        super(name, x, y, z);
        Random rand = new Random();
        this.HP = rand.nextInt(9); // Генерация HP от 0 до 8
    }

    public void landOnFlower(Bee bee) {
        // Уменьшаем HP на 50%
        HP = HP / 2;
        System.out.println("Bee landed on " + getName() + ". HP reduced to: " + HP + "Flower is swaying");
    }
    // Геттеры для координат
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
