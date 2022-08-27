package ua.ithillel.lms.javapro.pavlopashchevskyi.task4;

public class Dog extends Animal {

    private static int count = 0;

    protected static final double maxRunDistance = 500.000;
    protected static final double maxSwimDistance = 10.000;

    public Dog(String name) {
        super(name);
        count++;
    }

    public void run(double obstacleLength) {
        if (obstacleLength >= 0 && obstacleLength <= maxRunDistance) {
            System.out.println("Собака " + name + " пробіг " + obstacleLength + " м.");
        } else {
            System.out.println("Собака не зможе стільки пробігти");
        }
    }

    public void swim(double obstacleLength) {
        if (obstacleLength >= 0 && obstacleLength <= maxSwimDistance) {
            System.out.println("Собака " + name + " проплив " + obstacleLength + " м.");
        } else {
            System.out.println("Собака не зможе стыльки проплисти");
        }
    }

    public static int getCount() {
        return count;
    }

    @Override
    protected void finalize() throws Throwable {
        count--;
        super.finalize();
    }
}
