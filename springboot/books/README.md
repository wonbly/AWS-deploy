# Books Management Project

팀 프로젝트 협업을 위해 표준 아키텍처와 자동 로그 시스템을 구축한 도서 관리 프로젝트

## 기술 스택
- Language: Java 11
- Framework: Spring Boot 2.7.18
- Database: MySQL 8.0
- Library: JPA, Lombok, AOP

## 프로젝트 구조
- controller: API 엔드포인트 관리
- aop: 자동 로깅 및 성능 측정
- config: 예외 처리 및 공통 설정
- dto: 데이터 전송 규격화
- entity: DB 테이블 매핑

## 공통 세팅 가이드

### 1. 자동 로그 시스템 (AOP)
- 모든 컨트롤러 메서드는 실행 시 메서드명, 매개변수, 반환값, 실행 시간이 콘솔에 자동 출력
- 코드 내부에 별도의 출력문(syso)을 작성하지 않아도 모니터링 가능

### 2. 응답 규격화 (ResponseDTO)
- 프론트엔드와의 원활한 통신을 위해 모든 응답은 ResponseDTO 객체 통일
- 상태 코드와 메시지, 데이터를 포함하여 일관성 있는 데이터 반환

### 3. 예외 처리 (Global Exception)
- 런타임 오류 발생 시 시스템 중단을 막기 위해 GlobalExceptionHandler 작동
- 예외 상황 시 규격화된 오류 메시지 전달

### 4. DB 로그 설정
- application.yaml 설정 : 실제 실행되는 SQL 쿼리 및 파라미터 값 실시간 확인 가능

## 협업 규칙
- 새로운 기능은 feature 브랜치에서 작업 후 dev 브랜치로 Pull Request
- 모든 API는 자동 로그가 적용되도록 반드시 controller 패키지 내에 작성 필수