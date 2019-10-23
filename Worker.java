package oop.lab;

public class Worker {
    private String name;

    public Worker(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String result = "Worker: " + name;
        return result;
    }
}
