package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {

    private String courseName;
    private double creditHours;
    private HashMap<String, Integer> studentRoster = new HashMap<>();

    public Course (String courseName, int creditHours, HashMap<String, Integer> studentRoster){

        this.courseName = courseName;
        this.creditHours = creditHours;
        this.studentRoster = studentRoster;
    }

    public String getCourseName() {
        return courseName;
    }
    public double getCreditHours() {
        return creditHours;
    }
    public HashMap<String, Integer> getStudentRoster() {
        return studentRoster;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public void setStudentRoster(HashMap<String, Integer> studentRoster) {
        this.studentRoster = studentRoster;
    }
}
