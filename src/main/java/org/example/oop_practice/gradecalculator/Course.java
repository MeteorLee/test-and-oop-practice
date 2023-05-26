package org.example.oop_practice.gradecalculator;

public class Course {

    private final String subject; // 과목명
    private final int credit; // 학점
    private final String grade; // 성적 (A+, A, B+, ...);


    public Course(String subject, int credit, String gradle) {
        this.subject = subject;
        this.credit = credit;
        this.grade = gradle;
    }

    public int getCredit() {
        return credit;
    }

    // 성적의 문자열 -> int로 바꾸기 위해 필요
    public double getGradleNumber() {
        double gradeInt = 0;
        switch (this.grade) {
            case "A+":
                gradeInt = 4.5;
                break;
            case "A":
                gradeInt = 4.0;
                break;
            case "B+":
                gradeInt = 3.5;
                break;
            case "B":
                gradeInt = 3.0;
                break;
            case "C+":
                gradeInt = 2.5;
                break;
            case "C":
                gradeInt = 2.0;
                break;
            case "D+":
                gradeInt = 1.5;
                break;
            case "D":
                gradeInt = 1.0;
                break;
            case "F":
                gradeInt = 0.0;
                break;
        }

        return gradeInt;
    }
}
