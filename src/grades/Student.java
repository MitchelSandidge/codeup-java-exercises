package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    // Initializing Variables
    protected String name;
    protected ArrayList<Integer> grades;
    protected HashMap<String, String> attendance;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
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


    // Adds date and a "P" or "A" Value to the "attendance" HashMap
    public void recordAttendance(String date, String value) {
        if (value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P") && !this.attendance.containsKey(date)) {
            this.attendance.put(date, value.toUpperCase());
        }
    }

    public double getAttendanceGrade() {
        double daysPresent = 0;
        for(String key : this.attendance.keySet()){
            if(this.attendance.get(key).equals("P")) {
                daysPresent++;
            }
        }
        return (daysPresent/this.attendance.size()) * 100;
    }


//    public static void main(String[] args) {
//        Student henry = new Student("Henry");
//        Student bill = new Student("Bill");
//
//        henry.addGrade(98);
//        henry.addGrade(37);
//
//        System.out.println(henry.getName());
//        System.out.println(henry.getGradeAverage());
//        System.out.println(henry.getName());
//    }

}
