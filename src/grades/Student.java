package grades;

import java.util.ArrayList;

public class Student {

    // Initializing Variables
    protected String name;
    protected ArrayList<Integer> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        Integer sum = 0;
        if(!grades.isEmpty()) {
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum.doubleValue() / grades.size();
        }
        return sum;
    }


    public static void main(String[] args) {
        Student henry = new Student("Henry");
        Student bill = new Student("Bill");

        henry.addGrade(98);
        henry.addGrade(37);

        System.out.println(henry.getName());
        System.out.println(henry.getGradeAverage());
//        System.out.println(henry.getName());
    }

}
