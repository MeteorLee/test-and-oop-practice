package org.example.oop_practice.gradecalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수 * 교과목 평점)의 합계 / 수강신청 총학점 수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    // 1. 도메인을 구성하는 객체에는 어떤 것들이 있을지 고민
    // 학점 계신기 도메인 : 이수한 과목(객체지향 프로그래밍, 자료구조, 중국어 회화), 학점 계산기

    // 2. 객체들 간의 관계를 고민
    // 학점 계산기에서 이수한 과목을 인스턴스 변수로 받아서 학점을 계산할 것 같음

    // 3. 동적인 객체를 정적인 타입으로 추상화 해서 도메인 모델링
    // 이수한 과목 : 객체지향 프로그래밍, 자료구조, 중국어 회화 --> 3개의 객체를 과목(코스) 클래스로 표현

    // 4. 협력을 설계
    // 이수한 과목을 전달하여 평균학점 계산 요청 --> 학점 계산기(계산 요청) --> (학점수 * 교과목 평점)의 합계 --> 과목(코스)(학점, 교과목 평점 등의 정보 요청)
    //                                                            -->    수강신청 총학점 수       --> 과목(코스)(이수한 과목의 총학점 수 요청)


    // 5. 객체들을 포괄하는 타입에 적절한 책임을 할당
    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradleCalculator = new GradeCalculator(courses);
        double gradeResult = gradleCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
