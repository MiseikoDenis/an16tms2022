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
                System.out.println(person);
            }
        }
    }


}
