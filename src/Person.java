public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName() {
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello %s!", getName());
    }

    public static void main(String[] args) {
//        Person bob = new Person();
//        bob.name = "Bob";
//
//        bob.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // Jane
//        System.out.println(person2.getName()); // Jane


    }
}