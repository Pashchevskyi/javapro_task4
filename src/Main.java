import ua.ithillel.lms.javapro.pavlopashchevskyi.task4.Animal;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task4.Cat;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task4.Dog;

public class Main {

    public static void main(String[] args) {
        Animal dogBob = new Dog("Бобік");
        dogBob.run(150);
        dogBob.swim(5);

        Animal dogRex = new Dog("Рекс");
        dogRex.run(-1);
        dogRex.swim(-1);

        Animal dogMukhtar = new Dog("Мухтар");
        dogMukhtar.run(0);
        dogMukhtar.swim(0);

        Animal dogPango = new Dog("Панго");
        dogPango.run(501);
        dogPango.swim(11);

        Animal dogPardi = new Dog("Парді");
        dogPardi.run(500);
        dogPardi.swim(10);

        Animal catTom = new Cat("Том");
        catTom.run(100);
        catTom.swim(100);

        Animal catLeopold = new Cat("Леопольд");
        catLeopold.run(200);

        Animal catMura = new Cat("Мура");
        catMura.run(-1);
        catMura.run(201);;
        catMura.run(0);

        System.out.println("Всього тварин: " + Animal.getCount());
        System.out.println(" З них:");
        System.out.println("  Котів: " + Cat.getCount());
        System.out.println("  Собак: " + Dog.getCount());
    }
}
