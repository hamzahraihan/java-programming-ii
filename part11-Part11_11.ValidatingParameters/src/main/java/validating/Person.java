package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.length() > 40 || name.isEmpty()) {
            throw new IllegalArgumentException("The name given as the parameter is null, empty, or over 40 characters in length");
        }
        this.name = name;

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("The age should between 0 and 120.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
