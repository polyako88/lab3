package Base;
import Place.*;
public abstract class Human extends Character{
    protected int age;
    public Human(Place location, String name, int age) {
        super(location, name);
        this.age = age;
    }
    public void react(){
        System.out.println("персонаж реагирует");
     }
}
