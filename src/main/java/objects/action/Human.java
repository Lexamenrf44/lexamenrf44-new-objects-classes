package objects.action;

public class Human {

    public String name;
    public int age;
    boolean HasACat;

    public void sayName() {
        System.out.println("Моё имя: " + name);
    }

    public void sayAge() {
        System.out.println("Мне " + age + " лет");
    }

    public void doYouHaveACat() {
            System.out.println(HasACat);
        }
    }
