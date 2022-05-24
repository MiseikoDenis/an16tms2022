public class User {
    public String name;
    public String surname;
    public int age;
    public String gender;

    public User() {
    }

    @Deprecated
    public User(String name) {
        this.name = name;
    }

    public User(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    public User(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }

    public void grow(int growth) {
        age += growth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
