package org.example.oop_practice.gradecalculator;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        double mulitipledCreditAndCourseGrade = 0;
        for (Course course : courses) {
            mulitipledCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }
        return mulitipledCreditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
