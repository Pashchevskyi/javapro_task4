package ua.ithillel.lms.javapro.pavlopashchevskyi.task4;

abstract public class Animal {

    private static int count = 0;

    protected String name;

    protected static double maxRunDistance;
    protected static double maxSwimDistance;

    public Animal(String name) {
        count++;
        this.name = name;
    }

    abstract protected void run(double obstacleLength);
    abstract protected void swim(double obstacleLength);

    protected static int getCount() {
        return count;
    }

    @Override
    protected void finalize() throws Throwable {
        count--;
        super.finalize();
    }
}
