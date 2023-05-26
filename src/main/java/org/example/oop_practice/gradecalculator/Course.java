package org.example.oop_practice.gradecalculator;

public class Course {

    private final String subject; // 과목명
    private final int credit; // 학점
    private final String gradle; // 성적


    public Course(String subject, int credit, String gradle) {
        this.subject = subject;
        this.credit = credit;
        this.gradle = gradle;
    }
}
