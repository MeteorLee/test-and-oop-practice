package org.example.oop_practice.gradecalculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    /**
     * 요구사항
     * 평균학점 계산 방법 = (학점수 * 교과목 평점)의 합계 / 수강신청 총학점 수
     * 일급 컬렉션 사용
     */
    public double calculateGrade() {
        // (학점수 * 교과목 평점)의 합계
        double totalMultiplyCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        // 수강 신청 총 학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalMultiplyCreditAndCourseGrade / totalCompletedCredit;
    }


    // 테스트 통과를 위해 일단 4.5를 return하게 만듬
    // 이러면 테스트가 통과하는 것이 확인 되었으므로 다음 번에 코드를 작성하고 테스트를 통과하면 잘 작성된 코드임을 확인할 수 있음
    // 코드 작성 -> 테스트 통과 -> 안정성 상승
//    public double calculateGrade() {
//        return 4.5;
//    }
}
