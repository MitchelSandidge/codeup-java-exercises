package grades;

import java.util.ArrayList;

public class Student {

    protected String name;
    protected ArrayList grades;




    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(ArrayList <Integer> grades) {
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

        System.out.println(henry.getName());
    }

}
