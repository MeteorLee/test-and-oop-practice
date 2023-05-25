# 테스트와 객체지향 연습 프로젝트

## 테스트

### 테스트 코드 작성 이유

#### 1. 문서화

@DisplayName()에 설명만 잘 적어도 하나의 정리된 문서처럼 테스트 코드를 사용할 수 있음

#### 2. 코드에 결함을 발견하기 쉬움

테스트에 통과하지 못하면 바로 알아차릴 수 있어 결함을 발견하기 쉬움

#### 3. 리팩토링 시 안정성 확보

한줄의 리팩토링을 하더라도 바로바로 테스트를 돌릴 수 있어서 안정감이 높음

#### 4. 테스트하기 쉬운 코드를 작성하다 보면 더 낮은 결합도를 가진 설계를 할 수 있음

강결합된 코드들은 테스트하기가 어려운 경우가 많기에 테스트가 가능하게 코드를 리팩토링하면 결합도를 낮출 수 있음


## 객체 지향

### 객체 지향적 설계 및 구현

1. 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
2. 객체들 간의 관계를 고민
3. 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
4. 협력을 설계
5. 객체들을 포괄하는 타입에 적절한 책임을 할당
6. 구현하기

- 참고 : 객체지향 세계에서는 모든 객체가 능동적인 존재