package grades;

import util.Input;
import java.util.HashMap;


public class GradesApplication {

    public static void main(String[] args) {

        boolean cont = true;
        Input input = new Input();
        String userInput;
        boolean confirm;

        // Creating HashMap
        HashMap<String, Student> students = new HashMap<>();

        // Creating Students (Objects)
        Student john = new Student("John");
        john.addGrade(50);
        john.addGrade(80);
        john.addGrade(93);
        john.recordAttendance("3/12/17", "P");
        john.recordAttendance("3/13/17", "A");
        john.recordAttendance("3/14/17", "P");

        Student emily = new Student("Emily");
        emily.addGrade(30);
        emily.addGrade(100);
        emily.addGrade(40);
        emily.recordAttendance("3/12/17", "P");
        emily.recordAttendance("3/13/17", "A");
        emily.recordAttendance("3/14/17", "A");

        Student will = new Student("Will");
        will.addGrade(100);
        will.addGrade(95);
        will.addGrade(89);
        will.recordAttendance("3/12/17", "A");
        will.recordAttendance("3/13/17", "A");
        will.recordAttendance("3/14/17", "P");

        Student stephen = new Student("Stephen");
        stephen.addGrade(24);
        stephen.addGrade(50);
        stephen.addGrade(33);
        stephen.recordAttendance("3/12/17", "P");
        stephen.recordAttendance("3/13/17", "P");
        stephen.recordAttendance("3/14/17", "P");


        // Adding Students to the HashMap
        students.put("John-GitHub", john);
        students.put("Emily133", emily);
        students.put("Will_Code", will);
        students.put("Stephen_Tries", stephen);



        // Start of CLI (Command Line Interface)

        System.out.println("\n\n\tWelcome to our repository of students!\n");
        System.out.println("\tHere are the GitHub usernames of our students:");


        do {

            // Displays the GitHub User names of the students
            System.out.print("\t");
            for(String key : students.keySet()){
                System.out.printf("|%s| ", key);
            }

            System.out.printf("\n\n\tWhat student would you like to see more information on?\n\n\t>");

            userInput = input.getString();

            // Prints out name and grade of Student that matches userInput
            if (students.containsKey(userInput)) {
                System.out.printf("\tName: %s - GitHub Username: %s", students.get(userInput).getName(), userInput);
                System.out.printf("\n\tCurrent Average Grade: %.4s ", students.get(userInput).getGradeAverage());
                System.out.printf("\n\tAttendance Grade: %.4s ", students.get(userInput).getAttendanceGrade());

                System.out.print("\n\n\tWould you like to see another student? y/n\n\n\t>");

                // Continues if user enters "yes" or "y"
                cont = input.yesNo();

            } else {
                System.out.print("\n\tThat username does not match a user in our repository");
                System.out.print("\n\n\tWould you like to see another student? y/n\n\n\t>");

                cont = input.yesNo();
            }

        } while (cont);

        System.out.print("\n\tThanks! Have a good day :)\n");
    }
}
