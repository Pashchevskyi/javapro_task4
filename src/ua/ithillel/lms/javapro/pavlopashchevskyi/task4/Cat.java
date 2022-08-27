package ua.ithillel.lms.javapro.pavlopashchevskyi.task4;

public class Cat extends Animal {

    private static int count = 0;

    protected static final double maxRunDistance = 200.000;
    protected static final double maxSwimDistance = 0.000;

    public Cat(String name) {
        super(name);
        count++;
    }

    public void swim(double obstacleLength) {
        System.out.println("Кіт не вміє плавати!");
    }

    public void run(double obstacleLength) {
        if (obstacleLength >= 0 && obstacleLength <= maxRunDistance) {
            System.out.println("Кіт " + name + " пробіг " + obstacleLength + " м.");
        } else {
            System.out.println("Кіт не зможе стільки пробігти");
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
