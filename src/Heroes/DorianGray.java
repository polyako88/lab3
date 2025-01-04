package Heroes;
import Base.*;
import Nature.*;
import Place.*;
import Exception.*;

public class DorianGray extends Human {
    private String[] thoughts;
    public DorianGray(Place location, String name, int age) {
        super(location, name, age);
        // Инициализация массива мыслей
        thoughts = new String[]{
                "Какой прекрасный день для прогулки!",
                "Интересно, где сейчас пчела?",
                "Пчела села на ветку, надеюсь, она не укусит!",
                "Пчела летит к цветку, надеюсь, она принесет мне нектар.",
                "Пчела приземлилась на цветок, как мило!"
        };
    }

    public String think(Bee bee) throws BeeFlyPast {
        Place beeLocation = bee.getLocation(); // Получаем текущее местоположение пчелы
        // Проверяем местоположение пчелы
        if (beeLocation.getName().equals("Branch") || beeLocation.getName().equals("Flower")) {throw new BeeFlyPast("Пчела пролетела мимо, Дориан не думает ни о чем.");}
        // Проверяем местоположение пчелы и возвращаем соответствующую мысль
        if (beeLocation.getName().equals("Branch")) {return thoughts[2]; // Мысль о ветке
        } else if (beeLocation.getName().equals("Flower")) {
            return thoughts[4]; // Мысль о цветке
        } else {
            return thoughts[1]; // Общая мысль о пчеле
        }

    }
    @Override
    public void react() {
        System.out.println(getName() + "широко раскрыл глаза и внимательно слушал");
    }
    public void turn() {
        System.out.println(getName() + "повернулся ");
    }

}