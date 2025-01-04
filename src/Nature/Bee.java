package Nature;
import Base.*;
import Base.Character;
import Place.*;
import Exception.*;
import ENUMS.*;
public class Bee extends Character { ;
    public Bee(Place location, String name) {
        super(location, name);
    }


    public void moveInCircle(double radius, double angleIncrement, Time time) {
        double radiusic = 5.0; // Радиус движения по окружности
        double angle = 0.0; // Начальный угол
        double timeInMinutes = 0;
        // Устанавливаем время в зависимости от переданного ENUM
        switch (time) {
            case SECOND:
                timeInMinutes = 1.0 / 60; // 1 секунда = 1/60 минуты
                break;
            case MINUTE:
                timeInMinutes = 1; // 1 минута
                break;
            case HOUR:
                timeInMinutes = 60; // 1 час = 60 минут
                break;
        }
        System.out.println("Bee is moving in a circle with radius " + radius + " for " + timeInMinutes + " minutes.");

    }


    // перемещение пчелы к цветку и проверка с помощью equals
    public void flyToFlower(Flower flower) {
        this.location = new Place(flower.getName(), flower.getX(), flower.getY(), flower.getZ());
        System.out.println("Bee is flying to the flower at coordinates: (" + flower.getX() + ", " + flower.getY() + ", " + flower.getZ() + ")");

        // Проверяем, совпадают ли координаты
        if (this.equals(flower)) {
            System.out.println("Bee has landed on the flower!");
            flower.landOnFlower(this); // Уменьшаем HP цветка
        } else {
            System.out.println("Bee did not land on the flower.");
        }
    }

    // перемещение пчелы к ветке и проверка с помощью equals
    public void flyToBranch(Branch branch) {
        // Перемещение пчелы к координатам цветка
        this.location = new Place(branch.getName(), branch.getX(), branch.getY(), branch.getZ());
        System.out.println("Bee is flying to the branch at coordinates: (" + branch.getX() + ", " + branch.getY() + ", " + branch.getZ() + ")");

        // Проверяем, совпадают ли координаты
        if (this.equals(branch)) {
            System.out.println("Bee has landed on the branch!");
            branch.landOnBranch(this); // Уменьшаем HP ветки
        } else {
            System.out.println("Bee did not land on the branch.");
        }
    }
}