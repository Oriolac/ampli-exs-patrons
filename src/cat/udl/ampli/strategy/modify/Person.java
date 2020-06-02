package cat.udl.ampli.strategy.modify;

public class Person {

    private int age;
    private int height;

    public Person(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public void incAge() {
        age++;
    }

    public void incHeight() {
        height++;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}
