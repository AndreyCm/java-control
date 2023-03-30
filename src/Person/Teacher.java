package Person;

public class Teacher extends Person{
    private String firstName;

    private String lastName;

    private int age;
    private String position;

    public Teacher(String firstName, String lastName, int age, String position) {
        super(firstName, lastName, age);

        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
