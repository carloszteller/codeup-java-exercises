import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers)); // Without Arrays.toString() - prints: [I@38af3868

        Person[] people = { new Person("Bob"), new Person("Jane"), new Person("John") };

//        for(Person person : people) {
//            System.out.println(person.getName());
//        }

        people = addPerson(people, new Person("Cindy"));

        for(Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] addPeople = Arrays.copyOf(people, people.length + 1);
        addPeople[addPeople.length - 1] = person;

        return addPeople;
    }
}
