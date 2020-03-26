import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        Person[] personArray = new Person[3];

        Person caleb = new Person("Caleb");
        Person ashley = new Person("Ashley");
        Person dom = new Person("Dom");

        personArray[0] = caleb;
        personArray[1] = ashley;
        personArray[2] = dom;

        for (Person person : personArray) {
            System.out.println("\n\n\t" + person.getName());
            System.out.printf(person.sayHello());
        }


        // Adding "Cindy" to the array
        personArray = addPerson(personArray, new Person("Cindy"));
        // Adding "Jamie" to the array
        personArray = addPerson(personArray, new Person("Jamie"));
        // Adding "Holly" to the array
        personArray = addPerson(personArray, new Person("Holly"));


        for(Person person : personArray) {
            System.out.println("\n\t\t" + person.getName());
        }


        // Holly is added to the array even though the length of the array is 3 ??
        System.out.println(personArray[5].getName());

    }   // End of main



    // Method that adds the person to the array
    public static Person[] addPerson(Person[] people, Person personArray) {
        Person[] addPeople = Arrays.copyOf(people, people.length + 1);
        addPeople[addPeople.length - 1] = personArray;

        return addPeople;
    }
}
