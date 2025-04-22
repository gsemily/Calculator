# Java Project - Arithmetic Calculator

## 💻프로젝트 소개
사칙연산 기능을 수행하는 계산기 프로그램

### ⏰개발 기간
25.04.16 ~ 25.04.22

### ⚙️개발 환경
* Java 17
* JDK 1.8.0
* IDE : IntelliJ IDEA 2024.3.5

## 📄프로젝트 구조
src

├── calculator

│ ├── ArithmeticCalculator

│ └── OperatorType

├── input

│ ├── InputVarify

│ ├── CalculatorExecutor

│ ├── ContinueChecker

│ └── RemoveResult

└── Main


## 📌주요기능
**사용자로부터 계산 정보 입력받기**
* 양의 정수 또는 양의 실수 2개(0 포함)
* 사칙연산 기호(➕,➖,✖️,➗)

**입력한 숫자의 형태(정수, 실수) 판별**
* 입력값에 소수점이 포함되어 있는지 여부를 기준으로 자동 판별
* `Integer` 또는 `Double` 타입으로 파싱하여 계산기 객체 생성

**계산 수행 후 컬렉션 저장**
* `ArithmeticCalculator<T>` 클래스 내부의 계산 메소드를 통한 계산 진행
* static 컬렉션에 계산 결과를 저장하여 전체 결과 확인 가능

**계산 계속할지 여부 확인**
* 사용자에게 y/n 입력을 받아 반복 여부 결정
* 종료 전까지 여러 번 계산 가능

**계산결과 삭제**
* 가장 먼저 저장된 결과값 삭제 여부 확인
* 삭제 선택 시 결과 목록에서 제거 후 목록 재출력

**입력한 값보다 큰 값 출력**
* 사용자로부터 기준값 입력받기
* 필터링된 결과 목록 출력
