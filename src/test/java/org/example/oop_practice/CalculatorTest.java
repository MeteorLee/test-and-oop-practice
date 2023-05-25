package org.example.oop_practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * MVC패턴(Model-View-Controller) 기반으로 구현한다
 */
public class CalculatorTest {

    // 1 + 2 -------> Calculator  피연산자 2개와 연산자 1개 전달 작업 위임
    // 3    <-------------------  결과값을 전달해줌
    // Calculator에게 이런 규약을 가진 public 인터페이스를 만들어 준다.
    @DisplayName("덧셈 연산을 수행한다.")
    @Test
    void additionTest() {

        int result = Calculator.calculate(1, "+", 2);

        assertThat(result).isEqualTo(3);

    }
}
