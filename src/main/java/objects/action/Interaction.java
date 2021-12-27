package objects.action;

public class Interaction {

    public static void main (String[] args) {

        Cat barsik = new Cat();
        Human alexander = new Human();

        alexander.name = "Александр";
        alexander.age = 29;
        alexander.HasACat = false;

        alexander.sayName();
        alexander.sayAge();
        alexander.doYouHaveACat();

        barsik.name = "Барсик";
        barsik.age = 4;
        barsik.meow();
    }

}