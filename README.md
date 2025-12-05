# SPRING ADVANCED
이 프로젝트는 Spring Boot 기반에서 발생하는
에러 분석, ArgumentResolver 복구, 리팩토링, N+1 해결, 테스트 보완을 수행한 결과를 정리한 것

✅ Lv0 — 애플리케이션 실행 오류 해결

잘못된 Bean 등록/누락된 설정 수정

의존성/Config 문제 해결 → 정상 부팅

✅ Lv1 — ArgumentResolver 복구

supportsParameter()/resolveArgument() 재구현

요청에서 사용자 정보 추출 후 AuthUser 생성

WebMvcConfigurer 등록하여 정상 동작

✅ Lv2 — 코드 개선

Early Return 적용 → 중복 검사 먼저 수행

if-else 제거 → WeatherClient 가독성 개선

Validation 책임 분리 → DTO로 이동 & @Valid 적용

✅ Lv3 — N+1 해결

@EntityGraph 적용하여 User/Manager 지연로딩 문제 해결


✅ Lv4 — 테스트 코드 수정

테스트코드의 인자 순서 수정, 메시지/ 타입 수정 및 처리 로직 변경
