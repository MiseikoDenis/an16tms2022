package by.tms.model;

public class MilitaryOffice {
    private Person[] personRegistry;

    public MilitaryOffice(Person[] personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void all() {
        System.out.println("Годные к службе: ");
        for (Person person : personRegistry) {
            if (person.getGender().equals("Мужчина")
                    && person.getAge() < 27
                    && person.getAge() >= 18) {
                System.out.println(person.getName());
            }
        }
    }

    public void readyCity(String city) {
        int count = 0;
        System.out.print("Количество годных к службе в городе " + city + ": ");
        for (Person person : personRegistry) {
            if (person.getGender().equals("Мужчина")
                    && person.getAge() < 27
                    && person.getAge() >= 18
                    && person.getCity().equals(city)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void readyAge() {
        int count = 0;
        System.out.print("Количество призывников в возрасте от 25 до 27: ");
        for (Person person : personRegistry) {
            if (person.getAge() <= 27 && person.getAge() >= 25) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void readyName(String name){
        int count = 0;
        System.out.print("Количество призывников с именем " + name + ": ");
        for (Person person : personRegistry) {
            if (person.getName().equals(name)) {
                count++;
            }
        }
        System.out.println(count);
    }


}
